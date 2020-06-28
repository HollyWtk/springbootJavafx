package com.yhh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.entity.Fund;

import javafx.collections.ObservableList;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yhh
 * @since 2020-06-28
 */
public interface IFundService extends IService<Fund> {

   ObservableList<Fund> initData();

}
