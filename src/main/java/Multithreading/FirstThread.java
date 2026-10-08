package Multithreading;

public class FirstThread {
    public static void main(String[] args) {
        MyThread m=new  MyThread();
        MyThread2 m2=new  MyThread2();
        m.setPriority(Thread.MIN_PRIORITY);
        m.start();
        m2.start();


//        for(int j=0;j<10;j++){
//            System.out.println("Main Thread");
//        }

    }

}

 class MyThread extends Thread
{
    public void run()
    {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setName("OTHER THREAD AVC");
        for(int j=0;j<5;j++){
            System.out.println("Other Thread");
        }


    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Second Thread");
    }
}
