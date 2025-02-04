package org.example.design_patterns_interview.design_tic_to_toe;

import org.example.design_patterns_interview.design_tic_to_toe.piece_definition.OPiece;
import org.example.design_patterns_interview.design_tic_to_toe.piece_definition.XPiece;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Game {
    Deque<Player> players= new ArrayDeque<>();
    Board board;

    public void initializeGame() {
        // create two players
        players.add(new Player("Krishna",new XPiece(PieceType.X)));
        players.add(new Player("Divya",new OPiece(PieceType.O)));
        // assign the playing board
        this.board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            // player who has current turn is at first position, so we need to take it out
            Player playerTurn = players.removeFirst();
            // find the spaces available on board;
            board.printBoard();
            if(board.getFreeCells().isEmpty()) {
                noWinner = false;
                // there is no space so we have a tie
                break;
            }

            //read the user input
            System.out.print("Player:" + playerTurn.playerName + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // now insert the  row and column to board cell
            boolean pieceAddedSuccessfully = board.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.getPlayerName();
            }
        }
        return "Thanks for playing.. It's a tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.boardSize;i++) {

            if(board.cells[row][i] == null || board.cells[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.boardSize;i++) {

            if(board.cells[i][column] == null || board.cells[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.boardSize;i++,j++) {
            if (board.cells[i][j] == null || board.cells[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.boardSize-1; i<board.boardSize;i++,j--) {
            if (board.cells[i][j] == null || board.cells[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
