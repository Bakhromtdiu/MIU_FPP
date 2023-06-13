public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        Person person = new Person("1Ergasev", "Bakhrom", 13);
        Person person2 = new Person("2Ergasev", "Bakhrom", 13);
        Person person3 = new Person("3Ergasev", "Bakhrom", 13);
        MyStringList list = new MyStringList();
        list.add(person);
        list.add(person2);
        list.add(person3);
        System.out.println(list.get("1Ergasev"));
    }
}
