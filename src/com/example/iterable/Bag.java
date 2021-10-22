package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;


public class Bag<T> implements Container<T> {

    ArrayList<T> arr=new ArrayList<T>();


    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public void add(T item) {
        arr.add(item);
    }

    @Override
    public Iterator iterator() {
        return arr.iterator();
    }
}