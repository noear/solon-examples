package demo4051.controller;

import demo4051.dso.dao.AppxDao;
import demo4051.dso.mapper.SqlMapper;
import org.beetl.sql.solon.annotation.Db;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;

@Mapping("/demo/")
@Controller
public class DemoController {
    /**
     * 使用SqlMapper默认的数据库注入
     * */
    @Db
    SqlMapper sqlMapper;

    @Db
    AppxDao appxDao;


    @Mapping("/test")
    public Object test() throws Exception{

        return appxDao.single(1);

        //return sqlMapper1.appx_get2(1);
    }

    @Mapping("/test2")
    public Object test2() throws Exception{
        return sqlMapper.appx_getlist(1);
    }
}
