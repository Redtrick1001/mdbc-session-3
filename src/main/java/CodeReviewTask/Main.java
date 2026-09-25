package CodeReviewTask;

public class Main { // only give bonus when sales exceed 500:
     static void main(String[] args) {
        boolean taxYearEnded = true;
        double baseSalary = 20000;
        int numberOfSales = 1000;
        double bonus = 1000;
        double commissionRate = 3.0;
        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commissionRate);
            if (numberOfSales > 500) {
                // only give bonus when sales exceed 500:
                totalSalary += bonus;
                System.out.println("Total salary after bonus: " + totalSalary);
            }
        }
        // sales person 2:
        numberOfSales = 300;
        baseSalary = 25000;
        commissionRate = 2.0;
        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commissionRate);
            System.out.println("Total salary: " + totalSalary);
        }
    }
}