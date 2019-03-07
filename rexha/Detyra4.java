package rexha;

import java.util.Scanner;

public class Detyra4 {

    public static void main(String[]args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Jepeni fjalin:");
        String fjalia = input.nextLine();
        wordCount(fjalia);
    }
    public static void wordCount(String words)
    {
      int counter = 0;
        Scanner input = new Scanner(words);
        while(input.hasNext())
        {
            String x = input.next();
            counter+=1;

        }
        System.out.print("Fjali ka :"+counter+" Words");


    }


}
