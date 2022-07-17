import java.io.Serializable;
import Interface.to_String;

public class Book implements Serializable {

    protected String Name;
    protected String Author;
    protected int Book_id;

    static int bID = 1;
    protected int bid;

    public Book(String Name, String Author, int book_id) {
        this.Name = Name;
        this.Author = Author;
        this.Book_id = book_id;
        this.bid = bID;
        bID++;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getAuthor() {
        return Author;
    }


    public int getbID() {
        return bID;
    }

    public void save() {
        File.save(this);
    }

    public void remove(){
        File.remove(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Book code='" + bid + '}';
    }
}
