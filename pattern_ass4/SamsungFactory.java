package pattern_ass4;

public class SamsungFactory implements SmartphoneFactory{
    @Override
    public Smartphone createPhone() {
        return new Samsung();
    }
}
