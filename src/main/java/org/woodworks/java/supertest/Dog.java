package org.woodworks.java.supertest;

public class Dog extends Animal {
    private boolean tail;

    public Dog(){
        this.tail = true;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tail=" + tail +
                '}';
    }
}
