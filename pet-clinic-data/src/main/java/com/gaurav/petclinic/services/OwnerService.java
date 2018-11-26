package com.gaurav.petclinic.services;

import com.gaurav.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

        public Owner findByLastName(String name);
}
