import FOODDELIVERY.Restaurent;

public class User {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Swiggy");
        System.out.println("Press 2 for Zomato");

        int n=Restaurent.sc.nextInt();
        if(n==1){
            Swiggy.selection();
        }else if(n==2){
            Zomato.selection();
        }else{
            System.out.print("Invalid");
        }
    }
}
