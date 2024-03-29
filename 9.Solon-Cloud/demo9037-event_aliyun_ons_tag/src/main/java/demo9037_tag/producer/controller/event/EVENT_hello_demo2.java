package demo9037_tag.producer.controller.event;

import org.noear.snack.ONode;
import org.noear.solon.cloud.CloudEventHandler;
import org.noear.solon.cloud.annotation.CloudEvent;
import org.noear.solon.cloud.model.Event;

import java.time.LocalDateTime;

/**
 * @author noear 2021/1/27 created
 */
@CloudEvent(topic = "hello2.demo2",group = "test", tag = "test")
public class EVENT_hello_demo2 implements CloudEventHandler {
    @Override
    public boolean handle(Event event) throws Throwable {
        System.out.println(LocalDateTime.now() + ONode.stringify(event));

        return event.times() > 2;
    }
}
