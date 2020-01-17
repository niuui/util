package com.smart.util.sp;

public class SPKey {
	/*** 引导也面是否使用 **/
	public static final String GUIDE_PAGE = "isGuidePageView";
	/*** 用户手势密码详情 **/
	public static final String GESTURE_PWD_DETAIL = "gesturePwd";
	/*** 手势密码开关 **/
	public static final String GESTURE_PWD_ONOFF = "gestures";//todo 20180822 这个字段没有用上过
	/*** 话费充值历史号码 **/
	public static final String PHONE_PAY_HISTORY_NO = "phonePayHistoryNo";
	/*** 流量充值历史号码 **/
	public static final String FLOW_PAY_HISTORY_NO = "flowPayHistoryNo";
	/*** 通联钱包分享赠送v币标志 **/
	public static final String WEIGO_SHARE_RESULT_KEY = "weigoShareResultKey";
	/*** 微购客使用本地存储imei号 **/
	public static final String WEIGO_OLD_IMEI = "iemidloogiew";
	/*** 微购客使用本地存储mac地址 **/
	public static final String WEIGO_OLD_MACID = "camdloogiew";
	/*** 微购客使用本地存储imsi号 **/
	public static final String WEIGO_OLD_IMSI = "imsiloogiew";
	/*** 未开启小额免密时，付款码第一次进入时需要输入支付密码 **/
	public static final String PAYCODE_FIRST_AND_NOFREE = "paycodeFirstAndNofree";
	/*** 开启小额免密时，登录后首次进入需要输入支付密码 **/
	public static final String PAYCODE_FIRST_AND_FREE = "paycodeFirstAndFree";
	/*** 地方版定位信息存储key **/
	public static final String LOCAL_APP_ADRESS_INFO = "localAppAdressInfo";
	/*** 地方版定位信息存储key **/
	public static final String LOCAL_APP_CITYCODE = "localAppCityCode"; //定期理财创建订单时上送，用于统计
	/*** 卡券定位信息存储key-省份名字 **/
	public static final String COUP_PROVINCE_NAME = "localCoupProvinceName";
	/*** 卡券定位信息存储key-省份id **/
	public static final String COUP_PROVINCE_ID = "localCoupProvinceId";
	/*** 卡券定位信息存储key-城市名字 **/
	public static final String COUP_CITY_NAME = "localCoupCityName";
	/*** 卡券定位信息存储key-城市id **/
	public static final String COUP_CITY_ID = "localCoupCityId";
	/*** 卡券定位信息存储key-区域id **/
	public static final String COUP_AREA_ID = "localCoupAreaId";
	/*** 卡券定位信息存储key-搜索记录 **/
	public static final String COUP_SEARCH_HISTORY = "localCoupSearchHistory";
	/*** 启动页面加载图片的url地址 **/
	public static final String START_PAGE_IMAGE_URL = "startPageImageUrl";
	/*** 慧理财页面加载品质特产图片的url地址 **/
	public static final String HUI_FINANCE_PINZHI = "farmStoreImageUrl";
	/*** 慧理财页面加载品质特产图片的按钮颜色 **/
	public static final String HUI_FINANCE_BUTTON_COL = "farmStoreImageButtonCol";
	/*** 32位随机数据 **/
	public static final String RANDOM_32 = "systemDefalut";
	/*** 用户登录数据 **/
	public static final String ACCOUNT_INFO = "userDefalut";
	/*** 用户登录数据密码信息 **/
	public static final String ACCOUNT_INFO_PWD = "userDefalutp";
	/*** 加密使用sn存储 **/
	public static final String ACCOUNT_INFO_SN = "userDefalutsn";
	/*** 荟生活信息缓存 **/
	public static final String HUI_LIFT_DATA = "huiLiftData";
	/*** 荟精品信息缓存 **/
	public static final String HUI_JINGPIN_DATA = "HUI_JINPIN_DATA";
	/*** 慧金融-理财信息缓存 **/
	public static final String HUI_JINRONG_LICAI = "HUI_JINRONG_LICAI";
	/*** 慧金融-网贷信息缓存 **/
	public static final String HUI_JINRONG_WANGDAI = "HUI_JINRONG_WANGDAI";
	/*** 慧金融-保险 **/
	public static final String HUI_JINRONG_BAOXIAN = "HUI_JINRONG_BAOXIAN";
	/*** 理财宝首次进入弹框标记 **/
	public static final String LCB_FIRST_IN = "lcbFirstIn";
	/*** 我的理财页面是否显示金额 **/
	public static final String MY_FINANCE_IS_SHOW = "myFinanceIsShow";
	/*** 总资产页面是否显示金额 **/
	public static final String TOTAL_ASSETS_IS_SHOW = "totalAssetsIsShow";
	
	/*************************** 组合支付使用 ***************************/
	/*** 存储历史组合支付 **/
	public static final String HISTORY_COMBINATION = "historyCombination";
	/*** 存储历史账户  转账到账户 **/
	public static final String HISTORY_TRANS_TO_ACCOUNT = "historyTransToAccount";
	/*** 存储历史账户  转账到银行卡 **/
	public static final String HISTORY_TRANS_TO_BANKCARD = "historyTransToBankcard";
	/*** 商户历史搜索记录 **/
	public static final String MERCHANT_HISTORY_INFO = "merchantHistoryInfo";
	/*** 通联手环使用的机构号 **/
	public static final String ALLINPAY_SHOU_HUAN_SYSID = "allinpaySHJGH";
	
	/*************************** 账户使用 ***************************/
	/*** 用户昵称或者用户名保存 **/
	public static final String ACCOUNT_INFO_NICK = "accountInfoNick";
	/*** 登录账号保存 **/
	public static final String ACCOUNT_USER_NAME = "username";
	/*** 上次登录方式 **/
	public static final String ACCOUNT_LAST_LOGIN_MODE = "lastloginmode";
	/*** 登录账号头像保存 **/
	public static final String ACCOUNT_USER_AVATOR_URL = "useravatorurl";
	/*** 注册次数 **/
	public static final String REGISTER_COUNT = "registerCount";
	/*** 首页不满足人行实名认证的提示信息 **/
	public static final String REAL_NAME_HINT = "realNameHint";
	/*** 付款码使用历史账户 **/
	public static final String PAYCODE_HISTORY_ACCOUNT = "paycodeHistoryAccount";

	/*** 用于记录使用何种支付方式，是收银宝还是银联 true为银联支付，false为收银宝支付**/
	public static final String PAYCODE_CHOOSE_UNIONPAY_STYLE = "PAYCODE_CHOOSE_UNIONPAY_STYLE";
	/*** 用户记录银联支付方式 **/
	public static final String PAYCODE_UNIONPAY_STYLE = "PAYCODE_UNIONPAY_STYLE";
	
	/*************************** 两桶油使用 ***************************/
	/*** 中石油历史卡号存储 **/
	public static final String ZSY_HISTORY_CARDNO = "zsyHistoryCardno";
	/*** 中石化历史卡号存储 **/
	public static final String ZSH_HISTORY_CARDNO = "zshHistoryCardno";
	/*************************** 推送消息使用 ***************************/
	/*** 转账通知相关消息 **/
	public static final String NOTIFI_TRANS_MONEY_KEY = "notifiTransMoneyKeys";
	/*** 紧急通知消息存储 **/
	public static final String NOTIFI_URGENT_MSG_KEY = "notifiUrgentMsgKeys";
	/*** 优惠券推送通知 **/
	public static final String NOTIFI_COUPON_MSG_KEY = "notifiCouponMsgKey";
	/*** 身边编号key **/
	public static final String HEADER_TERMINAL_ID = "terminalId";
	/*** 教育缴费反积分key **/
	public static final String EDUCATION_BONUS_KEY = "educationBonusKey";
	/*** 教育缴费反现金key **/
	public static final String EDUCATION_CASH_KEY = "educationCashKey";

	/*** 是否开通银联云闪付 **/
	public static final String IS_OPEN_YUN_QUICK_PAY = "IS_OPEN_YUN_QUICK_PAY";

	/*** 是否是首次进入反扫页面(用户判断通华账户的) **/
	public static final String PAY_CODE_IS_FIRST_JUMP_IN = "PAY_CODE_IS_FIRST_JUMP_IN";

	/*** 首次进入反扫页面是否需要加载反扫的引导页 **/
	public static final String PAY_CODE_NEED_GUIDE_PAGE_FIRST_IN = "PAY_CODE_NEED_GUIDE_PAGE_FIRST_IN";

	/*** 首次进入食堂卡扫码界面加载引导图 **/
	public static final String MEAL_PAY_CODE_GUIDE_PAGE_FIRST_IN = "MEAL_PAY_CODE_GUIDE_PAGE_FIRST_IN";

	/*** 是否开启扣款顺序 **/
	public static final String IS_OPEN_WALLET_PAY_STHLE_ORDER = "IS_OPEN_WALLET_PAY_STHLE_ORDER";

	//存在代领金额的时候是否显示过弹窗，新设备上显示一次
	public static final String HAS_SHOW_DLJE_DIALOG = "HAS_SHOW_DLJE_DIALOG";

	//首页中查看福利卡中的金额
	public static final String ONE_PAGE_FLK_SHOW_DETAIL_MONEY = "ONE_PAGE_FLK_SHOW_DETAIL_MONEY";

	//会生活二级页缓存
	public static final String HUI_LIFT_SECOND_CACHE = "HUI_LIFT_SECOND_CACHE";

	//总资产页资产缓存
	public static final String TOTAL_ASSETS_CACHE_KEY = "TOTAL_ASSETS_CACHE_KEY";

	//个人中心的小红点
	public static final String CENTER_FRAG_PERSON_RED_POINTER = "CENTER_FRAG_PERSON_RED_POINTER";
	//用户信息中心的小红点
	public static final String PERSON_FRAG_PERSON_RED_POINTER = "PERSON_FRAG_PERSON_RED_POINTER";

	//我的tab页面账户余额小眼睛状态
	public static final String MINE_TAB_ACCOUNT_BALANCE_SHOW_STATE = "MINE_TAB_ACCOUNT_BALANCE_SHOW_STATE";
	//我的tab页面理财总资产小眼睛状态
	public static final String MINE_TAB_FINANCE_SHOW_STATE = "MINE_TAB_FINANCE_SHOW_STATE";
	//我的tab页面用户信息的缓存
	public static final String MINE_TAB_MINE_INFO = "MINE_TAB_MINE_INFO";
	//我的tab页面用户理财信息缓存
	public static final String MINE_TAB_MINE_FINANCE_PRODUCT = "MINE_TAB_MINE_FINANCE_PRODUCT";
	//我的tab页面引导页是否显示过
	public static final String MINE_TAB_GUIDE_PAGE_SHOW = "MINE_TAB_GUIDE_PAGE_SHOW";

	//三个引导页判断显示的键值名
	public static final String HUI_LIFE_GUIDER_PIC = "HUI_LIFE_GUIDER_PIC";
	public static final String HUI_JINGPIN_GUIDER_PIC = "HUI_JINGPIN_GUIDER_PIC";
	public static final String HUI_FINANCE_GUIDER_PIC = "HUI_FINANCE_GUIDER_PIC";

	public static final String RANDOM_DEVICE_ID = "RANDOM_DEVICE_ID";
}
