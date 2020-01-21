package wyss.businessapplication.springapplication.Database;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String price;
    private String shortDescription;
    private String description;
    private String specification;
    private Integer stars;

    @OneToMany
    @JoinColumn(name = "ratingId")
    private List<Rating> votes;

}
