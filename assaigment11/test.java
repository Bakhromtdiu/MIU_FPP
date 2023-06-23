import java.util.HashMap;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private String year;

    // Constructor
    public Student(String firstName, String lastName, double gpa, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.year = year;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return gpa;
    }

    public String getYear() {
        return year;
    }
}

class Key {
    private String firstName;
    private String lastName;

    // Constructor
    public Key(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // HashCode and equals methods
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Key other = (Key) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }
}

class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentMap.put(key, student);
        }
        return studentMap;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        double totalGPA = 0.0;
        for (Student student : maps.values()) {
            totalGPA += student.getGPA();
        }
        return totalGPA / maps.size();
    }
}

class Test {
    public static void main(String[] args) {
        // Create sample data
        Student student1 = new Student("John", "Doe", 3.8, "Freshman");
        Student student2 = new Student("Jane", "Smith", 3.9, "Sophomore");
        Student student3 = new Student("David", "Johnson", 3.5, "Junior");
        Student student4 = new Student("Sarah", "Williams", 3.7, "Senior");

        // Add students to a list
        List<Student> students = List.of(student1, student2, student3, student4);

        // Process the students and get the HashMap
        HashMap<Key, Student> studentMap = Admin.processStudents(students);

        // Compute and print the average GPA
        double averageGPA = Admin.computeAverageGPA(studentMap);
        System.out.println("Average GPA: " + averageGPA);

        // Test if the solution works
        if (Math.abs(averageGPA - 3.725) < 0.001) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

