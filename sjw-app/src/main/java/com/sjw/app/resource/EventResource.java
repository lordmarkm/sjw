package com.sjw.app.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sjw.app.entity.Event;
import com.sjw.app.service.EventService;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/sjw/event")
public class EventResource {

    private static final Logger LOG = LoggerFactory.getLogger(EventResource.class);

    @Autowired
    private EventService events;

    @RequestMapping(method = GET)
    public ResponseEntity<Event> findOne(@RequestParam Long id) {
        LOG.info("Finding event. id={}", id);
        return new ResponseEntity<Event>(events.findOne(id), OK);
    }
    
    @RequestMapping(method = POST)
    public ResponseEntity<Event> save(@RequestBody Event event) {
        LOG.info("Saving event. event={}", event);
        return new ResponseEntity<>(events.save(event), OK);
    }
}
