package week4;


    
    public class Tester{
        public static void main(String[] args)
        throws CloneNotSupportedException {
           A a = A.a;
           A b = (A)a.clone();
     
           System.out.println(a.hashCode());
           System.out.println(b.hashCode());
        }
     }
     
      class A implements Cloneable {
        public static A a= new A();
        private A(){}
     
        // public static A getInstance(){
        //    if(a == null){
        //       a = new A();
        //    }
           
        //    return a;
        // }
     
        @Override
        protected Object clone()
        throws CloneNotSupportedException {
           return super.clone();
        
        }
    }
