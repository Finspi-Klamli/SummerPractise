package com.belov.jmixapplication.screen.address;

import io.jmix.ui.screen.*;
import com.belov.jmixapplication.entity.Address;

@UiController("Address.browse")
@UiDescriptor("address-browse.xml")
@LookupComponent("addressesTable")
public class AddressBrowse extends StandardLookup<Address> {
}