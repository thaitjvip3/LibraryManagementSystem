package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pat.RenewCardLogs")
@Data
public class RenewCardLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "PatronId", nullable = false)
    private int PatronId;
    @Column(name = "OldDueDate", nullable = false)
    private Date OldDueDate;
    @Column(name = "NewDueDate", nullable = false)
    private Date NewDueDate;
    @Column(name = "CreateBy")
    private String CreateBy;
    @Column(name = "UpdateBy")
    private String UpdateBy;
    @Column(name = "CreateDate")
    private Date CreateDate;
    @Column(name = "UpdateDate")
    private Date UpdateDate;
    @Column(name = "ActiveFag")
    private int ActiveFag;

    public long getId() {
        return id;
    }

    public int getPatronId() {
        return PatronId;
    }

    public Date getOldDueDate() {
        return OldDueDate;
    }

    public Date getNewDueDate() {
        return NewDueDate;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public int getActiveFag() {
        return ActiveFag;
    }
}
