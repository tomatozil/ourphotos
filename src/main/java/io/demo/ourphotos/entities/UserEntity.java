package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class UserEntity {
    @Id
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private List<Integer> groupList;
}
