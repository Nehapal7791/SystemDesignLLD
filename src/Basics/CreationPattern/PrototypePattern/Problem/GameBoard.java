package Basics.CreationPattern.PrototypePattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private List<GamePiece> gamePieceList= new ArrayList<>();
    public void addPiece(GamePiece piece){
        gamePieceList.add(piece);
    }
    public List<GamePiece> getPieces(){
        return gamePieceList;
    }

    public void showBoardState(){
        for(GamePiece piece:gamePieceList){
            System.out.println(piece);
        }
    }

}
