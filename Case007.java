import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 18.11.15.
 */

// Единицы массы пронумерованы следующим образом:
// 1 — килограмм,
// 2 — миллиграмм,
// 3 — грамм,
// 4 — тонна,
// 5 — центнер.
// Дан номер единицы массы (целое число в диапазоне 1–5)
// и масса тела в этих единицах (вещественное число).
// Найти массу тела в килограммах.

public class Case007 {
    private static class Input {
        private Scanner s;
        private int n;
        private double a;

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

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число N в диапазоне 1-5 : ");
            n = s.nextInt();
            System.out.print("Введите вещественное число А (масса тела) : ");
            a = s.nextDouble();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int n = input.getN();
        double a = input.getA();

        double result = 0;

        String MeasuresOfWeight;
        String kilogram = "Килограмм";
        String milligram = "Миллиграмм";
        String gram = "Грамм";
        String ton = "Тонна";
        String hundredweight = "Центнер";
        String error = "не входит в диапазон 1-5" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 5-ти " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число N ";

        String Result;
        String Kilogram = "Данная мера веса уже в килограммах :) = ";
        String Milligram = "Миллиграмм переводится в килограмм : " + a + " * 0,000001 = ";
        String Gram = "Грамм переводится в килограмм : " + a + " * 0,001 = ";
        String Ton = "Тонна переводится в килограмм : " + a + " * 1000 = ";
        String Hundredweight = "Центнер переводится в килограмм : " + a + " * 100 = ";

        switch (n) {
            case 1:
                MeasuresOfWeight = kilogram;
                result = a;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Kilogram;
                Final(MeasuresOfWeight, Result, result, n);
                break;
            case 2:
                MeasuresOfWeight = milligram;
                result = a * 0.000001;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Milligram;
                Final(MeasuresOfWeight, Result, result, n);
                break;
            case 3:
                MeasuresOfWeight = gram;
                result = a * 0.001;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Gram;
                Final(MeasuresOfWeight, Result, result, n);
                break;
            case 4:
                MeasuresOfWeight = ton;
                result = a * 1000;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Ton;
                Final(MeasuresOfWeight, Result, result, n);
                break;
            case 5:
                MeasuresOfWeight = hundredweight;
                result = a * 100;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Hundredweight;
                Final(MeasuresOfWeight, Result, result, n);
                break;
            default:
                MeasuresOfWeight = error;
                Final2(MeasuresOfWeight, n);
                break;
        }
    }

    private static void Final(String MeasuresOfWeight, String Result, double result,
                              int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println("Оно соответствует мере веса : " + MeasuresOfWeight);
        System.out.println();
        System.out.println(Result + result + " kg");
        System.out.println();
    }

    private static void Final2(String MeasuresOfWeight, int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println(MeasuresOfWeight);
    }
}