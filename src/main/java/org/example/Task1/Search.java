package org.example.Task1;
import java.util.List;

public class Search implements SearchPublication<LibraryEntity> {

    @Override
    public List<LibraryEntity> filterListId(Library library, int id) {
        List<LibraryEntity> list = library.getListEntity()
                .stream()
                .filter(e -> id == e.getId()).toList();
        if (list.size() > 0) {
            System.out.printf("Результат поиска по указанному id - ", id);
        } else {
            System.out.println("Данные не обнаружены");
        }
        return list;
    }

    @Override
    public List<LibraryEntity> filterListAuthor(Library library, String author) {
        List<LibraryEntity> list = library.getListEntity()
                .stream()
                .filter(e -> e instanceof Authors && (((Authors) e)
                        .getAuthor()
                        .toLowerCase()
                        .contains(author.toLowerCase())))
                .toList();
        if (list.size() > 0) {
            System.out.printf("Результат поиска по указанному автору - ", author);
        } else {
            System.out.println("Данные не обнаружены");
        }
        return list;
    }
}




