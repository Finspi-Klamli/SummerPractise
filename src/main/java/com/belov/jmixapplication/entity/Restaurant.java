package com.belov.jmixapplication.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.maps.Geometry;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "RESTAURANT", indexes = {
        @Index(name = "IDX_RESTAURANT_ADDRESS_ID", columnList = "ADDRESS_ID")
})
@Entity
public class Restaurant {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ADDRESS", nullable = false)
    @NotNull
    private String address;

    @Geometry
    @Column(name = "COORDINATES", nullable = false)
    @NotNull
    private Point coordinates;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinColumn(name = "DELIVERY_ZONE_ID")
    @Composition
    @OneToOne(fetch = FetchType.LAZY)
    private DeliveryArea deliveryZone;

    @Composition
    @OneToMany(mappedBy = "restaurant")
    private List<Order> order;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public DeliveryArea getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(DeliveryArea deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}