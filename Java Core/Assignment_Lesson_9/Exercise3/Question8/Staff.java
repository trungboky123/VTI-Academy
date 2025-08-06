package Assignment_Lesson_9.Exercise3.Question8;

import Assignment_Lesson_9.Exercise3.Question6.MyMap;

public class Staff<K, V> extends MyMap<K, V>{
    
    public Staff(K key, V value){
        super(key, value);
    }

    public K getID(){
        return super.getKey();
    }

    public V getName(){
        return super.getValue();
    }

    @Override
    public String toString(){
        return "ID: " + getID() + ", Name: " + getName();
    }
}
