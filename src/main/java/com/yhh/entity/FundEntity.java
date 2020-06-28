package com.yhh.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月24日  
 */
public class FundEntity {
    
    private  IntegerProperty id;
    private  StringProperty fundCode;
    private  StringProperty fundName;
    private  StringProperty fundWorth;
    private  StringProperty fundGz;
    private  StringProperty fundGzPer;
    private  StringProperty gzDate;
    

    /**
     * @return the id
     */
    public int getId() {
        return id.get();
    }
    
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = new SimpleIntegerProperty(id);
    }
    
    public IntegerProperty idProperty() {
        return id;
    }
    /**
     * @return the fundCode
     */
    public String getFundCode() {
        return fundCode.get();
    }
    
    /**
     * @param fundCode the fundCode to set
     */
    public void setFundCode(String fundCode) {
        this.fundCode = new SimpleStringProperty(fundCode);
    }
    
    public StringProperty fundCodeProperty() {
        return fundCode;
    }
    
    /**
     * @return the fundName
     */
    public String getFundName() {
        return fundName.get();
    }
    
    /**
     * @param fundName the fundName to set
     */
    public void setFundName(String fundName) {
        this.fundName = new SimpleStringProperty(fundName);

    }
    
    public StringProperty fundNameProperty() {
        return fundName;
    }
    
    /**
     * @return the fundWorth
     */
    public String getFundWorth() {
        return fundWorth.get();
    }
    
    /**
     * @param fundWorth the fundWorth to set
     */
    public void setFundWorth(String fundWorth) {
        this.fundWorth = new SimpleStringProperty(fundWorth);
    }
    
    public StringProperty fundWorthProperty() {
        return fundWorth;
    }
    
    /**
     * @return the fundGz
     */
    public String getFundGz() {
        return fundGz.get();
    }
    
    /**
     * @param fundGz the fundGz to set
     */
    public void setFundGz(String fundGz) {
        this.fundGz = new SimpleStringProperty(fundGz);
    }
    
    public StringProperty fundGzProperty() {
        return fundGz;
    }
    
    /**
     * @return the fundGzPer
     */
    public String getFundGzPer() {
        return fundGzPer.get();
    }
    
    /**
     * @param fundGzPer the fundGzPer to set
     */
    public void setFundGzPer(String fundGzPer) {
        this.fundGzPer = new SimpleStringProperty(fundGzPer);
    }
    
    public StringProperty fundGzPerProperty() {
        return fundGzPer;
    }
    
    /**
     * @return the gzDate
     */
    public String getGzDate() {
        return gzDate.get();
    }
    
    /**
     * @param gzDate the gzDate to set
     */
    public void setGzDate(String gzDate) {
        this.gzDate = new SimpleStringProperty(gzDate);
    }
    
    public StringProperty gzDateProperty() {
        return gzDate;
    }

}
