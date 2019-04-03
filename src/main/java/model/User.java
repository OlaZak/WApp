package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long userId;
    @Column(name = "isBlock")
    private boolean isBlock;
    @Column(name = "password_")
    private String password;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "phone")
    private String phone;
    @Column(name = "lastIP")
    private String lastIP;
    @Column(name = "registerDate")
    private Date registerDate;
    @Column(name = "lastLoginDate")
    private Date lastLoginDate;


    @OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
    private List<Role> roles = new ArrayList<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Cart cart;

    @ManyToMany(mappedBy = "users")
    private List<PointOfSale> points = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Address address;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}