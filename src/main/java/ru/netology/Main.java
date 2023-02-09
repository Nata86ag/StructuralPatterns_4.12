package ru.netology;

public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(4, 4));
        System.out.println(calc.sum(9, 2));
        System.out.println(calc.pow(4, 1));
    }
}