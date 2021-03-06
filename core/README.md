# CloudEvents Core

The base classes, interfaces and low-level APIs to use CloudEvents.

## How to Use

### Create an Event

```java
import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import java.net.URI;

final CloudEvent event = CloudEventBuilder.v1()
    .withId("000")
    .withType("example.demo")
    .withSource(URI.create("http://example.com"))
    .withData("application/json", "{}".getBytes())
    .build();
```

### Materialize an Extension

CloudEvent extensions can be materialized in their respective POJOs:

```java
import io.cloudevents.core.extensions.DistributedTracingExtension;
import io.cloudevents.core.extensions.ExtensionsParser;

DistributedTracingExtension dte = ExtensionsParser.getInstance()
    .parseExtension(DistributedTracingExtension.class, event);
```

### Using Event Formats

The SDK implements [Event Formats](https://github.com/cloudevents/spec/blob/v1.0/spec.md#event-format) in submodules.
To use them, you just need to add them as dependencies to your project and the SDK,
through the `ServiceLoader` mechanism, will load them into the classpath.
For example, to use the [JSON event format](https://github.com/cloudevents/spec/blob/v1.0/json-format.md) with Jackson,
add `cloudevents-json-jackson` as a dependency and then:

```java
import io.cloudevents.core.format.EventFormatProvider;

EventFormat format = EventFormatProvider.getInstance().resolveFormat("application/json");

// Serialize event
byte[] serialized = format.serialize(event);

// Deserialize event
CloudEvent event = format.deserialize(bytes);
```
