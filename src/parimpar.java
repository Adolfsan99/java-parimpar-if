import java.util.Scanner;

public class parimpar {

    public static void main(String[] args) {

        int N;

        Scanner digitarEntrada = new Scanner(System.in);
        System.out.println("Insert the number");
        N = digitarEntrada.nextInt();

        if ((N % 2 == 0) && (N > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }


    }

}
