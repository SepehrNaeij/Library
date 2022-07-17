import Interface.to_String;

public class Manager extends Person {

    static int manager_ID = 1;
    protected int manager_id;

    public Manager(String Name, int National_Code) {
        super(Name, National_Code);
        this.manager_id = manager_ID;
        manager_ID++;

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


    public void save() {
        File.save(this);
    }

    public void remove(){
        File.remove(this);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name='" + Name + '\'' +
                ", National_Code=" + National_Code +
                ", manager_id=" + manager_id +
                '}';
    }
}
