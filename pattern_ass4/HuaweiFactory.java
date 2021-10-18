package pattern_ass4;

public class HuaweiFactory implements SmartphoneFactory{
    @Override
    public Smartphone createPhone() {
        return new Huawei();
    }
}
