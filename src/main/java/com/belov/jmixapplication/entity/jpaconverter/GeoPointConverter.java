package com.belov.jmixapplication.entity.jpaconverter;

import com.belov.jmixapplication.entity.customtypes.GeoPoint;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GeoPointConverter implements AttributeConverter<GeoPoint, String> {

    @Override
    public String convertToDatabaseColumn(GeoPoint attribute) {
        if(attribute == null)
            return null;
        return attribute.latitude + "|" + attribute.longitude;
    }

    @Override
    public GeoPoint convertToEntityAttribute(String dbData) {
        if(dbData == null)
            return null;
        String[] strings = dbData.split("\\|");
        return new GeoPoint(Double.parseDouble(strings[0]), Double.parseDouble(strings[1]));
    }
}
