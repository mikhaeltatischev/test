package library.realizable;

public class Book extends Product implements Crust {
    private String autor;

    public Book(String name, int page, String autor) {
        super(name, page);
        this.autor = autor;
    }
}
