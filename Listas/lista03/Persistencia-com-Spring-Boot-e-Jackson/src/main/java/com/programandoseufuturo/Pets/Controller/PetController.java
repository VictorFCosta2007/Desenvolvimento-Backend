package com.programandoseufuturo.Pets.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programandoseufuturo.Pets.Model.Pet;
import com.programandoseufuturo.Pets.Service.PetService;

@RequestMapping("/pets")
@RestController
public class PetController {
    private PetService service = new PetService();

    @GetMapping
    public List<Pet> listarPets() throws Exception{
        return service.listarPets();
    }

    @PostMapping
    public String cadastrarNovoPet(@RequestBody Pet pet) throws Exception{
        return service.cadastrarNovoPet(pet);
    }

}
