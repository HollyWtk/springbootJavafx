package com.yhh.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yhh
 * @since 2020-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Fund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 基金编码
     */
    private String fundcode;

    /**
     * 基金名称
     */
    private String name;

    /**
     * 基金净值
     */
    private String dwjz;

    /**
     * 基金估值
     */
    private String gsz;

    /**
     * 估值百分比
     */
    private String gszzl;

    /**
     * 估值时间
     */
    private String gztime;
    
    public StringProperty fundcodeProperty() {
        return new SimpleStringProperty(fundcode);
    }
    
    public StringProperty nameProperty() {
        return new SimpleStringProperty(name);
    }
    
    public StringProperty dwjzProperty() {
        return new SimpleStringProperty(dwjz);
    }
    public StringProperty gszProperty() {
        return new SimpleStringProperty(gsz);
    }
    
    public StringProperty gszzlProperty() {
        return new SimpleStringProperty(gszzl);
    }
    
    public StringProperty gztimeProperty() {
        return new SimpleStringProperty(gztime);
    }


}
