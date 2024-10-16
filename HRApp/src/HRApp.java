import hr.Department;
import hr.Employee;

public class HRApp {
    public static void main(String[] args) {

        System.out.println("HRApp starts");

        Employee e1 = new Employee(234, "Hachi", 333998);
        Employee e2 = new Employee(432, "Anna", 3392823);

        Department dept = new Department("Education");

        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(456, "Franc", 3334));

        Employee[] employees = dept.getEmployees();

        for (Employee employee : employees) {
            System.out.println("Emp " + employee);
        }

        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Average: " + dept.getAverageSalary());


        System.out.println("Emp " + dept.getEmployeeByID(232));
        System.out.println("Emp " + dept.getEmployeeByID(312));

    }
}








