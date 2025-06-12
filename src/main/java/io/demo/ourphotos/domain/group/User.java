package io.demo.ourphotos.domain.group;

import io.demo.ourphotos.domain.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<UserGroup> groupList;

    protected User() {
        this.groupList = new ArrayList<>();
    }

    @Builder
    public User(String name, String password, String phoneNumber, String email) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.groupList = new ArrayList<>();
    }
}
