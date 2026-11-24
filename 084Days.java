import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int n = hi.nextInt();
        int no[] = new int[n];
        int max = 0;

        for (int i = 0; i < no.length; i++) {
            no[i] = hi.nextInt();

            if (no[i] > max) {
                max = no[i];
            }
        }

        System.out.println("Angka Maksimal: " + max);
    }
}
