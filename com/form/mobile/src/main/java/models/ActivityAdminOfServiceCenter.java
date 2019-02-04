package models;

import java.util.List;

public class ActivityAdminOfServiceCenter implements IChangeDevicePosition, IGetDeviceFromRepair, ITakeDeviceToRepair, IViewAllDevices{


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
