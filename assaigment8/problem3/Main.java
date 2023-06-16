public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        // Add objects to the Marketing list
        marketingList.add(new Marketing("Bakhrom Ergashev", "Product A", 1500));
        marketingList.add(new Marketing("Mohammed Kayadan", "Product B", 2000));
        marketingList.add(new Marketing("Jon Jones", "Product C", 800));

        // Print the size of the list
        System.out.println("Size of the list: " + marketingList.size());

        // Print the contents of the list using toString()
        System.out.println("Contents of the list:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }

        // Remove an object from the Marketing list
        marketingList.remove(0);

        // Sort the list in natural order for the field salesAmount using Comparator
        marketingList.sort(Comparator.comparingDouble(Marketing::getSalesAmount));

        // Sort the list in natural order using employeeName with the criteria of salesAmount > $1000
        List<Marketing> list = listMoreThan1000(marketingList);
        list.sort(Comparator.comparing(Marketing::getEmployeeName));

        // Print the sorted list
        System.out.println("Sorted list of employees with salesAmount > $1000:");
        for (Marketing marketing : list) {
            System.out.println(marketing);
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}
