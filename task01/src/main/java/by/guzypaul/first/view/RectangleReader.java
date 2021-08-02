package by.guzypaul.first.view;

import by.guzypaul.first.validator.RectangleValidator;
import java.util.Scanner;

public class RectangleReader {

    final private double width;

    public RectangleReader() {
        RectangleValidator rectangleValidator = new RectangleValidator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter width: ");
            int tempWidth = scanner.nextInt();
            if (rectangleValidator.chekWidth(tempWidth)) {
                width = tempWidth;
                break;
            } else {
                System.out.print("Incorrect width! ");
            }
        }
    }
    public double getWidth() {
        return width;
    }
}
