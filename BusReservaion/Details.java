package BusReservaion;

import java.util.Scanner;
public class Details
{
    public static Scanner sc=new Scanner(System.in);
    String f1,f2,t2,t3,s,sub1,sub2,p;
    int k=1,seat,pin=2456;
    private String Username="Pranay";
    private String password="Pranay@123";
    public String getpass(){
        return this.password;
    }
    public String getuser(){
        return this.Username;
    }
    public void setter(String password){
        this.password=password;
    }
    
    public String location(){
        /*if(k==1){
            sc.nextLine();
            k++;
        }*/
        System.out.println("Hyderabad   \nVijayawada    \nBengaluru \nChennai   \nWarangal");
        String s=sc.nextLine();
        if(s.equals("Hyderabad")||s.equals("Vijayawada")||s.equals("Bengaluru")||s.equals("Chennai")||s.equals("Warangal")){
            return s;
        }else{
            return location();
        }
    }
    //-------TRAVELS---------//
    public String travels(){
        System.out.println("TSRTC     \nAPSRTC      \nPrivate     ");
        String s=sc.nextLine();
        
        if(s.equals("TSRTC")||s.equals("APSRTC")||s.equals("Private")){
            return s;
        }else{
            System.out.println("Invalid Iput Please Enter again");
            return travels();
        }
    }
    
    
    public String busType(){
        System.out.println("Rajadhani \nSuper luxuary  \nLuxury  \nDelux  \nExpress  \nGaruda  ");
        System.out.println("---------->Enter Required bus Type<-------------");
        String b=sc.nextLine();
        if(b.equals("Rajadhani")||b.equals("Super luxuary")||b.equals("Luxuary")||b.equals("Delux")||b.equals("Express")||b.equals("Garuda")){
            return b;
        }else{
            return busType();
        }
    }
    
    
    public String privatebus(){
        System.out.println("Atluri \nKVR  \nSRS  \nKaveri  \nOrange  \nMorning star ");
        System.out.println("---------->Enter Required Travels<---------------");
        String s=sc.nextLine();
        if(s.equals("Atluri")||s.equals("KVR")||s.equals("Kaveri")||s.equals("Orange")||s.equals("Morning")){
            return s;
        }else{
            System.out.println("Entered Invalid Input Please Try again");
            return privatebus();
        }
    }
    
    public int seat(){
        System.out.println("----------->This bus contains upto 50 seats<-------------");
        return sc.nextInt();
    }
    
    //--------- OTP METHOD -------------//
    public void otp(){
        int n=1000+(int)(Math.random()*8999);
        System.out.println(n);
        int s=sc.nextInt();//problem//
        if(s==n){
            System.out.println("---------OTP successfull-----------");
            return ;
        }else{
            System.out.println("Invalid OTP");
            System.exit(0);
        }
    }
    
    //--------------- PAYMENT METHOD --------------//
    public void payment(String p){
        if(p.equals("PhonePe")||p.equals("Paytm")){
            System.out.println("------->Enter the UPI Pin <-----------");
            int PIN=sc.nextInt();
            if(PIN==pin){
                return ;
            }else{
                System.out.println("--------->Entered Invalid PIN<------------");
                System.exit(0);
            }
        }else{
            System.out.println("---------->Please Enter the OTP <------------");
            otp();
            return;
        }
    }
    //------------SUB LOCATION-------------//
    public String sublocations(String s){
        //System.out.println("k is "+k);
		//System.out.println("f1 is "+f1);
		
		
		if(k==1){

           k++;
            sc.nextLine();
        }else{
            //p=f2;
        }
		
        switch (s){
            case "Hyderabad":
                System.out.println("KPHB \nUPPAL \nSR NAGAR \nHITECH CITY ");
                p=sc.nextLine();
                if(p.equals("KPHB")||p.equals("UPPAL")||p.equals("SR NAGAR")||p.equals("HITECH CITY")){
                   break; 
                }else{
					System.out.println("Entered Invalid Inputs Please try Again");
                    return sublocations(s);
                }
            

            case "Vijayawada":
                System.out.println("Benzcircle \nVijayawada Local \nBeach Road \nAuto Nagar ");
                p=sc.nextLine();
                if(p.equals("Benzcircle")||p.equals("Vijayawada Local")||p.equals("Beach Road")||p.equals("Auto Nagar")){
                   break; 
                }else{System.out.println("Entered Invalid Inputs Please try Again");
                    return sublocations(s);
                }
                
            case "Bengaluru":
                System.out.println("Mysore \nBengaluru Local \nWhitefield  \nBallari ");
                p=sc.nextLine();
                if(p.equals("Mysore")||p.equals("Bengaluru Local")||p.equals("Whitefield")||p.equals("Ballari")){
                   break; 
                }else{
					System.out.println("Entered Invalid Inputs Please try Again");
                    return sublocations(s);
                }
                
            case "Chennai":
                System.out.println("Podicherry \nChennai \nXYZ city \nChennai Bus stand ");
                p=sc.nextLine();
                if(p.equals("Podicherry")||p.equals("Chennai")||p.equals("XYZ city")||p.equals("Chennai Bus Stand")){
                   break; 
                }else{
					System.out.println("Entered Invalid Inputs Please try Again");
                    return sublocations(s);
                }
                
                
            case "Warangal":
                System.out.println("KAZIPET \nMulugu \nHanmakonda \nWgl Bus Stand ");
                p=sc.nextLine();
                if(p.equals("KAZIPET")||p.equals("Mulugu")||p.equals("Hanmakonda")||p.equals("Bus Stand")){
                    break;
                }else{
					System.out.println("Entered Invalid Inputs Please try Again");
                    return sublocations(s);
                }
                
            default :
                System.out.println("-------->Entered Invalid stop<----------");
                sublocations(s);
        }
        return p;
}
    
    
    public void tasks(){
        System.out.println("------->Please select the Seats<---------");
        seat=seat();
        System.out.println("-------Please select pick up location:---------------");

        sub1=sublocations(f1);//problem not taking pickup location//
        System.out.println("-------Please select Drop location:------------------");
        sub2=sublocations(f2);
        
        System.out.println("Enter the Passenger Details\nname\nage\nGender");
        String name=sc.nextLine();
        String age=sc.nextLine();
        String gender=sc.nextLine();
        
        System.out.println("Enter the contact Details:");
        Long l=sc.nextLong();
        
        System.out.println("Enter the mail ID:");
        sc.nextLine();
        String mail=sc.nextLine();
        
        System.out.println("Enter Payment method:\nPhonePe\nPaytm\nNet banking\nDebit Card\nCredit Card");
        String payment=sc.nextLine();
        payment(payment);
        int n=100000+(int)(Math.random()*899999);
        
        System.out.println("-----------------Payment Succesful------------------- \nBooking Details are:");
        System.out.println(f1+"("+sub1+")-to->"+f2+"("+sub2+")");
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nPhno: "+l+"\nMailId: "+mail+"\nSeat No: "+seat);
        System.out.println("Ticket No: "+n);
        System.out.println("-------PAYMENT DONE THROW "+payment+"---------");
    }
    
    
    //login method//
    public void login(){
        System.out.println("********************Welcome Abhi Bus********************");
        System.out.println("*******************abhi book abhi goo*******************");
        System.out.println("------>From location<-------");
        sc.nextLine();
        f1=location();
        System.out.println("------>To location<---------");
        
        f2=location();
        if(f1.equals(f2)){
            System.out.println("--->You have choosen same place for From and To<---");
            System.exit(0);
        }else{
            System.out.println("-->Enter the required travels to book<---");
            String t=travels();
            if(t.equals("TSRTC") ||t.equals("APSRTC")){
                System.out.println("--->Please Select the required bus Type<---");
                String t2=busType();
                tasks();
            }else{
                System.out.println("--->Please select the Private Bus<---");
                String t3=privatebus();
                tasks();
            }
        }
    }
    
}

