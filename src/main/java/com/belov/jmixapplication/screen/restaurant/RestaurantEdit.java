package com.belov.jmixapplication.screen.restaurant;

import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.Restaurant;

@UiController("Restaurant.edit")
@UiDescriptor("restaurant-edit.xml")
@EditedEntityContainer("restaurantDc")
public class RestaurantEdit extends StandardEditor<Restaurant> {

}
