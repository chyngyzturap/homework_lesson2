import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(walking(21, 10));
        System.out.println(walking(12, 20));
        System.out.println(walking(5, -5));
        System.out.println(walking(55, 30));
        System.out.println(walking(28, -13));
        System.out.println(walkingRandom(15));
        System.out.println(walkingRandom(-10));
    }


    public static String walking(int age, int temperature) {
        String go = "Ваш возраст: " + age + "; Температура: " + temperature + " = Можно идти гулять";
        String dontGo = "Ваш возраст: " + age + "; Температура: " + temperature + " = Оставайтесь дома";


        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return go;
        }

        if (age < 20 && (temperature > 0 && temperature < 28)) {
            return go;
        }

        if (age > 45 && (temperature > -10 && temperature < 25)) {
            return go;
        } else {
            return dontGo;
        }

    }

    public static int generateRandomAge() {
        int r = (int) (Math.random() * 99);
        return r;
    }

    public static String walkingRandom(int temperature) {
        int age = generateRandomAge();
        String go = "Ваш случайный возраст: " + age + "; Температура: " + temperature + " = Можно идти гулять";
        String dontGo = "Ваш случайный возраст: " + age + "; Температура: " + temperature + " = Оставайтесь дома";


        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return go;
        }

        if (age < 20 && (temperature > 0 && temperature < 28)) {
            return go;
        }

        if (age > 45 && (temperature > -10 && temperature < 25)) {
            return go;
        } else {
            return dontGo;
        }


    }
}

