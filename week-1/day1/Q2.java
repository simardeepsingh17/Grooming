package day1;



class Identity 
{ 
   String name = "Deep"; 
   protected int year = 2000;
   public int age = 28; 
void m1()
    { 
        System.out.println("Name: " +name); 
    } 
public void m2()
    { 
        System.out.println("Age: " +age); 
    } 
} 
class Person extends Identity 
{ 

} 
public class Q2 
{ 
 public static void main(String[] args) 
 { 
   Person p = new Person(); 
     p.m1(); 
     p.m2(); 
    System.out.println("Name: " +p.name); 
    System.out.println("Age: " +p.age); 
    System.out.println("Year: " +p.year); 
  } 
 }
