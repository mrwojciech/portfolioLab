package pl.coderslab.charity.category;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.coderslab.charity.donation.Donation;

import javax.persistence.*;

/*
Encja ta reprezentuje dane znajdujące się w aplikacji, np:
name: ubrania, zabawki
*/
@Getter
@Setter
@Entity
@Table(name = "categories")
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
