package Inhertancee;

public class Lawyer extends Employee {

    public String getVacationForm()
    {
        return "Pink";
    }
    public int getVacationDays()
    {
        return super.getVacationDays()+5;
    }
    public void sue() {
        System.out.println("I'll see you in court!");
    }
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }


}
