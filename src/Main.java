import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 4");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолтений");
        } else {
            System.out.println("Если возраст человека равен " + age + " Он не достиг совершеннолетния, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int C = 5;
        if (C <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти юез шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        } else {
            System.out.println(" Можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 44;
        boolean canGoToSlepp = age <= 2;
        if (canGoToSlepp) {
            System.out.println("Если возраст человека равен " + age + " то, ему пора спать");
        }
        boolean canGoToKindergarten = age > 2 && age < 6;
        if (canGoToKindergarten) {
            System.out.println("Если ворзаст человека равен " + age + " ему нужно ходить в десткий сад");
        }
        boolean canGoToSchool = age >= 7 && age < 18;
        if (canGoToSchool) {
            System.out.println("Если ворзаст человека равен " + age + " ему нужно ходить в школу");
        }
        boolean canGoToUniversity = age >= 18 && age < 24;
        if (canGoToUniversity) {
            System.out.println("Если ворзаст человека равен " + age + " его место в университете");
        }
        boolean canGoToTheWork = age >= 24 && age < 60;
        if (canGoToTheWork) {
            System.out.println("Если ворзаст человека равен " + age + " ему пора ходить на работу");
        }
        boolean canRest = age >= 60;
        if (canRest) {
            System.out.println("Если ворзаст человека равен " + age + " он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        boolean canNotRide = age < 5;
        if (canNotRide) {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему нельзя кататься на аттракционе");
        }
        boolean canRideWithAdults = age >= 5 && age < 14;
        if (canRideWithAdults) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на аттракционе, в сопровождении взрослого");
        }
        boolean canRideAlone = age >= 14;
        if (canRideAlone) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на аттракционе, без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int ourSeat = 50;
        if (ourSeat > 102) {
            System.out.println("В вагоне нет мест");
        } else {
            System.out.println("В Вагоне есть место");
        }
        if (ourSeat <= 102 && ourSeat <= 60) {
            System.out.println("Вы поедете сидя");
        }
        if (ourSeat <= 102 && ourSeat > 60) {
            System.out.println("Вы поедете стоя");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 543;
        int two = 7457;
        int three = 22;
        boolean threeMore = three>two && three>one;
        if (threeMore) {
            System.out.println(three);
        }
        boolean twoMore = two>three && two>one;
        if (twoMore) {
            System.out.println(two);
        }
        boolean oneMore = one>two && one>three;
        if (oneMore) {
            System.out.println(one);
        }
    }
}













