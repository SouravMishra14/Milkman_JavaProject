package hib.beans;

public class MilkmanRegistration {

    private int milkmanId;
    private String name;
    private Long contact;
    private String city;
    private String area;
    private String address;

    public MilkmanRegistration(int milkmanId, String name, Long contact, String city, String area, String address) {
        this.milkmanId = milkmanId;
        this.name = name;
        this.contact = contact;
        this.city = city;
        this.area = area;
        this.address = address;
    }

    public int getMilkmanId() {
        return milkmanId;
    }

    public void setMilkmanId(int milkmanId) {
        this.milkmanId = milkmanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
