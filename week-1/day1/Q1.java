package day1;

public class Q1 {
 
    
    public static int add(int a, int b)
    {
        return a + b;
    }
 
   
    public static double add(
        double a, double b)
    {
        return a + b;
    }
 
    
    public static void main(String args[])
    {
        
        System.out.println(add(2, 3));
 
        
        System.out.println(add(2.0, 3.0));
    }
}

class Test {
 
   
    public void method()
    {
        System.out.println("Method 1");
    }
}
 

 class GFG extends Test {
 
    
    public void method()
    {
        System.out.println("Method 2");
    }
 
    
    public static void main(String args[])
    {
        Test test = new GFG();
 
        test.method();
    }
}