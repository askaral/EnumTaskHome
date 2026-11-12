package IfElse;

import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write down the day: ");
        String week = scanner.nextLine().toUpperCase();
        Day[] days = Day.values();
        for (Day day : days) {
            if(day.name().equals(week)) {
                if(day == Day.MONDAY) {
                    System.out.println("Дуйшонбу куну жава окуйм");
                }
                if(day == Day.TUESDAY) {
                    System.out.println("Шейшемби куну анлис тилин окуйм");
                }
                if(day == Day.WEDNESDAY){
                    System.out.println("Шаршемби куну жава практика кылабыз");
                }
                if(day == Day.THURSDAY){
                    System.out.println("Бейшемби куну жава жаны тема");
                }
                if(day == Day.FRIDAY){
                    System.out.println("Жума куну жаны тема кайталайбыз жана практика кылабыз");
                }
                if(day == Day.SATURDAY){
                    System.out.println("Ишемби куну уй тапшырма аткаруу");
                }
                if(day == Day.SUNDAY){
                    System.out.println("жекшемби куну эс алуу жана кининки жумага даярдануу");

                }
                return;

            }
        }
        System.out.println("Aндай күн жок");

    }
}
