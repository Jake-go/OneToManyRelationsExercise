package ca.sheridancollege.gollej.beans;

import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.JoinColumn;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
public class Videogame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NonNull
    private String title;
    @NonNull
    private Double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "store_videogame", 
    	joinColumns = @JoinColumn(name = "videogame_id"), 
    	inverseJoinColumns = @JoinColumn(name = "store_id"))
    private List<Store> stores;

}
