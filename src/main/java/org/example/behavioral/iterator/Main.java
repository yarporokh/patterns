package org.example.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Apple", "Banana", "Potato", "Cola"};
        Shop shop = new Shop("ATB", products);

        Iterator iterator = shop.getIterator();

        System.out.println("Shop: " + shop.getName());
        System.out.println("Products: ");

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
