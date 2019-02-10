package controllers;

import java.util.Scanner;

public class AdministrationServicesImplementation implements IAdministrationServices {
    public String adminScImplement() {
        System.out.println("Адміністрування офісу: \n 1)Орендувати офіс \n 2)Встановити ІД СЦ " +
                "\n 3)Встановити контакти СЦ \n 4)Встановити адресу СЦ \n 5)Встановити робочий графік СЦ \n 0)Вихід");
        String out = null;
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        switch (input1) {
            case 1:
                if (input1 == 1) {
                    out = "1)Орендувати офіс";
                    this.officeRent();
                }
                break;
            case 2:
                out = "2)Встановити ІД СЦ";
                this.setIdServiceCenter();
                break;
            case 3:
                out = "3)Встановити контакти СЦ";
                this.setContactOfServiceCenter();
                break;
            case 4:
                out = "4)Встановити адресу СЦ";
                this.setAddressOfServiceCenter();
                break;
            case 5:
                out = "5)Встановити робочий графік СЦ";
                this.setWorkTimeOfServiceCenter();
            default:
                System.exit(0);
        }
        return out;

    }

    public void officeRent() {

    }

    public void setIdServiceCenter() {

    }

    public void setContactOfServiceCenter() {

    }

    public void setAddressOfServiceCenter() {

    }

    public void setWorkTimeOfServiceCenter() {

    }
}
