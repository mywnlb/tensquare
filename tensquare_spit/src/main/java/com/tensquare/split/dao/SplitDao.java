package com.tensquare.split.dao;

import com.tensquare.split.pojo.Split;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
public interface SplitDao extends MongoRepository<Split,String> {
    Page<Split> findByParentid(String parentid, Pageable pageable);
}
