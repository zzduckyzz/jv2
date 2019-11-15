package jv2_labs6;

public class Contact {
    public Integer id;
    public String contact_name;
    public String company;
    public String address;
    public String tableName;

    public Contact() {
    }

    public Contact(Integer id, String contact_name, String company, String address) {
        this.id = id;
        this.contact_name = contact_name;
        this.company = company;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return this.getContact_name();
    }
}
