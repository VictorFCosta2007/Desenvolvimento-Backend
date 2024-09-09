package com.programandoseufuturo.injecao_de_dependencia.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.programandoseufuturo.injecao_de_dependencia.models.Obra;
import com.programandoseufuturo.injecao_de_dependencia.repository.ObraRepository;

@Component
public class ObraService {
    private ObraRepository obraRepository;

    @Autowired
    public ObraService(ObraRepository obraRepository){
        this.obraRepository = obraRepository;
    }

    public List<Obra> listarVagas() throws IOException{
        return obraRepository.getAll();
    }

    public Obra save(Obra obra) throws IOException{
        if(obraRepository.save(obra)){
            return obra;
        }
        return null;
    }

    public Obra update(Obra obra) throws IOException{
        if(obraRepository.update(obra)){
            return obra;
        }
        return null;
    }

}
