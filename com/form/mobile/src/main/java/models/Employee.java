package models;

public abstract  class Employee {
    private String workPlace;
    private String position;
    private String arrivalDate;
    private String dateOfDismissal;
    private double salary;
    private String initials;
    private int phone;


    public Employee(String position, double salary, String initials) {
        this.position = position;
        this.salary = salary;
        this.initials = initials;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(String dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
