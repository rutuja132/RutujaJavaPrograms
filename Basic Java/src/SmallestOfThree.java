public class SmallestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is the smallest.");
            } else {
                System.out.println(c + " is the smallest.");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is the smallest.");
            } else {
                System.out.println(c + " is the smallest.");
            }
        }
    }
}







