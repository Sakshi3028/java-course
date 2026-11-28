package multithreading;;

public class threading {
    public static void main(String[] args) {
    // Mythread t1= new Mythread();
    // t1.start();
    // }
  Myrunnable r1= new Myrunnable();
 Thread t1 = new Thread()=> System.out.println("thread is running");
 t1.start();

}
}
// class Mythread extends Thread{
//     @Override
//      public void run(){
//         System.out.println("thread is running");

class Myrunnable implements runnable{
    @Override
     public void run(){
        System.out.println("thread is running");
     }
}
