public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int r : new Randoms(0, 100)) {
            System.out.println("Случайное число: " + r);
            sum++;
            if (r == 0) {
                System.out.println("Выпало число " + r + " за " + sum + " шагов.");
                break;
            }
        }
    }
}
