import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
        public static int[][] Randomizer(int ku) {
            Random losowe = new Random();
            int[][] array = new int[ku][ku];
            for (int i = 0; i < ku; i++) {
                for (int j = 0; j < ku; j++) {
                    array[i][j] = losowe.nextInt(10);}
            }
            return array;}

        public static void main(String[] args) {
            Scanner pu = new Scanner(System.in);
            System.out.print("wpisz liczbe : ");
            int ku = pu.nextInt();
            int[][] tabl = Randomizer(ku);
            System.out.println("tablica : ");
            System.out.print(Arrays.deepToString(tabl));
        }
    }


