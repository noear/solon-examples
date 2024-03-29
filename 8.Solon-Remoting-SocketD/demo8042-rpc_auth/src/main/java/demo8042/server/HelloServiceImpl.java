package demo8042.server;

import demo8042.protocol.HelloService;

import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Remoting;
import org.noear.solon.core.handle.MethodType;
import org.noear.solon.net.annotation.ServerEndpoint;

//定义远程服务组件
@Mapping(value = "/demoe/rpc", method = MethodType.SOCKET)
@Remoting
@ServerEndpoint
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "name=" + name;
    }
}

