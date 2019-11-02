package org.mt.petclinic.bootstrap;

import org.mt.petclinic.model.Owner;
import org.mt.petclinic.model.Vet;
import org.mt.petclinic.services.OwnerService;
import org.mt.petclinic.services.VetService;
import org.mt.petclinic.services.map.OwnerServiceMap;
import org.mt.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService; 
	private final VetService vetService; 
	
	public DataLoader() {
		ownerService = new OwnerServiceMap(); 
		vetService = new VetServiceMap(); 
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner(); 
		owner1.setId(1L);
		owner1.setFirstName("Jimmy");
		owner1.setLastName("Jones");
		
		ownerService.save(owner1); 
		
		Owner owner2 = new Owner(); 
		owner2.setId(2L);
		owner2.setFirstName("Wendy");
		owner2.setLastName("Williams");
		
		ownerService.save(owner2); 
		
		System.out.println("Owners loaded....	");
		
		Vet vet1 = new Vet(); 
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Norris");
		
		vetService.save(vet1); 
		
		Vet vet2 = new Vet(); 
		vet2.setId(2L);
		vet2.setFirstName("Ron");
		vet2.setLastName("James");
		
		vetService.save(vet2); 
		
		System.out.println("Vets loaded....");
		
	}

}