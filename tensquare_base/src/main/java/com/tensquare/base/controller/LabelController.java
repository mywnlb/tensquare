package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.*;

/**
 * describe:
 *
 * @author lb
 * @date 2018/11/27
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/label")
public class LabelController {

    @GetMapping("")
    public Result getAll(){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @GetMapping("/topList")
    public Result getLabelBytopList(){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @GetMapping("/list")
    public Result getLabelByList(){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @GetMapping("/{labelId }")
    public Result getLabelById(@PathVariable String labelId){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @PostMapping()
    public Result save(@RequestBody Label label){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @DeleteMapping("/{labelId }")
    public Result delLabelById(@PathVariable String labelId){
        return new Result(true, StatusCode.OK,"查询成功");
    }

}
