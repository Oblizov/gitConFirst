package first;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassOne {

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        int one;
        int two;

        try {
            one = in.nextInt();
            two = in.nextInt();
        }
        catch (InputMismatchException e){
            throw new InputMismatchException("Ввели не целое число!!!");
        }
        finally {
            in.close();
        }

        System.out.println(numberPlus(one, two));

    }

    //сложение функций
    private static int numberPlus(int number_1, int number_2){
        return number_1 + number_2;
    }

    //сравнивание чисел
    private static int compareNumbers(int number_1, int number_2) throws Exception {
        if(number_1 < number_2){
            return number_2;
        }
        else if (number_1 > number_2){
            return number_1;
        }
        else {
            throw new Exception("введенные числа равны");
        }
    }

}
