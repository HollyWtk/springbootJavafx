package com.yhh.mapper;

import com.yhh.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhh
 * @since 2020-06-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
