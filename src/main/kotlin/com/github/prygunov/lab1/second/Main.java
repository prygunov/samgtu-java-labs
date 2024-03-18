package com.github.prygunov.lab1.second;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>(10);

        for (int i = 0; i < 10; i++) {
            vector.add(0.0);
        }

        WriterThread writerThread = new WriterThread(vector);
        ReaderThread readerThread = new ReaderThread(vector);

        writerThread.setPriority(Thread.MAX_PRIORITY);
        readerThread.setPriority(Thread.MIN_PRIORITY);

        writerThread.start();
        readerThread.start();
    }
}
