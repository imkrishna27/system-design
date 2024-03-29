package org.example.design_patterns_interview.design_tic_to_toe;

import org.example.design_patterns_interview.design_tic_to_toe.piece_definition.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Board {
    Integer boardSize;
    Piece[][] cells;

    Board(Integer boardSize) {
        this.boardSize = boardSize;
        this.cells = new Piece[boardSize][boardSize];
    }

    public boolean addPiece(int row,int column,Piece pieceType) {
        if(cells[row][column]!=null) {
            return false;
        }
        else {
            cells[row][column] = pieceType;
            return true;
        }
    }
    /*
    Returns list of free cells
     */
    public List<Map.Entry<Integer, Integer>> getFreeCells() {
        List<Map.Entry<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (cells[i][j] == null) {
                    Map.Entry<Integer, Integer> rowColumn = Map.entry(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }
    /*
    prints the cell map
     */
    public void printBoard() {

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (cells[i][j] != null) {
                    System.out.print(cells[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
