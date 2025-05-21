package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Group {
    @Id
    private int id;
    private String name;
    private List<Integer> memberList;
}
