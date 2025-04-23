public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Constructor no parameter
    //Use this. to help set the actual fields
    public CellPhone() {
        this.serialNumber =0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    //Overloaded consructors
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner ){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    //Getters and setters

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public String setOwner(String owner) {
        this.owner = owner;
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Method
    public void dial(String otherPhoneNumber){
        System.out.println(owner + "'s phone is calling " + otherPhoneNumber );
    }
    //Overloaded Methods
    public void dial(CellPhone phone){
        System.out.println(owner + "'s" + phone + " is calling " + phone.getPhoneNumber());
    }
}


