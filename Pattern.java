package org.example;

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
                if (i + j >= 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //video 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //video 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                if (i + j <= 6)
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

                    System.out.print((char) (64 + k));

                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 10 approach 1
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= i && j <= 8 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //video 10 approach 2
        int k = 0;
        for (int i = 1; i <= 7; i++) {
            if (i <= 4)
                k++;
            else k--;
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - k && j <= 3 + k) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //video 11

        k = 0;
        for (int i = 1; i <= 7; i++) {

            if (i <= 4) k++;
            else k--;
            for (int j = 1; j <= 4; j++) {
                if (k >= j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        //video 12

        k = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= i && j <= 8 - i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 13
        k = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j <= 4) k++;
                    else k--;
                    System.out.print(k);
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();


        //video 14
        k = 6;
        for (int i = 1; i <= 7; i++) {
            int m = k;
            k--;
            for (int j = 1; j <= 7; j++) {
                if (i + j <= 8) {

                    System.out.print(m--);
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 15
        k = 0;
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) k++;
            else k--;
            int l = 1;
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - k) {
                    System.out.print(l++);
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 16
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 7; j++) {

                if (i == j)
                    System.out.print("\\ ");
                else if (i + j == 8)
                    System.out.print("/ ");
                else System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

        //video 17
        k = 0;
        for (int i = 1; i <= 9; i++) {
            if (i <= 5)
                k++;
            else k--;
            for (int j = 1; j <= 9; j++) {

                if (j <= 6 - k || j >= 4 + k)
                    System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println();


        //video 18

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 9; j++) {
                if (j >= i && j <= 10 - i)
                    System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println();

        //video 19

        for (int i = 1; i <= 4; i++) {
            k = 0;
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j <= 4) k++;
                    else k--;
                    System.out.print((char) (64 + k));
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 20
        for (int i = 1; i <= 4; i++) {
            int m = 0;
            k = 0;
            for (int j = 1; j <= 8; j++) {
                if (j >= 5 - i && j <= 4 + i) {
                    if (j <= 4) {
                        k++;
                        System.out.print((char) (k + 64));

                    } else {
                        m++;
                        System.out.print(m);
                    }

                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 21
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 8; j++) {

                if (j >= 5 - i && j <= 9 - i)
                    System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println();

        //video 22
        for (int i = 1; i <= 4; i++) {
            int m = 0;
            k = 0;
            for (int j = 1; j <= 8; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j <= 4) {
                        k++;
                        System.out.print(k);
                    } else {
                        m++;
                        System.out.print((char) (64 + m));
                    }
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //video 23
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++)
                if (j <= i)
                    if (j % 2 == 1)
                        System.out.print("| ");
                    else
                        System.out.print("0 ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();

        //video 24
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++)
                if ((i == 1 || i == 7 || j == 1 || j == 7) || (i >= 3 && i <= 5 && j <= 5 && j >= 3) && (i == 3 || i == 5 || j == 3 || j == 5))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println();


        //video 26
        for (int i = 1; i <= 4; i++) {
            int x = i;
            for (int j = 1; j <= 4; j++) {
                if (j <= i) {
                    System.out.print((char) (x + 64));
                    x--;
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //video 27
        for (int i = 1; i <= 4; i++) {
            int l = i + 1;
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    if (j <= 4) l--;
                    else l++;
                    System.out.print(l);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //video 31

        for (int i = 1; i <= 4; i++) {
            k=1;
            for (int j = 1; j <= 7; j++)
                if (j >= 5 - i && j <= 3 + i && (i + j) % 2 == 1)
                    if(i%2==0) {
                        System.out.print((char) (64 + k));
                        k++;
                    }
            else
                    {
                        System.out.print(k);
                        k++;
                    }
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();

        //video 32

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || (i + j) == 6) {
                    System.out.print("* ");

                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        //video 33

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j <= 5 - i || j >= 3 + i) {
                    System.out.print((char) (64 + j) + " ");

                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        //video 36

        for (int i = 0; i < 5; i++) {
            int l = i + 1;
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    int x = 0 + i * j;
                    System.out.print(x + " ");
                    k++;
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}


