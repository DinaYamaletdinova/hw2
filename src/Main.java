public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1
        byte hobbit = 4;
        short dwarf = 13;
        int elf = 78;
        long dragonBigger = 1000L;
        float meat = 100.25f;
        double wineRed = 500.857;
        boolean isFlag = true;

        // Задание 2
        float fighterFirst = 78.2f;
        System.out.println("Первый боец весит " + fighterFirst + " кг.");
        float fighterSecond = 82.7f;
        System.out.println("Второй боец весит " + fighterSecond + " кг.");
        float weightFighters = fighterFirst + fighterSecond;
        System.out.println("Общий вес бойцов " + weightFighters + " кг.");
        float differenceFighters = fighterSecond - fighterFirst;
        System.out.println("Разница в весе составляет " + differenceFighters + " кг.");

        // Задание 3
        byte bananas = 5;
        System.out.println("Бананы " + bananas + " шт");
        short banana = 80;
        System.out.println("Вес одного банана " + banana + " гр");
        float bananasWeight = bananas * banana;
        System.out.println("Общий вес бананов " + bananasWeight + " грамм.");
        long Kg = 1000L;
        float bananasKg = bananasWeight/Kg;
        System.out.println("Или же " + bananasKg + " кг.");

        byte iceCreams = 2;
        System.out.println("Мороженое пломбир " + iceCreams + " шт");
        short iceCream = 100;
        System.out.println("Одно мороженое весит " + iceCream + " грамм");
        float iceCreamWeight = iceCreams * iceCream;
        System.out.println("Общий вес мороженого " + iceCreamWeight + " грамм");
        float iceCreamKg = iceCreamWeight/Kg;
        System.out.println("Или же " + iceCreamKg + " кг.");

        byte eggs = 4;
        System.out.println("Яйца сырые " + eggs + " шт");
        short egg = 70;
        System.out.println("Одно яйцо весит " + egg + " грамм");
        float eggsWeight = eggs * egg;
        System.out.println("Общий вес яиц составляет " + eggsWeight + " грамм");
        float eggsKg = eggsWeight/Kg;
        System.out.println("Или же " + eggsKg + " кг.");

        short milk = 200;
        float milk100 = 100f;
        short milkGr100 = 105;
        System.out.println("Молоко " + milk + " мл.");
        float milkGr = milk * milkGr100 / milk100;
        System.out.println(milk100 + " мл молока весит " + milkGr100 + " гр");
        System.out.println("Значит у нас имеется " + milkGr + " грамм");
        float milkKg = milkGr/Kg;
        System.out.println("Что равно по весу " + milkKg + " кг." );
        float totalWeightGr = bananasWeight + iceCreamWeight + eggsWeight + milkGr;
        float totalWeightKg = bananasKg + iceCreamKg + eggsKg + milkKg;
        System.out.println("Ответ: итого вес спорт-завтрака " + totalWeightGr + " грамм, или же " + totalWeightKg + " кг.");

        // Задание 4
        byte manKg = 7;
        short grMin = 250;
        short grMax = 500;
        System.out.println("Спортсмен должен сбросить " + manKg + " кг по рациону тренера от " + grMin + " до " + grMax + " грамм в день.");
        long manGr = Kg * manKg;
        long dayMax = manGr / grMin;
        long dayMin = manGr / grMax;
        long averageDay = (dayMax + dayMin) / 2;
        System.out.println("Итого спортсмен может сбросить " + manKg + " кг за " + dayMax + " дней по " + grMin + " грамм в день или за " + dayMin + " по " + grMax +" грамм в день. В среднем будет затрачено: " + averageDay + " день.");

        // Задание 5
        long mashaZp1 = 67760L;
        short initialZp = 100;
        byte lvlUp = 10;
        byte year = 12;
        long mashaZpUp = mashaZp1 * lvlUp / initialZp;
        System.out.println("Зарплата Маши выросла на " + mashaZpUp + " рублей в месяц.");
        long mashaZpYear = mashaZp1 * year;
        long newZpMasha = mashaZp1 + mashaZpUp;
        long mashaNewZpYear = newZpMasha * year;
        long differenceYearM = mashaNewZpYear - mashaZpYear;
        System.out.println("Маша теперь получает " + newZpMasha + " рублей. Годовой доход вырос на " + differenceYearM + " рублей.");

        long denisZp1 = 83690L;
        long denisZpUp = denisZp1 * lvlUp / initialZp;
        System.out.println("Зарплата Дениса выросла на " + denisZpUp + " рублей в месяц.");
        long denisZpYear = denisZp1 * year;
        long newZpDenis = denisZp1 + denisZpUp;
        long denisNewZpYear = newZpDenis * year;
        long differenceYearD = denisNewZpYear - denisZpYear;
        System.out.println("Денис теперь получает " + newZpDenis + " рублей. Годовой доход вырос на " + differenceYearD + " рублей.");

        long krisZp1 = 76230L;
        long krisZpUp = krisZp1 * lvlUp / initialZp;
        System.out.println("Зарплата Кристины выросла на " + krisZpUp + " рублей в месяц.");
        long krisZpYear = krisZp1 * year;
        long newZpKris = krisZp1 + krisZpUp;
        long krisNewZpYear = newZpKris * year;
        long differenceYearK = krisNewZpYear - krisZpYear;
        System.out.println("Кристина теперь получает " + newZpKris + " рублей. Годовой доход вырос на " + differenceYearK + " рублей.");

    }
}