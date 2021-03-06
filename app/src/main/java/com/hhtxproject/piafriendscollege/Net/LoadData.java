package com.hhtxproject.piafriendscollege.Net;

import android.os.Handler;
import android.os.Message;

import com.hhtxproject.piafriendscollege.Net.HttpPost.HttpPost;
import com.loopj.android.http.RequestParams;


/**
 * Created by Respectupper on 2018/6/5.
 */

public class LoadData {

    private Handler handler;
    private RequestParams params;
    private int successCode;
    private String path;
    public LoadData(Handler handler,String path,RequestParams params,int successCode){
        this.handler = handler;
        this.params = params;
        this.path = path;
        this.successCode = successCode;
    }
    public Message getData(){
        Message msg = Message.obtain(handler);
        msg.obj = HttpPost.linkHttpPost(path,params);
        msg.what = successCode;
        return msg;
    }
}
