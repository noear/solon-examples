package demo7004.server.controller;

import demo7004.protocol.UserModel;
import demo7004.protocol.UserService;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Remoting;

//开启bean的远程服务
@Mapping("/user/")
@Remoting
public class UserServiceImpl implements UserService {
    @Override
    public UserModel getUser(Integer userId) {
        UserModel model = new UserModel();
        model.setId(userId);
        model.setName("user-" + userId);

        return model;
    }
}
