import javax.lang.model.util.ElementScanner7;

public class Main {
    public static void main(String[] args) {
//        int salary = 65535;
//        int total = 0;
//        for(; total < 1_000_000;) {
//            total = total + total/100;
//            total = total + salary;
//            System.out.println(total)
//        }
//            int salary = 65535;
//            int total = 0;
//            while (total<1_000_000) {
//                total = total + total / 100;
//                total = total + salary;
//                System.out.println(total);
//            }
        //Задача №1
//        System.out.println("Задача №1");
//        int salary = 15000;
//        int total = 0;
//        int i = 1;
//        while (total < 1_000_000) {
//            total = total + total / 100;
//            total = total + salary;
//            System.out.println(("Месяц " + (i++)) + ", сумма накоплений равна " + total + " рублей");
//        }
//        //Задача №2
//        System.out.println("Задача №2");
//
//        int totalNum = 0;
//        while (totalNum < 10) {
//            totalNum++;
//            System.out.print(totalNum + " ");
//        }
//        System.out.println();
//        {


//            for (int totalNum1 = 10; totalNum1 > 0; totalNum1--) {
//                System.out.print(totalNum1 + " ");
//
//            }
//        }

        //Задача№3
        System.out.println("Задача №3");
        int population2022 = 12_000_000;
        int born1000 = 17;
        int death1000 = 8;
        int born = born1000 * population2022 / 1000;
        int death = death1000 * population2022 / 1000;
        int ratio = born - death;
        for (int year = 2023; year <= 2033; year++) {
            population2022 = population2022 + ratio;
            System.out.println("Год " + year + ", численность населения составляет " + population2022);
        }
        //Приме
//        int salary = 65535;
//        int total = 0;
//        int i = 0;
//        for (; total < 1_000_000; i++) {
//            total = total +total/100;
//            total = total + salary;
//            if (i%5 ==0) {
//            }
//        }
//        System.out.println(total);

        //Задача №4
        System.out.println("Задача №4");
        double deposit = 15000;
        double total = 0;
        for (int i = 0; total <= 12_000_000; i++) {
            total = total + total * 0.07;
            total = total + deposit;
            if (i % 6 == 0) {

                System.out.println(" Месяц " + i + " накоплено: " + total + " рублей");

            }

        }
        System.out.println("Итого: " + total);

        double deposit1 = 15000;
        double total1 = 0;
        for (int i = 0; i <= 108; i++) {
            total1 = total1 + total1 * 0.07;
            total1 = total1 + deposit1;
            if (i % 6 == 0) {
                System.out.println(" Накопленные за полгода " + i + " накоплено: " + total1 + " рублей");
            }
        }
        System.out.println(total1);

        //Задача №7.
        System.out.println("Задача №7");

        int friday = 3;
        for (int day = 1; day < 31; day++) {
            if (day == friday || day == friday + 6 || day == friday + 12 || day == friday + 18 || day == friday + 24) {
                System.out.println("Пятница! Сдаем отчеты");
            } else {
                System.out.println("Сдавать рано");
            }
        }
        {
        int com = 79;
        int yearStart = 1896;
        int prCom = yearStart+com;
        int yearFinish = 2054;
        for (int year = 1896; year <=2054; year++) {

            if (year == prCom || year == prCom + com) {
                System.out.println(" Год " + year + " комета летит");

            } else {
                System.out.println(" Год " + year + " комета не летит");
            }
            }
            double d = 1e10;
            System.out.printf("%f%n", d);

            }
        }
    }



