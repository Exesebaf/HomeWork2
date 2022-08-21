public class Main {
    public static void main(String[] args) {

        // задача 1

//        var p = 55.4;
//
//        byte a = 10;
//        short b = 121;
//        int c = 329;
//        long d = 1598L;
//
//        float e = 123.5F;
//        double f = 1645.12344;
//
//        char  z = '#';
//        boolean k = a > b;

        // задача 2

        float weightOneBoxer = 78.2F;
        float weightSecondBoxer = 82.7F;

        float totalWeightTwoFighters = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeightTwoFighters + " кг.");

        float differenceBetweenWeightsFighters =  weightSecondBoxer - weightOneBoxer;
        System.out.println("Разница в весе между бойцами " + differenceBetweenWeightsFighters + " кг.");

        // Задача 3

        short bananas = 5;         // 1 банан - 80 грамм
        short milk = 200;         // 100 мл = 105 грамм
        short iceCreamSundae = 2; // 2 брикета по 100 грамм
        short rawEggs = 4;        // 1 яйцо - 70 грамм

        double totalWeightBreakfastG = ((bananas * 80) + (milk * 1.05) + (iceCreamSundae * 100) + (rawEggs * 70));
        System.out.println("Один из завтроков спортсмена " +totalWeightBreakfastG + " гр.");

        double totalWeightBreakfastKg = totalWeightBreakfastG / 1000;
        System.out.println("Один из завтроков спортсмена " +totalWeightBreakfastKg + " кг.");

        // Задание 4

        int athleteNeedsResetKg = 7;
        int athleteWillLoseEveryDayFirstCaseG = 250;
        int athleteWillLoseEveryDaySecondCaseG = 500;

        int athleteNeedsResetG = athleteNeedsResetKg * 1000;
        int takesDaysLoseFirstWeight = athleteNeedsResetG / athleteWillLoseEveryDayFirstCaseG;
        System.out.println("При похудении в первом случае " +takesDaysLoseFirstWeight+ " дней.");

        int takesDaysLoseSecondWeight = athleteNeedsResetG / athleteWillLoseEveryDaySecondCaseG;
        System.out.println("При похудении во втором случае " +takesDaysLoseSecondWeight+ " дней.");

        int takesDaysAverageLoseWeight = (takesDaysLoseFirstWeight + takesDaysLoseSecondWeight) / 2 ;
        System.out.println("Среднее колическо времени на похудение " + takesDaysAverageLoseWeight + " дней.");
        // я так и не понял где надо было использовать Операция определения остатка деления для этой задачи в критериях оценки

        // Задание 5

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        double salaryMashaAfterPromotion = salaryMasha * 0.1 + salaryMasha;
        double salaryDenisAfterPromotion = salaryDenis * 0.1 + salaryDenis;
        double salaryKristinaAfterPromotion = salaryKristina * 0.1 + salaryKristina;

        double differenceBetweenAnnualSalaryBeforeAndAfterMashaPromotion = (salaryMashaAfterPromotion * 12) - (salaryMasha *12);
        System.out.println("Маша теперь получает в месяц  " +salaryMashaAfterPromotion+" рублей. Годовой доход вырос на " +differenceBetweenAnnualSalaryBeforeAndAfterMashaPromotion+ " рублей." );

        double differenceBetweenAnnualSalaryBeforeAndAfterDenisPromotion = (salaryDenisAfterPromotion * 12) - (salaryDenis *12);
        System.out.println("Маша теперь получает в месяц  " +salaryDenisAfterPromotion+" рублей. Годовой доход вырос на " +differenceBetweenAnnualSalaryBeforeAndAfterDenisPromotion+ " рублей." );

        double differenceBetweenAnnualSalaryBeforeAndAfterKristinaPromotion = (salaryKristinaAfterPromotion * 12) - (salaryKristina *12);
        System.out.println("Маша теперь получает в месяц  " +salaryKristinaAfterPromotion+" рублей. Годовой доход вырос на " +differenceBetweenAnnualSalaryBeforeAndAfterKristinaPromotion+ " рублей." );






    }


}