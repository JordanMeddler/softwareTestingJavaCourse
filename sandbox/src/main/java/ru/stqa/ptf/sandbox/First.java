package ru.stqa.ptf.sandbox;

public class First {
    public static void main(String args[]){
        String name = "Dima";
        hello(name + 3);

        double LEN = 5;
        System.out.println("Площадь квадрата со стороной " + LEN + " = " + area(LEN));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double oh){
        return oh *oh;
    }

    public static  double area(double a, double b) {
        return a * b;
    }

}