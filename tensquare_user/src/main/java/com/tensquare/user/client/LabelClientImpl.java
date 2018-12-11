package com.tensquare.user.client;

import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@Component
public class LabelClientImpl implements LabelClient {

    @Override
    public Result getAll() {
        return new Result(false, StatusCode.ERROR,"熔断器启动了");
    }
}
