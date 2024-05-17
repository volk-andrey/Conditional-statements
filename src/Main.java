public class Main {
    public static void main(String[] args) {
        //Task1

        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, но нужно немного подождать");
        }

        //Task2

        int temp = 25;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Task3

        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        } else{
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        }

        //Task4

        age = 25;
        if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно ходить университет");
        } else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему можно ходить на работу");
        }

        //Task5

        age = 7;
        if (age < 5 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе, только в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе, без сопровождения взрослого");
        }

        //Task6
        int pepleInTrain = 62;
        int capacityTrain = 102;
        int capacitySeating = 60;
        int capacityStanding = capacityTrain - capacitySeating;
        if (pepleInTrain < capacitySeating) {
            System.out.println("Если количество пассажиров " + pepleInTrain + " , то в вагоне есть сидячие места");
        } else if (pepleInTrain >= capacitySeating && pepleInTrain <= capacityTrain) {
            System.out.println("Если количество пассажиров " + pepleInTrain + ", то в вагоне есть стоячие места");
        } else if (pepleInTrain > capacityTrain) {
            System.out.println("Если количество пассажиров " + pepleInTrain + ", то в вагоне нет свободных мест");
        }

        //Task7

        int one = 7;
        int two = 9;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше числа " + two + " и числа " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше числа " + one + " и числа " + three);
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " больше числа " + one + " и числа " + two);
        }

    }
}