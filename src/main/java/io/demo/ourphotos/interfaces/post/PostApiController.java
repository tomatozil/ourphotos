package io.demo.ourphotos.interfaces.post;

import io.demo.ourphotos.application.post.PostPipeline;
import io.demo.ourphotos.common.response.CommonResponse;
import io.demo.ourphotos.domain.post.PostCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
@RestController
public class PostApiController {
    private final PostPipeline postPipeline;

    @PostMapping
    public CommonResponse postPost(@ModelAttribute PostDto.PostRequest request) {
        // 이미지 저장 파이프라인

        // 포스팅 저장 파이프라인

        return CommonResponse.success();
    }
}
