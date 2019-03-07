package rexha;

import java.util.Scanner;

public class Detyra1 {

    public static void main(String[]args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you?");
        if(console.hasNextInt())
        {
            int age = console.nextInt();
        }
        else
            System.out.print("Nuk keni jepur një INTeger");

    }
}
