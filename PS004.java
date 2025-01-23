public class PS004 {

    private double basePay;
    private int hoursWorked;

    public PS004() {
        this.basePay = 0;
        this.hoursWorked = 0;
    }

    public PS004(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public void computeSalary() {
        final double MINIMUM_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_MULTIPLIER = 1.5;

        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay must not be less than the minimum wage ($8.00/hour). Base pay provided: " + basePay);
        } else if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked must not exceed 60 hours per week. Hours worked provided: " + hoursWorked);
        } else {
            double totalPay;
            if (hoursWorked <= REGULAR_HOURS) {
                totalPay = hoursWorked * basePay;
            } else {
                int overtimeHours = hoursWorked - REGULAR_HOURS;
                totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_MULTIPLIER);
            }
            System.out.printf("Total pay for %.2f base pay and %d hours worked: $%.2f\n", basePay, hoursWorked, totalPay);
        }
    }

    public static void main(String[] args) {
        PS004 employee1 = new PS004(7.50, 35);
        PS004 employee2 = new PS004(8.20, 47);
        PS004 employee3 = new PS004(10.00, 3);

        System.out.println("Employee 1:");
        employee1.computeSalary();
        
        System.out.println("Employee 2:");
        employee2.computeSalary();
        
        System.out.println("Employee 3:");
        employee3.computeSalary();
    }
}
