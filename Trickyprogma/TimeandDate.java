package Trickyprogma;

import java.util.Scanner;

public class TimeandDate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current hour :");
        double currentHours = sc.nextDouble();
        System.out.println("Enter current minute : ");
        double currentMintues = sc.nextDouble();
        System.out.println("Enter the curerrnt Second :");
        double currentSeconds = sc.nextDouble();

        System.out.println("Enter hour to go forword :");
        double forwordHours = sc.nextDouble();
        System.out.println("Enter minute to go forword : ");
        double forwordMintues = sc.nextDouble();
        System.out.println("Enter Second : to go forword : ");
        double forwordSeconds = sc.nextDouble();

        double answerHour = 0, answerMinutes = 0, answeSeconds = 0;
        double carrySeconds = 0, carryMintues = 0;
        boolean isnextDay = false;
        answeSeconds = currentSeconds + forwordSeconds;

        if (answeSeconds >= 60) {
            answeSeconds -= 60;
            carrySeconds = 1;

        }
        answerMinutes = currentMintues + forwordMintues;
        if (answerMinutes >= 60) {
            answerMinutes -= 60;
            carryMintues = 1;

        }
        answerHour = currentHours + forwordHours;
        if (answerHour >= 24) {
            answerHour -= 24;
            isnextDay = true;
        }
        if (isnextDay) {
            System.out.println(
                    "THE ANSWER IS " + answerHour + ":" + answerMinutes + ":" + answeSeconds + " on the  next day ");

        } else {
            System.out.println("THE ANSWER IS " + answerHour + ":" + answerMinutes + ":" + answeSeconds);
        }

    }
}
