import java.util.ArrayList;
import java.io.*;


public class File {

    private static final String MemberPath = "E:\\JavaFiles\\members.txt";
    private static final String ManagerPath = "E:\\JavaFiles\\managers.txt";
    private static final String RentPath = "E:\\JavaFiles\\rents.txt";
    private static final String BookPath = "E:\\JavaFiles\\books.txt";
    protected String path;

    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Manager> managers = new ArrayList<>();
    public static ArrayList<Rent> rents = new ArrayList<>();
    public static ArrayList<Book> books = new ArrayList<>();

    public File(String path)
    {
        this.path = path;
    }

    public static Member getMember(int id) {
        Member member = null;
        for (Member input : members) {
            if (input.mid == id) {
                member = input;
                break;
            }
        }
        return member;
    }

    public static Manager getManager(int id) {
        Manager manager = null;
        for (Manager input : managers) {
            if (input.manager_id == id) {
                manager = input;
                break;
            }
        }
        return manager;
    }


    public static Book getBook(int id) {
        Book book = null;
        for (Book input : books) {
            if (input.bid == id) {
                book = input;
                break;
            }
        }
        return book;
    }

    public static Rent getRent(int id) {
        Rent rent = null;
        for (Rent input : rents) {
            if (input.rid == id) {
                rent = input;
                break;
            }
        }
        return rent;
    }

    public static void showManagers() {
        for (Manager manager : managers) {
            System.out.println(manager);
        }
    }

    public static void showMember() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void showBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void showRent() {
        for (Rent rent : rents) {
            System.out.println(rent);
        }

    }

    public static void writeMember() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(MemberPath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Member member : members) {
                objectOutputStream.writeObject(member);
            }

            objectOutputStream.close();
            System.out.println("Done,Your information is saved in the File. ");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void writeManager() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ManagerPath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Manager manager : managers) {
                objectOutputStream.writeObject(manager);
            }

            objectOutputStream.close();
            System.out.println("Done,Your information is saved in the File.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readMember() {


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(MemberPath))) {

            while (true) {
                Member input = (Member) in.readObject();
                members.add(input);
            }


        } catch (EOFException eof) {
            System.out.println("Reached end of MemberFile");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {

            if (members.size() != 0) {
                int n = members.size() - 1;
                Member.mID = members.get(n).mid + 1;
            }
        }

    }

    public static void readManager() {


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ManagerPath))) {

            while (true) {
                Manager input = (Manager) in.readObject();
                managers.add(input);
            }


        } catch (EOFException eof) {
            System.out.println("Reached end of ManagerFile");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {

            if (managers.size() != 0) {
                int n = managers.size() - 1;
                Manager.manager_ID = managers.get(n).manager_id + 1;
            }
        }

    }

    public static void writeRent() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(RentPath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Rent v : rents) {
                objectOutputStream.writeObject(v);
            }

            objectOutputStream.close();
            System.out.println("Done,Your information is saved in the File. ");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readRent() {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(RentPath))) {

            while (true) {
                Rent rent = (Rent) in.readObject();
                rents.add(rent);
            }


        } catch (EOFException eof) {
            System.out.println("Reached end of RentFile");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeBook() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(BookPath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }

            objectOutputStream.close();
            System.out.println("Done,Your information is saved in the File. ");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readBook() {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(BookPath))) {

            while (true) {
                Book input = (Book) in.readObject();
                books.add(input);
            }


        } catch (EOFException eof) {
            System.out.println("Reached end of BookFile");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {

            if (books.size() != 0) {
                int n = books.size() - 1;
                Book.bID = books.get(n).bid + 1;
            }
        }

    }

    public static void save(Member member) {
        members.add(member);
        writeMember();
    }

    public static void remove(Member member) {
        members.remove(member);

    }

    public static void save(Manager manager) {
        managers.add(manager);
        writeManager();
    }

    public static void remove(Manager manager) {
        managers.remove(manager);
    }

    public static void save(Rent rent) {
        rents.add(rent);
        writeRent();
    }

    public static void remove(Rent rent) {
        rents.remove(rent);
    }

    public static void save(Book book) {
        books.add(book);
        writeBook();

    }

    public static void remove(Book book) {
        books.remove(book);
    }


}
