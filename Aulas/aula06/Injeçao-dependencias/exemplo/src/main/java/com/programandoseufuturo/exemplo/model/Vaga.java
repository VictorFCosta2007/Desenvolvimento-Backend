package com.programandoseufuturo.exemplo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vaga {
    private int id;

    @JsonProperty("placa_veiculo")
    private String placaVeiculo;
    
    @JsonProperty("esta_ocupada")
    private boolean estaOcupada;

    public Vaga(){
    }

    public Vaga(int id, String placaVeiculo, boolean estaOcupada) {
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.estaOcupada = estaOcupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }
}
