package application.model;

import java.lang.annotation.Inherited;
import java.util.Hashset;
import java.util.Set;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.perisistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Enity
@Table(name= "plataformas")
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "plataformas")
    private Set<Jogo> jogos = new HashSet<>();

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Set<Jogo> getJogos(){
        return jogos;
    }
    public void setJogos(Set<Jogo> jogos){
        this.jogos = jogos;
    }
}
