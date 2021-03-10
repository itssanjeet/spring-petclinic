package org.springframework.samples.petclinic.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.samples.petclinic.repository.SpecialtyRepository;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.stereotype.Service;

@Service
public class SpecialtySDJpaService {

	private final SpecialtyRepository repo;

	public SpecialtySDJpaService(SpecialtyRepository repo) {
		this.repo = repo;
	}

	public Set<Specialty> findAll(){
		Set<Specialty> specialty = new HashSet<>();
		repo.findAll().forEach(specialty::add);
		return specialty;
	}
	
	public Specialty findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public Specialty save(Specialty specialty) {
		return repo.save(specialty);
	}
	
	public void delete(Specialty specialty) {
		repo.delete(specialty);
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
}
