
package homework7;

public class NewClass {
    private String CustomerName;
    private String CustomerPhoneNumber;
    private static int  NumberOfCustomers;

    public NewClass() {
    }

    public NewClass(String CustomerName, String CustomerPhoneNumber, int NumberOfCustomers) {
        this.CustomerName = CustomerName;
        this.CustomerPhoneNumber = CustomerPhoneNumber;
        NumberOfCustomers++;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setCustomerPhoneNumber(String CustomerPhoneNumber) {
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }

    @Override
    public String toString() {
        return "NewClass{" + "CustomerName=" + CustomerName + ", CustomerPhoneNumber=" + CustomerPhoneNumber + '}';
    }
    
}
