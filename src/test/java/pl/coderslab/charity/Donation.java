package pl.coderslab.charity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/*
Encja ta reprezentuje dane znajdujące się w aplikacji, np:
name: ubrania, zabawki
*/
@Getter
@Setter
@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @OneToMany
    private List<Category> categories;

    @OneToOne
    private Institution institution;

    private String street;

    private String city;

    private String zipCode;

    private LocalDate pickUpDate;

    private LocalTime pickUpTime;

    private String pickUpComment;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
