package com.coforge.MavenProjectDay4;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        MyInterface mi = new DemoClass();
        mi.display();
        mi.printDetails();
        mi = new HelloClass();
        mi.display();
        mi.printDetails();
        MyInterface.UseParking("Coforge");
//        mi.UseParking("Coforge");
//        DemoClass.hey();
        DemoClass dd = new DemoClass();
        dd.hey();
    }
}
