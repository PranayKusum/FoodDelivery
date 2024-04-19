import BusReservaion.Details;

public class Booking{
    public static void main(String[] args){
        Details a=new Details();
        System.out.println("Enter the Username:");
        String s=Details.sc.next();
        if(s.equals(a.getuser())){
            System.out.println("Enter the password:");
            String s2=Details.sc.next();
            if(s2.equals(a.getpass())){
                System.out.println("Login successfull");
                a.login();
            }else{
                System.out.println("Incorrect password");
            }
        }else{
            System.out.println("Incorrect User name please provide the valid user name");
        }
    }
}
