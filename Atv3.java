public class Atv3 {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 100; i++) {

            if (i <= 51 && i % 2 != 0) {
                System.out.println("O numero impar e: " + i);
            } 
            else if (i >= 52 && i % 2 == 0) {
                System.out.println("O numero par e: " + i);
            }

        }
    }
}