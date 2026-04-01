package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "port.News")
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CategoryId", nullable = false)
    private int CategoryId;
    @Column(name = "AuthorId", nullable = false)
    private int AuthorId;
    @Column(name = "Title", nullable = false)
    private String Title;
    @Column(name = "Summany")
    private String Summany;
    @Column(name = "Body", nullable = false)
    private String Body;
    @Column(name = "Status", nullable = false)
    private int Status;
    @Column(name = "Image")
    private String Image;
    @Column(name = "PublishDate", nullable = false)
    private Date PublishDate;
    @Column(name = "TotalView")
    private int TotalView;
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

    public int getCategoryId() {
        return CategoryId;
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public String getTitle() {
        return Title;
    }

    public String getSummany() {
        return Summany;
    }

    public String getBody() {
        return Body;
    }

    public int getStatus() {
        return Status;
    }

    public String getImage() {
        return Image;
    }

    public Date getPublishDate() {
        return PublishDate;
    }

    public int getTotalView() {
        return TotalView;
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
