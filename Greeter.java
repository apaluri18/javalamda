
public class Greeter {
    
    
    public void greet()
    {
        System.out.println("Hello World");
        
    }
    
    public static void main (String args[]){
        
        Greeter test = new Greeter();
        
        test.greet();
        
        
      myLambda print   =   () -> System.out.print("Hello Lambda!");
     // myLambda  add  = (int a , int b) -> a + b;
     print.myLambdaFunction();
     
    }
    
}

