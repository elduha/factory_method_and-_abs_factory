package abs_factory_pattern.Application;

import abs_factory_pattern.Developer;

public class FullStackDev implements Developer {
    @Override
    public void display() {
        System.out.println("FullStackDev create application");
    }
}
