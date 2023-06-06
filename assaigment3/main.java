public class Main {


    public static void main(String[] args) {


        Address billingAddress = new Address("st1", "Chicago", "Illinois", "121212");
        Address shippingAddress = new Address("st11", "Chicago", "Illinois", "121212");
        Customer customer1 = new Customer("James", "Johns", 1212121, billingAddress, shippingAddress);


        Address billingAddress2 = new Address("st2", "Fairfield", "Iowa", "1223");
        Address shippingAddress2 = new Address("st2", "Chicago", "Illinois", "121212");
        Customer customer2 = new Customer("David", "Daidson", 55552121, billingAddress, shippingAddress);

        Address billingAddress3 = new Address("st3", "Chicago", "Illinois", "121212");
        Address shippingAddress3 = new Address("st3", "San Francisco", "California", "121212");
        Customer customer3 = new Customer("James", "Johns", 1212121, billingAddress, shippingAddress);

        Customer[] customers = new Customer[3];
        customers[0] = customer1 ;
        customers[1] = customer2 ;
        customers[2] = customer3 ;


        for (Customer c :customers){
            if (c.getBillingAdress().getCity().equals("Chicago")){
                System.out.println(c);
            }

        }


    }


}




