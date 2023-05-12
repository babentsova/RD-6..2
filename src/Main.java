public class Main {

    public static void main(String[] args) {

        int a = 62;
        int b = 20;
        int c = 30;
        int d = 40;
        int sum1 = a + b;
        int sum2 = c + d;
        boolean isFirstSumGreater = sum1 > sum2;
        System.out.println("Результат порівняння сум: " + isFirstSumGreater);
        boolean isAnySumMultipleOfTwo = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Хоча б одна сума кратна 2: " + isAnySumMultipleOfTwo);
    }
}