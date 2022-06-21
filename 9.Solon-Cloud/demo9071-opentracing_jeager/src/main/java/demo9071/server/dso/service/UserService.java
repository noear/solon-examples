package demo9071.server.dso.service;

import org.noear.solon.cloud.tracing.annotation.Tracing;
import org.noear.solon.aspect.annotation.Service;

/**
 * @author noear 2022/5/7 created
 */
@Service
public class UserService extends BaseService{
    @Tracing(name = "获取用户", tags = "用户=${name}")
    public String getUser(String name) {
        return name;
    }


    public String updateUser(String name){
        return name;
    }
}
