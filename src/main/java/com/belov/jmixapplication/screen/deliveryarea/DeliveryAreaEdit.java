package com.belov.jmixapplication.screen.deliveryarea;

import com.belov.jmixapplication.entity.Restaurant;
import io.jmix.mapsui.component.layer.style.GeometryStyle;
import io.jmix.mapsui.component.layer.style.GeometryStyles;
import io.jmix.ui.icon.JmixIcon;
import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.DeliveryArea;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("DeliveryArea.edit")
@UiDescriptor("delivery-area-edit.xml")
@EditedEntityContainer("deliveryAreaDc")
public class DeliveryAreaEdit extends StandardEditor<DeliveryArea> {

    @Autowired
    private GeometryStyles geometryStyles;

    @Install(to = "map.deliveryAreaLayer", subject = "styleProvider")
    private GeometryStyle setDeliveryAreaStyleProvider(DeliveryArea deliveryArea){
        return geometryStyles.polygon().setFillColor(deliveryArea.getColor()).setFillOpacity(0.5);
    }


}