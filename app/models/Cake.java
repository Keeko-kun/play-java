package models;

import javax.persistence.*;

@Entity
@Table (name = "Cake")
public class Cake {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "flavour")
    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cake (){ }

    public Cake(String flavour) {
        this.flavour = flavour;
    }



}