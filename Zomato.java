import FOODDELIVERY.Restaurent;

public class Zomato extends Restaurent{
    static double bill;
    static void selection(){
        System.out.println("press biryani or stater");
        String s=sc.next();
        Zomato z=new Zomato();
        switch(s){
            case "biryani":
                System.out.println("Enter Quantity ");
                bill=bill+z.biryani(sc.nextInt());
                break;
            case "stater":
                System.out.println("Enter Quantity ");
                bill=bill+z.starter(sc.nextInt());
                break;
        }
        billing(bill);
    }
    static void billing(double bill){
        System.out.println("total amount = "+bill);
        double dc=80;
        System.out.println("Delivery char = "+dc);
        System.out.println("payment = "+(bill+dc));
    }
}
