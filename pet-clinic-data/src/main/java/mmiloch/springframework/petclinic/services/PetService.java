package mmiloch.springframework.petclinic.services;

import mmiloch.springframework.petclinic.model.Owner;
import mmiloch.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
