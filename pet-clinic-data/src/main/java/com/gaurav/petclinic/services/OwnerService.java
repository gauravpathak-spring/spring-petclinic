package com.gaurav.petclinic.services;

import com.gaurav.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findById(Long id);

    public Set<Owner> findAll();

    public Owner save(Owner owner);

    public Owner findByName(String name);
}
