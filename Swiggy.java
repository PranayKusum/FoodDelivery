import FOODDELIVERY.Restaurent;
public class Swiggy extends Restaurent{
    static double bill;
    static void selection(){
        System.out.println("select biryani or stater");
        String s=sc.next();
        Swiggy x=new Swiggy();
        switch(s){
            case "biryani" :
                System.out.println("Enter the quanity ");
                bill=bill+x.biryani(sc.nextInt());
                break;
            case "stater":
                System.out.println("Enter quantity ");
                bill=bill+x.starter(sc.nextInt());
        }
        billing(bill);
    }
    static void billing(double bill){
        System.out.println("total amount = "+bill);
        double dc=80;
        System.out.println("Delivery char = "+dc);
        System.out.println("Total payment = "+(bill+dc));
    }
}

