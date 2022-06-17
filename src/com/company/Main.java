package com.company;

public class Main {

    public static void main(String[] args) {
        Order juneOrder = new Order();

        juneOrder.quantity = 5;
        juneOrder.price = 32700;
        juneOrder.sku = 155_000_000;
        juneOrder.employeeNumber = 5_000_000_000L;
        juneOrder.minDiscount = 0.10f;
        juneOrder.maxDiscount = 0.90;
        juneOrder.storeType = 'B';

        int firstNumber = 10_000_000;
        long secondNumber = 100_066_123_455L;
        long thirdNumber = 155_000_884_433_112_201L;

        char firstChar = '\u00A9';
        char secondChar = '\u00B5';
        char thirdChar = '\u00AE';

        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
    }
}
