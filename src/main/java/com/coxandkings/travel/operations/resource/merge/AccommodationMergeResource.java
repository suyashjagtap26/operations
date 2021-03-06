package com.coxandkings.travel.operations.resource.merge;


import com.fasterxml.jackson.annotation.JsonProperty;

public class AccommodationMergeResource extends MergeResource {
	
	@JsonProperty("hotelName")
	private String hotelName;
	@JsonProperty("checkInDate")
    private String checkInDate;
	@JsonProperty("checkOutDate")
    private String checkOutDate;
	@JsonProperty("roomTypeCode")
    private String roomType;
	@JsonProperty("roomCategoryId")
    private String roomCategory;
	@JsonProperty("bookId")
	private String book_order_room_id;
	private int roomCount;
	
    
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomCategory() {
		return roomCategory;
	}
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}
	public AccommodationMergeResource() {
		super();
	}
	
	public String getBook_order_room_id() {
		return book_order_room_id;
	}
	public void setBook_order_room_id(String book_order_room_id) {
		this.book_order_room_id = book_order_room_id;
	}
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	
	
	
    
 
}
