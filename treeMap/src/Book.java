public class Book implements Comparable<Book>{

    private String name;
    private int pageNum;
private String author;
private String bookYear;

    public Book(String name, int pageNum, String author, String bookYear) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
    public String toString(){
        return "Name: "+this.getName()+" , "+ "pageNumber: "+this.getPageNum();
    }
}

