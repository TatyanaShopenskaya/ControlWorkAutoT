package org.example.Task1;

import java.util.List;
public interface SearchPublication<T> {
    List<T> filterListId(Library library, int id);

    List<T> filterListAuthor(Library library, String author);

}
