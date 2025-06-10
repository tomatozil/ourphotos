package io.demo.ourphotos.domain.post;

import io.demo.ourphotos.common.utils.TokenGenerator;
import io.demo.ourphotos.domain.AbstractEntity;
import io.demo.ourphotos.entities.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "posts")
public class Post extends AbstractEntity {
    private static final String PREFIX_POST = "post_";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postToken;
    private String title;

    @ManyToOne
    @JoinColumn(name = "id")
    private UserEntity author;

    private String txtContent;
    private List<String> imgLContents;

    @Builder
    public Post(String title, UserEntity author, String txtContent) {
        this.postToken = TokenGenerator.randomCharacterWithPrefix(PREFIX_POST);
        this.title = title;
        this.author = author;
        this.txtContent = txtContent;
    }
}

