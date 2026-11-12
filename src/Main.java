import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Write down the day: ");
            String week = scanner.nextLine().toUpperCase();
           try{ Day day = Day.valueOf(week);
            switch (day) {
                case MONDAY -> System.out.println("Дуйшонбу куну жава окуйм");
                case TUESDAY -> System.out.println("Шейшемби куну анлис тилин окуйм");
                case WEDNESDAY -> System.out.println("Шаршемби куну жава практика кылабыз");
                case THURSDAY -> System.out.println("Бейшемби куну жава жаны тема");
                case FRIDAY -> System.out.println("Жума куну жаны тема кайталайбыз жана практика кылабыз");
                case SATURDAY -> System.out.println("Ишемби куну уй тапшырма аткаруу");
                case SUNDAY -> System.out.println("жекшемби куну эс алуу жана кининки жумага даярдануу");

            }

    }catch (IllegalArgumentException e){
               System.out.println("Aндай күн жок");
           }
    }
}