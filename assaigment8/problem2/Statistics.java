public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData>/*<implement>*/ aList) {
        double salary = 0;
        for (EmployeeData e : aList) {
            salary += e.getSalary();
        }
        return salary;
        //implement
        //compute sum of all salaries of people in aList and return
    }
}
