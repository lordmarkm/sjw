package com.sjw.app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjw.app.entity.Organization;

public interface OrganizationService extends JpaRepository<Organization, Long> {

}
