package com.belov.jmixapplication.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.maps.Geometry;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "ORDER_", indexes = {
        @Index(name = "IDX_ORDER_RESTAURANT_ID", columnList = "RESTAURANT_ID"),
        @Index(name = "IDX_ORDER_ADDRESS_ID", columnList = "ADDRESS_ID")
})
@Entity(name = "Order_")
public class Order {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Geometry
    @NotNull
    @Column(name = "LOCATION", unique = true)
    private Point location;

    @JoinColumn(name = "ADDRESS_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

    @Column(name = "EXECUTION_FLAG")
    private Boolean executionFlag = false;

    @Column(name = "DESCRIPTION", length = 511)
    private String description;


    @NotNull
    @JoinColumn(name = "RESTAURANT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Restaurant restaurant;

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Boolean getExecutionFlag() {
        return executionFlag;
    }

    public void setExecutionFlag(Boolean executionFlag) {
        this.executionFlag = executionFlag;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"description", "restaurant"})
    public String getInstanceName() {
        return String.format("%s %s", description, restaurant.getName());
    }
}