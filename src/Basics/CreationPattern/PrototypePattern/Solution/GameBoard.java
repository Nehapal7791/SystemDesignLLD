package Basics.CreationPattern.PrototypePattern.Solution;


import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype{
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
    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for(GamePiece piece:gamePieceList){
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }
}
