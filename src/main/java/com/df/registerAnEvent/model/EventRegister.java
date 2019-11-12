package com.df.registerAnEvent.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="eventRegister")
public class EventRegister 
{
	@Id
	private String id;
	private String eventTitle;
	private String eventCategory;
	private String organizerName;
	private Venue venue;
	private String eventStartDate;
	private String eventEndDate;
	private String summary;
	private String ticketType;
	private String numberOfTickets;
	private String ticketPrice;
	private String ticketstartDate;
	private String ticketEndDate;
	private String published;
	
	public EventRegister()
	{
		
	}

	public EventRegister(String id, String eventTitle, String eventCategory, String organizerName, Venue venue,
			String eventStartDate, String eventEndDate, String summary, String ticketType, String numberOfTickets,
			String ticketPrice, String ticketstartDate, String ticketEndDate, String published) {
		super();
		this.id = id;
		this.eventTitle = eventTitle;
		this.eventCategory = eventCategory;
		this.organizerName = organizerName;
		this.venue = venue;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.summary = summary;
		this.ticketType = ticketType;
		this.numberOfTickets = numberOfTickets;
		this.ticketPrice = ticketPrice;
		this.ticketstartDate = ticketstartDate;
		this.ticketEndDate = ticketEndDate;
		this.published = published;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(String numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketstartDate() {
		return ticketstartDate;
	}

	public void setTicketstartDate(String ticketstartDate) {
		this.ticketstartDate = ticketstartDate;
	}

	public String getTicketEndDate() {
		return ticketEndDate;
	}

	public void setTicketEndDate(String ticketEndDate) {
		this.ticketEndDate = ticketEndDate;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	
}
