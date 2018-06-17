package models;

import javax.persistence.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;


//@NamedQueries({
//
//})


@Entity
@Table (name = "FirstParty")
public class FirstParty extends Developer {

    @Column(name = "parent")
    private String parent;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public FirstParty (){ }

    public FirstParty(String parent) {
        this.parent = parent;
    }
}