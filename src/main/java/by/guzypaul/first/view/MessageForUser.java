package by.guzypaul.first.view;

public class MessageForUser {

    public void showInvitation(){
        System.out.println("Выберете пункт меню:" + "\n" + "1. Найти значение функции: с = 3 + a" + "\n"
                + "2. Найти площадь прямоугольника ширина которого в два раза меньше длины" + "\n"
                + "3. Найти среднее арифметическое кубов двух чисел и среднее геометрическое их модулей." + "\n"
                + "4. Получить a^8  и a^10." + "\n"
                + "5. Прибавить время к текущему показанию" + "\n"
                + "6. выход"
                + "\n");
    }

    public void correctUser(){
        System.out.println("выбран неправильный пункт меню, повторите ввод.");
    }

    public void enterNumber(){
        System.out.println("Enter number: ");
    }
}
