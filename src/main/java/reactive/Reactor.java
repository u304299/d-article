package reactive;

import reactor.core.publisher.Mono;

public class Reactor {

  public static void main(String[] args) {

    // Test

    Mono.<String>create(monoSink -> System.out.println("test"))
        .subscribe(System.out::println);

    // Create a Mono provider that will supply a target Mono to subscribe to for each Subscriber downstream.
    Mono.defer(() -> Mono.just("test"))
        .subscribe(System.out::println);

    // A read-only view of a collection of key/value pairs that is propagated between components such as operators via the context protocol. Contexts are ideal to transport orthogonal information such as tracing or security tokens.
    //Context is an immutable variant of the same key/value pairs structure which exposes a write API that returns new instances on each write.

    // Create a Mono provider that will supply a target Mono to subscribe to for each Subscriber downstream. This operator behaves the same way as defer(Supplier), but accepts a Function that will receive the current ContextView as an argument.
    Mono<String> test = Mono.just("test");
    test.subscribe(System.out::println);



    Mono<Object> never = Mono.never();
    Mono<String> map = never
        .map(e -> "test");
    map
        .subscribe(e -> System.out.println("test"));
  }
}
