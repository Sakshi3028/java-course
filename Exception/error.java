package Exception;

public class error {
    public static void main(String[] args) {
        
        //exception handling
        System.out.println("Step 1");
        try{
          int a=5;
          int b=0;
          System.out.println(a/b);//risky code
        }
        catch(ArithmeticException e){
        System.out.println("division by zero is not allowed");
        }
        System.out.println("Step 2");
    }
}
//why exception handle

