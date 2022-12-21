package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        double r1= 2.95;
        double r2= 3;

        double pi = 3.141;

        double hitArea = 0;
        double volumeR2=(4*pi*r2*r2*r2)/6;
        double volumeR1=(4*pi*r1*r1*r1)/6;
        double distance;

        double volume = volumeR2-volumeR1;

        Random random = new Random();
        double times = 100000;


        while (times>=0)
        {
            double xP = random.nextDouble();
            double xP2 = xP*6-3;

            double yP = random.nextDouble();
            double yP2 = yP*6-3;

            double zP = random.nextDouble();
            double zP2 = zP*6-3;

            distance = Math.sqrt(((xP - xP2) * (xP - xP2)) + ((yP - yP2) * (yP - yP2)) + ((zP - zP2) * (zP - zP2)));

            if (distance >= r1 && distance <= r2) {

                hitArea++;

            }

            times--;
        }

        System.out.println("Hit Area= "+hitArea);
        double probability;
        probability = hitArea/100000;
        System.out.println("Probability= "+probability);
        System.out.println("Volume= "+volume);

    }

}
