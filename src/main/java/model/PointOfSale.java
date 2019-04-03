package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "points")
public class PointOfSale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long pointId;
    @Column
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="points_users",
            joinColumns=@JoinColumn(name="pointId"),
            inverseJoinColumns=@JoinColumn(name="userId"))
    private List<User> users = new ArrayList<>();

    @ManyToMany(mappedBy = "points")
    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "point", fetch=FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();


}