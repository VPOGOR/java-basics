public class Area {

    public double calculate(int N) {
        if (N % 2 == 0) {
            return N * N;
        } else if (N % 3 == 0) {
            return Math.PI * N * N;
        } else {
            return (Math.sqrt(3) / 4) * N * N;
        }
    }

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        int squareSide = 4;
        System.out.println("Area of square: " + areaCalculator.calculate(squareSide));

        int circleRadius = 3;
        System.out.println("Area of circle: " + areaCalculator.calculate(circleRadius));

        int triangleSide = 5;
        System.out.println("Area of equilateral triangle: " + areaCalculator.calculate(triangleSide));
    }
}
