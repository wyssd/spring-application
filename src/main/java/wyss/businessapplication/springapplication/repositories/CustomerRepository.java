package wyss.businessapplication.springapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wyss.businessapplication.springapplication.Database.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //methoden für bearbeitung der DB
    //in jpaRepository sind bereits standart methoden vohanden
    //kann einfach eigene methode hinzugefügt werden

}
