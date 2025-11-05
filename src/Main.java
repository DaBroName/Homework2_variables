public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1: ");
        byte a1 = 127;
        short a2 = 32767;
        int a3 = 2147483647;
        long a4 = 922337203L;
        float b1 = 345.67f;
        double b2 = 2345.6789;
        System.out.println("Значение переменной a1 с типом byte " + "равно " + a1);
        System.out.println("Значение переменной a2 с типом short " + "равно " + a2);
        System.out.println("Значение переменной a3 с типом int " + "равно " + a3);
        System.out.println("Значение переменной a4 с типом long " + "равно " + a4);
        System.out.println("Значение переменной b1 с типом float " + "равно " + b1);
        System.out.println("Значение переменной b2 с типом double " + "равно " + b2);

        System.out.println("Задача 2:");
        float q1 = 27.12f;
        long q2 = 987678965549L;
        double q3 = 2.786;
        int q4 = 569;
        short q5 = -159;
        int q6 = 27897;
        byte q7 = 67;
        System.out.println("По условию задачи ничего выводить не надо");

        System.out.println("Задача 3:");
        int studentsOfLyudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int totalAmountOfPaper = 480;
        int totalStudents = studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLyudmilaPavlovna;
        int amountOfPaperPerStudent = totalAmountOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + amountOfPaperPerStudent + " листов бумаги");

        System.out.println("Задача 4:");
        int efficiencyTwoMin = 16;
        int efficiencyOneMin = efficiencyTwoMin / 2;
        int efficiency20Min = efficiencyOneMin * 20;
        int efficiencyDay = efficiencyOneMin * 1440;
        int efficiencyThreeDays = efficiencyOneMin * 1440 * 3;
        int efficiencyMonth = efficiencyOneMin * 1440 * 30;
        System.out.println("За 20 минут машина произвела " + efficiency20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + efficiencyMonth + " штук бутылок");

        System.out.println("Задача 5:");
        int totalNumberOfCans = 120;
        int theAmountOfWhitePaintPerClass = 2;
        int theAmountOfBrownPaintPerClass = 4;
        int theAmountOfWhiteAndBrownPaintPerClass = theAmountOfWhitePaintPerClass + theAmountOfBrownPaintPerClass;
        int numberOfClasses = totalNumberOfCans / theAmountOfWhiteAndBrownPaintPerClass;
        int numberOfWhitePaint = numberOfClasses * theAmountOfWhitePaintPerClass;
        int numberOfBrownPaint = numberOfClasses * theAmountOfBrownPaintPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhitePaint +
                " банок белой краски и " + numberOfBrownPaint + " банок коричневой краски");

        System.out.println("Задача 6:");
        int numberOfBananas = 5;
        int weightOneBanana = 80;
        int milkVolume = 200;
        int numberOfPackages = milkVolume / 100;
        int weight100MlMilk = 105;
        int numberOfBriquettes = 2;
        int weightOneBriquettes = 100;
        int numberOfRawEggs = 4;
        int weightOneRawEggs = 70;
        int weightOfTheDrink = numberOfBananas * weightOneBanana + numberOfPackages * weight100MlMilk +
                numberOfBriquettes * weightOneBriquettes + numberOfRawEggs * weightOneRawEggs;
        float weightOfTheDrinkKg = (float) weightOfTheDrink / 1000;
        System.out.println("Вес спортзавтрака в граммах - " + weightOfTheDrink + ". Вес в килограммах - " +
                weightOfTheDrinkKg);

        System.out.println("Задача 7:");
        int loseWeightKg = 7;
        int loseWeightGr = loseWeightKg * 1000;
        int loseWeightGrInDayMin = 250;
        int loseWeightGrInDayMax = 500;
        int numberOfWeightLossDaysMin = loseWeightGr / loseWeightGrInDayMin;
        int numberOfWeightLossDaysMax = loseWeightGr / loseWeightGrInDayMax;
        int theAverageNumberOfDaysToLoseWeight = (numberOfWeightLossDaysMin + numberOfWeightLossDaysMax) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то " + numberOfWeightLossDaysMin +
                " дней уйдет на похудение");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то " + numberOfWeightLossDaysMax +
                " дней уйдет на похудение");
        System.out.println("В среднем спортсмену потребуется " + theAverageNumberOfDaysToLoseWeight + " дней");

        System.out.println("Задача 8:");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalary = 1.1f;
        int numberOfMonthsInAYear = 12;

        int oldYearSalaryMasha = salaryMasha * numberOfMonthsInAYear;
        int oldYearSalaryDenis = salaryDenis * numberOfMonthsInAYear;
        int oldYearSalaryKristina = salaryKristina * numberOfMonthsInAYear;

        float newYearSalaryMasha = salaryMasha * numberOfMonthsInAYear * newSalary;
        float newYearSalaryDenis = salaryDenis * numberOfMonthsInAYear * newSalary;
        float newYearSalaryKristina = salaryKristina * numberOfMonthsInAYear * newSalary;

        float growthSalaryMasha = newYearSalaryMasha - oldYearSalaryMasha;
        float growthSalaryDenis = newYearSalaryDenis - oldYearSalaryDenis;
        float growthSalaryKristina = newYearSalaryKristina - oldYearSalaryKristina;

        System.out.println("Маша теперь получает " + newYearSalaryMasha + " рублей. Годовой доход вырос на " +
                growthSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newYearSalaryDenis + " рублей. Годовой доход вырос на " +
                growthSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newYearSalaryKristina + " рублей. Годовой доход вырос на " +
                growthSalaryKristina + " рублей");
    }
}