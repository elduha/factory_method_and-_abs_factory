package abs_factory_pattern.Games;

import abs_factory_pattern.User;

public class Player implements User {
    @Override
    public void use() {
        System.out.println("Player use and check the game");
    }
}
