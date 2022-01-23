import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius, surfaceArea, volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        double elevado2 = Math.pow(radius, 2);
        double elevado3 = Math.pow(radius, 3);
        in.close();
        surfaceArea = 4 * Math.PI * elevado2;
        volume = (4/3) * Math.PI * elevado3;
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
