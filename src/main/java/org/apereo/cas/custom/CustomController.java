package org.apereo.cas.custom;

import de.codecentric.boot.admin.server.web.AdminController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

@AdminController
@ResponseBody
public class CustomController {
    @GetMapping(path = "/custom", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> customStream() {
        return Flux.empty();
    }
}
