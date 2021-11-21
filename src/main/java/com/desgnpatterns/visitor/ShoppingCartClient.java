package com.desgnpatterns.visitor;

/**
 * https://www.geeksforgeeks.org/visitor-design-pattern/
 *
 * Visitor design pattern is one of the behavioral design patterns. It is used when we have to perform an
 * operation on a group of similar kind of Objects. With the help of visitor pattern,
 * we can move the operational logic from the objects to another class.
 *
 * The visitor pattern consists of two parts:
 *
 * 1. A method called Visit() which is implemented by the visitor and is called for every element in the data structure.
 * 2. Visitable classes providing Accept() methods that accept a visitor
 *
 */
class ShoppingCartClient {

    public static void main(String[] args)
    {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
