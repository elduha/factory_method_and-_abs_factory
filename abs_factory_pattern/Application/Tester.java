package abs_factory_pattern.Application;

import abs_factory_pattern.User;

public class Tester implements User {
    @Override
    public void use() {
        System.out.println("Check application");
    }
}
