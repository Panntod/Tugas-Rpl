package looping;
public class looping {

    public static void Loop(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");

            }
            System.out.println("");
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");

            }
            System.out.println("");
        }

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
