package interfaces;

import models.DeviceOfServiceCenter;
import models.TicketOfServiceCenter;

interface IGiveToRepair {

   TicketOfServiceCenter giveToRepair(DeviceOfServiceCenter device);
}
