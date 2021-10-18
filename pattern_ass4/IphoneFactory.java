package pattern_ass4;

public class IphoneFactory implements SmartphoneFactory{
    @Override
    public Smartphone createPhone() {
        return new Iphone();
    }
}
