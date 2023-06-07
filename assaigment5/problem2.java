import java.time.LocalDate;

class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double computeSalary() {
        return salary;
    }
}

class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, LocalDate hireDate, double salary, int numberOfPublications) {
        super(name, hireDate, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }
}

class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("John Doe", LocalDate.of(2010, 6, 1), 5000, 10);
        Professor professor2 = new Professor("Jane Smith", LocalDate.of(2015, 9, 15), 6000, 15);
        Professor professor3 = new Professor("Michael Johnson", LocalDate.of(2018, 3, 20), 5500, 12);

        Secretary secretary1 = new Secretary("Emily Davis", LocalDate.of(2012, 2, 10), 3000, 5);
        Secretary secretary2 = new Secretary("David Brown", LocalDate.of(2017, 7, 5), 3500, 8);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = professor1;
        department[1] = professor2;
        department[2] = professor3;
        department[3] = secretary1;
        department[4] = secretary2;

        System.out.print("Do you want to see the sum of all Professor and Secretary salaries? (Y/N): ");
     
        String response = "Y"; 

        if (response.equalsIgnoreCase("Y")) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total Salary: $" + totalSalary);
        }
    }
}
