public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;

        // Sum of the floats as an integer (using casting)
        int sumCasting = (int) (num1 + num2 + num3);
        System.out.println("Sum (casting): " + sumCasting);

        // Sum of the floats as an integer (using Math.round)
        int sumRounded = Math.round(num1 + num2 + num3);
        System.out.println("Sum (rounded): " + sumRounded);
    }
}
