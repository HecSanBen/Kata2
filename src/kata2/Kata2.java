package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"juan","lola","lola","lola","juan"};
        Histogram histo = new Histogram (data);
        //  Clave    Valor.   Implementado como HashMap
        Map<String, Integer> histogram = histo.getHistogram();

  
        for (String key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
        
        System.out.println(Arrays.asList(histogram));
        System.out.println(histogram.entrySet());
    }
}