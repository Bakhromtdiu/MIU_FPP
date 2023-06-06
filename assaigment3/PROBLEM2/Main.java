public class Main {


    public static void main(String[] args) {

        int year;
        int day;
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please , enter your first name");
        String name = scanner.nextLine();
        System.out.println("Please , enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please , enter your birth day ");
        day = scanner.nextInt();

        System.out.println("Please , enter your birth month ");
        month = scanner.nextInt();

        System.out.println("Please , enter your birth year ");
        year = scanner.nextInt();


        HeartRates heartRates = new HeartRates(name, lastName, year, month, day);
        System.out.println("Target Heart Rate Range between " + heartRates.UBTHR() + " and " + heartRates.LBTHR());
        System.out.println("First Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + heartRates.age());
        System.out.println("Date of birth :" + year);
        System.out.println("Maximum heart Rate " + heartRates.MHR());


    }


}

