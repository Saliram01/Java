package Thread.Thread_Class;

class FirstThread extends Thread{
    public void run(){
        System.out.println("\n" + currentThread().getName());
        for(int i = 1; i <= 100; i++){
            System.out.print(" * ");
        }
    }
}

class SecondThread extends Thread {
    public void run(){
        System.out.println("\n" + currentThread().getName());
        for(int i = 1; i <= 100; i++) {
            System.out.print(" $ ");
        }
    }
}

class ThirdThread extends Thread{
    public void run(){
        System.out.println("\n"+ currentThread().getName());
        for(int i = 1; i <= 100; i++) {
            System.out.print(" # ");
        }
    }
}

// Main Method
public class MyThread {
    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        t1.start();

        SecondThread t2 = new SecondThread();
        t2.start();


        ThirdThread t3 = new ThirdThread();
        t3.start();

    }
}
