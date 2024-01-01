package myfirtspackage;

import myfirtspackage.*;

public class MyFirstClass {

    public static void main(String[] args) {
    MySecondClass o = new MySecondClass(0,0);
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setI(i);
                o.setJ(j);
                System.out.print(o.mult() + "\t ");
            }
            System.out.println();
        }
    }
}
