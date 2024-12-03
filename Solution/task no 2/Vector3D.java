import java.util.Random;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    // Constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        double cx = this.y * other.z - this.z * other.y;
        double cy = this.z * other.x - this.x * other.z;
        double cz = this.x * other.y - this.y * other.x;
        return new Vector3D(cx, cy, cz);
    }

    public double cosine(Vector3D other) {
        double dotProduct = this.dotProduct(other);
        double lengthsProduct = this.length() * other.length();
        return dotProduct / lengthsProduct;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public static Vector3D[] generateRandomVectors(int n) {
        Random random = new Random();
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble() * 10 - 5;
            double y = random.nextDouble() * 10 - 5;
            double z = random.nextDouble() * 10 - 5;
            vectors[i] = new Vector3D(x, y, z);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return String.format("Vector3D(%.5f, %.5f, %.5f)", x, y, z);

    }

        public static void main(String[] args) {
            Vector3D vector1 = new Vector3D(1, 2, 3);
            Vector3D vector2 = new Vector3D(4, 5, 6);

            System.out.println("Vector 1: " + vector1);
            System.out.println("Vector 2: " + vector2);

            System.out.println("Length of Vector 1: " + vector1.length());

            System.out.println("Dot Product: " + vector1.dotProduct(vector2));

            System.out.println("Cross Product: " + vector1.crossProduct(vector2));

            System.out.println("Cosine of the Angle: " + vector1.cosine(vector2));

            Vector3D sum = vector1.add(vector2);
            System.out.println("Sum: " + sum);

            Vector3D difference = vector1.subtract(vector2);
            System.out.println("Difference: " + difference);

            Vector3D[] randomVectors = Vector3D.generateRandomVectors(2);
            System.out.println("Random Vectors:");
            for (Vector3D vector : randomVectors) {
                System.out.println(vector);
            }

    }

}
