package Multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        MyNewThread mt=new MyNewThread();
        Thread t=new Thread(mt);
        t.start();

    }
}
class MyNewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Created using runnable");
    }
}