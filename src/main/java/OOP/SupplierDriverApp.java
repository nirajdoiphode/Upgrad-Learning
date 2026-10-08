package OOP;

public class SupplierDriverApp{
    public static void main(String[] Args)
    {
        Supplier s=new  Supplier();
        s.setDetails(101,"Niraj","Jalna",
                "nirajdoiphode2004@gmail.com",7499968607L,Boolean.FALSE);
        s.displayDetails();
    }
}
