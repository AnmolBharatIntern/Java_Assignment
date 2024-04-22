public class quest6_10 {
        public static void main(String[] args) {
            System.out.println("X\tY");
            for (double i=0.0;i<=9.9;i+=0.1) {
                double x =Math.sqrt(i);
                double y =Math.sqrt(i+0.1);
                System.out.printf("%.1f\t%.1f%n", x, y);
            }
        }
    
}