package demo3072;

import org.noear.solon.Solon;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import reactor.core.publisher.Mono;

/**
 * @author noear 2023/6/19 created
 */
public class App {
    public static void main(String[] args) {
        Solon.start(App.class, args);
    }

}
