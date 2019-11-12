package gamelibrary;

public class CreateGameFactory {

    //use getShape method to get object of type game
    public FactoryGame getCreateGame(String gameType){
        if(gameType == null){
            return null;
        }
        if(gameType.equalsIgnoreCase("TOY")){
            return new Toy();

        } else if(gameType.equalsIgnoreCase("VideoGame")){
            return new VideoGame();

        } else if(gameType.equalsIgnoreCase("BoardGame")){
            return new BoardGame();
        }

        return null;
    }

}

