package controllers;

import models.BillOfRepair;
import models.CustomerOfServiceCenter;
import models.DeviceOfServiceCenter;
import models.TicketOfServiceCenter;

import java.util.List;
import java.util.Scanner;

public class CustomerImplementation extends CustomerOfServiceCenter implements IActionWithDevice {
    private Object TicketOfServiceCenter;
    private Object DeviceOfServiceCenter;

    public CustomerImplementation(String position, double salary, String initials) {
        super(position, salary, initials);
    }

    public String customerImplementation() {
        System.out.println("Ви увійшли в систему, як " + getInitials() + ".\n" + getPosition() + " Виберіть подальші дії : " +
                "\n 1)Віддати на  ремонт\n 2)Забрати з ремонту \n 3)Заплатити за ремонт \n 0)Вихід ");

        String out = null;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input) {

            case 1:
                if (input == 1) {
                    System.out.println("1)Віддати на  ремонт");
                    this.giveDevice(TicketOfServiceCenter);
                }
                break;
            case 2:
                if (input == 2) {
                    System.out.println("2)Забрати з ремонту");
                    this.takeDevice(DeviceOfServiceCenter);
                }
                break;
            case 3:
                if (input == 3) {
                    System.out.println("3)Заплатити за ремонт");
                    this.payForRepairs(TicketOfServiceCenter);
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

    private BillOfRepair payForRepairs(Object ticket) {

        return null;
    }
}
