package wyss.businessapplication.springapplication.Database;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //brauht es nicht umbedingt
    private Long id;

    // @Column(nullable = true, )
    private Integer stars;
    private String title;
    private String text;
    private Integer thumbUp;
    private Integer thumbDown;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;


    // stellt die DB dar
    // Die Variablen und der name stellt ein SQL tabelle dar
    // (link auf Email anschauen für name)

}
