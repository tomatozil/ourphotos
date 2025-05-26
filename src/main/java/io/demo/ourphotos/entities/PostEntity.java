package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class PostEntity {
    @Id
    private int id;
    private String title;
    private int author;
    private String content;
    private List<String> imageList;
}

