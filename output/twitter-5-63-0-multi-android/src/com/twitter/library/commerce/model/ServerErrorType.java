// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

public enum ServerErrorType
{
    A("INVALID_EMAIL", 26, 25, lg.commerce_error_invalid_address_email_unknown), 
    B("INVALID_EMAIL_LENGTH", 27, 26, lg.commerce_error_invalid_address_email_length), 
    C("INVALID_CC_TYPE", 28, 27, lg.commerce_error_invalid_card_type), 
    D("INVALID_PAYMENT_TYPE", 29, 28, lg.commerce_error_invalid_card_payment_type), 
    E("DECLINED", 30, 29, lg.commerce_error_invalid_card_declined), 
    F("OFFER_NOT_FOUND", 31, 30, lg.commerce_error_offer_not_found), 
    G("OFFER_EXPIRED", 32, 31, lg.commerce_error_offer_expired), 
    H("OFFER_INACTIVE", 33, 32, lg.commerce_error_offer_inactive), 
    I("OFFER_ALREADY_SAVED", 34, 33, lg.commerce_error_offer_already_saved), 
    J("INVALID_COUNTRY_FOR_ITEM", 35, 34, lg.commerce_error_address_not_supported), 
    a("UNKNOWN", 0, -1, lg.commerce_error_unknown_error), 
    b("NETWORK_ERROR", 1, 0, lg.commerce_error_network_error), 
    c("AUTH_ERROR", 2, 1, lg.commerce_error_auth_error), 
    d("BAD_REQUEST", 3, 2, lg.commerce_error_bad_request), 
    e("SERVICE_UNAVAILABLE", 4, 3, lg.commerce_error_service_unavailable), 
    f("SERVER_ERROR", 5, 4, lg.commerce_error_server_error), 
    g("INVALID_PARAMETER", 6, 5, lg.commerce_error_invalid_parameters), 
    h("EMAIL_CONFIRMATION_REQUIRED", 7, 6, lg.commerce_error_email_confirmation_required), 
    i("PRODUCT_NOT_AVAILABLE", 8, 7, lg.commerce_error_product_unavailable), 
    j("AMOUNT_CHANGED", 9, 8, lg.commerce_error_amount_changed), 
    k("NO_INVENTORY", 10, 9, lg.commerce_error_invalid_inventory, true), 
    l("INVALID_PRODUCT", 11, 10, lg.commerce_error_invalid_product), 
    m("PARTNER_ERROR", 12, 11, lg.commerce_error_partner_error), 
    n("ACCOUNT_NOT_FOUND", 13, 12, lg.commerce_error_account_not_found), 
    o("ACCOUNT_ALREADY_EXIST", 14, 13, lg.commerce_error_account_duplicate), 
    p("INVALID_ADDRESS", 15, 14, lg.commerce_error_invalid_address_address), 
    q("INVALID_AMOUNT", 16, 15, lg.commerce_error_invalid_amount), 
    r("INVALID_CC_NUMBER", 17, 16, lg.commerce_error_invalid_card_number_invalid), 
    s("INVALID_COUNTRY", 18, 17, lg.commerce_error_invalid_address_country_unknown), 
    t("INVALID_CURRENCY_TYPE", 19, 18, lg.commerce_error_invalid_currency), 
    u("INVALID_CVV_CODE", 20, 19, lg.commerce_error_invalid_card_ccv_number), 
    v("INVALID_EXPIRATION_DATE", 21, 20, lg.commerce_error_invalid_card_date), 
    w("INVALID_EXPIRATION_MONTH", 22, 21, lg.commerce_error_invalid_card_month), 
    x("INVALID_EXPIRATION_YEAR", 23, 22, lg.commerce_error_invalid_card_year), 
    y("INVALID_NUMBER", 24, 23, lg.commerce_error_invalid_card_ccv_number), 
    z("INVALID_PROFILE", 25, 24, lg.commerce_error_invalid_profile);
    
    private final boolean mIsSoftError;
    private int mStringResId;
    private final int mValue;
    
    private ServerErrorType(final String s, final int n, final int n2, final int n3) {
        this(s, n, n2, n3, false);
    }
    
    private ServerErrorType(final String s, final int n, final int mValue, final int mStringResId, final boolean mIsSoftError) {
        this.mValue = mValue;
        this.mStringResId = mStringResId;
        this.mIsSoftError = mIsSoftError;
    }
    
    public static ServerErrorType a(final int n) {
        for (final ServerErrorType serverErrorType : values()) {
            if (serverErrorType.ordinal() == n) {
                return serverErrorType;
            }
        }
        return ServerErrorType.a;
    }
    
    public static ServerErrorType a(final String s) {
        if (s == null) {
            return ServerErrorType.a;
        }
        switch (s) {
            default: {
                return ServerErrorType.a;
            }
            case "AUTHENTICATION_FAILED": {
                return ServerErrorType.c;
            }
            case "ACCOUNT_NOT_FOUND": {
                return ServerErrorType.n;
            }
            case "ACCOUNT_ALREADY_EXIST": {
                return ServerErrorType.o;
            }
            case "INVALID_ADDRESS": {
                return ServerErrorType.p;
            }
            case "INVALID_AMOUNT": {
                return ServerErrorType.q;
            }
            case "INVALID_CC_NUMBER": {
                return ServerErrorType.r;
            }
            case "INVALID_COUNTRY": {
                return ServerErrorType.s;
            }
            case "INVALID_CURRENCY_TYPE": {
                return ServerErrorType.t;
            }
            case "INVALID_CVV_CODE": {
                return ServerErrorType.u;
            }
            case "INVALID_EXPIRATION_DATE": {
                return ServerErrorType.v;
            }
            case "INVALID_EXPIRATION_MONTH": {
                return ServerErrorType.w;
            }
            case "INVALID_EXPIRATION_YEAR": {
                return ServerErrorType.x;
            }
            case "INVALID_NUMBER": {
                return ServerErrorType.y;
            }
            case "INVALID_PROFILE": {
                return ServerErrorType.z;
            }
            case "INVALID_EMAIL": {
                return ServerErrorType.A;
            }
            case "INVALID_EMAIL_LENGTH": {
                return ServerErrorType.x;
            }
            case "INVALID_CC_TYPE": {
                return ServerErrorType.C;
            }
            case "INVALID_PAYMENT_TYPE": {
                return ServerErrorType.D;
            }
            case "DECLINED": {
                return ServerErrorType.E;
            }
            case "InvalidParameter": {
                return ServerErrorType.g;
            }
            case "EmailConfirmationRequired": {
                return ServerErrorType.h;
            }
            case "ProductNotAvailable": {
                return ServerErrorType.i;
            }
            case "AmountChanged": {
                return ServerErrorType.j;
            }
            case "NoInventory": {
                return ServerErrorType.k;
            }
            case "InvalidProduct": {
                return ServerErrorType.l;
            }
            case "PartnerError": {
                return ServerErrorType.m;
            }
            case "OfferNotFound": {
                return ServerErrorType.F;
            }
            case "OfferExpired": {
                return ServerErrorType.G;
            }
            case "OfferInactive": {
                return ServerErrorType.H;
            }
            case "OfferAlreadySaved": {
                return ServerErrorType.I;
            }
            case "AddressNotSupported": {
                return ServerErrorType.J;
            }
        }
    }
    
    public int a() {
        return this.mValue;
    }
    
    public int b() {
        return this.mStringResId;
    }
    
    public boolean c() {
        return this.mIsSoftError;
    }
}
