package io.demo.ourphotos.domain.post;

import io.demo.ourphotos.domain.group.User;
import java.util.List;
import lombok.Builder;

@Builder
public record PostCommand(
    String title,
    User author,
    String txtContent,
    List<PostImage> imgContents
) {
    public Post toEntity() {
        return Post.builder()
                .author(author)
                .title(title)
                .txtContent(txtContent)
                .imgContents(imgContents)
                .build();
    }
}
