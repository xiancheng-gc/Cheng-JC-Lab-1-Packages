package org.LabPackages.main;

import org.LabPackages.packageone.ClassOne;
import org.LabPackages.packagetwo.ClassTwo;
import org.LabPackages.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();

        System.out.println(c1.greet());
        System.out.println(c2.greet());
        System.out.println(c3.greet());

    }
}