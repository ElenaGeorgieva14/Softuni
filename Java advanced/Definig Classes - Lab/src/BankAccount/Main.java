package BankAccount;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        List<BankAccount> bankAccountList=new ArrayList<>();

        while(!input.equals("End")){
            String[] data=input.split(" ");
            String command=data[0];

            switch (command){
                case "Create":
                    BankAccount bankAccount=new BankAccount();
                    bankAccountList.add(bankAccount);
                    System.out.printf("Account ID%d created%n",bankAccount.getId());
                    break;
                case "Deposit":
                    int id=Integer.parseInt(data[1]);
                    double amount=Double.parseDouble(data[2]);
                    if(id<bankAccountList.size()+1){
                        bankAccountList.get(id-1).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n",amount,id);
                    }else{
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    int rate= ((int) Double.parseDouble(data[1]));
                    BankAccount.setInterestRate(rate);
                    break;
                case "GetInterest":
                    id= Integer.parseInt(data[1]);
                    int years=Integer.parseInt(data[2]);

                    if(id<bankAccountList.size()+1){
                        double interest=bankAccountList.get(id-1).getInterest(years);
                        System.out.printf("%.2f%n",interest);
                    }else{
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input=scanner.nextLine();
        }
    }
}
