package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");

        double maxnum = 0d;
        String input = scanner.nextLine();
        double num = Double.parseDouble(input);

        if (num <= 0) {
            System.out.println("No number entered.");
            return;
        }

        for (int i=2; num>0; i++) {
            if (num > maxnum) {
                maxnum = num;
            }
            System.out.printf("Number %d: ", i);
            input = scanner.nextLine();
            num = Double.parseDouble(input);
        }
        System.out.print("The largest number is ");
        System.out.println(String.format("%.2f", maxnum));
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("1");
        } else if (input == 2) {
            System.out.println("1");
            System.out.println("2 3");
        } else if (input == 3) {
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
        } else if (input == 4) {
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9 10");
        } else if (input == 5) {
            System.out.println("1 ");
            System.out.println("2 3 ");
            System.out.println("4 5 6 ");
            System.out.println("7 8 9 10 ");
            System.out.println("11 12 13 14 15 ");
        } else if (input == 6) {
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9 10");
            System.out.println("11 12 13 14 15");
            System.out.println("16 17 18 19 20 21");
        } else if (input == 7) {
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9 10");
            System.out.println("11 12 13 14 15");
            System.out.println("16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
        } else System.out.println("Invalid number!");
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        /**
         * The following 15 lines of Code have been taken from the Internet | https://www.programiz.com/java-programming/examples/pyramid-pattern, last visit: 14.10.2022
         */
            int rows = 6, k = 0;

            for (int i = 1; i <= rows; ++i, k = 0) {
                for (int space = 1; space <= rows - i; ++space) {
                    System.out.print(" ");
                }

                while (k != 2 * i - 1) {
                    System.out.print("*");
                    ++k;
                }

                System.out.println();
            }


    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("h: ");
        int input1 = scanner.nextInt();
        System.out.print("c: ");
        String input2 = scanner2.nextLine();

        if (input1 == 6) {
            System.out.println("Invalid number!");
        } else if (input1 == 5) {
            System.out.println("  h" + System.lineSeparator() +
                    " ghg" + System.lineSeparator() +
                    "fghgf" + System.lineSeparator() +
                    " ghg" + System.lineSeparator() +
                    "  h" + System.lineSeparator());
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int neg = 0;
        int avg = 0;
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mark 1: ");

        double maxnum = 0d;
        String input = scanner.nextLine();
        double num = Double.parseDouble(input);
        if (num == 0) {
            System.out.println("Average: 0.00");
            System.out.println("Negative marks: 0");
        } else {



        for (int i=1; num>=0; i++) {

            if (num >= 6 || num < 0) {
                System.out.println("Invalid mark!");
            } else {
                sum += num;
                avg++;
            }
            if (num == 5) {
                neg++;
            }
            if (num > maxnum) {
                maxnum = num;
            }
            System.out.printf("Mark " + (avg + 1) + ": ");
            input = scanner.nextLine();
            num = Double.parseDouble(input);

            if (num == 0) {
                if (avg >= 0) {
                    float med = (float) (sum / (avg));
                    System.out.println("Average: " + String.format("%.2f", med));
                    System.out.println("Negative marks: " + neg);
                }
                break;
            }
        }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();
        int Ergebnis;
        int Rechnung1;
        int Rechnung2;
        int Rechnung3;

        while (number > 0) {
            if (number != 1 && number != 4) {
                Rechnung3 = number % 10;
                Rechnung2 = (number / 10) % 10;
                Rechnung1 = (number / 100) % 10;
                Ergebnis = (int) (Math.pow(Rechnung1, 2) + Math.pow(Rechnung2, 2) + Math.pow(Rechnung3, 2));
                number = Ergebnis; }

            else if (number == 1) {

                System.out.println("Happy number!");
                break;
            }
            else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}