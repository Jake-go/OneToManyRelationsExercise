package ca.sheridancollege.gollej.bootstrap;

import ca.sheridancollege.gollej.beans.Employee;
import ca.sheridancollege.gollej.beans.Store;
import ca.sheridancollege.gollej.repositories.EmployeeRepository;
import ca.sheridancollege.gollej.repositories.StoreRepository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private StoreRepository storeRepository;

    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Store store1 = new Store();
        store1.setName("Store 1");
        store1.setEmployees(new ArrayList<Employee>());

        
        
        Store store2 = new Store();
        store2.setName("Store 2");
        store2.setEmployees(new ArrayList<Employee>());
        
        storeRepository.save(store1);
        storeRepository.save(store2);

        Employee employee1 = new Employee();
        employee1.setName("Employee 1");
        employee1.setStore(store1);

        Employee employee2 = new Employee();
        employee2.setName("Employee 2");
        employee2.setStore(store1);

        Employee employee3 = new Employee();
        employee3.setName("Employee 3");
        employee3.setStore(store2);

        Employee employee4 = new Employee();
        employee4.setName("Employee 4");
        employee4.setStore(store2);

        Employee employee5 = new Employee();
        employee5.setName("Employee 5");
        employee5.setStore(store2);

        Employee employee6 = new Employee();
        employee6.setName("Employee 6");
        employee6.setStore(store1);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);
        employeeRepository.save(employee5);
        employeeRepository.save(employee6);
    }

}
