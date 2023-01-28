public class Main {
    public static void main(String[] args) {
        int account = 200;
        int deposit = 900;

        int bonus = 0;
        if ( deposit > 1000 ) {
            bonus = deposit / 100;
        }
        int amount = account + deposit + bonus;
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма на счете: " + amount);
    }
}