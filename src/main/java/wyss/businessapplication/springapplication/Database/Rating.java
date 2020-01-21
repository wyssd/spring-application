package wyss.businessapplication.springapplication.Database;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer stars;
    private String title;
    private String text;
    private Integer thumbUp;
    private Integer thumbDown;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

}
