package com.belov.jmixapplication.screen.order;

import com.belov.jmixapplication.entity.DeliveryArea;
import io.jmix.mapsui.component.GeoMap;
import io.jmix.mapsui.component.layer.TileLayer;
import io.jmix.mapsui.component.layer.VectorLayer;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Order_.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
//    @Autowired
//    private GeoMap map;
//
//    @Autowired
//    private InstanceContainer<DeliveryArea> deliveryAreaDc;
//
//    @Autowired
//    private InstanceContainer<Order> orderDc;
//
//    @Subscribe
//    protected void onBeforeShow(BeforeShowEvent event) {
//        map.setHeight("400px");
//        map.setWidth("800px");
//        map.setCenter(-99.755859D, 39.164141D);
//        map.setZoomLevel(4);

//        TileLayer tileLayer = new TileLayer("tileLayer");
//        tileLayer.setUrl("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png");
//        tileLayer.setAttributionString("&copy; <a href=\"http://www.openstreetmap.org/copyright\"" +
//                ">OpenStreetMap</a> &copy; <a href=\"https://carto.com/attributions\">CARTO</a>");
//        map.addLayer(tileLayer);

//        VectorLayer<DeliveryArea> territoryLayer = new VectorLayer<>("deliveryAreaLayer", deliveryAreaDc);
//        map.addLayer(territoryLayer);

//        VectorLayer<> salespersonLayer = new VectorLayer<>("salespersonLayer", salespersonDc);
//        salespersonLayer.setEditable(true);
//        map.addLayer(salespersonLayer);
//        map.selectLayer(salespersonLayer);
//    }
}