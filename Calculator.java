package FjernRepo;

import java.util.Scanner;



public class Calculator {

    public static void main(String[] args) {

        System.out.println("Zahedullah er helt død"); //jk mate



        char calculate;
        Double num, num2, result;

        //Laver en objekt for Scanner klasse
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Choose a number: 1 = Plus, 2 = Minus, 3 = Gang, 4 = Dividere");
            calculate = scan.next().charAt(0);

            System.out.print("Enter the first number: ");
            num = scan.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scan.nextDouble();


            switch (calculate) {
                case '1':
                    result = num + num2;
                    System.out.print("Num Plus = " + result);
                    break;
                case '2':
                    result = num - num2;
                    System.out.print("Num Minus" + result);
                    break;
                case '3':
                    result = num * num2;
                    System.out.print("Num Gang" + result);
                    break;
                case '4':
                    result = num/num2;
                    System.out.print("Num Dividere" + result);
                    break;
                default:
                    System.out.print("Error");
            }

        }
    }
}
