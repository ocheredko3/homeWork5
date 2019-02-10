package controllers;

import java.util.Scanner;

public class HumanResourcesImplementation implements IHumanResources {
    public String humanresources() {
        System.out.println("Відділ кадрів: \n 1)Найняти співробітника \n 2)Звільнити співробітника \n 3)Переглянути всіх співробітників \n 0)Вихід");
        String out = null;
        Scanner scan = new Scanner(System.in);
        int input2 = scan.nextInt();
        switch (input2) {
            case 1:
                out = "1)Найняти співробітника";
                this.hireAnEmployee();
                break;
            case 2:
                out = "2)Звільнити співробітника";
                this.fireAnEmployee();
                break;
            case 3:
                out = "3)Переглянути всіх співробітників";
                this.viewAllEmployee();
                break;
            default:
                System.exit(0);

        }

        return out;
    }

    public void hireAnEmployee() {

    }

    public void viewAllEmployee() {

    }

    public void fireAnEmployee() {

    }
}
