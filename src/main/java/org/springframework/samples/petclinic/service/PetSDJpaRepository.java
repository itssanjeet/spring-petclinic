package org.springframework.samples.petclinic.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetSDJpaRepository {

	private final PetRepository petRepository;

	public PetSDJpaRepository(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	public Set<Pet> findAll(){
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}
	
	public Pet findById(Long aLong) {
		return petRepository.findById(aLong).orElse(null);
	}
	
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}
	
	public void delete(Pet pet) {
		petRepository.delete(pet);
	}
	
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}
}
