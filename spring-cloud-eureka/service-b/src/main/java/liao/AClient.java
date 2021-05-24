package liao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a", path = "/a")
public interface AClient {

    @GetMapping("/hello")
    String hello();
}
