package abs_factory_pattern.Application;

import abs_factory_pattern.Developer;
import abs_factory_pattern.IFactory;
import abs_factory_pattern.Manager;
import abs_factory_pattern.User;

public class AppFactory implements IFactory {
    @Override
    public Developer getDeveloper() {
        return new FullStackDev();
    }

    @Override
    public User getUser() {
        return new Tester();
    }

    @Override
    public Manager getManager() {
        return new CEO();
    }
}
