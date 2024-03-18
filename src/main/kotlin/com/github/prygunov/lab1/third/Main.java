package com.github.prygunov.lab1.third;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        Thread writerThread = new Thread(new WriterRunnable(data, 0));
        Thread readerThread = new Thread(new ReaderRunnable(data, 0));

        writerThread.start();
        readerThread.start();
    }
}
