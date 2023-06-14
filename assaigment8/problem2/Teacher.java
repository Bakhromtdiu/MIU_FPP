public final class Teacher implements EmployeeData {
    private double bonus;
    private String name;
    private double salary;

    public Teacher(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
