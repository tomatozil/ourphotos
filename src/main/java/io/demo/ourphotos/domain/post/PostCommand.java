package io.demo.ourphotos.domain.post;

import io.demo.ourphotos.domain.group.User;
import java.util.List;
import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

@Builder
public record PostCommand(
    String title,
    User author,
    String txtContent,
    List<MultipartFile> files
) {
    public Post toEntity() {
        List<PostImage> imgContents = files.stream()
                .map(this::convertFileToImage)
                .toList();

        return Post.builder()
                .author(author)
                .title(title)
                .txtContent(txtContent)
                .imgContents(imgContents)
                .build();
    }

    public PostImage convertFileToImage(MultipartFile file) {
        return null;
    }
}
