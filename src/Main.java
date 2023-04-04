public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
        System.out.println(" ");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxCost = arr [0];
        int minCost =  arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxCost < arr[i]) {
                maxCost = arr[i];
            }
            if (minCost > arr[i]) {
                minCost = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + maxCost + " рублей.");
        System.out.println("Минимальная сумма трат за месяц составила " + minCost + " рублей.");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double sumAverage = sum / 30;
        System.out.print("Средняя сумма трат за месяц составила " + sumAverage + " рублей.");
        System.out.println(" ");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}