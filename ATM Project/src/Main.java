import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("***Welcome ATM Project***");
        System.out.print("\n");

        String userName;
        String passWord;
        int right = 3;
        int balance = 2000;
        int select;

        while(right > 0){
            System.out.println("Please enter your userName: ");
            userName = input.nextLine();
            System.out.println("Please enter your passWord: ");
            passWord = input.nextLine();

            if(userName.equals("dumanliva27") && passWord.equals("2727")){
                System.out.println("Hello! Welcome Duman Bank");
                do{
                    System.out.println("1.Deposit\n" +
                            "2.Money to pull\n" +
                            "3.Balance Inguriy\n" +
                            "4.Check Out\n");

                    System.out.println("Please select the action you want to do: ");
                    select = input.nextInt();

                    if(select == 1){
                        System.out.println("Amount of Money: ");
                        int price = input.nextInt();
                        balance += price;

                    }else if(select == 2){
                        System.out.println("Amount of Money: ");
                        int price = input.nextInt();
                        if(price > balance){
                            System.out.println("Insufficient Balance!");
                        }else {
                            balance -= price;
                        }
                    }else if(select == 3){
                        System.out.println("Yours Balance: " + balance);
                    }
                }while(select != 4);
                    System.out.println("Repeat Goodbays");
                    break;

                }else{
                    right--;
                    System.out.println("Incorrent userName or passWord . Try Again");
                    if(right == 0){
                        System.out.println("Sorry!!! Your acount has been bloked.Please contact the bank");

                    }else{
                        System.out.println("Available Balance: " + right );
                    }


            }
        }




    }
}