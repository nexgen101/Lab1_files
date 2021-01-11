import java.util.*;
/**
 * ACS-2947-002 W2021
 * Lab 1 
 * Driver class
 * @author ACS-2947
 */
public class Lab1_Driver{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Commission("Ron", "107", 4310.95, 0.21));
        employees.add(new BasePlusCommission("Harry", "777", 400.00, 0.1, 4503.48));
        employees.add(new Salaried("Hermione", "123", 1925.32));
        employees.add(new Hourly("Draco", "666", 14.72, 40));

        Invoice i1 = new Invoice("3111", 4, 99.99);
        Invoice i2 = new Invoice("3112", 12, 125.35);
        PayWeek thisweek = new PayWeek("January 15, 2021");
        
        // add invoice payments and only commissioned employees to pay week
        thisweek.addPayment(i1);
        thisweek.addPayment(i2);
        for (Employee e : employees){
            if (e instanceof Commission)
            thisweek.addPayment(e);
        }
        System.out.println(thisweek);       
    }      
}

