//Вы реализуете библиотечный реестр - абстракция предназначенная для описания
// библиотечного фонда муниципалитета вашего города.
// В этом фонде хранятся разные объекты: книги, журналы, письма, микрофильмы и т.д.
// Также вам необходимо будет реализовать сервис обеспечивающий поиск среди
// всех объектов по инвентарному номеру и/или автору.
// Ваш main класс должен инициализировать реестр
// (генерировать экземпляры объектов), инициализировать сервис поиска и выводить на экран найденные элементы.
package org.example.Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LibraryEntity book1 = new Books(1, "Война и мир", "Лев Толстой");
        LibraryEntity book2 = new Books(2, "Евгений Онегин", "Александр Пушкин");
        LibraryEntity book3 = new Books(3, "Преступление и наказание", "Достоевский");
        LibraryEntity book4 = new Books(4, "Приключения капитана Врунгеля", "Андрей Некрасов");
        LibraryEntity book5 = new Books(5, "Черная курица или Подземные жители", "Александр Погорельский");
        LibraryEntity book6 = new Books(6, "Перегруженный ковчег", "Джеральд Даррелл");

        LibraryEntity newspaper1 = new Papers(7, "Burda", "Автор1");
        LibraryEntity newspaper2 = new Papers(8, "Times", "Автор2");
        LibraryEntity newspaper3 = new Papers(9, "Караван историй", "Автор3");
        LibraryEntity newspaper4 = new Papers(10, "Известия", "Автор4");
        LibraryEntity newspaper5 = new Papers(11, "Вести", "Автор5");
        LibraryEntity newspaper6 = new Papers(12, "АиФ", "Автор6");

        LibraryEntity clip1 = new Clips(13, "Симфонии", "Бах");
        LibraryEntity clip2 = new Clips(14, "Картины", "Айвазовский");


        Library centralLibrary = new MainTownLibrary("Центральная библиотека", new ArrayList<>());
        centralLibrary.addToLibrary(book1);
        centralLibrary.addToLibrary(book2);
        centralLibrary.addToLibrary(book3);
        centralLibrary.addToLibrary(book4);
        centralLibrary.addToLibrary(book5);
        centralLibrary.addToLibrary(book6);
        centralLibrary.addToLibrary(newspaper1);
        centralLibrary.addToLibrary(newspaper2);
        centralLibrary.addToLibrary(newspaper3);
        centralLibrary.addToLibrary(newspaper4);
        centralLibrary.addToLibrary(newspaper5);
        centralLibrary.addToLibrary(newspaper6);
        centralLibrary.addToLibrary(clip1);
        centralLibrary.addToLibrary(clip2);



        Search search = new Search();

        System.out.println(search.filterListId(centralLibrary,6));;
        System.out.println(search.filterListAuthor(centralLibrary,"Бах"));
    }
}



