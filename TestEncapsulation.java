public class TestEncapsulation {
    public static void main(String[] args) {

        Employee employee1 = new employee("Emmanuel", 26, 30000);
        Employee employee2 = new employee();

        employee2.setName("Elizabeth");
        employee2.setAge(25);
        employee2.setSalary(25000);

        System.out.println("Employee detials");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println("Name: " + employee2.getName());
        System.out.println("Age: " + employee2.getAge());
        System.out.println("Salary: " + employee2.getSalary());

        // testing invalid values
        employee1.setName(" ");
        employee1.setAge(17);
        employee1.setSalary(-1);

        // displaing details
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());

        System.out.println(employee2.getName());
        System.out.println(employee2.getAge());
        System.out.println(employee2.getSalary());


        // object calling the function inputing value of 10
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        // display details
        System.out.println("Emplyee details with 10% raise");
        System.out.println(employee1.displayEmployeeDetails());
        System.out.println(employee2.displayEmployeeDetails());









        }
}