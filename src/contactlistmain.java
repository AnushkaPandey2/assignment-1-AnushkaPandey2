import java.util.Scanner;
public class contactlistmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        contactlist obj=new contactlist();
        System.out.println("Welcome to DBC's Contact List App");
        while(true) {
            System.out.println("Press 1 to add a new contact\nPress 2 to view all contacts\nPress 3 to search for a contact\nPress 4 to delete a contact\nPress 5 to exit program");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("enter name: ");
                    String name=sc.next();
                    System.out.println("enter contact no.");
                    String no=sc.next();
                    obj.insert(name,no);
                    break;
                case 2:obj.printlist();
                    break;
                case 3:System.out.println("enter name");
                    String n=sc.next();
                    boolean response=obj.search(n);
                    if(response==true)
                    {
                        System.out.println("contact found");
                    }
                    else
                    {
                        System.out.println("contact not found");
                    }
                    break;
                case 4:System.out.println("enter name");
                    String na=sc.next();
                    int res=obj.delete(na);
                    if(res==1)
                    {
                        System.out.println("contact deleted");
                    }
                    else
                    {
                        System.out.println("contact not found");
                    }
                    break;
                case 5:System.exit(0);
                    //break;
                default:System.out.println("you entered wrong choice");
                    break;
            }
        }
    }
}

