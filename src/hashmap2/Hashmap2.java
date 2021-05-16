package hashmap2;

import java.util.ArrayList;
import java.util.List;

public class Hashmap2 {

    private List<KeyValue> arr;

    public Hashmap2() {
        arr = new ArrayList<>();
    }

    public List getArr() {
        return arr;
    }

    public void setArr(List arr) {
        this.arr = arr;
    }

    public void put(int key, long value){

        for (KeyValue kv : arr) {
            if (kv.getKey() == key){
                arr.remove(kv);
            }
        }


        KeyValue putKeyValue = new KeyValue(key, value);

        arr.add(putKeyValue);
    }

    public Long get(int key){

        for (KeyValue kv : arr) {
            if (kv.getKey() == key){
                return kv.getValue();
            }
        }
        return null;
    }

    public int size(){

        return arr.size();
    }
}
