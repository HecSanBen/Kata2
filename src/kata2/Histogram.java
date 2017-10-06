package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram <T> {
    private T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        
        for ( T value : data) {
            histogram.put(value, histogram.containsKey(value) ? 
                    histogram.get(value) + 1 : 1);
        }
        
    return histogram;
    }
    
}
