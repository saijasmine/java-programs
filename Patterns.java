*
**
***
****
*****
public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*****
****
***
**
*
public class InvertedRightTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



    *
   ***
  *****
 *******
*********
public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) System.out.print(" ");
            for(int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }
}


*********
 *******
  *****
   ***
    *
public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >= 1; i--) {
            for(int j = n; j > i; j--) System.out.print(" ");
            for(int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }
}


    1
   121
  12321
 1234321
123454321
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print(j);
            for(int j = i-1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }
}


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) System.out.print(" ");
            for(int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
        // Lower half
        for(int i = n-1; i >= 1; i--) {
            for(int j = n; j > i; j--) System.out.print(" ");
            for(int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }
}


1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
public class SquareNumberPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}



1
12
123
1234
12345
public class RightAngledNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}


12345
1234
123
12
1
public class InvertedNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}


A
AB
ABC
ABCD
ABCDE
public class AlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) System.out.print((char)('A' + j));
            System.out.println();
        }
    }
}


