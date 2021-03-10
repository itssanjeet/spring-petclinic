package org.springframework.samples.petclinic.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetSDJpaService {

	private final VetRepository vetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}
	
	public Set<Vet> findAll(){
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}
	
	public Vet findById(Long aLong) {
		return vetRepository.findById(aLong).orElse(null);
	}
	
	public Vet save(Vet vet) {
		return vetRepository.save(vet);
	}
	
	public void delete(Vet vet) {
		vetRepository.delete(vet);
	}
	
	public void deleteById(Long aLong) {
		vetRepository.deleteById(aLong);
	}
}
