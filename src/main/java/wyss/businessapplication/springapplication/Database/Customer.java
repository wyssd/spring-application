package wyss.businessapplication.springapplication.Database;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //brauht es nicht umbedingt
    private Long id;

    // @Column(nullable = true, )
    private String firstname;
    private String lastname;


    // stellt die DB dar
    // Die Variablen und der name stellt ein SQL tabelle dar
    // (link auf Email anschauen für name)

}
