package rexha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Detyra6 {


    public static void main(String[]args) throws FileNotFoundException
    {

        Scanner input = new Scanner(new File("test.txt"));
        flipLines(input);

    }
    public static void flipLines(Scanner console)
    {

        while(console.hasNextLine())
        {
            String x = console.nextLine();
            String y = console.nextLine();

            System.out.println(y);
            System.out.println(x);

        }
    }

}
