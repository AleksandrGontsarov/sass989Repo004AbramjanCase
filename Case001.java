import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 02.11.15.
 */

// Дано целое число в диапазоне 1–7. Вывести
// строку — название дня недели, соответствующее данному
// числу (1 — «понедельник», 2 — «вторник» и т. д.).

public class Case001 {

    private static class Input {
        private Scanner s;
        private int a;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getA() {

            return a;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число А в диапазоне 1-7 : ");
            a = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();

        String result = null;
        String result1 = "понедельник";
        String result2 = "вторник";
        String result3 = "среда";
        String result4 = "четверг";
        String result5 = "пятница";
        String result6 = "суббота";
        String result7 = "воскресенье";
        String result8 = "не входит в диапазон 1-7" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 7-ми " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число А ";

        switch (a) {
            case 1:
                result = result1;
                break;
            case 2:
                result = result2;
                break;
            case 3:
                result = result3;
                break;
            case 4:
                result = result4;
                break;
            case 5:
                result = result5;
                break;
            case 6:
                result = result6;
                break;
            case 7:
                result = result7;
                break;
            default:
                result = result8;
        }

        Final(result, a);
    }

    private static void Final(String result, int a) {
        System.out.println();
        System.out.println("Данное число :" + a);
        System.out.println(result);
    }
}