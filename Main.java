
class Employee {
    protected String name;
    protected double salary;

   
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    private String department;
    private double bonus;

    public Manager(String name, double salary, String department, double bonus) {
        super(name, salary); 
        this.department = department;
        this.bonus = bonus;
    }

   
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: $" + bonus);
    }
}


public class Main {
    public static void main(String[] args) {
      
        Employee[] employees = new Employee[3];

       
        employees[0] = new Employee("Alice", 50000);
        employees[1] = new Manager("Bob", 80000, "Sales", 10000);
        employees[2] = new Manager("Charlie", 90000, "IT", 15000);

        for (Employee emp : employees) {
            emp.display();
            System.out.println("------------------------");
        }
    }
}
