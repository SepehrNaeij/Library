import java.io.Serializable;
import Interface.to_String;

public abstract class Person implements Serializable {

    protected String Name;
    protected int National_Code;

    public Person(String Name, int National_Code) {
        this.Name = Name;
        this.National_Code = National_Code;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setNational_Code(int National_Code) {
        this.National_Code = National_Code;
    }

    public int getNational_Code() {
        return National_Code;
    }
}
