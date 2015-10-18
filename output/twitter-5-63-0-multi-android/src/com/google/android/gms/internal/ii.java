// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public enum ii
{
    A("ALREADY_HAS_GMAIL", 26, "ALREADY_HAS_GMAIL"), 
    B("BAD_REQUEST", 27, "BadRequest"), 
    C("BAD_USERNAME", 28, "BadUsername"), 
    D("LOGIN_FAIL", 29, "LoginFail"), 
    E("NOT_LOGGED_IN", 30, "NotLoggedIn"), 
    F("NO_GMAIL", 31, "NoGmail"), 
    G("REQUEST_DENIED", 32, "RequestDenied"), 
    H("SERVER_ERROR", 33, "ServerError"), 
    I("USERNAME_UNAVAILABLE", 34, "UsernameUnavailable"), 
    J("DELETED_GMAIL", 35, "DeletedGmail"), 
    K("SOCKET_TIMEOUT", 36, "SocketTimeout"), 
    L("EXISTING_USERNAME", 37, "ExistingUsername"), 
    M("NEEDS_BROWSER", 38, "NeedsBrowser"), 
    N("GPLUS_OTHER", 39, "GPlusOther"), 
    O("GPLUS_NICKNAME", 40, "GPlusNickname"), 
    P("GPLUS_INVALID_CHAR", 41, "GPlusInvalidChar"), 
    Q("GPLUS_INTERSTITIAL", 42, "GPlusInterstitial"), 
    R("GPLUS_PROFILE_ERROR", 43, "ProfileUpgradeError"), 
    S("INVALID_SCOPE", 44, "INVALID_SCOPE");
    
    public static String T;
    public static String U;
    
    a("SUCCESS", 0, "Ok"), 
    b("BAD_AUTHENTICATION", 1, "BadAuthentication"), 
    c("NEEDS_2F", 2, "InvalidSecondFactor"), 
    d("NOT_VERIFIED", 3, "NotVerified"), 
    e("TERMS_NOT_AGREED", 4, "TermsNotAgreed"), 
    f("UNKNOWN", 5, "Unknown"), 
    g("UNKNOWN_ERROR", 6, "UNKNOWN_ERR"), 
    h("ACCOUNT_DELETED", 7, "AccountDeleted"), 
    i("ACCOUNT_DISABLED", 8, "AccountDisabled"), 
    j("SERVICE_DISABLED", 9, "ServiceDisabled"), 
    k("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable"), 
    l("CAPTCHA", 11, "CaptchaRequired"), 
    m("NETWORK_ERROR", 12, "NetworkError"), 
    n("USER_CANCEL", 13, "UserCancel"), 
    o("PERMISSION_DENIED", 14, "PermissionDenied"), 
    p("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled"), 
    q("DM_INTERNAL_ERROR", 16, "DeviceManagementInternalError"), 
    r("DM_SYNC_DISABLED", 17, "DeviceManagementSyncDisabled"), 
    s("DM_ADMIN_BLOCKED", 18, "DeviceManagementAdminBlocked"), 
    t("DM_ADMIN_PENDING_APPROVAL", 19, "DeviceManagementAdminPendingApproval"), 
    u("DM_STALE_SYNC_REQUIRED", 20, "DeviceManagementStaleSyncRequired"), 
    v("DM_DEACTIVATED", 21, "DeviceManagementDeactivated"), 
    w("DM_REQUIRED", 22, "DeviceManagementRequired"), 
    x("CLIENT_LOGIN_DISABLED", 23, "ClientLoginDisabled"), 
    y("NEED_PERMISSION", 24, "NeedPermission"), 
    z("BAD_PASSWORD", 25, "WeakPassword");
    
    private final String Fm;
    
    static {
        ii.T = "Error";
        ii.U = "status";
    }
    
    private ii(final String s, final int n, final String fm) {
        this.Fm = fm;
    }
    
    public String a() {
        return this.Fm;
    }
}
