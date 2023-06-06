public class Customer {
    private String firstName;
    private String lastName;
    private int socSecurityNum;

    private Address shippingAdress;
    private Address billingAdress;

    public Customer(String firstName, String lastName, int socSecurityNum, Address shippingAdress, Address billingAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
        this.shippingAdress = shippingAdress;
        this.billingAdress = billingAdress;
    }

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

    public int getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(int socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getShippingAdress() {
        return shippingAdress;
    }

    public void setShippingAdress(Address shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public Address getBillingAdress() {
        return billingAdress;
    }

    public void setBillingAdress(Address billingAdress) {
        this.billingAdress = billingAdress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socSecurityNum=" + socSecurityNum +
                ", shippingAdress=" + shippingAdress +
                ", billingAdress=" + billingAdress +
                '}';
    }
}
