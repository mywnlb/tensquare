package com.tensquare.recruit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.recruit.pojo.Recruit;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit>{
    /**
     * 根据条件查找
     * @param state
     * @return
     */
	public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);

    /**
     * 排除某种条件
     * @param state
     * @return
     */
	public List<Recruit> findByStateNotOrderByCreatetimeDesc(String state);
}
