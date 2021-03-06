package com.coxandkings.travel.operations.model.core;

import com.coxandkings.travel.operations.enums.ActionItemStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpsHotelRoomLevelActionItems {

    @JsonIgnore
    private Map<String, OpsActionItem> actionItemsMap = new HashMap<String, OpsActionItem>();

    private List<OpsActionItem> actionItemList = new ArrayList<OpsActionItem>();

    @JsonIgnore
    String[] actionItemNames = {"supplierCommercials", "clientCommercials", "companyCommercials",
            "viewSharedBookingDetails", "updateConfirmationDetails", "changeSupplier",
            "discountOnSupplierPrice", "supplementToSupplierPrice"};

    @JsonIgnore
    String[] actionItemLabels = {"Supplier Commercials", "Client Commercials", "Company Commercials",
            "View Shared Booking Details", "Update Confirmation Details", "Change Supplier / Supplier Price",
            "Discount on Supplier Price", "Supplement to Supplier Price"
    };

    @JsonIgnore
    Boolean[] isInlineActionItem = {false, false, false,
            false, true, false,
            false, false};
    @JsonIgnore
    private String[] functions = {"", "", "", "", "", "", "", "Supplement on Supplier Price"

    };


    public OpsHotelRoomLevelActionItems() {
        super();
        init();
    }

    public void init() {
        actionItemsMap.clear();
        actionItemList.clear();
        int index = 0;
        for (String anActionItemName : actionItemNames) {
            OpsActionItem anActionItem = new OpsActionItem(actionItemLabels[index],
                    anActionItemName, ActionItemStatus.ACTIVE.getActionItemStatus(), isInlineActionItem[index], functions[index]);
            actionItemList.add(anActionItem);
            index++;
        }
    }

    public List<OpsActionItem> getActionItemList() {
//        init();
        return actionItemList;
    }

    public void setActionItemList(List<OpsActionItem> actionItemList) {
        this.actionItemList = actionItemList;
    }

    public void setActionItemsMap(Map<String, OpsActionItem> newProperties) {
        actionItemsMap = newProperties;
    }
}

