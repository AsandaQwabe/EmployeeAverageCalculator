
public class App {
    public static void main(String[] args) {
    
        System.out.println("Welcome to the Employee Salary Average Calculator!");

        java.util.Scanner scan = new java.util.Scanner(System.in);

        // User can input employee details here
        System.out.println("Enter the name of the Employee:");
        String name = scan.nextLine();
        System.out.println("Enter Employee Number:");
        int employeeNum = scan.nextInt();
        System.out.println("Enter the age of the Employee:");
        int age = scan.nextInt();

        // creates  average  with 3 salary inputs
        Average employeeAverage = new Average(name, employeeNum, age, 3);

        //users put the salary and the app displays it
        employeeAverage.inputSalary();
        employeeAverage.display();
    }
}

// EmployeeSalaryAverage class to handle employee details
class EmployeeSalaryAverage {
    private String name;
    private int employeeNumber;
    private int age;

    
    public EmployeeSalaryAverage(String name, int employeeNumber, int age) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getAge() {
        return age;
    }
}

// Average class for salary 
class Average {
    private EmployeeSalaryAverage employee;
    private double[] salaries;

    public Average(String name, int employeeNumber, int age, int numberOfSalaries) {
        employee = new EmployeeSalaryAverage(name, employeeNumber, age);
        salaries = new double[numberOfSalaries];
    }

    public void inputSalary() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter salaries for " + salaries.length + " months:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Salary for month " + (i + 1) + ": ");
            salaries[i] = scan.nextDouble();
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        return sum / salaries.length;
    }
//this will be what gets displayed after calculations and details are gotten.
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee Number: " + employee.getEmployeeNumber());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Average Salary: " + calculateAverage());
    }
}
