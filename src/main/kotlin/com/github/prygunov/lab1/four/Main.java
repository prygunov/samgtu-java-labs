package com.github.prygunov.lab1.four;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Vector<Integer> synchronizedVector = synchronizedVector(vector);

        // Use the synchronizedVector in a multi-threaded environment
    }

    public static Vector synchronizedVector(Vector vector) {
        return new SynchronizedVector(vector);
    }
}
