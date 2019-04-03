package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "user")
@Entity
@Table(name = "addresses")
public class Address  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "addressId")
    private long addressId;
    @Column(name = "country")
    private String country;
    @Column(name = "region")
    private String region;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "street")
    private String street;
    @Column(name = "houseNumb")
    private String houseNumb;
    @Column(name = "index_")
    private String index;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;


}
