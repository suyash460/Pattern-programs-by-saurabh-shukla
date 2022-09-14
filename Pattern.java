class Pattern {

    public static void main(String args[]) {
    //video 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
    //video 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (i+j>=6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
    //video 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
    //video 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (i+j<=6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();

        //video 5
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++)
                if (j >= 6 - i && j <= 4 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();

        //video 6
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++)
                if (j >= 6 - i && j <= 4 + i && (i + j) % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();

        //video 7
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++)
                if (j <= 6 - i || j >= 4 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();


        //video 8
        for (int i = 1; i <= 4; i++) {
            int k = 1;
            for (int j = 1; j <= 7; j++)
                if (j >= 5 - i && j <= 3 + i) {
                    System.out.print(k);
                    if (j < 4) k++;
                    else k--;
                } else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();

        //video 9
        for (int i = 1; i <= 4; i++) {
            int k = 0;
            for (int j = 1; j <= 7; j++) {
                if (j <= 4) k++;
                else k--;
                if (j <= 5 - i || j >= 3 + i) {

                    System.out.print((char) (64+k));

                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
