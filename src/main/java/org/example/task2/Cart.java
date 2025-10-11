package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public void add(Item item) {
        if (this.index >= this.contents.length) {
            System.out.println("Кошик переповнений!");
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public void removeById(long id) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == id) {
                // зрушуємо масив вліво
                for (int j = i; j < this.index - 1; j++) {
                    this.contents[j] = this.contents[j + 1];
                }
                this.contents[this.index - 1] = null;
                this.index--;
                break;
            }
        }
    }

    public int getItemCount() {
        return this.index;
    }

    public Item[] getContents() {
        return Arrays.copyOf(this.contents, this.index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart:\n");
        for (int i = 0; i < this.index; i++) {
            sb.append(this.contents[i].toString()).append("\n");
        }
        return sb.toString();
    }
}