package abs_factory_pattern.Games;

import abs_factory_pattern.Developer;
import abs_factory_pattern.IFactory;
import abs_factory_pattern.Manager;
import abs_factory_pattern.User;

public class TeamGame implements IFactory {
    @Override
    public Developer getDeveloper() {
        return new GameDev();
    }

    @Override
    public User getUser() {
        return new Player();
    }

    @Override
    public Manager getManager() {
        return new Admins();
    }
}
