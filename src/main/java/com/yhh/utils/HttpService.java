package com.yhh.utils;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月28日  
 */
public class HttpService {

    private static OkHttpClient client = new OkHttpClient();

    //发起请求，获取内容
    public static String getjson (String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        System.out.println(url);
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
