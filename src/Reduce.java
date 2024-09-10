public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0){
            if (n % 2 == 0){ // halving even numbers
                n = n / 2;
            } else { // subtract 1 otherwisde
                n -= 1;
            }

            count++;
        }

        System.out.println("Steps that took: " + count);
    }
}
