package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="dispositivo")
public class Dispositivo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long idDispositivo;

    @Column
    @Getter @Setter
    private String nomeDispositivo;
    @Column
    @Getter @Setter
    private String cpu;
    @Column
    @Getter @Setter
    private double ram;
    @Column
    @Getter @Setter
    private double hardDisk;
    @Column
    @Getter @Setter
    private String stato;


    public Dispositivo(){


}

    public Dispositivo(String nomeDispositivo,String cpu,double ram,double hardDisk, String stato){
        this.nomeDispositivo=nomeDispositivo;
        this.cpu=cpu;
        this.ram=ram;
        this.hardDisk=hardDisk;
        this.stato=stato;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dispositivo that = (Dispositivo) o;
        return idDispositivo == that.idDispositivo &&
                Double.compare(that.ram, ram) == 0 &&
                Double.compare(that.hardDisk, hardDisk) == 0 &&
                Objects.equals(nomeDispositivo, that.nomeDispositivo) &&
                Objects.equals(cpu, that.cpu) &&
                Objects.equals(stato, that.stato);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nomeDispositivo, cpu, ram, hardDisk, stato);
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nomeDispositivo='" + nomeDispositivo+ '\'' +
                ", CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", HardDisk='" + hardDisk + '\'' +
                ", Stato='" + stato + '\'' +
                '}';
    }


}
