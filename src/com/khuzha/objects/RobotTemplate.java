package com.khuzha.objects;

public class RobotTemplate {
    private boolean isTurnedOn = false;
    private boolean isMakingIceCream = false;
    private boolean isHugging = false;
    private boolean isDriving = false;

    boolean checkMe () {
        if (isTurnedOn && !isMakingIceCream && !isHugging && !isDriving) {
            return true;
        } else if (isTurnedOn && (isMakingIceCream || isHugging || isDriving)) {
            System.out.println("Sorry, I'm busy with something else.");
            return false;
        } else {
            System.out.println("I'm sleeping.. Zzz..;");
            return false;
        }
    }

    void turnOn () {
        isTurnedOn = true;
        System.out.println("Loading... Robot is ready work.");
    }

    void turnOff () {
        if (checkMe()) {
            isTurnedOn = false;
        }
    }

    void makeIceCream () {
        if (!checkMe()) {
            return;
        }

        isMakingIceCream = true;
        System.out.println("I'm making an ice cream for you, please, wait.");
    }

    void stopMakingIceCream () {
        if (isMakingIceCream) {
            isMakingIceCream = false;
            System.out.println("I stopped to make ice cream.");
        } else {
            System.out.println("I'm not making ice cream!");
        }
    }

    void hug () {
        if (!checkMe()) {
            return;
        }

        isHugging = true;
        System.out.println("I love you!");
    }

    void stopHugging () {
        if (isHugging) {
            isHugging = false;
            System.out.println("I stopped to hug.");
        } else {
            System.out.println("I'm not hugging!");
        }
    }

    void drive () {
        if (!checkMe()) {
            return;
        }
        isDriving = true;
        System.out.println("I'm driving your car to ");
    }

    void stopDriving () {
        if (isDriving) {
            isDriving = false;
            System.out.println("I stopped to drive.");
        } else {
            System.out.println("I'm not driving anywhere right now!");
        }
    }
}
