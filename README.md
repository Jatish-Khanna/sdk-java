# Java SDK for CloudEvents API

[![Build Status](https://travis-ci.org/cloudevents/sdk-java.png)](https://travis-ci.org/cloudevents/sdk-java)
[![License](https://img.shields.io/:license-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.cloudevents/cloudevents-parent/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.cloudevents/cloudevents-parent)
[![Javadocs](http://www.javadoc.io/badge/io.cloudevents/cloudevents-core.svg?color=green)](http://www.javadoc.io/doc/io.cloudevents/cloudevents-core)

A Java API for the [CloudEvents specification](https://github.com/cloudevents/spec)

__Checkout the [changelog](./CHANGELOG.md)__

## Status

This SDK is considered **work in progress**. The community is working hard to bring you a new major version of the SDK with major enhancements both to APIs and to implementation.

If you want to know more about v1 of this SDK, check out the [v1 readme](./README_v1.md)

Stay tuned!

Supported features of the specification:

|                               |  [v0.3](https://github.com/cloudevents/spec/tree/v0.3) | [v1.0](https://github.com/cloudevents/spec/tree/v1.0) |
| :---------------------------: | :----------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: |
| CloudEvents Core              | :heavy_check_mark: | :heavy_check_mark: |
| AMQP Protocol Binding         | :x: | :x:  |
| AVRO Event Format             | :x: | :x: |
| HTTP Protocol Binding         | :heavy_check_mark: | :heavy_check_mark: |
| - [Vert.x](http/vertx)        | :heavy_check_mark: | :heavy_check_mark: |
| - [Jakarta Restful WS](http/restful-ws) | :heavy_check_mark: | :heavy_check_mark: |
| JSON Event Format             | :heavy_check_mark: | :heavy_check_mark: |
| - [Jackson](formats/json-jackson) | :heavy_check_mark: | :heavy_check_mark: |
| [Kafka Protocol Binding](kafka)        | :heavy_check_mark: | :heavy_check_mark: |
| MQTT Protocol Binding         | :x: | :x: |
| NATS Protocol Binding         | :x: | :x: |
| Web hook                      | :x: | :x: |

## Motivation

The [CloudEvents specification](https://github.com/cloudevents/spec) is a vendor-neutral specification for defining the format of event data that is being exchanged between different cloud systems. The specification basically defines an abstract envelope for any event data payload, without knowing specific implementation details of the actual underlying event. The current version of the spec is at `0.3` and it describes a simple event format, which was demonstrated at [KubeCon 2018](https://youtu.be/TZPPjAv12KU) using different _Serverless platforms_, such as [Apache Openwhisk](https://github.com/apache/incubator-openwhisk).

## Java API

For Maven based projects, use the following to configure the CloudEvents Java SDK:

```xml
<dependency>
    <groupId>io.cloudevents</groupId>
    <artifactId>cloudevents-core</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```

## Community

- There are bi-weekly calls immediately following the [Serverless/CloudEvents
  call](https://github.com/cloudevents/spec#meeting-time) at
  9am PT (US Pacific). Which means they will typically start at 10am PT, but
  if the other call ends early then the SDK call will start early as well.
  See the [CloudEvents meeting minutes](https://docs.google.com/document/d/1OVF68rpuPK5shIHILK9JOqlZBbfe91RNzQ7u_P7YCDE/edit#)
  to determine which week will have the call.
- Slack: #cloudeventssdk channel under
  [CNCF's Slack workspace](https://slack.cncf.io/).
- Email: https://lists.cncf.io/g/cncf-cloudevents-sdk
- Contact for additional information: Fabio José (`@fabiojose` on slack).
