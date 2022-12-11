package library.realizable;

public abstract class Product {
    private String name;
    private int page;
    private boolean isRented = false;

    public Product(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    public boolean getRented() {
        return isRented;
    }
}
