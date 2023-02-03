package ca.sheridancollege.gollej.repositories;

import ca.sheridancollege.gollej.beans.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {

}
