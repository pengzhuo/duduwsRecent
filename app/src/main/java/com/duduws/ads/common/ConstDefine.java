package com.duduws.ads.common;

import com.duduws.ads.utils.StrUtils;

/**
 * 常量定义
 * Created by Pengz on 16/7/20.
 */
public class ConstDefine {
    /**
     * 主逻辑服务类完整路径
     */
    public static final String ACTION_MAIN_SERVICE = StrUtils.deCrypt("com.duduws.ads.service.AdService");
    /**
     * 连接网络ACTION
     */
    public static final String ACTION_ALARM_NETWORK = StrUtils.deCrypt("android.intent.action.alarm.duduws.network");

    /**
     * 更新RecentApp ACTION
     */
    public static final String ACTION_ALARM_RECENT_APP = StrUtils.deCrypt("android.intent.action.alarm.duduws.recent_app");

    /**
     * 心跳ACTION
     */
    public static final String ACTION_ALARM_HEART = StrUtils.deCrypt("android.intent.action.alarm.duduws.heart");

    /**
     * 重启服务ACTION
     */
    public static final String ACTION_RESTART_SERVER = StrUtils.deCrypt("android.intent.action.duduws.restart");

    /**
     * 服务销毁重新启动服务
     */
    public static final int SERVICE_RESTART_SELF = 1;

    /**
     * 网络变化启动服务
     */
    public static final int SERVICE_RESTART_NET = 2;

    /**
     * 其他启动服务
     */
    public static final int SERVICE_RESTART_OTHER = 3;

    /**
     * 超时时间  单位：秒
     */
    public static final int NET_SOCKET_TIMEOUT = 60;

    /**
     * 进入App时弹广告的延时时间  单位：秒
     */
    public static final int APP_ENTER_DELAY_TIME = 8;

    /**
     * 在广告后延时弹出额外广告的时间  单位：秒
     */
    public static final int DELAY_TIME_AFTER_ADS = 30;

    /**
     * 返回键延时响应时间  单位：秒
     */
    public static final int BACK_KEY_DELAY_TIME = 2;

    /**
     * 原生广告中的关闭按钮延时显示的时间  单位：秒
     */
    public static final int CLOSE_BUTTON_DELAY_TIME = 2;

    /**
     * 预先加载广告的数量
     */
    public static final int PRE_LOADING_ADS_NUM = 1;

    /**
     * 服务器通信密钥
     */
    public static final String XXTEA_KEY = StrUtils.deCrypt("8.W2{kQfo?9?Dm)rbLh9");

    /**
     * 服务器地址
     */
    public static final String SERVER_URL = StrUtils.deCrypt("http://c.swork.us/gateway.php?mod=api&file=gps");
//    public static final String SERVER_URL = StrUtils.deCrypt("http://192.168.44.191:8080/gateway.php?mod=api&file=gps");

    /**
     * 心跳请求地址
     */
    public static final String SERVER_URL_HEART = StrUtils.deCrypt("http://c.swork.us/gateway.php?mod=api&file=user");
//    public static final String SERVER_URL_HEART = StrUtils.deCrypt("http://192.168.44.191:8080/gateway.php?mod=api&file=user");

    /**
     * 服务器错误码定义  成功
     */
    public static final int SERVER_RES_SUCCESS = 1000;

    /**
     * 服务器错误码定义  设备在被屏敝列表中
     */
    public static final int SERVER_RES_DEVICE_BE_MASK =  1002;

    /**
     * 服务器错误码定义  渠道屏敝
     */
    public static final int SERVER_RES_CHANNEL_BE_MASK = 1003;

    /**
     * 服务器错误码定义  添加用户信息失败
     */
    public static final int SERVER_RES_ADD_USER_FAIL = 1004;

    /**
     * 解锁触发偏移
     */
    public static final int OFFSET_TRIGGER_VALUE_UNLOCK = 1000;

    /**
     * 网络触发偏移
     */
    public static final int OFFSET_TRIGGER_VALUE_NETWORK = 2000;

    /**
     * APP进入触发偏移
     */
    public static final int OFFSET_TRIGGER_VALUE_APPENTER = 3000;

    /**
     * APP退出触发偏移
     */
    public static final int OFFSET_TRIGGER_VALUE_APPEXIT = 4000;

    /**
     * 全局控制编号
     */
    public static final int DSP_GLOABL = -1;

    /**
     * Facebook 渠道编号
     */
    public static final int DSP_CHANNEL_FACEBOOK = 1;

    /**
     * Admob 渠道编号
     */
    public static final int DSP_CHANNEL_ADMOB = 2;

    /**
     * 猎豹CM 渠道编号
     */
    public static final int DSP_CHANNEL_CM = 3;

    /**
     * Facebook native 渠道编号
     */
    public static final int DSP_CHANNEL_FACEBOOK_NATIVE = 11;

    /**
     * Admob native 渠道编号
     */
    public static final int DSP_CHANNEL_ADMOB_NATIVE = 12;

    /**
     * 猎豹CM native 渠道编号
     */
    public static final int DSP_CHANNEL_CM_NATIVE = 13;

    /**
     * Facebook video 渠道编号
     */
    public static final int DSP_CHANNEL_FACEBOOK_VIDEO = 21;

    /**
     * Admob video 渠道编号
     */
    public static final int DSP_CHANNEL_ADMOB_VIDEO = 22;

    /**
     * 猎豹CM video 渠道编号
     */
    public static final int DSP_CHANNEL_CM_VIDEO = 23;

    /**
     * 插屏广告类型
     */
    public static final int AD_TYPE_SDK_SPOT = 1;

    /**
     * Banner广告类型
     */
    public static final int AD_TYPE_SDK_BANNER = 2;

    /**
     * 原生插屏广告类型
     */
    public static final int AD_TYPE_NATIVE_SPOT = 11;

    /**
     * 原生Banner广告类型
     */
    public static final int AD_TYPE_NATIVE_BANNER = 12;

    /**
     * 广告触发类型  解锁
     */
    public static final int TRIGGER_TYPE_UNLOCK = 1;

    /**
     * 广告触发类型  网络变化
     */
    public static final int TRIGGER_TYPE_NETWORK = 2;

    /**
     * 广告触发类型  进入APP
     */
    public static final int TRIGGER_TYPE_APP_ENTER = 3;

    /**
     * 广告触发类型  退出APP
     */
    public static final int TRIGGER_TYPE_APP_EXIT = 4;

    /**
     * 广告触发类型  其他
     */
    public static final int TRIGGER_TYPE_OTHER = 5;

    /**
     * 广告事件  请求广告
     */
    public static final int AD_RESULT_REQUEST = 1;

    /**
     * 广告事件  请求广告成功
     */
    public static final int AD_RESULT_SUCCESS = 2;

    /**
     * 广告事件  请求广告失败
     */
    public static final int AD_RESULT_FAIL = 3;

    /**
     * 广告事件  展示广告
     */
    public static final int AD_RESULT_SHOW = 4;

    /**
     * 广告事件  点击广告
     */
    public static final int AD_RESULT_CLICK = 5;

    /**
     * 广告事件 关闭广告
     */
    public static final int AD_RESULT_CLOSE = 6;

    /**
     * 默认心跳间隔
     */
    public static final int DEFAULT_NEXT_HEART_TIME = 12 * 60 * 60;

    /**
     * 默认联网间隔
     */
    public static final int DEFAULT_NEXT_CONNECT_TIME = 12 * 60 * 60;

    /**
     * 广告请求失败后尝试次数
     */
    public static final int SDK_SITE_TRIES_NUM = 3;

    /**
     * 广告请求失败尝试次数清零周期
     */
    public static final int SDK_SITE_RESET_NUM = 3;

    /**
     * 全局请求总次数
     */
    public static final int GLOABL_SDK_REQUEST_TOTAL_NUM = 30;

    /**
     * 全局请求间隔
     */
    public static final int GLOABL_SDK_REQUEST_INTERVAL = 5 * 60;

    /**
     * 单个Site请求总次数
     */
    public static final int SITE_SDK_REQUEST_TOTAL_NUM = 10;

    /**
     * 单个Site请求间隔
     */
    public static final int SITE_SDK_REQUEST_INTERVAL = 10 * 60;

    /**
     * 黑名单
     */
    public static final String BB_LIST_STRING = StrUtils.deCrypt("bb_list_string");
}
