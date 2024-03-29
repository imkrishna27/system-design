package org.example.design_patterns_interview.design_tic_to_toe.piece_definition;

import org.example.design_patterns_interview.design_tic_to_toe.PieceType;

public abstract class Piece {
    public PieceType pieceType;
    Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
