package week3;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeSortComparator {
   

        private String name;
        private Integer marks;
    
        public TreeSortComparator(String string, int i) {
            this.name=string;
            this.marks=i;
        }

        public static void main(String[] args)
        {
            TreeMap<TreeSortComparator, Integer> map
                    = new TreeMap<>(new MarksSort());
    
            map.put(new TreeSortComparator("A", 100), 1);
            map.put(new TreeSortComparator("B", 10), 2);
            map.put(new TreeSortComparator("C", 60), 3);
    
            map.forEach((k,v)->{System.out.println(k.getName()+" : "+k.getMarks()+" : "+v);});
        }

        Integer getMarks() {
            return this.marks;
        }

        String getName() {
            return this.name;
        }
    }
    
    
    class MarksSort implements Comparator<TreeSortComparator> {
        public int compare(TreeSortComparator s1, TreeSortComparator s2)
        {
            return s1.getMarks().compareTo(s2.getMarks());
        }
    
}
