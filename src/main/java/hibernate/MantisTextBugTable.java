package hibernate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name = "mantis_bug_text_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MantisTextBugTable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "description",length = 255)
    private String description;

    @Column(name = "steps_to_reproduce",length = 255)
    private String steps_to_reproduce;

    @Column(name = "additional_information",length = 255)
    private String additional_information;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MantisTextBugTable that = (MantisTextBugTable) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}