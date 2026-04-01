package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pat.BlockedTracking")
@Data
public class BlockedTracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "PatronId", nullable = false)
    private int PatronId;
    @Column(name = "ActionType", nullable = false)
    private int ActionType;
    @Column(name = "ActionDate", nullable = false)
    private Date ActionDate;
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

    public int getActionType() {
        return ActionType;
    }

    public Date getActionDate() {
        return ActionDate;
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
