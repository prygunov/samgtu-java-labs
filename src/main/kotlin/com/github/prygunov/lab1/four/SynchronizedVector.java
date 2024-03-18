package com.github.prygunov.lab1.four;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class SynchronizedVector extends Vector {
    private Vector vector;

    public SynchronizedVector(Vector vector) {
        this.vector = vector;
    }

    @Override
    public synchronized int size() {
        return vector.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return vector.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return vector.contains(o);
    }

    @Override
    public synchronized Enumeration elements() {
        return vector.elements();
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return vector.containsAll(c);
    }

    // Implement other methods of the Vector interface in a similar way

    // Overload methods from the Object class

    @Override
    public synchronized boolean equals(Object o) {
        return vector.equals(o);
    }

    @Override
    public synchronized int hashCode() {
        return vector.hashCode();
    }

    @Override
    public synchronized String toString() {
        return vector.toString();
    }
}