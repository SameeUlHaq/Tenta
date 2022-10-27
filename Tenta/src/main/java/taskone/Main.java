package taskone;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
       do {
           Scanner scanner = new Scanner(in);
           String name;


           System.out.println("Vad heter du kära användare? ");
           name = scanner.nextLine();

           String initial = name.substring(0, 1)+
                   " är bokstaven ditt namn börjar på!";
           System.out.println(initial);
       } while (true);


        }
}
