package com.github.prygunov.lab1.second;

import java.util.Vector;

public class ReaderThread extends Thread {
    private Vector<Double> vector;

    public ReaderThread(Vector<Double> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.size(); i++) {
            double value = vector.get(i);
            System.out.println("Read: " + value + " from position " + i);
        }
    }
}
