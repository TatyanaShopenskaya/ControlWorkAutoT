package org.example.Task1;

public abstract class Publication extends LibraryEntity{
        private String title;
        protected Publication(int id, String title) {
            super(id);
            this.title = title;
        }

        protected Publication(int id, String title, String datePublication) {
            this(id, title);
        }

        public String getName() {
            return this.title;
        }
}


