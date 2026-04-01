package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pat.PatronTypes")
@Data
public class PatronTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Code", nullable = false)
    private String Code;
    @Column(name = "Name", nullable = false)
    private String Name;
    @Column(name = "OrderNumber")
    private int OrderNumber;
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

    public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public int getOrderNumber() {
        return OrderNumber;
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
