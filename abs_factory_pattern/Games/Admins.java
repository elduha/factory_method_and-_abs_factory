package abs_factory_pattern.Games;

import abs_factory_pattern.Manager;

public class Admins implements Manager {
    @Override
    public void control() {
        System.out.println("Admins control everything in game");
    }
}
