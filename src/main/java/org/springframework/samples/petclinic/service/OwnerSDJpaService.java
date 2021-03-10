package org.springframework.samples.petclinic.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.PetTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerSDJpaService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	public Owner findById(Long aLong) {
		return ownerRepository.findById(aLong).orElse(null);
	}
	
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}
	
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}
	
	public void deleteById(Long aLong) {
		ownerRepository.deleteById(aLong);
	}
}
