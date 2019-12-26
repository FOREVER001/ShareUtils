package com.blks.func_share;

import android.content.Context;

import java.util.HashMap;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.wechat.friends.Wechat;

public class ShareUtils {
    //java
    public static void showShare(Context context) {
        OnekeyShare oks = new OnekeyShare();
        // title标题，微信、QQ和QQ空间等平台使用
        oks.setTitle("测试分享");
        // titleUrl QQ和QQ空间跳转链接
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本,哈哈哈测试");
        // imagePath是图片的本地路径，确保SDcard下面存在此张图片
        oks.setImagePath("/sdcard/test.jpg");
        // url在微信、Facebook等平台中使用
        oks.setUrl("http://sharesdk.cn");
        // 启动分享GUI
        oks.show(context);
    }
    public static void setParsm(String appId,String appSecret){

        HashMap<String,Object> hashMap = new HashMap<String, Object>();

        hashMap.put("AppId",appId);
        hashMap.put("AppSecret",appSecret);

        ShareSDK.setPlatformDevInfo(Wechat.NAME,hashMap);
    }
}
