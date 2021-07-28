package by.guzypaul.first.view;

public class MessageForUser {

    /*private final String showInvitation = "Select a menu item:" + "\n"
            + "1. Find the value of a function: с = 3 + a" + "\n"
            + "2. Find the area of a rectangle" + "\n"
            + "3. Find the arithmetic mean of the cubes of two numbers and the geometric mean of their modules." + "\n"
            + "4. Get a^8  и a^10." + "\n"
            + "5. Add time to current value. " + "\n"
            + "6. Exit"
            + "\n";*/

    /*public void printMessage (String typeMessage){
        System.out.println(typeMessage);
    }*/

    public void showInvitation(){
        System.out.println("Select a menu item:" + "\n"
                + "1. Find the value of a function: с = 3 + a" + "\n"
                + "2. Find the area of a rectangle" + "\n"
                + "3. Find the arithmetic mean of the cubes of two numbers and the geometric mean of their modules." + "\n"
                + "4. Get a^8  и a^10." + "\n"
                + "5. Add time to current value. " + "\n"
                + "6. Exit"
                + "\n");
    }

    public void correctUser(){
        System.out.println("Wrong menu item is selected, re-enter." + "\n");
    }

    public void enterNumber(){
        System.out.println("Enter number: " + "\n");
    }
}
