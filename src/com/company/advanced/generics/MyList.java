package com.company.advanced.generics;

import java.util.Arrays;

public class MyList<E> {

    private Object[] elements;

    public MyList() {
        elements = new Object[0];
    }

    public void add(E e) {
        grow();
        elements[elements.length - 1] = e;
    }

    public E get(int index) {
        if (index < 0 || index >= elements.length) {
           throw new RuntimeException("BLOGAS INDEKSAS");
        }
        return (E) elements[index];
    }

    private void grow() {
        elements = Arrays.copyOf(elements, elements.length + 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
