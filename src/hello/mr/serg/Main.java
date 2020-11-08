package hello.mr.serg;
import java.util.Random;
import java.util.Scanner;
public class Main {

    //сканер
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int guessingNumber;
        randomNumberGenerator();
        guessingNumber = randomNumberGenerator();

        int TypeNum = 3;
        boolean check = false;

        do {

            int UserNum = getNumberFromScanner("Введите число в пределах от 0 до 9 -> ", 0, 10);

            if (UserNum == guessingNumber ) {
                check = true;
                System.out.println("Вы угадали число");
            } else {
                if (UserNum > guessingNumber) {
                    System.out.println("Число, загаданное компьютером меньше! ");
                } else {
                    System.out.println("Число, загаданное компьютером больше !");
                }
                TypeNum--;
                System.out.println("Число оставшихся попыток -> " + TypeNum);
            }
            if (TypeNum == 0) {
                System.out.println("К сожалению, вы проиграли... ");
                System.out.println("Загаданное число -> " + guessingNumber);
            }

        } while ((check == false)&& (TypeNum != 0));

    }


    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.print(message);
            x = input.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static int randomNumberGenerator () {
        Random rand = new Random();
        int RandNum;
        return RandNum = rand.nextInt(10);

    }
}