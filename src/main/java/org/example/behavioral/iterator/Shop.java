package org.example.behavioral.iterator;

import java.util.Arrays;

public class Shop implements Collection {
    private String name;
    private String[] products;

    public Shop(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < products.length;
        }

        @Override
        public Object next() {
            return products[index++];
        }
    }
}
