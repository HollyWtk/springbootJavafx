package com.yhh.vo;


/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月28日  
 */
public class FundResponse {
    
    @Override
    public String toString() {
        return "FundResponse [dwjz=" + dwjz + ", fundcode=" + fundcode + ", gsz=" + gsz + ", gszzl=" + gszzl
                + ", gztime=" + gztime + ", jzrq=" + jzrq + ", name=" + name + "]";
    }


    private String dwjz;
    
    private String fundcode;
    
    private String gsz;
    
    private String gszzl;
    
    private String gztime;
    
    private String jzrq;
    
    private String name;
    
    /**
     * @return the dwjz
     */
    public String getDwjz() {
        return dwjz;
    }

    
    /**
     * @param dwjz the dwjz to set
     */
    public void setDwjz(String dwjz) {
        this.dwjz = dwjz;
    }

    
    /**
     * @return the fundcode
     */
    public String getFundcode() {
        return fundcode;
    }

    
    /**
     * @param fundcode the fundcode to set
     */
    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    
    /**
     * @return the gsz
     */
    public String getGsz() {
        return gsz;
    }

    
    /**
     * @param gsz the gsz to set
     */
    public void setGsz(String gsz) {
        this.gsz = gsz;
    }

    
    /**
     * @return the gszzl
     */
    public String getGszzl() {
        return gszzl;
    }

    
    /**
     * @param gszzl the gszzl to set
     */
    public void setGszzl(String gszzl) {
        this.gszzl = gszzl;
    }

    
    /**
     * @return the gztime
     */
    public String getGztime() {
        return gztime;
    }

    
    /**
     * @param gztime the gztime to set
     */
    public void setGztime(String gztime) {
        this.gztime = gztime;
    }

    
    /**
     * @return the jzrq
     */
    public String getJzrq() {
        return jzrq;
    }

    
    /**
     * @param jzrq the jzrq to set
     */
    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    

}
