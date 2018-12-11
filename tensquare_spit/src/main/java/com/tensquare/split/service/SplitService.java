package com.tensquare.split.service;

import com.tensquare.split.dao.SplitDao;
import com.tensquare.split.pojo.Split;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import util.IdWorker;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@Service
public class SplitService {

    @Autowired
    private SplitDao splitDao;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询所有
     * @return
     */
    public List<Split> findAll(){
        return splitDao.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Split findById(String id){
        return splitDao.findById(id).get();
    }

    /**
     * 保存操作
     * @param spit
     */
    public void add(Split spit){
        //设置id
        spit.set_id(String.valueOf(idWorker.nextId()));
        //实现保存
        splitDao.save(spit);
    }

    /**
     * 更新操作
     * @param spit
     */
    public void update(Split spit){
        splitDao.save(spit);
    }

    /**
     * 删除操作
     * @param id
     */
    public void delete(String id){
        splitDao.deleteById(id);
    }

    /**
     * 根据上级id查询吐槽信息（就是查询吐槽的回复）
     * @param parentid
     * @param page
     * @param size
     * @return
     */
    public Page<Split> findByParentid(String parentid, int page, int size){
        //1.创建分页对象
        PageRequest pageRequest = PageRequest.of(page-1,size);
        //2.执行查询并返回
        return splitDao.findByParentid(parentid,pageRequest);
    }




    /**
     *  实现点赞功能
     */
    public void updateThumbup(String id){
        //1.创建查询对象
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));//update({_id:id})
        //2.创建更新对象
        Update update = new Update();
        update.inc("thumbup",1);//update({_id:id},{$inc:{thumbup:NumberInt(1)}})
        //3.实现更新
        mongoTemplate.updateFirst(query,update,"spit");
    }
}
