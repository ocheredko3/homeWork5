package models;

public class CustomerOfServiceCenter extends Employee implements ITakeDeviceToRepair, IGetDeviceFromRepair, IChangeDevicePosition {
    public CustomerOfServiceCenter(String position, double salary, String initials) {
        super(position, salary, initials);
    }

    @Override
    public TicketOfServiceCenter takeDeviceToRepair(DeviceOfServiceCenter device) {
        return TicketOfServiceCenter;
    }

    @Override
    public DeviceOfServiceCenter getDeviceFromRepair(TicketOfServiceCenter ticket) {
        return DeviceOfServiceCenter;
    }

    @Override
    public String changeDevicePosition(DeviceOfServiceCenter device) {
        return null;
    }
}
