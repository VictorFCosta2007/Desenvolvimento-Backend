package com.programandoseufuturo.injecao_de_dependencia.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.programandoseufuturo.injecao_de_dependencia.models.Obra;

@Component
public class ObraRepository {
    private static final int ZERO_BYTE = 0;
    private File arquivo = new File("src/resources/database/tb_obras.json");
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Obra> getAll() throws IOException{
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }

        if(arquivo.length() > ZERO_BYTE){
            return objectMapper.readValue(arquivo, new TypeReference<List<Obra>>(){});
        }

        return new ArrayList<>();
    }

    public boolean save(Obra obra) throws IOException{
        List<Obra> obras = this.getAll();

        for(Obra obraNoDatabase : obras){
            if(obra.getId() == obraNoDatabase.getId()){
                return false;
            }
        }
        obras.add(obra);
        objectMapper.writeValue(arquivo, obras);
        return true;
    }

    public boolean update(Obra obra) throws IOException{
        List<Obra> obras = this.getAll();
        for(Obra obraNoDatabase : obras){
            if(obra.getId() == obraNoDatabase.getId()){
                obraNoDatabase.setNome(obra.getNome());
                obraNoDatabase.setAutor(obra.getAutor());
                obraNoDatabase.setPreco(obra.getPreco());
                obraNoDatabase.setJaFoiVendida(obra.isJaFoiVendida());

                objectMapper.writeValue(arquivo, obras);
                return true;
            }
        }
        return false;
    }


}
