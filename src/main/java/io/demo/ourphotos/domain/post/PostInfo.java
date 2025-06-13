package io.demo.ourphotos.domain.post;

import io.demo.ourphotos.domain.group.User;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostInfo {
    private final String postToken;
    private final String title;
    private final User author;
    private final String txtContent;
    private final List<PostImage> imgContents;
}
