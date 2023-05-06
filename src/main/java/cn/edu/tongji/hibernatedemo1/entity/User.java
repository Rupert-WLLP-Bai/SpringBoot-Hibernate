package cn.edu.tongji.hibernatedemo1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user", schema = "public")
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
}
