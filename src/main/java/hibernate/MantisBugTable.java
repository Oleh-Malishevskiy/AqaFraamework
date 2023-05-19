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
@Table(name = "mantis_bug_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MantisBugTable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "project_id",length = 255)
    private Long project_id;

    @Column(name = "reporter_id",length = 255)
    private Long reporter_id;

    @Column(name = "handler_id",length = 255)
    private Long handler_id;

    @Column(name = "duplicate_id")
    private Long duplicate_id;

    @Column(name = "priority")
    private Long priority;

    @Column(name = "severity")
    private Long severity;

    @Column(name = "reproducibility")
    private Long reproducibility;

    @Column(name = "status")
    private Long status;

    @Column(name = "resolution")
    private Long resolution;

    @Column(name = "projection")
    private Long projection;

    @Column(name = "eta")
    private Long eta;

    @Column(name = "bug_text_id")
    private Long bug_text_id;

    @Column(name = "os")
    private char os;

    @Column(name = "os_built")
    private char os_built;

    @Column(name = "platform", length = 255)
    private char platform;

    @Column(name = "version")
    private char version;

    @Column(name = "fixed_in_version")
    private char fixed_in_version;

    @Column(name = "build")
    private char build;

    @Column(name = "profile_id")
    private Integer profile_id;

    @Column(name = "view_state")
    private Integer view_state;

    @Column(name = "summary",length = 255)
    private char summary;

    @Column(name = "sponsorship_total")
    private Integer sponsorship_total;

    @Column(name = "sticky")
    private Integer sticky;

    @Column(name = "target_version")
    private char target_version;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "date_submitted")
    private Long date_submitted;

    @Column(name = "due_date")
    private Long due_date;

    @Column(name = "last_updated")
    private Long last_updated;

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
