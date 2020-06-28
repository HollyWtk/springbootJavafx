package com.yhh.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhh.entity.Fund;
import com.yhh.mapper.FundMapper;
import com.yhh.service.IFundService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhh
 * @since 2020-06-28
 */
@Service
public class FundServiceImpl extends ServiceImpl<FundMapper, Fund> implements IFundService {
    

    @Override
    public ObservableList<Fund> initData() {
        ObservableList<Fund> fundData = FXCollections.observableArrayList();
        this.list().forEach(k ->{
            fundData.add(k);
        });
        return fundData;
    }

}
