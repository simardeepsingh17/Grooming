package day1;

import java.util.ArrayList;

class Q3{  
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
  
        //autoboxing
        list.add(5);
        list.add(6);
  
        System.out.println("ArrayList: " + list);

        // unboxing
        int a = list.get(0);
        System.out.println("Value at index 0: " + a);
     }
  }  