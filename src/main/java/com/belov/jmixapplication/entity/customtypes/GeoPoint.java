package com.belov.jmixapplication.entity.customtypes;

import java.io.Serializable;
import java.util.Objects;

public class GeoPoint implements Serializable {

    public final double latitude;
    public final double longitude;

    public GeoPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        GeoPoint point = (GeoPoint) obj;
        return Double.compare(this.latitude, point.latitude) == 0 &&
                Double.compare(this.longitude, point.longitude) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude,longitude);
    }
}
