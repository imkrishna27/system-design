package org.example.design_patterns_interview.design_tic_to_toe;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.design_patterns_interview.design_tic_to_toe.piece_definition.Piece;

@Data
@AllArgsConstructor
public class Player {
    public String playerName;
    public Piece playingPiece;
}
