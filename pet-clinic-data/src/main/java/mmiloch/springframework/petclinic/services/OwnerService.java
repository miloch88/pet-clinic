package mmiloch.springframework.petclinic.services;

import mmiloch.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
