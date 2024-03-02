package org.example.Task1;

public enum Type {
    BOOK("Книга"),
    PAPER("Газета"),
    CLIP("Микрофильм");

        private String title;
        Type(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }



    }


