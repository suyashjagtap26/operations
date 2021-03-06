package com.coxandkings.travel.operations.model.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpsPaxTypeFareHolidaysClient extends OpsPaxTypeFare {

    @JsonProperty("clientEntityCommercial")
    private List<OpsClientEntityCommercial> opsClientEntityCommercial = new ArrayList<OpsClientEntityCommercial>();

    public OpsPaxTypeFareHolidaysClient() {
    }

    public List<OpsClientEntityCommercial> getOpsClientEntityCommercial() {
        return opsClientEntityCommercial;
    }

    public void setOpsClientEntityCommercial(List<OpsClientEntityCommercial> opsClientEntityCommercial) {
        this.opsClientEntityCommercial = opsClientEntityCommercial;
    }
}
