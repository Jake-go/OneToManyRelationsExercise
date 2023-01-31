package ca.sheridancollege.gollej.repositories;

import ca.sheridancollege.gollej.beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
