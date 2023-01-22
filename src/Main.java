public class Main {
    public static void main(String[] args) {
      int account = 200;
      int deposit = 1100;
      int bonus = deposit/100;
      int amout = account+deposit+bonus;
        if (deposit>=1000) {
          bonus = deposit / 100;
      } else { bonus = 0;
      }

      System.out.println("Итоговый бонус: " +bonus);
      System.out.println("Итоговая сумма на счете: " +amout);
    }
}