package abs_factory_pattern;

import abs_factory_pattern.Application.AppFactory;

public class OnlineBanking {
    public static void main(String[] args) {
        IFactory iFactory = new AppFactory();
        Developer developer = iFactory.getDeveloper();
        User user = iFactory.getUser();
        Manager manager = iFactory.getManager();
        System.out.println("Banking application in creating process");
        developer.display();
        user.use();
        manager.control();
    }
}
