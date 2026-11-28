package multithreading;

public class threadId {
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());

        Thread t1= new Thread(()-> {
            System.out.println("Nmae of my thread is"+ Thread.currentThread().getName());
        });
        t1.start();
        
    }
}
