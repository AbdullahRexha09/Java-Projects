package rexha;

import java.util.Scanner;

public class Detyra5 {

    public static void main(String[]args)
    {
        String x ="3.25 4.5 -8.25 7.25 3.5 4.25 -6.5 5.25";
        Scanner input = new Scanner(x);
runningSum(input);

    }
public static void runningSum(Scanner console)
{
double sum = 0;
double sum1 =0;
double max = 0;
System.out.print("Running Sum =");
while(console.hasNextDouble())
{
    sum = console.nextDouble();
    sum1 +=sum;
    System.out.print(sum1+" ");
    if(sum1>max)
    {
        max = sum1;
    }
}
System.out.println();
System.out.print("Shuma maksimale eshte :"+max);
}
}
