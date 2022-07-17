import java.io.Serializable;
import Interface.to_String;

public class Rent implements Serializable {

    protected String date;
    protected Member member;
    protected Book book;
    static int Rid = 1;
    protected int rid;

    public Rent(Book book, Member member, String date) {
        this.book = book;
        this.member = member;
        this.date = date;
        this.rid = Rid;
        Rid++;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }

    public void save() {
        File.save(this);
    }

    public void remove(){
        File.remove(this);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "date='" + date + '\'' +
                ", member=" + member +
                ", book=" + book +
                '}';
    }
}
