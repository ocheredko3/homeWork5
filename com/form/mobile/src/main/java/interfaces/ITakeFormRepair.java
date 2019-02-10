package interfaces;

import models.DeviceOfServiceCenter;
import models.TicketOfServiceCenter;

interface ITakeFormRepair {
    DeviceOfServiceCenter takeDeviceFromRepair(TicketOfServiceCenter ticket);
}
