package com.github.prygunov.lab1.third;

public class WriterRunnable implements Runnable {
    private Data data;
    private int index;

    public WriterRunnable(Data data, int index) {
        this.data = data;
        this.index = index;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double value = Math.random() * 100;
            data.write(index, value);
        }
    }
}
