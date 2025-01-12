public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        int adultAge = 18;
        if (adultAge >= 18) {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний%n", adultAge);
        } else {
            System.out.printf("Если возраст человека равен %s, то он не достиг совершеннолетия, нужно немного подождать%n", adultAge);
        }
        System.out.println("Task № 2");
        int outsideTemperature = 5;
        if (outsideTemperature <= 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку%n", outsideTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки%n", outsideTemperature);
        }
        System.out.println("Task № 3");
        int acceptableSpeed = 65;
        if (acceptableSpeed > 60) {
            System.out.printf("Если скорость %s, то придется заплатить штраф%n", acceptableSpeed);
        } else {
            System.out.printf("Если скорость %s, то можно ездить спокойно%n", acceptableSpeed);
        }
        System.out.println("Task № 4");
        int currentAge = 25;
        if (currentAge >= 2 && currentAge <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад%n", currentAge);
        }
        if (currentAge >= 7 && currentAge <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу%n", currentAge);
        }
        if (currentAge >= 18 && currentAge <= 24) {
            System.out.printf("Если возраст человека равен %s, то его место в университете%n", currentAge);
        }
        if (currentAge > 24) {
            System.out.printf("Если возраст человека равен %s, то ему пора ходить на работу%n", currentAge);
        }
        System.out.println("Task № 5");
        int attractionAccessAge = 25;
        if (attractionAccessAge < 5) {
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе%n", attractionAccessAge);
        }
        if (attractionAccessAge >= 5 && attractionAccessAge < 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого%n", attractionAccessAge);
        }
        if (attractionAccessAge >= 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого%n", attractionAccessAge);
        }
        System.out.println("Task № 6");
        int peopleNumber = 103;
        if (peopleNumber <= 60) {
            System.out.printf("Если количество пассажиров %s, то в вагоне достаточно сидячих мест%n", peopleNumber);
        }
        else if (peopleNumber > 60 && peopleNumber <= 102) {
            System.out.printf("Если количество пассажиров %s, то в вагоне недостаточно сидячих мест, но достаточно стоячих мест%n", peopleNumber);
        }
        else {
            System.out.printf("Если количество пассажиров %s, то вагон уже полностью забит%n", peopleNumber);
        }
        System.out.println("Task № 7");
        int one = 103;
        int two = 101;
        int three = 101;
        if (one > two && one > three) {
            System.out.printf("Число %s больше двух других%n", one);
        }
        else if (two > one && two > three) {
            System.out.printf("Число %s больше двух других%n", two);
        }
        else if (three > one && three > two){
            System.out.printf("Число %s больше двух других%n", three);
        } else {
            System.out.println("Ни одно число не является больше двух других");
        }
    }
}