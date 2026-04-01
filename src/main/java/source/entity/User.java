package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "UserInfos")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Role", nullable = false)
    private int Role;
    @Column(name = "UserName", nullable = false)
    private String UserName;
    @Column(name = "FullName", nullable = false)
    private String FullName;
    @Column(name = "Password", nullable = false)
    private String Password;
    @Column(name = "Email", nullable = false)
    private String Email;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "Image")
    private String Image;
    @Column(name = "Address", nullable = false)
    private String Address;
    @Column(name = "Sex", nullable = false)
    private int Sex;
    @Column(name = "Fax")
    private String Fax;
    @Column(name = "Birthdate", nullable = false)
    private Date Birthdate;
    @Column(name = "IsActive", nullable = false)
    private boolean IsActive;
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

    public int getRole() {
        return Role;
    }

    public String getUserName() {
        return UserName;
    }

    public String getFullName() {
        return FullName;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getImage() {
        return Image;
    }

    public String getAddress() {
        return Address;
    }

    public int getSex() {
        return Sex;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public boolean isActive() {
        return IsActive;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public String getFax() {
        return Fax;
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

    public void setRole(int role) {
        Role = role;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public void setActive(boolean active) {
        IsActive = active;
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
