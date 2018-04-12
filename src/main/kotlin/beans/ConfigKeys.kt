package beans

enum class ConfigKeys{

    /** 是否显示游戏兑换入口 */
    GAME_REDEEM_ENTRY,

    /** 关注提醒开关（用户关注比赛时是否提醒） */
    MATCH_NOTIFY_STATUS,


    //  ----------  开关 -----

    /** 是否显示游戏入口 */
    SHOW_GAME_ENTRY,

    /** 是否显示彩票入口 */
    SHOW_LOTTERY_ENTRY,

    /** 是否显示爆料（资讯）入口 */
    SHOW_TIPS_ENTRY,

    /** 是否显示比分（直播）入口 */
    SHOW_LIVE_SCORE_ENTRY,

    /** 是否个人中心入口 */
    SHOW_USER_ENTRY,

    //  -----------  公司 --------


    /** 公司名 */
    COMPANY_NAME,

    /** 公司logo */
    COMPANY_LOGO,

    /** 关于我们 */
    ABOUT_US_URL,

    /** 用户服务协议 */
    SERVICE_AGREEMENT_URL,

    /** 客服电话 */
    SERVICE_TEL,

    /** 竞猜订单列表 */
    GAME_ORDER_LIST_URL,

    /** query-api server地址 */
    QUERY_API_SERVER_URL,

    /** 竞猜-首页 */
    GAME_INDEX_URL,

    //   ------ 用户 ----
    /** 我的道具仓库入口地址 */
    GAME_BACKPACK_URL,

    /** 个人中心幸运抽奖入口地址 */
    GAME_LUCKY_LOTTERY_URL,

    //   ----------- 第三方 -----
    /** 	微信 AppId */
    APPID_WECHAT,

    /** QQ AppId */
    APPID_QQ,
    /** 	Sina微博 AppId */
    APPID_WEIBO,

    /** 微信 AppSecret（Android专用） */
    APPSECRET_WECHAT,

    /** QQ AppSecret（Android专用） */
    APPSECRET_QQ,

    /** Sina微博 AppSecret（Android专用） */
    APPSECRET_WEIBO

}