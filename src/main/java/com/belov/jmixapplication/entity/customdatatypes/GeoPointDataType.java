package com.belov.jmixapplication.entity.customdatatypes;

import com.belov.jmixapplication.entity.customtypes.GeoPoint;
import io.jmix.core.metamodel.annotation.DatatypeDef;
import io.jmix.core.metamodel.annotation.Ddl;
import io.jmix.core.metamodel.datatype.Datatype;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.util.Locale;

@DatatypeDef(
        id = "geoPoint",
        javaClass = GeoPoint.class,
        defaultForClass = true
)
@Ddl("varchar(255)")
public class GeoPointDataType implements Datatype<GeoPoint> {

    @Override
    public String format(@Nullable Object value) {
        if(value instanceof GeoPoint){
            GeoPoint point = (GeoPoint) value;
            return point.latitude+"|"+point.longitude;
        }
        return null;
    }

    @Override
    public String format(@Nullable Object value, Locale locale) {
        return format(value);
    }

    @Nullable
    @Override
    public GeoPoint parse(@Nullable String value) throws ParseException {
        if(value == null)
            return null;
        String[] strings = value.split("\\|");
        try {
            return new GeoPoint(Double.parseDouble(strings[0]), Double.parseDouble(strings[1]));
        }catch (Exception e){
            throw new ParseException(String.format("Cannot parse %s as GeoPoint: %s", value, e.toString()), 0);
        }
    }

    @Nullable
    @Override
    public GeoPoint parse(@Nullable String value, Locale locale) throws ParseException {
        return parse(value);
    }
}
