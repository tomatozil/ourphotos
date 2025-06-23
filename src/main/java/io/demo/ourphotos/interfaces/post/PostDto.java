package io.demo.ourphotos.interfaces.post;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

public class PostDto {

    @Getter
    @Setter
    public static class PostRequest {
        Long userId;
        String title;
        String txtContent;
        List<MultipartFile> files;
    }
}
