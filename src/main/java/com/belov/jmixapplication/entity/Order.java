package com.belov.jmixapplication.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

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

    @JoinColumn(name = "ADDRESS_ID", nullable = false)
    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Address address;

    @Column(name = "EXECUTION_FLAG", nullable = false)
    @NotNull
    private Boolean executionFlag = false;

    @InstanceName
    @Column(name = "DESCRIPTION", length = 511)
    private String description;


    @JoinColumn(name = "RESTAURANT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Restaurant restaurant;

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
}