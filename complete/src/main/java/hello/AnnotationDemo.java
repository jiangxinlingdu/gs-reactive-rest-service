package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 区别于使用 Functional 函数式路由实现 RESTful API
 * <p>
 * 这里使用注解形式；
 */
@RestController
@RequestMapping(value = "/test")
public class AnnotationDemo {

    @GetMapping("")
    public Mono<String> test() {
        return Mono.create(cityMonoSink -> cityMonoSink.success("Test"));

    }

}
