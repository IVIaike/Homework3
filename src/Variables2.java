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

    }
}