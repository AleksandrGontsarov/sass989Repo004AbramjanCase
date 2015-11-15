import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 02.11.15.
 */

// Дано целое число K. Вывести строку-описание оценки,
// соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно»,
// 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
// Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».

public class Case002 {

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
            System.out.print("Введите целое число А в диапазоне 1-5 : ");
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
        String result1 = "плохо";
        String result2 = "неудовлетворительно";
        String result3 = "удовлетворительно";
        String result4 = "хорошо";
        String result5 = "отлично";
        String result6 = "ошибка"+ "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 5-ти " + "\n" +
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
            default:
                result = result6;
                break;
        }

        Final(result, a);
    }

    private static void Final(String result, int a) {
        System.out.println();
        System.out.println("Данное число :" + a);
        System.out.println(result);
    }

}
