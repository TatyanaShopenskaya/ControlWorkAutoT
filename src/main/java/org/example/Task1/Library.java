package org.example.Task1;
import java.util.ArrayList;
import java.util.List;
    public abstract class Library{
        private String name;
        private List<LibraryEntity> listEntity;
        public Library(String name, List<LibraryEntity> listEntity) {
            this.name = name;
            this.listEntity = new ArrayList<>();
        }
        public Library addToLibrary(LibraryEntity libraryEntity) {
            listEntity.add(libraryEntity);
            return this;
        }

        public String getName() {
            return name;
        }

        public List<LibraryEntity> getListEntity() {
            return this.listEntity;
        }
    }

