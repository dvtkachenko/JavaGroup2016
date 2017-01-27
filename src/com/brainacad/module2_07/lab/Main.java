package com.brainacad.module2_07.lab;

/**
 * Created by Дима on 25.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];

        Monitor m = new Monitor();
        m.setSerialNumber("237363");
        m.setPrice(5600);
        m.setManufacturer("DELL");
        m.setResolutionX(1280);
        m.setResolutionY(720);

        devices[0] = m;

        Monitor m1 = new Monitor();
        m1.setSerialNumber("877363");
        m1.setPrice(7800);
        m1.setManufacturer("SAMSUNG");
        m1.setResolutionX(1920);
        m1.setResolutionY(1080);

        devices[1] = m1;

        EthernetAdapter ea = new EthernetAdapter();
        ea.setSerialNumber("873463");
        ea.setPrice(1250);
        ea.setManufacturer("ASUS");
        ea.setMac("EA-F2-F5-A3");
        ea.setSpeed(100);

        devices[2] = ea;

        for (Device d : devices)
            System.out.println(d);

    }
}
