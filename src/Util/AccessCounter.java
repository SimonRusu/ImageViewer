package Util;

import java.util.HashMap;

public class AccessCounter {
    final private HashMap<Integer, Integer> accesses = new HashMap<>();
    private static final AccessCounter instance = new AccessCounter();
    
    public static  AccessCounter getInstance(){
        return instance;
    }

    private AccessCounter() {
    }
    
    
    public Integer increment (Integer key){
        final Integer count;
        if (this.accesses.containsKey(key)){
            count = this.accesses.get(key) + 1;
        }else {
            count = 1;
        }
        this.accesses.put(key, count);
        return count;
    }
}
