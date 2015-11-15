import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 02.11.15.
 */

// Дан номер месяца — целое число в диапазоне 1–12
// (1 — январь, 2 — февраль и т. д.).
// Вывести название соответствующего времени года
// («зима», «весна», «лето», «осень»).

public class Case003 {
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
            System.out.print("Введите целое число А в диапазоне 1-12 : ");
            a = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();

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

        switch (a) {
            case 1:
                month = jan;
                fourSeason = Winter;
                Final(month, fourSeason, a);
                break;
            case 2:
                month = feb;
                fourSeason = Winter;
                Final(month, fourSeason, a);
                break;
            case 3:
                month = mar;
                fourSeason = Spring;
                Final(month, fourSeason, a);
                break;
            case 4:
                month = apr;
                fourSeason = Spring;
                Final(month, fourSeason, a);
                break;
            case 5:
                month = may;
                fourSeason = Spring;
                Final(month, fourSeason, a);
                break;
            case 6:
                month = jun;
                fourSeason = Summer;
                Final(month, fourSeason, a);
                break;
            case 7:
                month = jul;
                fourSeason = Summer;
                Final(month, fourSeason, a);
                break;
            case 8:
                month = aug;
                fourSeason = Summer;
                Final(month, fourSeason, a);
                break;
            case 9:
                month = spt;
                fourSeason = Autumn;
                Final(month, fourSeason, a);
                break;
            case 10:
                month = okt;
                fourSeason = Autumn;
                Final(month, fourSeason, a);
                break;
            case 11:
                month = nov;
                fourSeason = Autumn;
                Final(month, fourSeason, a);
                break;
            case 12:
                month = dec;
                fourSeason = Winter;
                Final(month, fourSeason, a);
                break;
            default:
                month = error;
                Final2(month, a);
                break;
        }
    }

    private static void Final(String month, String fourSeason, int a) {
        System.out.println();
        System.out.println("Данное число :" + a);
        System.out.println();
        System.out.println("Оно соответствует месяцу : " + month);
        System.out.println();
        System.out.println("И времени года : " + fourSeason);
    }

    private static void Final2(String month, int a) {
        System.out.println();
        System.out.println("Данное число :"+ a);
        System.out.println();
        System.out.println(month);
    }
}