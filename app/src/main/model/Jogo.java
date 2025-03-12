package application.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.perisistence.GeneratedValue;
import jakarta.perisistence.GenerationType;
import jakarta.perisistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.perisistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.perisistence.Table;

@Entity
@Table(name ="jogos")
public class    Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = true)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
        name = "jogos_possuem_plataformas",
        JoinColumns = @JoinColumn(name = "id_jogos"),
        inverseJoinColumns = @JoinColumn(name = "id_plataformas"))
    private Set<Plataforma> plataformas = new HashSet();

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    public Set<Plataforma> getPlataformas(){
        return plataformas;
    }
    public void setPlataformas(Set<Plataformas> plataformas){
        this.plataformas = plataformas;
    }
}