// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public enum PromotedEvent
{
    A("AUDIO_CONTENT_PLAYBACK_100", 26, "audio_playback_100"), 
    B("AUDIO_REPLAY", 27, "audio_replay"), 
    C("VIDEO_PLAY", 28, "video_play"), 
    D("VIDEO_CONTENT_PLAYBACK_0", 29, "video_content_playback_0"), 
    E("VIDEO_CONTENT_PLAYBACK_START", 30, "video_content_playback_start"), 
    F("VIDEO_CONTENT_PLAYBACK_25", 31, "video_content_playback_25"), 
    G("VIDEO_CONTENT_PLAYBACK_50", 32, "video_content_playback_50"), 
    H("VIDEO_CONTENT_PLAYBACK_75", 33, "video_content_playback_75"), 
    I("VIDEO_CONTENT_PLAYBACK_95", 34, "video_content_playback_95"), 
    J("VIDEO_CONTENT_PLAYBACK_100", 35, "video_content_playback_100"), 
    K("VIDEO_CONTENT_PLAYBACK_COMPLETE", 36, "video_content_playback_complete"), 
    L("VIDEO_CONTENT_VIEW", 37, "video_content_view"), 
    M("VIDEO_CONTENT_VIEW_THRESHOLD", 38, "video_content_view_threshold"), 
    N("VIDEO_CONTENT_PLAY_FROM_TAP", 39, "video_content_play_from_tap"), 
    O("VIDEO_AD_PLAYBACK_0", 40, "video_ad_playback_0"), 
    P("VIDEO_AD_PLAYBACK_START", 41, "video_ad_playback_start"), 
    Q("VIDEO_AD_PLAYBACK_25", 42, "video_ad_playback_25"), 
    R("VIDEO_AD_PLAYBACK_50", 43, "video_ad_playback_50"), 
    S("VIDEO_AD_PLAYBACK_75", 44, "video_ad_playback_75"), 
    T("VIDEO_AD_PLAYBACK_95", 45, "video_ad_playback_95"), 
    U("VIDEO_AD_PLAYBACK_100", 46, "video_ad_playback_100"), 
    V("VIDEO_AD_PLAYBACK_COMPLETE", 47, "video_ad_playback_complete"), 
    W("VIDEO_AD_VIEW", 48, "video_ad_view"), 
    X("VIDEO_AD_VIEW_THRESHOLD", 49, "video_ad_view_threshold"), 
    Y("VIDEO_AD_PLAY_FROM_TAP", 50, "video_ad_play_from_tap"), 
    Z("VIDEO_REPLAY", 51, "video_replay"), 
    a("IMPRESSION", 0, "impression"), 
    aA("DWELL_MEDIUM", 78, "dwell_medium"), 
    aB("DWELL_LONG", 79, "dwell_long"), 
    aC("SCROLL_WEBVIEW", 80, "scroll_webview"), 
    aD("CLOSE_WEBVIEW", 81, "close_webview"), 
    aE("CAROUSEL_SWIPE_NEXT", 82, "carousel_swipe_next"), 
    aF("CAROUSEL_SWIPE_PREVIOUS", 83, "carousel_swipe_previous"), 
    aG("LONG_DWELL_VIEW", 84, "long_dwell_view"), 
    aa("VIDEO_CTA_APP_OPEN_CLICK", 52, "video_cta_app_open_click"), 
    ab("VIDEO_CTA_APP_INSTALL_CLICK", 53, "video_cta_app_install_click"), 
    ac("VIDEO_CTA_URL_CLICK", 54, "video_cta_url_click"), 
    ad("VIDEO_CTA_WATCH_CLICK", 55, "video_cta_watch_click"), 
    ae("BUYNOW_PRODUCT_DETAIL_LOAD_FINISHED", 56, "buynow_product_detail_load_finished"), 
    af("BUYNOW_PRODUCT_DETAIL_LOAD_ABORTED", 57, "buynow_product_detail_load_aborted"), 
    ag("BUYNOW_PRODUCT_IMAGE_OPEN", 58, "buynow_product_image_open"), 
    ah("BUYNOW_BUY_BUTTON_CLICK", 59, "buynow_buy_button_click"), 
    ai("BUYNOW_STORE_PROFILE_START", 60, "buynow_store_profile_start"), 
    aj("BUYNOW_STORE_PROFILE_EXIT", 61, "buynow_store_profile_exit"), 
    ak("BUYNOW_STORE_PROFILE_SUBMIT", 62, "buynow_store_profile_submit"), 
    al("BUYNOW_STORE_PROFILE_SUCCESS", 63, "buynow_store_profile_success"), 
    am("BUYNOW_STORE_PROFILE_FAILURE", 64, "buynow_store_profile_failure"), 
    an("BUYNOW_BUY_BUTTON_CONFIRM", 65, "buynow_buy_button_confirm"), 
    ao("BUYNOW_PURCHASE_SUCCESS", 66, "buynow_purchase_success"), 
    ap("BUYNOW_PURCHASE_FAILURE", 67, "buynow_purchase_failure"), 
    aq("BUYNOW_PRODUCT_DETAIL_EXIT", 68, "buynow_product_detail_exit"), 
    ar("BUYNOW_CHANGE_PAYMENT_PROFILE_BUTTON_CLICK", 69, "buynow_change_payment_profile_button_click"), 
    as("BUYNOW_CARD_CLICK", 70, "buynow_card_click"), 
    at("PRODUCT_PAGE_CARD_CLICK", 71, "product_page_card_click"), 
    au("PRODUCT_AD_CARD_CLICK", 72, "product_ad_card_click"), 
    av("COMMERCE_COLLECTION_CARD_CLICK", 73, "commerce_collection_card_click"), 
    aw("CL_OFFER_ACCEPTED", 74, "cl_offer_accepted"), 
    ax("CL_OFFER_REDEEMED", 75, "cl_offer_redeemed"), 
    ay("CL_OFFER_CARD_CLICK", 76, "cl_offer_card_click"), 
    az("DWELL_SHORT", 77, "dwell_short"), 
    b("URL_CLICK", 1, "url_click"), 
    c("PROFILE_IMAGE_CLICK", 2, "profile_image_click"), 
    d("SCREEN_NAME_CLICK", 3, "screen_name_click"), 
    e("HASHTAG_CLICK", 4, "hashtag_click"), 
    f("USER_MENTION_CLICK", 5, "user_mention_click"), 
    g("VIEW_DETAILS", 6, "view_details"), 
    h("PROMOTED_TREND_CLICK", 7, "click"), 
    i("DISMISS", 8, "dismiss"), 
    j("DISMISS_REPETITIVE", 9, "dismiss_repetitive"), 
    k("DISMISS_UNINTERESTING", 10, "dismiss_uninteresting"), 
    l("DISMISS_SPAM", 11, "dismiss_spam"), 
    m("FOOTER_PROFILE", 12, "footer_profile"), 
    n("CARD_URL_CLICK", 13, "card_url_click"), 
    o("CARD_CLICK", 14, "card_click"), 
    p("CARD_MEDIA_CLICK", 15, "embedded_media"), 
    q("CARD_OPEN_APP", 16, "open_app"), 
    r("CARD_INSTALL_APP", 17, "install_app"), 
    s("CARD_INSTALLED_APP", 18, "installed_app"), 
    t("CARD_DIAL_PHONE", 19, "dial_phone"), 
    u("CASHTAG_CLICK", 20, "cashtag_click"), 
    v("AUDIO_PLAY", 21, "audio_play"), 
    w("AUDIO_CONTENT_PLAYBACK_0", 22, "audio_playback_0"), 
    x("AUDIO_CONTENT_PLAYBACK_25", 23, "audio_playback_25"), 
    y("AUDIO_CONTENT_PLAYBACK_50", 24, "audio_playback_50"), 
    z("AUDIO_CONTENT_PLAYBACK_75", 25, "audio_playback_75");
    
    private final String mEvent;
    
    private PromotedEvent(final String s, final int n, final String mEvent) {
        this.mEvent = mEvent;
    }
    
    public static PromotedEvent a(final int n) {
        return values()[n];
    }
    
    @Override
    public String toString() {
        return this.mEvent;
    }
}
