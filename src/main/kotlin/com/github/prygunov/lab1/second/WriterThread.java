package com.github.prygunov.lab1.second;

import java.util.Vector;

public class WriterThread extends Thread {
    private Vector<Double> vector;

    public WriterThread(Vector<Double> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.size(); i++) {
            double value = Math.random() * 100;
            vector.set(i, value);
            System.out.println("Write: " + value + " to position " + i);
        }
    }
}

