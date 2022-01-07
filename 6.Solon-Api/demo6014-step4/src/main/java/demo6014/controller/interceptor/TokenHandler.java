package demo6014.controller.interceptor;

import demo6014.controller.ApiCodes;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;

/**
 * 将处理独立为类，可以在不同的网关里组装式使用；
 *
 * @author noear 2021/6/11 created
 */
public class TokenHandler implements Handler {
    @Override
    public void handle(Context ctx) throws Throwable {
        //
        //检测有没有token（用 param 替代；方便手浏览器测试）
        //
        if (ctx.param("t") == null) {
            throw ApiCodes.CODE_4001021;
        }
    }
}
