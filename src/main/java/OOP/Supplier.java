package OOP;

class Supplier {

    private int sippId;
    private String name;
    private String city;
    private String email;
    private long contactNo;
    private Boolean isCODAccepted;

    public void setDetails(int sippId, String name, String city, String email, long contactNo, Boolean isCODAccepted) {
        this.sippId = sippId;
        this.name = name;
        this.city = city;
        this.email = email;
        this.contactNo =contactNo;
        this.isCODAccepted = isCODAccepted;
    }

    public void displayDetails() {
        System.out.println("Sipp Id: " + sippId);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Email: " + email);
        System.out.println("Contact No: " + contactNo);
        System.out.println("IsCODAccepted: " + isCODAccepted);
    }

}
