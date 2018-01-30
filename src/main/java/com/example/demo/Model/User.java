package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @Getter @Setter
    private String username;
    @Column
    @Getter @Setter
    private String password ;
    @Column
    @Getter @Setter
    private String nomeUser ;
    @Column
    @Getter @Setter
    private String cognomeUser;
    @Column
    @Getter @Setter
    private String dataDiNascita;
    @Column
    @Getter @Setter
    private String indirizzo ;
    @Column
    @Getter @Setter
    private String città;
    @Column
    @Getter @Setter
    private String provincia ;
    @Column
    @Getter @Setter
    private String cap ;
    @Column
    @Getter @Setter
    private String email;
    @Column
    @Getter @Setter
    private String telefono ;
    @Column
    @Getter @Setter
    private  String ruolo ;

    public User(){}

    public User(String username, String password, String nomeUser, String cognomeUser, String dataDiNascita, String indirizzo, String città, String provincia, String cap,String email,String telefono, String ruolo) {
        this.username = username;
        this.password = password;
        this.nomeUser = nomeUser;
        this.cognomeUser = cognomeUser;
        this.dataDiNascita = dataDiNascita;
        this.indirizzo = indirizzo;
        this.città= città;
        this.provincia = provincia;
        this.cap = cap;
        this.email=email;
        this.telefono=telefono;
        this.ruolo =ruolo;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getCognomeUser() {
        return cognomeUser;
    }

    public void setCognomeUser(String cognomeUser) {
        this.cognomeUser = cognomeUser;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(nomeUser, user.nomeUser) &&
                Objects.equals(cognomeUser, user.cognomeUser) &&
                Objects.equals(dataDiNascita, user.dataDiNascita) &&
                Objects.equals(indirizzo, user.indirizzo) &&
                Objects.equals(città, user.città) &&
                Objects.equals(provincia, user.provincia) &&
                Objects.equals(cap, user.cap) &&
                Objects.equals(email, user.email) &&
                Objects.equals(telefono, user.telefono) &&
                Objects.equals(ruolo, user.ruolo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, nomeUser, cognomeUser, dataDiNascita, indirizzo, città, provincia, cap, email, telefono, ruolo);
    }

    @Override
    public String toString() {
        return "User: " + "\n username: " + username + "\n password: " + password + "\n Nome: " + nomeUser + "\n Cognome: " + cognomeUser + "\n Data di nascita: " + dataDiNascita + "\n Indirizzo: " + indirizzo + "\n Città: " + città + "\n Provincia: " + provincia + "\n CAP: " + cap + "\n Email: " + email + "\n Telefono: " + telefono + "\n  Ruolo: " + ruolo;
    }


}
