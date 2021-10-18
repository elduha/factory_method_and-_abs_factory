package pattern_ass4;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        SmartphoneFactory smartphoneFactory = createPhonebyname("Huawei");
        Smartphone smartphone = smartphoneFactory.createPhone();
        smartphone.displayPhone();


    }

    static SmartphoneFactory createPhonebyname(String nameOfPhone) {
        if (nameOfPhone.equalsIgnoreCase("Samsung")) {
            return new SamsungFactory();
        } else if (nameOfPhone.equalsIgnoreCase("Iphone")) {
            return new IphoneFactory();
        } else if (nameOfPhone.equalsIgnoreCase("Huawei")) {
            return new HuaweiFactory();
        }else {
            throw new RuntimeException(nameOfPhone + "is unknown Smartphone");
        }
    }
}

