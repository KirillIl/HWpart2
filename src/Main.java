public class Main {
    public static void main(String[] args) {
        //Переменные часть 2 (Задача 1)
        System.out.println("Задача 1");
        int papers = 10;
        System.out.println("Значение переменной papers с типом int равно " + papers);
        byte pens = 4;
        System.out.println("Значение переменной pens с типом byte равно " + pens);
        short files = 215;
        System.out.println("Значение переменной files с типом short равно " + files);
        long eraser = 43263426L;
        System.out.println("Значение переменной eraser с типом long равно " + eraser);
        float plasticine = 3.56F;
        System.out.println("Значение переменной plasticine с типом float равно " + plasticine);
        double pencils = 3.15654;
        System.out.println("Значение переменной pencils с типом double равно " + pencils);

        // Задача 2
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        int e = 569;
        short f = -159;
        char g = 27897;
        byte h = 67;

        // Задача 3
        System.out.println("Задача 3");
        int teacherLP = 23;
        int teacherAS = 27;
        int teacherEA = 30;
        int paper = 480;
        int students = teacherLP + teacherAS + teacherEA;
        System.out.println("На каждого ученика рассчитано " + paper / students + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int performance = bottles / minutes;
        int aMinutes = 20;
        System.out.println("За " + aMinutes + " минут машина произвела бутылок " + performance * aMinutes +" штук ");
        int day = 24 * 60;
        System.out.println("За " + day + " минут машина произвела бутылок " + performance * day +" штук ");
        int threeDays = 3 * day;
        System.out.println("За " + threeDays + " минут машина произвела бутылок " + performance * threeDays +" штук ");
        int oneMonth = 3 * threeDays; // к примеру взят сентябрь - 30 дней.
        System.out.println("За " + oneMonth + " минут машина произвела бутылок " + performance * oneMonth +" штук ");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansOneClass = 2;
        int brownCansOneClass = 4;
        int totalClasses = totalCans / (whiteCansOneClass + brownCansOneClass);
        int totalWhiteCans = totalClasses * whiteCansOneClass;
        int totalBrownCans = totalClasses * brownCansOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int totalBananas = 5;
        int weightBananas = 5 * 80;
        int milk = 200;
        int weightMilk = 2 * 105;
        int iceCream = 2;
        int weightIceCream = 2 * 100;
        int eggs = 4;
        int weightEggs = 4 * 70;
        int weightGrams = weightBananas+weightMilk+weightIceCream+weightEggs;
        float weightKilograms = weightGrams / 1000F;
        System.out.println("Общее колличество продуктов в граммах " + weightGrams + " гамм, а в килограммах " + weightKilograms + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int loseWeight = 7;
        int weightLossGrams = 7 * 1000;
        int weightLossPerDays250 = weightLossGrams / 250;
        int weightLossPerDays500 = weightLossGrams / 500;
        System.out.println("За " + weightLossPerDays250 + " дней, если худеть по 250 грамм в день и за " + weightLossPerDays500 + " дней если худеть по 500 грамм в день");
        int averageNumberDays = (weightLossPerDays250 + weightLossPerDays500) / 2;
        System.out.println( "Потребуется " + averageNumberDays + " день в среднем, чтобы добиться результата похудения");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryMasha10 = salaryMasha * 10 / 100;
        int nowGetsMasha = salaryMasha + salaryMasha10;
        int salaryPerYearMasha = salaryMasha * 12;
        int salaryPerYearMasha10 = nowGetsMasha * 12;
        int differenceAnnualIncomeMasha = salaryPerYearMasha10 - salaryPerYearMasha;
        System.out.println("Маша теперь получает " + nowGetsMasha + " рублей. Годовой доход вырос на " + differenceAnnualIncomeMasha + " рублей");
        int salaryDenis = 83690;
        int salaryDenis10 = salaryDenis * 10 / 100;
        int nowGetsDenis = salaryDenis + salaryDenis10;
        int salaryPerYearDenis = salaryDenis * 12;
        int salaryPerYearDenis10 = nowGetsDenis * 12;
        int differenceAnnualIncomeDenis = salaryPerYearDenis10 - salaryPerYearDenis;
        System.out.println("Денис теперь получает " + nowGetsDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeDenis + " рублей");
        int salaryKristina = 76230;
        int salaryKristina10 = salaryKristina * 10 / 100;
        int nowGetsKristina = salaryKristina + salaryKristina10;
        int salaryPerYearKristina = salaryKristina * 12;
        int salaryPerYearKristina10 = nowGetsKristina * 12;
        int differenceAnnualIncomeKristina = salaryPerYearKristina10 - salaryPerYearKristina;
        System.out.println("Денис теперь получает " + nowGetsKristina + " рублей. Годовой доход вырос на " + differenceAnnualIncomeKristina + " рублей");




    }
}