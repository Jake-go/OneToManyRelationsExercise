package ca.sheridancollege.gollej.bootstrap;

import ca.sheridancollege.gollej.beans.Employee;
import ca.sheridancollege.gollej.beans.Store;
import ca.sheridancollege.gollej.beans.Videogame;
import ca.sheridancollege.gollej.repositories.EmployeeRepository;
import ca.sheridancollege.gollej.repositories.StoreRepository;
import ca.sheridancollege.gollej.repositories.VideogameRepository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private StoreRepository storeRepository;

    private EmployeeRepository employeeRepository;

    private VideogameRepository vgRepo;

    @Override
    public void run(String... args) throws Exception {
        Store store1 = new Store();
        store1.setName("Store 1");
        store1.setEmployees(new ArrayList<Employee>());
        store1.setVideogames(new ArrayList<Videogame>());

        Store store2 = new Store();
        store2.setName("Store 2");
        store2.setEmployees(new ArrayList<Employee>());
        store2.setVideogames(new ArrayList<Videogame>());

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

        // set up the new videogames
        Videogame vg1 = new Videogame("Super Mario Bros.", 59.99);
        Videogame vg2 = new Videogame("The Legend of Zelda: Ocarina of Time", 59.99);
        Videogame vg3 = new Videogame("The Legend of Zelda: Breath of the Wild", 59.99);
        Videogame vg4 = new Videogame("Super Smash Bros. Ultimate", 59.99);
        Videogame vg5 = new Videogame("Super Mario Odyssey", 59.99);
        Videogame vg6 = new Videogame("Super Mario 64", 59.99);
        Videogame vg7 = new Videogame("Super Mario Galaxy", 59.99);
        Videogame vg8 = new Videogame("Super Mario Galaxy 2", 59.99);
        Videogame vg9 = new Videogame("Super Mario Sunshine", 59.99);
        Videogame vg10 = new Videogame("Super Mario 3D World", 59.99);

        // set up the stores in the videogames
        vg1.setStores(new ArrayList<Store>());
        vg1.getStores().add(store1);
        vg2.setStores(new ArrayList<Store>());
        vg2.getStores().add(store1);
        vg2.getStores().add(store2);
        vg3.setStores(new ArrayList<Store>());
        vg3.getStores().add(store1);
        vg4.setStores(new ArrayList<Store>());
        vg4.getStores().add(store2);
        vg5.setStores(new ArrayList<Store>());
        vg5.getStores().add(store2);
        vg5.getStores().add(store1);
        vg6.setStores(new ArrayList<Store>());
        vg6.getStores().add(store1);
        vg7.setStores(new ArrayList<Store>());
        vg7.getStores().add(store2);
        vg8.setStores(new ArrayList<Store>());
        vg8.getStores().add(store2);
        vg8.getStores().add(store1);
        vg9.setStores(new ArrayList<Store>());
        vg9.getStores().add(store1);
        vg10.setStores(new ArrayList<Store>());
        vg10.getStores().add(store2);

        vgRepo.save(vg1);
        vgRepo.save(vg2);
        vgRepo.save(vg3);
        vgRepo.save(vg4);
        vgRepo.save(vg5);
        vgRepo.save(vg6);
        vgRepo.save(vg7);
        vgRepo.save(vg8);
        vgRepo.save(vg9);
        vgRepo.save(vg10);

    }

}
