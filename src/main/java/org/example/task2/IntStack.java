package org.example.task2;

public class IntStack {

    private int[] stackArray;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    public IntStack() {
        this.stackArray = new int[INITIAL_CAPACITY];
        this.top = 0;
    }

    public void push(int value) {
        if (this.top == this.stackArray.length) {
            expandCapacity();
        }
        this.stackArray[this.top++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній!");
        }
        return this.stackArray[--this.top];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній!");
        }
        return this.stackArray[this.top - 1];
    }

    public int size() {
        return this.top;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public void clear() {
        this.top = 0;
    }

    private void expandCapacity() {
        int newCapacity = this.stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(this.stackArray, 0, newArray, 0, this.stackArray.length);
        this.stackArray = newArray;
    }
}