public class Variables2 {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int block = 123547;
        System.out.println("Количество блоков, доставленных на стройплощадку " + block + " шт.");

        byte board = 120;
        System.out.println("Количество досок, доставленных на стройплощадку " + board + " шт.");

        short brick = 25347;
        System.out.println("Количество кирпичей, доставленных на стройплощадку " + brick + " шт.");

        long selfTappingScrew = 1100000;
        System.out.println("Количество саморезов, доставленных на стройплощадку " + selfTappingScrew + " шт.");

        float concrete = 4.2f;
        System.out.println("Количество бетона, доставленного на стройплощадку " + concrete + " куб.м.");

        double water = 423.7;
        System.out.println("Количество воды, доставленной на стройплощадку " + water + " куб.м.");

        // Задание 2
        System.out.println("Задание 2");

        int blockAnotherHome = 27897;
        System.out.println("Количество блоков, доставленных на строительство другого дома " + blockAnotherHome + " шт.");

        byte boardAnotherHome = 2;
        System.out.println("Количество досок, доставленных на строительство другого дома " + boardAnotherHome + " шт.");

        byte bigBoardAnotherHome = 67;
        System.out.println("Количество больших досок, доставленных на строительство другого дома " + bigBoardAnotherHome + " шт.");

        short brickAnotherHome = 786;
        System.out.println("Количество кирпичей, доставленных на строительство другого дома " + brickAnotherHome + " шт.");

        short brokenBrickAnotherHome = -159;
        System.out.println("Количество разбитых кирпичей, вывезенных со на стройки другого дома " + brokenBrickAnotherHome + " шт.");

        short bigBrickAnotherHome = 569;
        System.out.println("Количество больших кирпичей, доставленных на на строительство другого дома " + bigBrickAnotherHome + " шт.");

        long selfTappingScrewAnotherHome = 987678965549L;
        System.out.println("Количество саморезов, доставленных на на строительство другого дома " + selfTappingScrewAnotherHome + " шт.");

        double waterAnotherHome = 27.12;
        System.out.println("Количество воды, доставленной на на строительство другого дома " + waterAnotherHome + " куб.м.");

        boolean boardQuantity = boardAnotherHome >= bigBoardAnotherHome;
        System.out.println("Верно ли утверждение, что на стройплощадке другого дома количество обычных досок больше, чем больших - " + boardQuantity );

        // Задание 3
        System.out.println("Задание 3");

        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        System.out.println("У Людмилы Павловны " + teacherLP + " ученика , у Анны Сергеевны " + teacherAS + " учеников и у Екатерины Андреевны – " + teacherEA + " учеников.");

        short paper = 480;
        System.out.println("Три учительницы закупили все вместе " + paper + " листов бумаги");

        int paperQtyPerStudent = 480/(teacherLP+teacherAS+teacherEA); // Хотел поставить тип byte или short но Идейка потребовала выбрать int
        System.out.println("На каждого ученика рассчитано " + paperQtyPerStudent + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");

        byte bottleQty = 16;
        byte timeToProduce = 2;
        int bottleMachineProductivity = bottleQty / timeToProduce;
        System.out.println("Производительность машины по производству бутылок составляет " + bottleMachineProductivity + " бутылок в минуту");

        int bottleMachineProductivityOnTwentyMinutes = bottleMachineProductivity*20;// за 20 минут
        System.out.println("За 20 минут машина произвела бутылок " + bottleMachineProductivityOnTwentyMinutes + " штук");

        int bottleMachineProductivityOnDay = bottleMachineProductivity*60*24;//в сутки
        System.out.println("За 1 сутки машина произвела бутылок " + bottleMachineProductivityOnDay + " штук");

        int bottleMachineProductivityOnThreeDay = bottleMachineProductivityOnDay*3; //за 3 дня
        System.out.println("За 3 суток машина произвела бутылок " + bottleMachineProductivityOnThreeDay + " штук");

        int bottleMachineProductivityOnMonth = bottleMachineProductivityOnDay*30; //за 1 месяц. Исходим из того, что в этом месяце 30 дней.
        System.out.println("За 1 месяц машина произвела бутылок " + bottleMachineProductivityOnMonth + " штук");

        //Задание 5
        System.out.println("Задание 5");

        byte paintTotal = 120;
        System.out.println("На ремонт школы нужно " + paintTotal + " банок краски двух цветов: белой и коричневой");
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte paintPerClass = 2+4;
        System.out.println("На ремонт одного класса нужно " + paintPerClass + " банок краски двух цветов: белой " + whitePaintPerClass + " банки и " + brownPaintPerClass + " банки коричневой");
        int classes = paintTotal / paintPerClass;
        System.out.println("Всего в школе классов " + classes);

        int whitePaintTotal = whitePaintPerClass * classes;
        int brownPaintTotal = brownPaintPerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");

        byte bananaWeight = 80;
        byte bananaQuantity = 5;
        int bananaTotal = bananaWeight*bananaQuantity;
        System.out.println("Вес бананов в рецепте " + bananaTotal + " грамм.");
        byte milkWeight = 105;
        byte milkQuantity = 2;
        int milkTotal = milkWeight*milkQuantity;
        System.out.println("Вес молока в рецепте " + milkTotal + " грамм.");
        byte iceCreamWeight = 100;
        byte iceCreamQuantity = 2;
        int iceCreamTotal = iceCreamWeight*iceCreamQuantity;
        System.out.println("Вес мороженного в рецепте " + iceCreamTotal + " грамм.");
        byte eggWeight = 70;
        byte eggQuantity = 4;
        int eggTotal = eggWeight*eggQuantity;
        System.out.println("Вес яиц в рецепте " + eggTotal + " грамм.");
        int sportBreakfastWeight = bananaTotal + milkTotal + iceCreamTotal + eggTotal;
        System.out.println("Вес спортивного завтрака в граммах составляет " + sportBreakfastWeight + " гр.");
        double sportBreakfastWeightKg = (sportBreakfastWeight / 1000.0);
        System.out.println("Вес спортивного завтрака в килограммах составляет " + sportBreakfastWeightKg + " кг.");

        // Задание 7
        System.out.println("Задание 7");

        byte sportManWeightDeltaKg = 7;
        int sportManWeightDelta = sportManWeightDeltaKg*1000;
        System.out.println("Спортсмену нужно похудеть на " + sportManWeightDeltaKg + " килограмм или на " + sportManWeightDelta + " грамм.");
        short dailyLostWeightMin = 250;
        System.out.println("Минимальная потеря веса в день " + dailyLostWeightMin + " грамм.");
        short dailyLostWeightMax = 500;
        System.out.println("Максимальная потеря веса в день " + dailyLostWeightMax + " грамм.");
        int daysToWeightLostMin = sportManWeightDelta / dailyLostWeightMax;
        System.out.println("Если спортсмен будет терять по " + dailyLostWeightMax + " грамм, то он похудеет за " + daysToWeightLostMin + " дней.");
        int daysToWeightLostMax = sportManWeightDelta / dailyLostWeightMin;
        System.out.println("Если спортсмен будет терять по " + dailyLostWeightMin + " грамм, то он похудеет за " + daysToWeightLostMax + " дней.");
        double daysToWeightLostAwg = (daysToWeightLostMin + daysToWeightLostMax)/2.0;
        System.out.println("В среднем спортсмену понадобится " + daysToWeightLostAwg + " день, чтобы сбросить " + sportManWeightDeltaKg + " килограмм.");



    }
}