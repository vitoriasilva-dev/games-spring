package application.model;
import java.lang.annotation.Inherited;
import java.utill.HashSet;
import java.utill.Set;

import jakarta.persistence.Column;
import jakarta.peristence.Enity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;



@Enity
@Table(name  = "categorias")

public class Categoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (unique=true, nullable=false)

    private String nome;

    @OneToMany(mappedBy = "categoria")
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
    public void setJogos (Set<Jogos> jogos){
        this.jogos = jogos;
    }

    
}