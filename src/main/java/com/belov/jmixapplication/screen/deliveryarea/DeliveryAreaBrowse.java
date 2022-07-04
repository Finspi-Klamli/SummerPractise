package com.belov.jmixapplication.screen.deliveryarea;

import io.jmix.mapsui.component.layer.style.GeometryStyle;
import io.jmix.mapsui.component.layer.style.GeometryStyles;
import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.DeliveryArea;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("DeliveryArea.browse")
@UiDescriptor("delivery-area-browse.xml")
@LookupComponent("deliveryAreasTable")
public class DeliveryAreaBrowse extends StandardLookup<DeliveryArea> {

    @Autowired
    GeometryStyles geometryStyles;

    @Install(to = "map.deliveryAreaLayer", subject = "styleProvider")
    private GeometryStyle setDeliveryAreaStyleProvider(DeliveryArea deliveryArea){
        return geometryStyles.polygon()
                .setFillColor(String.format("#%s",deliveryArea.getColor()))
                .setFillOpacity(0.4)
                .setStrokeColor("#2CA860");

    }
}