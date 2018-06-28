package me.galliliu.ssm.service;

import me.galliliu.ssm.model.BbbArea;

/**
 * BbbArea服务接口
 *
 * @author galliliu
 * @createTime 2018-06-28
 */
public interface IBbbAreaService {
    /**
     * 保存一个区域
     */
    void save(BbbArea bbbArea);

    /**
     * 根据id查找区域
     *
     * @param id
     * @return
     */
    BbbArea selectById(Long id);
}
