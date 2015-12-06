import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.12.15.
 */

// Даны два целых числа: D (день) и M (месяц),
// определяющие правильную дату невисокосного года.
// Вывести значения D и M для даты, предшествующей указанной.

public class Case008 {
    private static class Input {
        private Scanner s;
        private int d;
        private int m;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getD() {

            return d;
        }

        public int getM() {

            return m;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число D(день) в диапазоне 1-31 : ");
            d = s.nextInt();
            System.out.print("Введите целое число М(месяц) в диапазоне 1-12 : ");
            m = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int d = input.getD();
        int m = input.getM();

        int dMax; // максимальное кол-во дней в месяце
        int oldD = 0; // предшествующий день
        String oldM = null; // предшествующий месяц

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
                "Пожалуйста перезапустите программу и введите новое число M ";
        String error2 = "не входит в диапазон" + "\n" +
                "" + "\n" +
                "" + "\n" +
                "Введенное число должно быть в диапазоне от 1-го до 28-ми, 30-ти или 31-го" +
                "(в зависимости от введенного месяца)." +
                " " + "\n" +
                "Для января, марта, мая, июля, августа, октября, декабря : 31  " + "\n" +
                "Для февраля : 28  " + "\n" +
                "Для апреля, июня, сентября, ноября : 30  " + "\n" +
                "" + "\n" +
                "Пожалуйста перезапустите программу и введите новое число D ";
        String Winter = "зима";
        String Spring = "весна";
        String Summer = "лето";
        String Autumn = "осень";

        switch (m) {
            case 1:
                month = jan;
                fourSeason = Winter;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = dec;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 2:
                month = feb;
                fourSeason = Winter;
                dMax = 28;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = jan;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 3:
                month = mar;
                fourSeason = Spring;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 28;
                    oldM = feb;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 4:
                month = apr;
                fourSeason = Spring;
                dMax = 30;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = mar;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 5:
                month = may;
                fourSeason = Spring;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 30;
                    oldM = apr;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 6:
                month = jun;
                fourSeason = Summer;
                dMax = 30;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = may;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 7:
                month = jul;
                fourSeason = Summer;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 30;
                    oldM = jun;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 8:
                month = aug;
                fourSeason = Summer;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = jul;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 9:
                month = spt;
                fourSeason = Autumn;
                dMax = 30;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = aug;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 10:
                month = okt;
                fourSeason = Autumn;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 30;
                    oldM = spt;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 11:
                month = nov;
                fourSeason = Autumn;
                dMax = 30;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 31;
                    oldM = okt;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            case 12:
                month = dec;
                fourSeason = Winter;
                dMax = 31;
                if (d < 1) {
                    Final3(error2, d);
                } else if (d > dMax) {
                    Final3(error2, d);
                } else if (d == 1) {
                    oldD = 30;
                    oldM = nov;
                } else if (d > 1 && d <= dMax) {
                    oldD = d - 1;
                    oldM = month;
                }
                Final(month, fourSeason, m, d, oldD, oldM);
                break;
            default:
                month = error;
                Final2(month, m);
                break;
        }
    }

    private static void Final(String month, String fourSeason, int m, int d, int oldD, String oldM) {
        System.out.println();
        System.out.println("Введенное вами число D(день) :" + d);
        System.out.println();
        System.out.println("Введенное вами число M(месяц) :" + m);
        System.out.println("Оно соответствует месяцу : " + month);
        System.out.println("И времени года : " + fourSeason);
        System.out.println();
        System.out.println("Введенная вами дата : " + d + " " + month);
        System.out.println();
        System.out.println("Предшествующая дата : " + oldD + " " + oldM);
    }

    private static void Final2(String month, int m) {
        System.out.println();
        System.out.println("Введенное вами число M(месяц) : " + m);
        System.out.println();
        System.out.println(month);
    }

    private static void Final3(String error2, int d) {
        System.out.println();
        System.out.println("Введенное вами число D(день) : " + d);
        System.out.println();
        System.out.println(error2);
    }
}