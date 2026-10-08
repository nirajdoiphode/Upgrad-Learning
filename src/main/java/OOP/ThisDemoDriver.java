package OOP;

public class ThisDemoDriver {
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        ThisDemo t1=new ThisDemo();

        t.setData(72, "Niraj","nirajdoiphode2004@gmail.com");
        t1.setData(45,"Khushi", "kp@gmail.com");
        t.displayData();
        t1.displayData();

    }
}
