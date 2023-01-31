package ca.sheridancollege.gollej.repositories;

import ca.sheridancollege.gollej.beans.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
