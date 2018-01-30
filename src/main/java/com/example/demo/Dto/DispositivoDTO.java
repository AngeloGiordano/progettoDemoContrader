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

    public String getNomeDispositivo() {
        return nomeDispositivo;
    }

    public void setNomeDispositivo(String nomeDispositivo) {
        this.nomeDispositivo = nomeDispositivo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(double hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
