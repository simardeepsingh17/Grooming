package week4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamCollect {
    
    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,8,6,4);
        
        
        // Stream<Integer> data = list.stream(); 
        // data.forEach(a -> {System.out.println(a);});
        //System.out.println(data.count());

        // list.stream()
        //     .filter((n)-> {return n>2;})
        //     .filter(n -> n%3==0)
        //     .forEach(n -> System.out.println(n));

            List<String> courses = List.of("spring","spring boot","api");
        
            // courses.stream()
            //     .map(n -> n.length())
            //     .forEach(n-> System.out.println(n));
             
            
           // int stn    = list.stream().reduce(0,(x,y)->  x+y);

            //System.out.println(stn);

            // int ans=list.stream()
            //     .filter(a-> a%2==1).reduce(0,(a,b)-> a+b);
            // System.out.println(ans);

            // list.stream().sorted().forEach(n-> System.out.println(n));
            // courses.stream().sorted(Comparator.comparing(n->n.length())).forEach(n-> System.out.println(n));
            
            // List<Integer> l = list.stream().filter(n->n%2==0).collect(Collectors.toList());
            // System.out.println(l);

            // List<Integer> l2= courses.stream().map(n-> n.length()).collect(Collectors.toList());
            // System.out.println(l2);
            BinaryOperator<Integer> sum = (a,b)-> a+b;
            Integer ans=list.stream().reduce(0,sum);
            System.out.println(ans);
    }
}
