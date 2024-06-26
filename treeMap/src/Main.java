import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Iyi hissetmek", 320, "David Burns", "1980");
        Book b2 = new Book("Hobbit", 250, "J. R. R. Tolkien", "1937");
        Book b3 = new Book("80 günde devrialem", 200, "Jules Verne", "1872");
        Book b4 = new Book("Suç ve ceza", 340, "Fyodor Dostoyevski", "1849");
        Book b5 = new Book("Melekler ve şeytanlar", 400,"Dan Brown","2000");

        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(b1);
        bookSetByName.add(b2);
        bookSetByName.add(b3);
        bookSetByName.add(b4);
        bookSetByName.add(b5);

        System.out.println("İsme göre sıralama");
        for (Book bookName: bookSetByName){
            System.out.println(bookName);
        }

        Set<Book> bookSetPageNum= new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        });
        bookSetPageNum.add(b1);
        bookSetPageNum.add(b2);
        bookSetPageNum.add(b3);
        bookSetPageNum.add(b4);
        bookSetPageNum.add(b5);
        System.out.println("Kitap sayfa sırasına göre sıralama: ");

        for (Book bookNum: bookSetPageNum){
            System.out.println(bookNum);
        }
    }
}