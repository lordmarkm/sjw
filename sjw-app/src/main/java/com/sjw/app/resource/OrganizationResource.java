package com.sjw.app.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sjw.app.entity.Organization;
import com.sjw.app.service.OrganizationService;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/sjw/org")
public class OrganizationResource {

    @Autowired
    private OrganizationService orgs;

    @RequestMapping(method = GET)
    public ResponseEntity<List<Organization>> query() {
        return new ResponseEntity<>(orgs.findAll(), OK);
    }

    @RequestMapping(value = "/{id}", method = GET)
    public ResponseEntity<Organization> findOne(@RequestParam Long id) {
        return new ResponseEntity<>(orgs.findOne(id), OK);
    }
    
    @RequestMapping
    public ResponseEntity<Organization> save(@RequestBody Organization organization) {
        return new ResponseEntity<>(orgs.save(organization), OK);
    }

}
