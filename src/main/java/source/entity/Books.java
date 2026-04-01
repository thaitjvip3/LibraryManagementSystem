package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Books")
@Data
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Code", nullable = false)
    private int Code;
    @Column(name = "Title", nullable = false)
    private String Title;
    @Column(name = "Status", nullable = false)
    private int Status;
    @Column(name = "Author", nullable = false)
    private String Author;
    @Column(name = "Publisher", nullable = false)
    private String Publisher;
    @Column(name = "PublishPlace", nullable = false)
    private String PublishPlace;
    @Column(name = "PublishDate", nullable = false)
    private Date PublishDate;
    @Column(name = "MaterialType", nullable = false)
    private int MaterialType;
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

    public int getCode() {
        return Code;
    }

    public String getTitle() {
        return Title;
    }

    public int getStatus() {
        return Status;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getPublishPlace() {
        return PublishPlace;
    }

    public Date getPublishDate() {
        return PublishDate;
    }

    public int getMaterialType() {
        return MaterialType;
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
