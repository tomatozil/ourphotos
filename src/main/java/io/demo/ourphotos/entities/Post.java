package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Post {
    @Id
    private int id;
    private String title;
    private int author;
    private String content;
    private List<String> imageList;
}

