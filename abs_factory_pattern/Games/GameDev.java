package abs_factory_pattern.Games;

import abs_factory_pattern.Developer;

public class GameDev implements Developer {
    @Override
    public void display() {
        System.out.println("Gamedev create game");
    }
}
