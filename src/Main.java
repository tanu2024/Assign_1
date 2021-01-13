import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        while (true){
            try{
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter productName.");
        String productName = myObj.nextLine();
        System.out.println("Please enter price.");
        int price = myObj.nextInt();
        System.out.println("Please enter quantity.");
        int quantity = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Please enter type.");
        String type = myObj.nextLine();
//        System.out.println( Name + price + quantity + Type);
                Product product = new Product(productName,type,price,quantity);
                product.Productmethod();
        System.out.println("Do you want to enter details of any other item ");
        String Response = myObj.nextLine();
        if (Response.equals("Y")){
            System.out.println("Start Again");
        }
        else if (Response.equals("N")){
            break;
        }
        }
            catch(Exception ex){
                System.out.println("Please Enter a Valid Input");
                System.out.println("Error:"+ ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    }
