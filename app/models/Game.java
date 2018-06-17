package models;

import javax.persistence.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;


@NamedQueries({
        @NamedQuery(
                name = "Game.GetAll",
                query = "select g from Game as g"
        ),
        @NamedQuery(
                name = "Game.FindById",
                query = "select g from Game as g where g.id = :id"
        )
})


@Entity
@Table (name = "Game")
public class Game {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;	

    @Column(name = "price")
    private int price;

    @Column(name = "url")
    private String url;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "game")
    @JsonIgnoreProperties({"game", "r.game"})
    private Set<Review> reviews;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "games")
    @JsonIgnoreProperties("games")
    private Set<Developer> developers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public void addDeveloper(Developer dev){
        developers.add(dev);
        dev.addGame(this);
    }

    public Game (){
        developers = new HashSet<Developer>();
    }

    public Game(Long id, String name, int price, String url, Set<Review> reviews, Set<Developer> developers) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.reviews = reviews;
        this.developers = developers;
    }
}