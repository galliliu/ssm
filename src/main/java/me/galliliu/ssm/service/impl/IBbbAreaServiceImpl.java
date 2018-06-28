package me.galliliu.ssm.service.impl;

import me.galliliu.ssm.mapper.BbbAreaMapper;
import me.galliliu.ssm.model.BbbArea;
import me.galliliu.ssm.service.IBbbAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BbbArea服务实现类
 *
 * @author galliliu
 * @createTime 2018-06-28
 */
@Service
public class IBbbAreaServiceImpl implements IBbbAreaService {

    @Autowired
    private BbbAreaMapper bbbAreaMapper;

    @Override
    public void save(BbbArea bbbArea) {
        this.bbbAreaMapper.save(bbbArea);
    }

    @Override
    public BbbArea selectById(Long id) {
        return this.bbbAreaMapper.selectById(id);
    }
}
