package com.sjw.app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjw.app.entity.Event;

public interface EventService extends JpaRepository<Event, Long> {

}
