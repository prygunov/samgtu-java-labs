package com.github.prygunov.lab1.third;

import java.util.Vector;

public class Data {
    private Vector<Double> vector;
    private boolean isWriting;

    public Data() {
        vector = new Vector<>(10);
        for (int i = 0; i < 10; i++) {
            vector.add(0.0);
        }
        isWriting = false;
    }

    public synchronized void write(int index, double value) {
        while (isWriting) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isWriting = true;
        vector.set(index, value);
        System.out.println("Write: " + value + " to position " + index);
        isWriting = false;

        notifyAll();
    }

    public synchronized double read(int index) {
        while (isWriting) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double value = vector.get(index);
        System.out.println("Read: " + value + " from position " + index);

        notifyAll();

        return value;
    }
}

