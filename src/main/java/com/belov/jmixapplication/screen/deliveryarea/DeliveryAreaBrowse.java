package com.belov.jmixapplication.screen.deliveryarea;

import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.DeliveryArea;

@UiController("DeliveryArea.browse")
@UiDescriptor("delivery-area-browse.xml")
@LookupComponent("deliveryAreasTable")
public class DeliveryAreaBrowse extends StandardLookup<DeliveryArea> {
}