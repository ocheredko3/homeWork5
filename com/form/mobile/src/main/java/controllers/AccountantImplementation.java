package controllers;

import java.util.Scanner;

public class AccountantImplementation implements IAccountant {
    public String accountantImplementation() {

        System.out.println("Бугалтерія:\n 1)Переглянути надходження \n 2)Заплатити податки \n 3)Заплатити зарплатню \n 4)Збільшити зарплату на 10% \n 0)Вихід");
        String out = null;
        Scanner scan = new Scanner(System.in);
        int input3 = scan.nextInt();
        switch (input3) {
            case 1:

                out = "1)Переглянути надходження";
                this.viewAllIncome();
                break;
            case 2:
                out = "2)Заплатити податки";
                this.payTax();
                break;
            case 4:
                out = "3)Заплатити зарплатню";
                this.paySalary();
                break;
            case 5:
                out = "4)Збільшити зарплату на 10%";
                this.increaseSalary();
                break;
            default:
                System.exit(0);
        }
        return out;

    }

    public void viewAllIncome() {

    }

    public void payTax() {


    }

    public void paySalary() {

    }

    public void increaseSalary() {

    }
}
