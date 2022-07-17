import java.util.Scanner;

public class RunApp {


    public static void hint() {
        System.out.println("\n" + "[<<< Please Select Menu >>>]" + "\n");
        System.out.println(" 1: Add Manager");
        System.out.println(" 2: Remove Manager");
        System.out.println(" 3: Add Member");
        System.out.println(" 4: Remove Member:");
        System.out.println(" 5: Add Book");
        System.out.println(" 6: Remove Book");
        System.out.println(" 7: Add Rent");
        System.out.println(" 8: Remove Rent");
        System.out.println(" 9: Show Books");
        System.out.println("10: Show Rents");
        System.out.println("11: Exit" + "\n");
        System.out.println("Enter a menu number:");
    }

    public static void addMember() {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        try {
            System.out.println("Enter name:");
            String Name = input1.nextLine();
            System.out.println("Enter nationalCode:");
            int National_Code = input.nextInt();
            System.out.println("Enter member_id:");
            String Member_id = input1.nextLine();

            Member member = new Member(Name, National_Code, Member_id);
            member.save();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void removeMember(){

        Scanner input = new Scanner(System.in);

        try {
            File.showMember();
            System.out.println("Enter member_id:");
            int member_id = input.nextInt();
            Member member = File.getMember(member_id);
            member.remove();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addManager() {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter name:");
            String Name = input.nextLine();
            System.out.println("Enter nationalCode:");
            int NationalCode = input.nextInt();

            Manager manager = new Manager(Name, NationalCode);
            manager.save();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void removeManager(){

        Scanner input = new Scanner(System.in);

        try {
            File.showManagers();
            System.out.println("Enter manager_id:");
            int manager_id = input.nextInt();
            Manager manager = File.getManager(manager_id);
            manager.remove();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addBook() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Name:");
            String Name = input.nextLine();
            System.out.println("Enter Author:");
            String Author = input.nextLine();
            System.out.println("Enter Book_id:");
            int book_id = input.nextInt();

            Book book = new Book(Name, Author, book_id);
            book.save();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeBook(){

        Scanner input = new Scanner(System.in);

        try {
            File.showBook();
            System.out.println("Enter book_id:");
            int book_id = input.nextInt();
            Book book = File.getBook(book_id);
            book.remove();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addRent() {

        Scanner inputName = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        try {
            File.showBook();
            System.out.println("Enter book code:");
            int bid = inputNum.nextInt();
            Book book = File.getBook(bid);
            File.showMember();
            System.out.println("Enter member code:");
            int mid = inputNum.nextInt();
            Member member = File.getMember(mid);
            System.out.println("Enter date:");
            String date = inputName.nextLine();

            Rent rent = new Rent(book, member, date);
            rent.save();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeRent(){

        Scanner input = new Scanner(System.in);

        try {
            File.readRent();
            System.out.println("Enter rent_id:");
            int rent_id = input.nextInt();
            Rent rent = File.getRent(rent_id);
            rent.remove();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        File.readManager();
        File.readMember();
        File.readRent();
        File.readBook();

        try {

            while (true) {
                hint();

                int input = in.nextInt();

                switch (input) {

                    case 1:
                        addManager();
                        break;

                    case 2:
                        removeManager();
                        break;

                    case 3:
                        addMember();
                        break;

                    case 4:
                        removeMember();
                        break;

                    case 5:
                        addBook();
                        break;

                    case 6:
                        removeBook();
                        break;

                    case 7:
                        addRent();
                        break;

                    case 8:
                        removeRent();
                        break;

                    case 9:
                        File.showBook();
                        break;
                    case 10:
                        File.showRent();
                        break;

                    case 11:
                        System.out.println("Thanks for selecting us.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("incorrect!!!");

                }
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
