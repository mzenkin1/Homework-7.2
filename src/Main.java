public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джоан", "Роулинг");
        Book book = new Book("Гарри Потер и философский камень", new Author("Джоан", "Роулинг"), 1997);
        System.out.println(book);

        Author author1 = new Author("Сергей", "Лукьяненко");
        Book book1 = new Book("Лабиринт отражений", new Author("Сергей", "Лукьяненко"), 1997);
        System.out.println(book1);

        book.setYear(1998);
        book1.setYear(2000);

        System.out.println(author.getName() + " " + " " + author.getSurname() + " " + book.getTitle() + " " + book.getYear());
        System.out.println(author1.getName() + " " + " " + author1.getSurname() + " " + book1.getTitle() + " " + book1.getYear());


    }
}