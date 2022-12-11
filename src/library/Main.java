/*
package library;

import library.realizable.Book;
import library.realizable.Client;
import library.realizable.Magazine;
import library.rents.RentManager;

import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book one = new Book("Один", 20, "Слон");
        Book two = new Book("Два", 30, "Слон");
        Book three = new Book("Три", 500, "Жираф");
        Magazine four = new Magazine("Дикси", 20);
        Magazine five = new Magazine("Магнит", 30);
        Client vasya = new Client("Вася");
        Client dasha = new Client("Даша");
        Client masha = new Client("Маша");
        RentManager rentManager = new RentManager();

        System.out.println("Привет!");
        System.out.println("Приложение библиотеки");
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (true) {
            int command = scanner.nextInt();
            if(command == 1) {
                rentManager.rent(vasya, one);
                printMenu();
            } else if (command == 2) {
                rentManager.passBook(vasya, one);
            } else if (command == 3) {
                System.out.println("Скажи своё имя");
                String name = scanner.next();
                rentManager.search(name);
                printMenu();
            } else {
                System.out.println("Пока!");
                return;
            }
        }
    }

    static void printMenu() {
        System.out.println("Выбери что ты хочешь сделать (цифру):");
        System.out.println("1. Взять книгу");
        System.out.println("2. Сдать книгу");
        System.out.println("3. Узнать должен ли я вам книгу");
        System.out.println("4. Выйти");
    }
}
*/
