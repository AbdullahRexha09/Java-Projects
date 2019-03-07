package rexha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Detyra2 {

    public static void main(String[]args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("votat.txt"));
        int vv=0,ldk=0,pdk=0;

        while(sc.hasNext())
        {
if(sc.hasNextInt())
{
    vv+=sc.nextInt();
    ldk+=sc.nextInt();
    pdk+=sc.nextInt();
}
else
    sc.next();

        }
        System.out.printf("VV ka %d ,LDK ka %d , PDK ka %d",vv,ldk,pdk);

    }

}
