package abs_factory_pattern.Application;

import abs_factory_pattern.Manager;

public class CEO implements Manager {
    @Override
    public void control() {
        System.out.println("Head of this application");
    }
}
