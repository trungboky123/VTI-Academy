package Exercise3.Question7;

import Exercise3.Question6.MyMap;

public class Phone<K, V> extends MyMap<K, V> {

    public Phone(K key, V value){
        super(key, value);
    }

    public K getKey(){
        return super.getKey();
    }

    public V getPhoneNumber(){
        return super.getValue();
    }
}
