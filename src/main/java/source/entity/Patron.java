package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pat.Patron")
@Data
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "TypeId")
    private PatronTypes TypeId;
    @Column(name = "Code", nullable = false)
    private String Code;
//    @OneToOne
//    @JoinColumn(name = "UserId")
    @Column(name = "UserId", nullable = false)
    private String UserId;
    @Column(name = "Status", nullable = false)
    private int Status;
    @Column(name = "CreationDate", nullable = false)
    private Date CreationDate;
    @Column(name = "UpdationDate", nullable = false)
    private Date UpdationDate;
    @Column(name = "ExpirationDate", nullable = false)
    private Date ExpirationDate;
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

    public PatronTypes getTypeId() {
        return TypeId;
    }

    public String getUserId() {
        return UserId;
    }

    public String getCode() {
        return Code;
    }

    public int getStatus() {
        return Status;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public Date getUpdationDate() {
        return UpdationDate;
    }

    public Date getExpirationDate() {
        return ExpirationDate;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setTypeId(PatronTypes typeId) {
        TypeId = typeId;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public void setUpdationDate(Date updationDate) {
        UpdationDate = updationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        ExpirationDate = expirationDate;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public void setUpdateBy(String updateBy) {
        UpdateBy = updateBy;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    public void setActiveFag(int activeFag) {
        ActiveFag = activeFag;
    }
}
