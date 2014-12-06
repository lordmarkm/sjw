package com.sjw.app.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjw.app.entity.Event;

import constants.EventType;

public interface EventService extends JpaRepository<Event, Long> {

    List<Event> findByOrg_Id(Long orgId);
    List<Event> findByEtype(EventType type);

}
