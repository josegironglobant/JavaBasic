import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, baseArea, surfaceArea, volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        System.out.print("Enter the height: ");
        height = in.nextDouble();  // read input as double
        in.close();
        double elevado2 = Math.pow(radius, 2);
        baseArea = Math.PI * elevado2;
        surfaceArea = 2.0 * Math.PI * (radius + 2.0) * baseArea;
        volume = baseArea * height;
        System.out.printf("BaseArea is: %.2f%n", baseArea);
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
