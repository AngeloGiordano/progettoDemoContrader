package com.example.demo.Model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="movimento")
@NoArgsConstructor @AllArgsConstructor
public class Movimento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Getter @Setter
    private long id;

    @Column
    @Getter @Setter
    private Date data;

    @Column
    @Getter @Setter
    private String causale;

    @Column
    @Getter @Setter
    private double importo;

    @Column
    @Getter @Setter
    private String mittente;

    @Column
    @Getter @Setter
    private String beneficiario;

    @Column
    @Getter @Setter
    private String valuta;

    public Movimento(Date data,String causale,double importo,String mittente,String beneficiario,String valuta){
        this.data=data;
        this.causale=causale;
        this.importo=importo;
        this.mittente=mittente;
        this.beneficiario=beneficiario;
        this.valuta=valuta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movimento movimento = (Movimento) o;
        return id == movimento.id &&
                Double.compare(movimento.importo, importo) == 0 &&
                Objects.equals(data, movimento.data) &&
                Objects.equals(causale, movimento.causale) &&
                Objects.equals(mittente, movimento.mittente) &&
                Objects.equals(beneficiario, movimento.beneficiario) &&
                Objects.equals(valuta, movimento.valuta);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, data, causale, importo, mittente, beneficiario, valuta);
    }

    @Override
    public String toString() {
        return "Movimento{" +
                "Data='" + data+ '\'' +
                ", Causale='" + causale + '\'' +
                ", Importo='" + importo+ '\'' +
                ", Mittente='" + mittente + '\'' +
                ", Beneficiario='" + beneficiario + '\'' +
                ", Valuta='"+ valuta+'\''+
                '}';
    }
}
