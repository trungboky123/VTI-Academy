package Assignments.Assignment_Lesson_9.Exercise3.Question7;

import Assignments.Assignment_Lesson_9.Exercise3.Question6.MyMap;

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
