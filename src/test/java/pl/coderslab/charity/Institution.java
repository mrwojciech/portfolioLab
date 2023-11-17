package pl.coderslab.charity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Encja ta reprezentuje dane znajdujące się w aplikacji, np:
        name : Fundacja “Bez domu”
        description : Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania
*/

@Getter
@Setter
@Entity
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
