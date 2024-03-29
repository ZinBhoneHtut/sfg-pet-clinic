package com.zbh.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.zbh.sfgpetclinic.model.Owner;
import com.zbh.sfgpetclinic.model.Pet;
import com.zbh.sfgpetclinic.model.PetType;
import com.zbh.sfgpetclinic.model.Speciality;
import com.zbh.sfgpetclinic.model.Vet;
import com.zbh.sfgpetclinic.service.OwnerService;
import com.zbh.sfgpetclinic.service.PetTypeService;
import com.zbh.sfgpetclinic.service.SpecialityService;
import com.zbh.sfgpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialtyService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService =  specialtyService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		petTypeService.save(dog);
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Zephania");
		owner1.setLastName("Ingram");
		owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");
        
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        
		ownerService.save(owner1);	

		Owner owner2 = new Owner();
		owner2.setFirstName("Charde");
		owner2.setLastName("Fitzgerald");
		owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");
        
        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);
        
		ownerService.save(owner2);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialtyService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialtyService.save(surgery);

		Vet vet1 = new Vet();
		vet1.setFirstName("Geoffrey");
		vet1.setLastName("Carson");
		vet1.getSpecialities().add(savedRadiology);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Ashton");
		vet2.setLastName("Terry");
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);

		System.out.println("Data are loaded");
	}

}
