package Basics.CreationPattern.PrototypePattern.Solution;

public class GameClientWithPrototype {
    static void main() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedBoard = gameBoard.clone();

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
