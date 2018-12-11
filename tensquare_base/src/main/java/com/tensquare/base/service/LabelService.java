package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.transaction.Transactional;
import java.util.List;


/**
 * describe:
 *
 * @author lb
 * @date 2018/11/28
 */
@Service
@Transactional
public class LabelService {
    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 获取全部
     * @return
     */
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    /**
     *  根据id查找
     * @return
     */
    public Label findById(String id ){
        return labelDao.findById(id).get();
    }

    /**
     *  创建
     * @param label
     */
    public void add(Label label){
        label.setId(String.valueOf(idWorker.nextId()));
        labelDao.save(label);
    }

    /**
     * 保存
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }
}
