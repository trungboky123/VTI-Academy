package Assignments.Assignment_Lesson_9.Exercise3.Question6;

public class MyMap<K, V> {
    public K key;
    public V value;

    public MyMap(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return "ID: " + getKey() + ", Name: " + getValue();
    }
}
