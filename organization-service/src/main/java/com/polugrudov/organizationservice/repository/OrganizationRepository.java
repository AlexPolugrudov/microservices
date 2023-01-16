package com.polugrudov.organizationservice.repository;

import com.polugrudov.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {
    public Optional<Organization> findById(String organizationId);
}
