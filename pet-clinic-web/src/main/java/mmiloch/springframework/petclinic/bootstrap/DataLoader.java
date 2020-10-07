package mmiloch.springframework.petclinic.bootstrap;

import mmiloch.springframework.petclinic.model.Owner;
import mmiloch.springframework.petclinic.model.Vet;
import mmiloch.springframework.petclinic.services.OwnerService;
import mmiloch.springframework.petclinic.services.VetService;
import mmiloch.springframework.petclinic.services.map.OwnerServiceMap;
import mmiloch.springframework.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jace");
        owner1.setLastName("Beleren");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Liliana");
        owner2.setLastName("Vess");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Gideon");
        vet1.setLastName("Jura");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Nissa");
        vet2.setLastName("Revane");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
