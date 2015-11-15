import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 05.11.15.
 */

// Дан номер месяца — целое число в диапазоне 1–12
// (1 — январь, 2 — февраль и т. д.). Определить
// количество дней в этом месяце для невисокосного года.

public class Case004 {

    private static class Input {
        private Scanner s;
        private int a;
        private int b;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getA() {

            return a;
        }

        public int getB() {

            return b;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число А в диапазоне 1-12 (месяц) : ");
            a = s.nextInt();
            System.out.print("Введите целое число B (год) : ");
            b = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();
        int b = input.getB();

        String month;
        String fourSeason = null;
        String jan = "январь";
        String feb = "февраль";
        String mar = "март";
        String apr = "апрель";
        String may = "май";
        String jun = "июнь";
        String jul = "июль";
        String aug = "август";
        String spt = "сентябрь";
        String okt = "октябрь";
        String nov = "ноябрь";
        String dec = "декабрь";
        String error = "не входит в диапазон 1-12" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 12-ти " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число А ";

        String Winter = "зима";
        String Spring = "весна";
        String Summer = "лето";
        String Autumn = "осень";

        String result = null;
        String result1 = "Данный год : високосный";
        String result2 = "Данный год : невисокосный";

        String daysInMonth = null;
        String days1 = "В этом месяце 28 дней";
        String days2 = "В этом месяце 29 дней";
        String days3 = "В этом месяце 30 дней";
        String days4 = "В этом месяце 31 день";

        if (b % 400 != 0 && b % 100 == 0) {
            result = result2;
        } else if (b % 4 == 0) {
            result = result1;
        } else if (b % 4 != 0) {
            result = result2;
        }

        switch (a) {
            case 1:
                month = jan;
                fourSeason = Winter;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 2:
                month = feb;
                fourSeason = Winter;
                if (b % 400 != 0 && b % 100 == 0) {
                    daysInMonth = days1;
                } else if (b % 4 == 0) {
                    daysInMonth = days2;
                } else if (b % 4 != 0) {
                    daysInMonth = days1;
                }
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 3:
                month = mar;
                fourSeason = Spring;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 4:
                month = apr;
                fourSeason = Spring;
                daysInMonth = days3;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 5:
                month = may;
                fourSeason = Spring;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 6:
                month = jun;
                fourSeason = Summer;
                daysInMonth = days3;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 7:
                month = jul;
                fourSeason = Summer;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 8:
                month = aug;
                fourSeason = Summer;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 9:
                month = spt;
                fourSeason = Autumn;
                daysInMonth = days3;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 10:
                month = okt;
                fourSeason = Autumn;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 11:
                month = nov;
                fourSeason = Autumn;
                daysInMonth = days3;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            case 12:
                month = dec;
                fourSeason = Winter;
                daysInMonth = days4;
                Final(month, fourSeason, result, daysInMonth, b, a);
                break;
            default:
                month = error;
                Final2(month, a);
                break;
        }
    }

    private static void Final(String month, String fourSeason, String result,
                              String daysInMonth, int b, int a) {
        System.out.println();
        System.out.println("Данное число A :" + a);
        System.out.println();
        System.out.println("Оно соответствует месяцу : " + month);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("И времени года : " + fourSeason);
        System.out.println();
        System.out.println("Данное число B :" + b);
        System.out.println(result);
    }

    private static void Final2(String month, int a) {
        System.out.println();
        System.out.println("Данное число A :" + a);
        System.out.println();
        System.out.println(month);
    }
}