public class quest6_6{
        public static void main(String[] args) {
            int sum = 0, count = 0;
    
            for (int i = 101; i < 200; i++) {
                if (i % 7 == 0) {
                    sum += i;
                    count++;
                }
            }
    
            System.out.println("The sum of numbers between 100 and 200 that are divisible by 7 is: " + sum);
            System.out.println("The count of numbers between 100 and 200 that are divisible by 7 is: " + count);
        }
    
}