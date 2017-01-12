package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.Specie;
import mx.utng.practice.repository.SpecieRepository;



@Named
@ViewScoped
public class SpecieController {
	@Autowired
	private SpecieRepository specieRepository;
		
		
		
		private List<Specie> species;
		
		private Specie specie = new Specie();
		
		private boolean editMode = false;
		

		@PostConstruct
		public void init(){
			setSpecies(specieRepository.findAll());
		}
		
		public void save(){
			specieRepository.save(specie);
			if(!editMode){
				getSpecies().add(specie);
			}
			specie = new Specie();
			setEditMode(false);
		}
		
		public void delete(Specie specie){
			specieRepository.delete(specie);
			species.remove(specie);
		}
		public void update(Specie specie){
			setSpecie(specie);
			setEditMode(true);
		}
		public void cancel(){
			specie = new Specie();
			setEditMode(false);
		}
		
		public Specie getSpecie() {
			return specie;
		}
		public void setSpecie(Specie specie) {
			this.specie = specie;
		}
		public List<Specie> getSpecies() {
			return species;
		}
		public void setSpecies(List<Specie> species) {
			this.species = species;
		}
		public boolean isEditMode(){
			return editMode;
		}
		public void setEditMode(boolean editMode){
			this.editMode = editMode;
		}
}
