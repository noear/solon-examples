package demo4082.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "event")
public class Event {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    @Column(name = "date", columnDefinition="datetime(2) DEFAULT NULL")
    private LocalDateTime date;
}
