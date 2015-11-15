import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 15.11.15.
 */

// Единицы длины пронумерованы следующим образом:
// 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр,
// 5 — сантиметр. Дан номер единицы длины (целое число в диапазоне 1–5)
// и длина отрезка в этих единицах (вещественное число).
// Найти длину отрезка в метрах.

public class Case006 {
    private static class Input {
        private Scanner s;
        private int n;
        private double a;
//        private double b;

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

//        public double getB() {
//
//            return b;
//        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число N в диапазоне 1-5: ");
            n = s.nextInt();
            System.out.print("Введите вещественное число А (длина отрезка) : ");
            a = s.nextDouble();
//            System.out.print("Введите вещественное число В : ");
//            b = s.nextDouble();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int n = input.getN();
        double a = input.getA();
//        double b = input.getB();

        double result = 0;

        String MeasuresOfLength;
        String decimetre = "Дециметр";
        String kilometre = "Километр";
        String metre = "Метр";
        String millimetre = "Миллиметр";
        String centimetre = "Сантиметр";
        String error = "не входит в диапазон 1-5" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 5-ти " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число N ";

        String Result;
        String Decimetre = "Дециметр переводится в метр : " + a + " * 0,1 = ";
        String Kilometre = "Километр переводится в метр : " + a + " * 1000 = ";
        String Metre = "Данная мера длины уже в метрах = ";
        String Millimetre = "Миллиметр переводится в метр : " + a + " * 0,001 = ";
        String Centimetre = "Сантиметр переводится в метр : " + a + " * 0,01 = ";

        switch (n) {
            case 1:
                MeasuresOfLength = decimetre;
                result = a * 0.1;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Decimetre;
                Final(MeasuresOfLength, Result, result, n);
                break;
            case 2:
                MeasuresOfLength = kilometre;
                result = a * 1000;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Kilometre;
                Final(MeasuresOfLength, Result, result, n);
                break;
            case 3:
                MeasuresOfLength = metre;
                result = a;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Metre;
                Final(MeasuresOfLength, Result, result, n);
                break;
            case 4:
                MeasuresOfLength = millimetre;
                result = a * 0.001;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Millimetre;
                Final(MeasuresOfLength, Result, result, n);
                break;
            case 5:
                MeasuresOfLength = centimetre;
                result = a * 0.01;
                result = Math.rint(100.0 * result) / 100.0; // округление до сотых
                Result = Centimetre;
                Final(MeasuresOfLength, Result, result, n);
                break;
            default:
                MeasuresOfLength = error;
                Final2(MeasuresOfLength, n);
                break;
        }
    }

    private static void Final(String MeasuresOfLength, String Result, double result,
                              int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println("Оно соответствует мере длины : " + MeasuresOfLength);
        System.out.println();
        System.out.println(Result + result+" m.");
        System.out.println();
    }

    private static void Final2(String MeasuresOfLength, int n) {
        System.out.println();
        System.out.println("Данное число N :" + n);
        System.out.println();
        System.out.println(MeasuresOfLength);
    }
}