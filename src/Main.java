public class Main {
    public static void main(String[] args) {
      int x =200;
      int y = 1100;
      int bonus = y/100;
      int z = y+x+bonus;
      if (y>=1000) {
          bonus = y / 100;
      } else { bonus = 0;
      }

      System.out.println("Итоговый бонус: " +bonus);
      System.out.println("Итоговая сумма на счете: " +z);
    }
}