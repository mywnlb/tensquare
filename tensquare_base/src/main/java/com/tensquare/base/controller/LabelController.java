package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * describe: CrossOrigin 跨域
 *
 * @author lb
 * @date 2018/11/27
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping("")
    public Result getAll(){
        List<Label> labelList = labelService.findAll();

        int i = 1/0;
        return new Result(true, StatusCode.OK,"查询成功",labelList);
    }

    @GetMapping("/topList")
    public Result getLabelBytopList(){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @GetMapping("/list")
    public Result getLabelByList(){
        return new Result(true, StatusCode.OK,"查询成功");
    }

    @GetMapping("/{labelId}")
    public Result getLabelById(@PathVariable String labelId){
        Label label = labelService.findById(labelId);

        return new Result(true, StatusCode.OK,"查询成功",label);
    }

    @PostMapping()
    public Result save(@RequestBody Label label){
        labelService.add(label);
        return new Result(true, StatusCode.OK,"添加成功");
    }


    @PutMapping("/{labelId}")
    public Result update(@PathVariable String labelId,@RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true, StatusCode.OK,"修改成功");
    }


    @DeleteMapping("/{labelId}")
    public Result delLabelById(@PathVariable String labelId){
        labelService.deleteById(labelId);
        return new Result(true, StatusCode.OK,"删除成功");
    }

}
