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
    }

}
