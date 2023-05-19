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
@Table(name = "mantis_project_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MantisProjectTable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status", length = 255)
    private Integer status;

    @Column(name = "enabled")
    private Integer enabled;

    @Column(name = "view_state")
    private Integer view_state;

    @Column(name = "access_min")
    private Integer access_min;

    @Column(name = "file_path", length = 255)
    private String file_path;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "inherit_global")
    private Integer inherit_global;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MantisProjectTable that = (MantisProjectTable) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
