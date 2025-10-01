// Employee class to demonstrate encapsulation
public class Employee implements Cloneable {
    // Step 1: Declare private variables for name, age, and salary
    private String name;
    private int age;
    private double salary;

    // Hint: Use appropriate data types (String, int, double)
    
    // Step 2: Create constructors
    // 2.1: Create a default constructor that sets name to "Unknown", age to 18, and salary to 0.0
    public Employee() {
        name = "Unknown";
        age = 18;
        salary = 0.0;
    }
    // Hint: public Employee()
    
    // 2.2: Create an overloaded constructor that initializes all three variables
    // Hint: public Employee(String name, int age, double salary)
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Step 3: Create public getter methods for each variable
    // Hint: Use the format: public returnType getVariableName()

    public void setName(String name) {
        if (name == null) {
            System.out.println("Please input your name: ");
        } else if (name != null) {
            System.out.println("Name entered as been stored in our system, thank you");
        } else {
            System.out.println("Please try again, make sure you input what's required");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            System.out.println("Age has been set in the system, thank you.");       
         } else {
            System.out.println("Sorry must be 18 or over for this.")
         }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be less than 0");
            this.salary = 0;
        } else {
            System.out.println("Thank you, salary has been logged in the system.");
            this.salary = salary;
        }
        
    }
    
    // Step 4: Create public setter methods for each variable
    // Hint: Use the format: public void setVariableName(parameter)

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Add validation logic in the setter methods:
    // - For name: Ensure it is not null or empty
    // - For age: Ensure it is between 18 and 65 (inclusive)
    // - For salary: Ensure it is greater than or equal to 0
    
    // Step 5: Create a public method to calculate annual salary (monthly salary * 12)
    // Hint: public double calculateAnnualSalary()
    public double calculateAnnualSalary() {
        double annualSalary = salary*12;
        return annualSalary;
    }
    
    // Step 6: Create a public method to give a raise (percentage)
    // This method should increase the salary by the given percentage
    // Hint: public void giveRaise(double percentage)
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            double raiseAmount = salary * (percentage/100);
            salary += raiseAmount;
            System.out.println(name + " raise amount is: " + percentage + "%");
        } else {
            System.out.println("Percentage must be positive");
        }
    }
    
    // Step 7: Create a public method to display employee details
    // Hint: Use System.out.println() to print name, age, monthly salary, and annual salary
    public void displayEmployeeDetails(String name, int age, double salary) {
        System.out.print("\n Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + "€" +salary);
    }
    // Step 8: Override the clone method to make Employee objects cloneable
    // Hint: @Override protected Object clone() throws CloneNotSupportedException
    // Return super.clone() to create a shallow copy of the object

    protect Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
