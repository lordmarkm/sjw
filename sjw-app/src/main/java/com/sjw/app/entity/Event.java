package com.sjw.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.baldy.commons.models.BaseNamedEntity;

import constants.EventType;

@Entity(name = "EVENT")
public class Event extends BaseNamedEntity {

	@Column
	@Enumerated(EnumType.STRING)
	private EventType etype = null;
	
	@ManyToOne
	@JoinColumn(name="eventowner")
	private Organization org = null;
	
	@Column
	private float latitude = 0.0f;
	
	@Column
	private float longtitude = 0.0f;

	public EventType getEtype() {
		return etype;
	}

	public void setEtype(EventType etype) {
		this.etype = etype;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(float longtitude) {
		this.longtitude = longtitude;
	}
	
	
	
	
}
