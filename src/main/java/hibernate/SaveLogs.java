package hibernate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logs")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SaveLogs {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "log",length = 255)
    private String logs;
}
