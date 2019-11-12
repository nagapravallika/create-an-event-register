package com.df.registerAnEvent.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EventRegister")
public class EventRegister 
{
	@Id
	private String id;
	private String EventTitle;
	private String EventCategory;
	private String OrganizerName;
	private Venue venue;
	private String EventStartDate;
	private String EventEndDate;
	private String Summary;
	private String TicketType;
	private String NumberOfTickets;
	private String TicketPrice;
	private String TicketstartDate;
	private String TicketEndDate;
	private String Published;
	
	public EventRegister()
	{
		
	}

	public EventRegister(String id, String eventTitle, String eventCategory, String organizerName, Venue venue,
			String eventStartDate, String eventEndDate, String summary, String ticketType, String numberOfTickets,
			String ticketPrice, String ticketstartDate, String ticketEndDate, String published) {
		super();
		this.id = id;
		EventTitle = eventTitle;
		EventCategory = eventCategory;
		OrganizerName = organizerName;
		this.venue = venue;
		EventStartDate = eventStartDate;
		EventEndDate = eventEndDate;
		Summary = summary;
		TicketType = ticketType;
		NumberOfTickets = numberOfTickets;
		TicketPrice = ticketPrice;
		TicketstartDate = ticketstartDate;
		TicketEndDate = ticketEndDate;
		Published = published;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventTitle() {
		return EventTitle;
	}

	public void setEventTitle(String eventTitle) {
		EventTitle = eventTitle;
	}

	public String getEventCategory() {
		return EventCategory;
	}

	public void setEventCategory(String eventCategory) {
		EventCategory = eventCategory;
	}

	public String getOrganizerName() {
		return OrganizerName;
	}

	public void setOrganizerName(String organizerName) {
		OrganizerName = organizerName;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public String getEventStartDate() {
		return EventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		EventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return EventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		EventEndDate = eventEndDate;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}

	public String getTicketType() {
		return TicketType;
	}

	public void setTicketType(String ticketType) {
		TicketType = ticketType;
	}

	public String getNumberOfTickets() {
		return NumberOfTickets;
	}

	public void setNumberOfTickets(String numberOfTickets) {
		NumberOfTickets = numberOfTickets;
	}

	public String getTicketPrice() {
		return TicketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		TicketPrice = ticketPrice;
	}

	public String getTicketstartDate() {
		return TicketstartDate;
	}

	public void setTicketstartDate(String ticketstartDate) {
		TicketstartDate = ticketstartDate;
	}

	public String getTicketEndDate() {
		return TicketEndDate;
	}

	public void setTicketEndDate(String ticketEndDate) {
		TicketEndDate = ticketEndDate;
	}

	public String getPublished() {
		return Published;
	}

	public void setPublished(String published) {
		Published = published;
	}
	
	
}
