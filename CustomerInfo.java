package hib.beans;

public class CustomerInfo {
    private int milkmanId ;
    private int cId;
    private String cusRequirement;
    private long cusContact;
    private String cusAddress;
    private String cusSubs;
    private String cusPayment;

    public CustomerInfo(int milkmanId, int cId, String cusRequirement, long cusContact, String cusAddress, String cusSubs, String cusPayment) {
        this.milkmanId = milkmanId;
        this.cId = cId;
        this.cusRequirement = cusRequirement;
        this.cusContact = cusContact;
        this.cusAddress = cusAddress;
        this.cusSubs = cusSubs;
        this.cusPayment = cusPayment;
    }

    public String getCusPayment() {
        return cusPayment;
    }

    public void setCusPayment(String cusPayment) {
        this.cusPayment = cusPayment;
    }

    public int getMilkmanId() {
        return milkmanId;
    }

    public void setMilkmanId(int milkmanId) {
        this.milkmanId = milkmanId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getCusRequirement() {
        return cusRequirement;
    }

    public void setCusRequirement(String cusRequirement) {
        this.cusRequirement = cusRequirement;
    }

    public long getCusContact() {
        return cusContact;
    }

    public void setCusContact(long cusContact) {
        this.cusContact = cusContact;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusSubs() {
        return cusSubs;
    }

    public void setCusSubs(String cusSubs) {
        this.cusSubs = cusSubs;
    }
    
}
