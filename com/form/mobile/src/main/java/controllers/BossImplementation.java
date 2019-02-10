package controllers;

import models.BossOfServiceCenter;

import java.util.Scanner;

public class BossImplementation extends BossOfServiceCenter {



    public BossImplementation(String position, double salary, String initials) {
        super(position, salary, initials);
    }


    public String bossImplementation() {

        //
        System.out.println("Ви увійшли в систему, як " + getInitials() + ".\n" + getPosition() +"  Виберіть подальші дії :" +
                " \n 1)Бугалтерія \n 2)Відділ кадрів \n 3)Адміністрування \n 0)Вихід ");

        String out = null;
        Scanner scan=new Scanner(System.in);
        int input1 = scan.nextInt();
        switch (input1) {

            case 1:
                if (input1 == 1) {
                    AccountantImplementation accountantImplementation = new AccountantImplementation();
                    System.out.println(accountantImplementation.accountantImplementation());
                }
                    break;
            case 2:
                if (input1 == 2) {
                    HumanResourcesImplementation humanResourcesImplementation = new HumanResourcesImplementation();
                    System.out.println(humanResourcesImplementation.humanresources());
                }break;
            case 3:
                if (input1 == 3) {
                    AdministrationServicesImplementation administrationServicesImplementation = new AdministrationServicesImplementation();
                    System.out.println(administrationServicesImplementation.adminScImplement());
                }break;
            default:
                System.exit(0);
        }
        return out;
    }


}


