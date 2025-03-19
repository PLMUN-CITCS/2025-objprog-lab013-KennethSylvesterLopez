public class ParametersAndArguments {
    // Main method
    public static void main(String[] args) {
        // Declare variables in main
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea and store the result in area
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }

    // CalculateArea method
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}
