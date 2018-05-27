package models;

import javax.persistence.*;

@NamedQuery(
    name = "Game.findById",
    query = "select g from Game as g where g.id = :id"
)

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

    public Game (){ }

    public Game(String name, int price) {
        this.name = name;
        this.price = price;
    }



}