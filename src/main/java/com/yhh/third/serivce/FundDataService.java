package com.yhh.third.serivce;

import java.nio.charset.StandardCharsets;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.yhh.entity.Fund;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月28日  
 */
public class FundDataService {
    
    private static String URL = "http://fundgz.1234567.com.cn/js/";

    private static String URL_SUFFIX = ".js";

    /**
     * 获取基金数据
     * @param fundCode
     * @return
     */
    public static Fund getData(String fundCode) {
        RestTemplate tem = new RestTemplate();
        tem.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        String res =  tem.getForObject(URL + fundCode + URL_SUFFIX, String.class,"utf-8");
        res = res.replace("jsonpgz(", "").replace(");", "");
        Fund fund = JSONObject.parseObject(res, Fund.class);
        return fund;
    }
}
