/**
 * Created by aleksandr on 23.09.14.
 */
public class Main {
    public static void main( final String[] args ) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println(i + " кукареку");
            } else if (i % 3 == 0) {
                System.out.println(i + " ко-ко-ко");
            } else if (i % 7 == 0) {
                System.out.println(i + " куд-куд-куда");
            }
        }
    }
}
