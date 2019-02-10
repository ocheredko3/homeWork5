package controllers;

import models.DeviceOfServiceCenter;
import models.Employee;
import models.TicketOfServiceCenter;

import java.util.List;
import java.util.Scanner;

public class EngeeniarImplementation extends Employee implements IActionWithDevice {
    private Object DeviceOfServiceCenter;

    public EngeeniarImplementation(String position, double salary, String initials) {
        super(position, salary, initials);
    }

    public String engeeniarImplementation() {
        System.out.println("Ви увійшли в систему, як Інженер. Виберіть подальші дії : " +
                "\n 1)Переглянути всі пристрої \n 2)Переглянути зарплату \n 3)Ремонтувати пристрій \n 4)Перемістити пристрій на інший склад \n 0)Вихід  ");
        String out = null;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input) {

            case 1:
                if (input == 1) {
                    System.out.println("1)Переглянути всіх пристрої");
                    this.viewAllDevice();
                }
                break;
            case 2:
                if (input == 2) {
                    System.out.println("2)Переглянути зарплату");
                    this.viewSalary();
                }
                break;
            case 3:
                if (input == 3) {
                    System.out.println("3)Ремонтувати пристрій");
                    this.repairOfDeviice(takeDevice(DeviceOfServiceCenter));
                }
                break;
            case 4:
                if (input == 4) {
                    System.out.println("4)Перемістити пристрій на інший склад ");
                    this.changeDevicePosition();
                }
                break;
            default:
                System.exit(0);
        }
        return out;
    }

    public TicketOfServiceCenter takeDevice(Object device) {

        return null;
    }

    public List<DeviceOfServiceCenter> viewAllDevice() {
        return null;
    }

    public DeviceOfServiceCenter giveDevice(Object ticket) {
        return null;
    }

    public void changeDevicePosition() {

    }

    private DeviceOfServiceCenter repairOfDeviice(TicketOfServiceCenter device) {
        return null;
    }

    private void viewSalary() {

    }
}
