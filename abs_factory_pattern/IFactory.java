package abs_factory_pattern;

import pattern_ass4.Smartphone;

public interface IFactory {
    Developer getDeveloper();
    User getUser();
    Manager getManager();
}
