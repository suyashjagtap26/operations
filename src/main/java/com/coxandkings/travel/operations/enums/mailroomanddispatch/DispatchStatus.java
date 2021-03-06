package com.coxandkings.travel.operations.enums.mailroomanddispatch;

public enum DispatchStatus {
    IN_TRANSIT,
    PENDING,
    DELIVERY,
    UNDELIVERY,
    ASSIGNED_TO_DELIVERY_BOY,
    PICKED_UP,
    RECEIVED_AT_MAILROOM_LOCATION,
    SENT_TO_MAILROOM_LOCATION,
    PARCEL_NOT_CREATED,
    PARCEL_CREATED_BUT_NOT_DISPATCHED,
    PARCEL_DISPATCHED_AWB_NOT_UPDATED,
    AWB_UPDATED_BILL_AMOUNT_NOT_UPDATED,
    BILLED_AND_DISPATCHED;

}
