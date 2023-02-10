package springboot.nexus.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "Teacher")
public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tID;

    @Column(name = "name")
    private String name;

    @Column(name = "joinDate")
    private String joinDate;

    @Column(name = "address")
    private  String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    public Teacher() {
        super();
    }

    public Teacher(long tID, String name, String joinDate, String address, String phone, String email) {
        super();
        this.tID = tID;
        this.name = name;
        this.joinDate = joinDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public long gettID() {
        return tID;
    }

    public String getName() {
        return name;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void settID(int tID) {
        this.tID = tID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tID=" + tID +
                ", name='" + name + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
