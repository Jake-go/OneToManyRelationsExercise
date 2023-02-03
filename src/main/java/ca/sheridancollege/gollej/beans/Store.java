package ca.sheridancollege.gollej.beans;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    // One store for many employees
    // mappedBy = "<the field in the other entity>"
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private List<Employee> employees;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "store_videogame", 
    	joinColumns = @JoinColumn(name = "store_id"), 
    	inverseJoinColumns = @JoinColumn(name = "videogame_id"))
    private List<Videogame> videogames;

}
