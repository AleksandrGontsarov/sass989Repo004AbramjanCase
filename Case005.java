import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.11.15.
 */

// Арифметические действия над числами пронумерованы
// следующим образом: 1 — сложение,
// 2 — вычитание, 3 — умножение, 4 — деление.
// Дан номер действия N (целое число в диапазоне 1–4) и
// вещественные числа A и B (В не равно 0).
// Выполнить над числами указанное действие и вывести результат.

public class Case005 {

    private static class Input {
        private Scanner s;
        private int n;
        private double a;
        private double b;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getN() {

            return n;
        }

        public double getA() {

            return a;
        }

        public double getB() {

            return b;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число N в диапазоне 1-4: ");
            n = s.nextInt();
            System.out.print("Введите вещественное число А : ");
            a = s.nextDouble();
            System.out.print("Введите вещественное число В : ");
            b = s.nextDouble();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int n = input.getN();
        double a = input.getA();
        double b = input.getB();

        double result;

        String Arithmetic;
        String addition = "Сложение";
        String subtraction = "Вычитание";
        String multiplication = "Умножение";
        String division = "Деление";
        String error = "не входит в диапазон 1-4" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 4-ех " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число N ";

        String Result;
        String Addition = "A + B = " + a + " + " + b + " = ";
        String Subtraction = "A - B = " + a + " - " + b + " = ";
        String Multiplication = "A * B = " + a + " * " + b + " = ";
        String Division = "A / B = " + a + " / " + b + " = ";

        switch (n) {
            case 1:
                Arithmetic = addition;
                result = a + b;
                Result = Addition;
                Final(Arithmetic, Result, result, n);
                break;
            case 2:
                Arithmetic = subtraction;
                result = a - b;
                Result = Subtraction;
                Final(Arithmetic, Result, result, n);
                break;
            case 3:
                Arithmetic = multiplication;
                result = a * b;
                Result = Multiplication;
                Final(Arithmetic, Result, result, n);
                break;
            case 4:
                Arithmetic = division;
                result = a / b;
                Result = Division;
                Final(Arithmetic, Result, result, n);
                break;
            default:
                Arithmetic = error;
                Final2(Arithmetic, n);
                break;
        }
    }

    private static void Final(String Arithmetic, String Result, double result,
                              int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println("Оно соответствует арифметическому действию : " + Arithmetic);
        System.out.println(Result + result);
        System.out.println();
    }

    private static void Final2(String Arithmetic, int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println(Arithmetic);
    }
}