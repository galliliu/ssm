package me.galliliu.ssm.mapper;

import me.galliliu.ssm.model.BbbArea;

public interface BbbAreaMapper {

    BbbArea selectById(Long id);

    void save(BbbArea bbbArea);
}
