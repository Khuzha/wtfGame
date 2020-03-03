package com.khuzha.objects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RobotTemplate myRobo = new RobotTemplate();
        Scanner scan = new Scanner(System.in);
        boolean stopped = false;

        while (!stopped) {
            String command = scan.next();
            switch (command) {
                case ("turnOn"):
                    myRobo.turnOn();
                    break;
                case ("turnOff"):
                    myRobo.turnOff();
                    stopped = true;
                    break;
                case ("makeIceCream"):
                    myRobo.makeIceCream();
                    break;
                case ("stopMakingIceCream"):
                    myRobo.stopMakingIceCream();
                    break;
                case ("hug"):
                    myRobo.hug();
                    break;
                case ("stopHugging"):
                    myRobo.stopHugging();
                    break;
                case ("drive"):
                    myRobo.drive();
                    break;
                case ("stopDriving"):
                    myRobo.stopDriving();
                    break;
                default:
                    System.out.println("Wrong command, try again");
            }
        }

    }
}
