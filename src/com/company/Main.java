package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean check=true;
        Author<String> authorOne = new Author<>();
        String steeh;
        String[] strokee;
        authorOne.setName("Friedrich Nietzsche");
        Scanner scanner = new Scanner(System.in);
        while(check)
        {
            System.out.println("Введите стихотворение, разделяя строки знаком \"/\" (0 - выход)");
            steeh = scanner.nextLine();
            if(steeh  == "0" || steeh.isEmpty()) {
                check = false;
                break;
            }
            strokee = steeh.split("/");
            authorOne.addSteeh(String.join("\n", strokee));
            authorOne.addStrokee(strokee);
        }
        System.out.println("Стихи автора \"" + authorOne.getName() + "\", отсортированные по длинам строк:\n" + String.join("\n___\n", authorOne.sortStrokee()));
    }
}
