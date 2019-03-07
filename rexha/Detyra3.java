package rexha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Detyra3 {

    public static void main(String[] args)throws FileNotFoundException {
        int wordCount = 0;
        Scanner input = new Scanner(new File("word.txt"));

      while(input.hasNext())
      {
          wordCount+=1;
          String k = input.next();
      }

        System.out.println("Total words = " + wordCount);
    }
}
