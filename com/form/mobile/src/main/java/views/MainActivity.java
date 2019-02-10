package views;

import common.DateNow;
import controllers.AdminImplementation;
import controllers.BossImplementation;
import controllers.CustomerImplementation;
import controllers.EngeeniarImplementation;

import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {

        DateNow dateNow = new DateNow();
        dateNow.dateOf();
        System.out.println("Сьогодні " + dateNow.dateOf() + "\n Увійти як: \n 1) Директор;\n 2) Адміністратор; \n 3) Клієнт; \n 4) Інженер; \n 0) Exit;");
        Scanner scan = new Scanner(System.in);
        int input;
        input = scan.nextInt();
        switch (input) {
            case 1:
                BossImplementation bossImplementation = new BossImplementation("Boss", 50000, "Hugo Boss");
                System.out.println(bossImplementation.bossImplementation());
                break;
            case 2:
                if (input == 2) {
                    AdminImplementation adminImplementation = new AdminImplementation("Admin", 15000, "Admin A.");
                    System.out.println(adminImplementation.adminImlementation());
                }
                break;
            case 3:
                if (input == 3) {
                    CustomerImplementation customerImplementation = new CustomerImplementation("Customer", 5000, "Ivanov");
                    System.out.println(customerImplementation.customerImplementation());
                }
                break;
            case 4:
                if (input == 4) {
                    EngeeniarImplementation engeeniarImplementation = new EngeeniarImplementation("Engineer", 15000, "Petrov P.");
                    System.out.println(engeeniarImplementation.engeeniarImplementation());
                }
                break;
            default:
                System.exit(0);
                break;


        }
    }
}
