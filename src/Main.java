public class Main {
    public static void main(String[] args) {
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
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outsideTemperature = 4;
        if (outsideTemperature <= 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 40;
        boolean goToKindergarten = age >= 2 && age <= 6;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        boolean goToSchool = age >= 7 && age <= 18;
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        boolean goToUniversity = age >= 18 && age <= 24;
        if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childsAge = 15;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему нельзя кататься на аттракционе");
        }
        boolean kids = childsAge >= 5 && childsAge <= 14;
        if (kids) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему можно кататься на аттракционе в сопровождении");
        }
        if (childsAge > 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 40;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else if (passengers == 102) {
            System.out.println("В вагоне нет свободных мест");
        } else {
            System.out.println("В вагон 102 человека");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean one1 = one > two && one > three;
        boolean two1 = two > one && two > three;
        boolean three1 = three > one && three > two;
        if (one1) {
            System.out.println("" + one + " большее число");
        } else if (two1) {
            System.out.println("" + two + " большее число");
        } else if (three1) {
            System.out.println("" + three + " большее число");
        }
    }
}