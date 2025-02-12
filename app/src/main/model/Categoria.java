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
    GeneratedValue (strategy =GenerationType.IDENITY)
    private long id;
    @Column (unique=true, nullable=false)

    private String nome;

    
}