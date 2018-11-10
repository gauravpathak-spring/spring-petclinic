package com.gaurav.petclinic.services;

import com.gaurav.petclinic.model.Pet;

import java.util.Set;

public interface PetOwner {

    public Pet findById(Long id);

    public Pet save(Pet pet);

    public Set<Pet> findAll();

}
