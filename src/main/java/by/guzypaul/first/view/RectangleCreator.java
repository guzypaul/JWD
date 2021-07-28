package by.guzypaul.first.view;

import by.guzypaul.first.validate.RectangleValidator;
import java.util.Scanner;

public class RectangleCreator {

    private double width;

    public RectangleCreator () {
        RectangleValidator rectangleValidator = new RectangleValidator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter width: ");
            int tempWidth = scanner.nextInt();
            if (rectangleValidator.chekWeidth(tempWidth) == true) {
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
