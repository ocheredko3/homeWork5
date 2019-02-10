package controllers;

import models.DeviceOfServiceCenter;
import models.TicketOfServiceCenter;

import java.util.List;

public interface IActionWithDevice {
    TicketOfServiceCenter takeDevice(Object device);

    List<DeviceOfServiceCenter> viewAllDevice();

    DeviceOfServiceCenter giveDevice(Object ticket);

    void changeDevicePosition();
}
