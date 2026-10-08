package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        createThread.start();
    }
}
class CreateThread extends Thread {

    public void run() {
        System.out.println("Thread Created");
    }
}