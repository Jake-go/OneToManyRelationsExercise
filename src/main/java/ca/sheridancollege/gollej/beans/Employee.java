package ca.sheridancollege.gollej.beans;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    // Many employees for one store
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "EMPLOYEE_STORE", /* id for this class */joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), /*
                                                                                                                 * id
                                                                                                                 * for
                                                                                                                 * other
                                                                                                                 * class
                                                                                                                 */inverseJoinColumns = @JoinColumn(name = "STORE_ID"))
    private Store store;

}
