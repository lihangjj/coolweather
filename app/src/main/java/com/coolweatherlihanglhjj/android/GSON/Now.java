package com.coolweatherlihanglhjj.android.GSON;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/1/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("coud")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
