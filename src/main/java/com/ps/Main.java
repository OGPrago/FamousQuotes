package com.ps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userIn;
        String[] quotes = {
                "Be Water",
                "A man who doesn't spend time with his family can never be a real man",
                "We bend more rules than the Catholic Church!",
                "Those who want respect, give respect.",
                "Now I know why tigers eat their young.",
                "Tough times don't last, only tough people",
                "Joey, have you ever been in a... in a Turkish prison?",
                "Chama",
                "F*** you, pay me.",
                "I’m gonna go get the papers, get the papers."
        };
        do {
            System.out.println("Select a number from 1-10(0 to exit): ");
            userIn = scanner.nextInt();

            switch (userIn) {
                case 1:
                    System.out.println(quotes[0]);
                    break;
                case 2:
                    System.out.println(quotes[1]);
                    break;
                case 3:
                    System.out.println(quotes[2]);
                    break;
                case 4:
                    System.out.println(quotes[3]);
                    break;
                case 5:
                    System.out.println(quotes[4]);
                    break;
                case 6:
                    System.out.println(quotes[5]);
                    break;
                case 7:
                    System.out.println(quotes[6]);
                    break;
                case 8:
                    System.out.println(quotes[07]);
                    break;
                case 9:
                    System.out.println(quotes[8]);
                    break;
                case 10:
                    System.out.println(quotes[9]);
                    break;
                default:
                    System.out.println("Command not found");

            }

        } while (userIn !=0);

    }
}