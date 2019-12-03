package hello;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Component
public class HandlerTest implements WebHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange exchange) {
        System.out.println("handler");
        return exchange.getResponse().writeWith(Mono.just(exchange.getResponse()
                .bufferFactory().wrap(Objects.requireNonNull("handler").getBytes())));
    }
}
