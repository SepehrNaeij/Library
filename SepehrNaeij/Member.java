import Interface.to_String;

public class Member extends Person {

    protected String Member_id;

    static int mID = 1;

    protected int mid;

    public Member(String Name, int National_Code, String Member_id) {
        super(Name, National_Code);
        this.Member_id = Member_id;
        this.mid = mID;
        mID++;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setNational_Code(int NationalCode) {
        this.National_Code = NationalCode;
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
        return "Member{" +
                "Name='" + Name + '\'' +
                ", National_Code=" + '\'' + National_Code +
                '\'' + ", mid=" + mid + '}';
    }
}
