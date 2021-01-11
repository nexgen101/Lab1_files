/**
 * ACS-2947-002 
 * Lab 1
 * Class representing a Commissioned Employee
 * @author ACS-2947
 */

public class Commission extends Employee {
    protected double grossSales;        // gross sales
    protected double commissionRate;    // rate of commission

    /**
     * Constructs a commissioned employee with specified name, sin, gross sales
     * and commission rate
     * @param name  name of employee
     * @param sin   social insurance number of employee
     * @param sales gross sales made by employee
     * @param rate  commission rate of employee
     */  
    public Commission(String name, String sin, 
            double sales, double rate) {
        super(name, sin);
        this.grossSales = sales;
        this.commissionRate = rate;
    } 
    
    /**
     * Constructs a default commissioned employee
     */
    public Commission(){                // *note: implicit call to super()
        this.grossSales = 0.0;
        this.commissionRate = 0.0;
    }

    /**
     * Gets the commissioned employee's amount of pay
     * @return  returns the payment amount of this commissioned employee 
     */
    @Override 
    public double getPaymentAmount() {
        return commissionRate * grossSales;
    } 
} 
