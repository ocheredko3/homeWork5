package models;

public class DeviceOfServiceCenter {
    private String serialNumber;
    private String model;
    private String nomination;
    private String manufacturer;
    private String countOfRepair;

    public DeviceOfServiceCenter(String serialNumber, String model, String nomination, String manufacturer, String countOfRepair) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.nomination = nomination;
        this.manufacturer = manufacturer;
        this.countOfRepair = countOfRepair;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountOfRepair() {
        return countOfRepair;
    }

    public void setCountOfRepair(String countOfRepair) {
        this.countOfRepair = countOfRepair;
    }
}
