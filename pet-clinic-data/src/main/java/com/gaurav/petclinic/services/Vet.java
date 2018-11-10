package com.gaurav.petclinic.services;

import java.util.Set;

public interface Vet {

    public Vet findById(Long id);

    public Vet save(Vet vet);

    public Set<Vet> findAll();
}
