import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int num;
        System.out.println("Введіть число: ");

        //Введенное пользователем число в консоле хранится в переменной num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        // Если число делится на 2, то это четное число, иначе - нечетное
        // если остаток от деления равен нулю, то четное
        if ( num % 2 == 0 )
            System.out.println("Число парне");
        else
            System.out.println("Число непарне");
    }
}