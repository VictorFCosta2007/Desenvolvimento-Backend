package com.programandoseufuturo.Pets.Service;

import java.util.List;

import com.programandoseufuturo.Pets.Model.Pet;
import com.programandoseufuturo.Pets.Repository.PetRepository;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarPets() throws Exception{
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception{
        if(repository.save(pet)){
            return String.format("Pet %s cadastrado com sucesso!", pet.getNome());
        }
        return "Pets devem ter id único...";
    }

}
