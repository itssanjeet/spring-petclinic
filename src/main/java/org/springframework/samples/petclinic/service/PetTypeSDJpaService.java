package org.springframework.samples.petclinic.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.samples.petclinic.repository.PetTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PetTypeSDJpaService {

	private final PetTypeRepository petTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	public PetType findById(Long aLong) {
		return petTypeRepository.findById(aLong).orElse(null);
	}

	public PetType seve(PetType petType) {
		return petTypeRepository.save(petType);
	}
	
	public void delete(PetType petType) {
		petTypeRepository.delete(petType);
	}
	
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}
}
