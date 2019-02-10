package models;

public class TicketOfServiceCenter {
    String ticketID;
    String customerOfServiceCenter;
    String dateOfIncomeDevice;
    String dateOfOutDevice;
    String deviceOfServiceCenter;
    double priceOfRepair;
    String curentDeviceWarehouse;
    String curentStatusOfRepair;

    enum statusOfRepair {
        OPEN,
        IN_PROGRESS,
        WAIT_PARTS,
        REPAIRED,
        ISSUED

    }

    enum deviceWarehouse {
        INCOMING_RECEPTION_WAREHOUSE,
        ENGINEER_WAREHOUSE,
        OUTCOMING_RECEPTION_WAREHOUSE
    }

    public TicketOfServiceCenter(String ticketID, String customerOfServiceCenter, String dateOfIncomeDevice, String dateOfOutDevice,
                                 String deviceOfServiceCenter, double priceOfRepair, String curentDeviceWarehouse, String curentStatusOfRepair) {
        this.ticketID = ticketID;
        this.customerOfServiceCenter = customerOfServiceCenter;
        this.dateOfIncomeDevice = dateOfIncomeDevice;
        this.dateOfOutDevice = dateOfOutDevice;
        this.deviceOfServiceCenter = deviceOfServiceCenter;
        this.priceOfRepair = priceOfRepair;
        this.curentDeviceWarehouse = curentDeviceWarehouse;
        this.curentStatusOfRepair = curentStatusOfRepair;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getCustomerOfServiceCenter() {
        return customerOfServiceCenter;
    }

    public void setCustomerOfServiceCenter(String customerOfServiceCenter) {
        this.customerOfServiceCenter = customerOfServiceCenter;
    }

    public String getDateOfIncomeDevice() {
        return dateOfIncomeDevice;
    }

    public void setDateOfIncomeDevice(String dateOfIncomeDevice) {
        this.dateOfIncomeDevice = dateOfIncomeDevice;
    }

    public String getDateOfOutDevice() {
        return dateOfOutDevice;
    }

    public void setDateOfOutDevice(String dateOfOutDevice) {
        this.dateOfOutDevice = dateOfOutDevice;
    }

    public String getDeviceOfServiceCenter() {
        return deviceOfServiceCenter;
    }

    public void setDeviceOfServiceCenter(String deviceOfServiceCenter) {
        this.deviceOfServiceCenter = deviceOfServiceCenter;
    }

    public double getPriceOfRepair() {
        return priceOfRepair;
    }

    public void setPriceOfRepair(double priceOfRepair) {
        this.priceOfRepair = priceOfRepair;
    }

    public String getCurentDeviceWarehouse() {
        return curentDeviceWarehouse;
    }

    public void setCurentDeviceWarehouse(String curentDeviceWarehouse) {
        this.curentDeviceWarehouse = curentDeviceWarehouse;
    }

    public String getCurentStatusOfRepair() {
        return curentStatusOfRepair;
    }

    public void setCurentStatusOfRepair(String curentStatusOfRepair) {
        this.curentStatusOfRepair = curentStatusOfRepair;
    }
}
