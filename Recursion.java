package recursion;

public class Recursion {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(f(x));
    }

    public static int f(int x) {
        if (x == 1) {
            return 3;
        } else {
            return 2 * f(x - 1) + 1;
        }
    }

}

// Visualization of the recursion above
//     f(5) -> returns 63
//      |
//   2*f(4)+1 = 63
//      |
//   2*f(3)+1 = 31
//      |
//   2*f(2)+1 = 15
//      |
//   2*f(1)+1 = 7
