import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Поток ввода
        Parent parent = new Parent();
        System.out.println("Назначьте имя родителя");
        parent.setName(scanner.next()); // Ввод имени
        System.out.println(parent.name);
        parent = new Child(); // Передаем переменной суперкласса ссылку на объект подкласса
        System.out.println(parent.getName());
    }
}