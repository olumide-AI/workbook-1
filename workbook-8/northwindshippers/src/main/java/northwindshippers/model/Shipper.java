package northwindshippers.model;

public class Shipper {
    private int shipperId;
    private String companyName;
    private String phone;

    //Create 3 constructor

    public Shipper() {
    }

    public Shipper(String companyName, String phone) {
        CompanyName = companyName;
        this.phone = phone;
    }

    public Shipper(int shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        CompanyName = companyName;
        this.phone = phone;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return shipperId + ": " + companyName + " - " + phone;
    }
}
