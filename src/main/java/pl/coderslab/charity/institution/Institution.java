package pl.coderslab.charity.institution;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/*
Encja ta reprezentuje dane znajdujące się w aplikacji, np:
        name : Fundacja “Bez domu”
        description : Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania
*/

@Getter
@Setter
@Entity
@ToString
@Table(name = "institutions")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "institution_id")
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
