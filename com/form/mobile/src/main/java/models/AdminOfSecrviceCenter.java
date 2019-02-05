package models;

import java.util.List;

public class AdminOfSecrviceCenter extends Employee implements  IChangeDevicePosition,IGetDeviceFromRepair,ITakeDeviceToRepair,IViewAllDevices{
    public AdminOfSecrviceCenter(String position, double salary, String initials) {
        super(position, salary, initials);
    }

    @Override
    public String changeDevicePosition(DeviceOfServiceCenter device) {
        return null;
    }

    @Override
    public DeviceOfServiceCenter getDeviceFromRepair(TicketOfServiceCenter ticket) {
        return null;
    }

    @Override
    public TicketOfServiceCenter takeDeviceToRepair(DeviceOfServiceCenter device) {
        return null;
    }

    @Override
    public List<DeviceOfServiceCenter> viewAllDevices() {
        return null;
    }
}
