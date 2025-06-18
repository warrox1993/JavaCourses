package Boucles;


public class odd {
    public static void main(String[] args) {
        System.out.println(sumOdd(5, 10));
        System.out.println(sumOdd(4, 9));
        System.out.println(sumOdd(-1, 5));

    }

    public static boolean isOdd(int n) {
        if (n<=0) {
            return false;
        }else if (n%2!=0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

}

