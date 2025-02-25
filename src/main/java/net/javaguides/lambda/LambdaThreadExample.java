package net.javaguides.lambda;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method is calling ..");
    }
}

public class LambdaThreadExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // Using Lambda expression
        Thread thread1 = new Thread(() -> System.out.println("run method is calling from lambda .."));
        thread1.start();

    }
}
