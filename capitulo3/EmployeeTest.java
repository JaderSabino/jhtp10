public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Jader", "Sabino Borges", 5000.0);
        displayEmployee(employee);
        employee.increase(10);
        displayEmployee(employee);
        employee.setSalary(-10);
        displayEmployee(employee);
    }

    public static void displayEmployee(Employee employee) {
        System.out.println("----------------------------");
        System.out.printf("Name: %s%n", employee.getName());
        System.out.printf("Last Name: %s%n", employee.getLastName());
        System.out.printf("Salary: $%.2f%n", employee.getSalary());
    }
}
