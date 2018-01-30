package com.example.demo.Dto;

public class DispositivoDTO {



    private String nomeDispositivo;
    private String cpu;
    private double ram;
    private double hardDisk;
    private String stato;

    public DispositivoDTO(String nomeDispositivo, String cpu, double ram, double hardDisk, String stato) {
        this.nomeDispositivo = nomeDispositivo;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.stato = stato;
    }
}
