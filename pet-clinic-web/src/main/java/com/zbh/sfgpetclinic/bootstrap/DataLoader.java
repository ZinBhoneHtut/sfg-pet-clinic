package com.zbh.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.zbh.sfgpetclinic.model.Owner;
import com.zbh.sfgpetclinic.model.Vet;
import com.zbh.sfgpetclinic.service.OwnerService;
import com.zbh.sfgpetclinic.service.VetService;
import com.zbh.sfgpetclinic.service.map.OwnerServiceMap;
import com.zbh.sfgpetclinic.service.map.VetServiceMap;

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
		owner1.setFirstName("Zephania");
		owner1.setLastName("Ingram");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Charde");
		owner2.setLastName("Fitzgerald");
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Geoffrey");
		vet1.setLastName("Carson");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ashton");
		vet2.setLastName("Terry");
		vetService.save(vet2);
		
		System.out.println("Data are loaded");
	}

}
