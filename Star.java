public class Star {
    public static void main(String args[]) {
        int n = 5;
        // Right Angle Star Pattern
        // for (int i = 1; i <= n; i++) {
        // // System.out.print(" ");

        // for (int k = 0; k < i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        //////////////////////////////////////
        // Left Angle Star Pattern
        // for (int i = 1; i <= n; i++) {

        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // // System.out.print(" ");

        // for (int k = 0; k < i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /////////////////////////////////////////
        // Diamond Shape Pattern
        // for (int i = 0; i < n; i++) {
        // // for space
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // // System.out.print(" ");
        // // for star
        // for (int k = 0; k <= i; k++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        /////////////////////////////////////////////
        // diamond
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // System.out.print(" ");
            // for star
            for (int k = 0; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            // for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // System.out.print(" ");
            // for star
            for (int k = 0; k <= n - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        ///////////////////////////////////////////
        // Downword triangle star pattern
        for (int i = 0; i < n; i++) {
            // for space
            // for (int j = 0; j < n - i; j++) {
            // System.out.print(" ");
            // }
            // System.out.print(" ");
            // for star
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ////////////////////////////////////////////
        // Revers Pyramid
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int k = 0; k < n - i; k++) {
                System.out.print(" *");
            }

            // System.out.print(" ");
            System.out.println();
        }

        ////////////////////////////////////////////
        // stars example given by sir
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int k = 0; k < n - i; k++) {
                System.out.print(" *");
            }

            // System.out.print(" ");
            System.out.println();
        }

    }
}
