package com.tensquare.user.client;

import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@FeignClient(value = "tensquare-base",fallback = LabelClientImpl.class)
public interface LabelClient {
    @GetMapping(value = "/label")
    public Result getAll();
}
