package models;

import javax.persistence.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

@NamedQueries({
        @NamedQuery(
                name = "User.auth",
                query = "select u from User as u where u.username = :username and u.password = :password"
        ),
        @NamedQuery(
                name = "User.FindById",
                query = "select u from User u where u.id = :id"
        )
})


@Entity
@Table (name = "Users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    @JsonIgnore
    private Set<Review> reviews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }



    public User (){ }

    public User(Long id, String username, String password, boolean isAdmin, Set<Review> reviews) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.reviews = reviews;
    }
}