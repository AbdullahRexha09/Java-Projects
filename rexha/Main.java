package rexha;
//DETYRA1
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
  Scanner sc = new Scanner(new File("test.txt"));
      double vlera1 = sc.nextDouble();
  while(sc.hasNext())
  {
    if(sc.hasNextDouble()){

double vlera2 = sc.nextDouble();
      System.out.printf("%.1f to %.1f, change = %.1f \n ",vlera1,vlera2,vlera2-vlera1);
vlera1 = vlera2;
    }
    else
      sc.next();


  }



    }
}
