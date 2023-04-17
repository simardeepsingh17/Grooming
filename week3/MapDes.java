package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDes {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("2", "ap");
        map.put("1", "dhoni");
        map.put("3", "virat");

        List<String> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, Collections.reverseOrder());

        arr.forEach((i)->{System.out.println(i+" : "+map.get(i));});

    }
}
