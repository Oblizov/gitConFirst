package first;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ClassOne {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();

        /*System.out.println(numberPlus(one, two));*/
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
