package Day24;
public class Employee {
    String name;
    String id;
    int salary;

    Employee() {
        String name = "";
        String id = "";
        int salary = 0;
    }
    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee(Employee one){
        this.name = one.name;
        this.id = one.id;
        this.salary = one.salary;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Shashank";
        emp.id = "E12345";
        emp.salary = 50000;

        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Salary: $" + emp.salary);
    }
}
