/*
 * Copyright 2018-Present The CloudEvents Authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.cloudevents.kafka;

import io.cloudevents.core.message.MessageWriter;
import io.cloudevents.kafka.impl.KafkaProducerMessageWriterImpl;
import io.cloudevents.rw.CloudEventWriter;
import org.apache.kafka.clients.producer.ProducerRecord;

public interface KafkaProducerMessageWriter<K> extends MessageWriter<KafkaProducerMessageWriter<K>, ProducerRecord<K, byte[]>>, CloudEventWriter<ProducerRecord<K, byte[]>> {

    static <V> KafkaProducerMessageWriter<V> create(String topic, Integer partition, Long timestamp, V key) {
        return new KafkaProducerMessageWriterImpl<V>(topic, partition, timestamp, key);
    }

    static <V> KafkaProducerMessageWriter<V> create(String topic, Integer partition, V key) {
        return create(topic, partition, null, key);
    }

    static <V> KafkaProducerMessageWriter<V> create(String topic, V key) {
        return create(topic, null, null, key);
    }

    static KafkaProducerMessageWriter<Void> create(String topic) {
        return create(topic, null, null, null);
    }

}
