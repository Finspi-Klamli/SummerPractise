package com.belov.jmixapplication.screen.address;

import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.Address;

@UiController("Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
public class AddressEdit extends StandardEditor<Address> {
}