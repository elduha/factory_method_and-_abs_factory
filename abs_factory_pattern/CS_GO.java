package abs_factory_pattern;

import abs_factory_pattern.Games.TeamGame;

public class CS_GO {
    public static void main(String[] args) {
        IFactory iFactory = new TeamGame();
        Developer developer = iFactory.getDeveloper();
        User user = iFactory.getUser();
        Manager manager = iFactory.getManager();

        System.out.println("CsGO shooter game in two teams like Terrors and CounterTerrors");
        developer.display();
        user.use();
        manager.control();
    }
}
