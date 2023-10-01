public class Main {
    public static void main(String[] args) {
        System.out.println("Java cicles part two");


        System.out.println("Task 1");
        /**
         * Сколько месяцев потребуется для достижения вклада 2459000 рублей,
         * если каждый месяц откладывать по 15000 рублей.
         * На вклад начисляются проценты (12 процентов годовых или 1 процент в месяц)
         * Решить задачу при помощи цикла while
         */
        int month = 1;
        int total = 0;
        int salary = 15000;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + " сумма вклада равна " + total + " рублей.");
            month++;
        }


        System.out.println("Task 2");
        /**
         * Выводим в одной строке числа от 1 до 10, используя цикл while
         * Выводим в другой строке числа от 10 до 1, используя цикл for
         */
        int num = 0;
        System.out.println("Числа от 1 до 10");
        while (num < 10) {
            num++;
            System.out.print(num + " ");

        }

        System.out.println("\n");
        System.out.println("Числа от 10 до 1");
        for( ; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Task 3");
        /**
         * В стране 12 млн человек.
         * Рождаемость 17 человек на 1000
         * Смертность 8 человек на 1000
         * Какая численность через 10 лет
         * Год .... численность населения составляет .... .
         */

        int populationY = 12000000; // Начальное кол-во населения
        int fertilityY; // Рождаемость
        int mortalityY; // Смертность

        for(int year = 1; year <= 10; year++) {
            fertilityY = populationY / 1000 * 17;
            mortalityY = populationY / 1000 * 8;
            populationY = populationY + fertilityY - mortalityY;
            System.out.println("Год " + year + " численность населения составляет " + populationY);
        }

        System.out.println("Task 4");
        /**
         * Сколько потребуется месяцев для сбора 12000000
         * если вложить 15000 под 7 процентов в менсяц
         * Вывести в консоль результат накоплений за каждый месяц.
         *
         */
        int monthOfDeposit = 1; //
        int totalDeposit = 15000; //  вклад
        while (totalDeposit < 12000000) {
            totalDeposit = totalDeposit + totalDeposit / 100 * 7;
            System.out.println("К концу " + monthOfDeposit + " месяца, сумма накоплений равна " + totalDeposit + " рублей.");
            monthOfDeposit++;
        }

        System.out.println("Task 5");
        /**
         * Видоизменение программы, чтоб результат
         * выводился только каждые 6 месяцев.
         */

        int monthOfDep = 0;
        int totalDep = 15000;
        while (totalDep < 12000000) {
            totalDep = totalDep + totalDep / 100 * 7;
            monthOfDep++;
            if (monthOfDep % 6 == 0) {
                System.out.println("К концу " + monthOfDep + " месяца, сумма накоплений равна " + totalDep + " рублей.");
            }

        }
        System.out.println("Для достижения цели в 12 млн потребуется " + monthOfDep + " месяцев, на конец " + monthOfDep + " месяца сумма будет " + totalDep + " рублей.");


        System.out.println("Task 6");

        int totalDepos = 15000;
        int monthOfDepos = 0;
        while (monthOfDepos < 12 * 9) {
            totalDepos = totalDepos + totalDepos / 100 * 7;
            monthOfDepos++;
            if (monthOfDepos % 6 == 0) {
                System.out.println("К концу " + monthOfDepos+ " месяца, сумма накоплений равна " + totalDepos + " рублей.");
            }

        }
        System.out.println("Спустя 9 лет -  " + monthOfDepos + " месяцев,  сумма будет " + totalDepos + " рублей.");

        System.out.println("Task 7");
        int friday = 2;
        for (int day = 1; day <= 31; day++) {
            if (day == friday || (day - friday) % 7 == 0 ) {
                System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчет.");
            }

        }

        System.out.println("Task 8");
        int yearNow = 2023; // текущий год
        int yearBefore = yearNow - 200; // год за 200 лет до текущего
        int yearAfter = yearNow + 100; // год за 100 лет после текущего
        for ( ; yearBefore <= yearAfter; yearBefore ++) {
            if ((yearBefore % 79) == 0) {
                System.out.println(yearBefore);
            }
        }
    }
}