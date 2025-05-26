package io.demo.ourphotos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 10)
    private String name;
    
    @Column(nullable = false)
    private String password;

    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<UserGroupEntity> userGroupList;
}
