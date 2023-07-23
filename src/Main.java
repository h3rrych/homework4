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
        int age = 18;
        if (age < 18) {
            System.out.println("Вам меньше 18");
        } else {
            System.out.println(" Вы совершеннолетний");
        }
    }

    public static void task2() {
        int c = 4;
        if (c < 5) {
            System.out.println("Нужно надеть шапку");
        } else {
            System.out.println("Можно идти без шаки");
        }
    }

    public static void task3() {
        int km = 59;
        if (km < 60) {
            System.out.println("Штрафа нет");
        } else {
            System.out.println("Прийдется заплатить штраф");
        }
    }

    public static void task4() {
        int age = 611;
        if (age < 2) {
            System.out.println("Тебе пора спать");
        } else if (age > 2 && age < 6) {
            System.out.println(" Детский сад");
        } else if (age > 6 && age < 18) {
            System.out.println(" Тебе надо ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Твое место в универе");
        } else if (age > 24 && age < 60) {
            System.out.println("Тебе надо работаь");
        } else {
            System.out.println(" Можно отдохнуть");
        }
    }

    public static void task5() {
        int age = 13;
        if (age < 5) {
            System.out.println("Кататься нельзя");
        } else if (age > 5 && age < 14) {
            System.out.println("Кататься можно только в сопровождлении взрослого");
        } else {
            System.out.println("Кататься можно");

        }
    }
    public static void  task6() {
        int mesto = 103;
        if (mesto < 102) {
            System.out.println("В вагоне есть место");
        } else {
            System.out.println("В Вагоне мест нет");
        }
        if (mesto < 60) {
            System.out.println("Вы поедете сидя");
        } else if (mesto >60 && mesto <102){
            System.out.println("ВЫ поедете стоя");
        }


    }
    public static void task7() {
        int one = 31241;
        int two = 523523523;
        int three = 412515;
        if (one > two && one > three) {
            System.out.println(one);
        } else if ( two>one && two>three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }

}
















