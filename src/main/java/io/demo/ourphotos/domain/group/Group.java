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
@Table(name = "groups")
public class Group extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "group")
    private List<UserGroup> memberList;

    protected Group() {
        this.memberList = new ArrayList<>();
    }

    @Builder
    public Group(String name) {
        this.name = name;
        this.memberList = new ArrayList<>();
    }
}
