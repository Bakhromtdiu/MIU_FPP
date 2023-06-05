public class Problem1 {

    static int reverNum = 0;
    static int base = 1;

    static int reverseCof(int num) {

        if (num > 0) {

            reverse(num / 10);
            reverNum += (num % 10) * base;
            baseM *= 10;
        }
        return reverNum;
    }

    public static void main(String[] args) {

        System.out.println(reverseCof(12345));

    }
