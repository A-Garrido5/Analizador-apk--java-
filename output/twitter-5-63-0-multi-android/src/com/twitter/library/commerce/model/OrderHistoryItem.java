// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.content.res.Resources;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Map;

public class OrderHistoryItem extends OrderItem
{
    private Map mAttributes;
    private String mExternalOrderId;
    private Long mId;
    private String mImageUrl;
    private String mMerchantEmail;
    private String mMerchantName;
    private String mMerchantPhoneNumber;
    private String mMerchantUrl;
    private String mOrderStatus;
    private Calendar mOrderedAt;
    private String mProductUrl;
    private Long mSalesOrderId;
    private String mTitle;
    private BigDecimal mTotal;
    private String mTotalCurrency;
    private Long mTweetId;
    
    public String a() {
        return this.mMerchantName;
    }
    
    public String a(final Resources resources) {
        final String e = this.e();
        int n2 = 0;
        switch (e) {
            default: {
                return "";
            }
            case "PROCESSING": {
                n2 = lg.commerce_order_status_processing;
                break;
            }
            case "SENT_TO_SELLER": {
                n2 = lg.commerce_order_status_sent_to_seller;
                break;
            }
            case "CANCELED": {
                n2 = lg.commerce_order_status_cancelled;
                break;
            }
        }
        return resources.getString(n2);
    }
    
    public void a(final Long mSalesOrderId) {
        this.mSalesOrderId = mSalesOrderId;
    }
    
    public void a(final String mMerchantName) {
        this.mMerchantName = mMerchantName;
    }
    
    public void a(final BigDecimal mTotal) {
        this.mTotal = mTotal;
    }
    
    public void a(final Calendar mOrderedAt) {
        this.mOrderedAt = mOrderedAt;
    }
    
    public void a(final Map mAttributes) {
        this.mAttributes = mAttributes;
    }
    
    public String b() {
        return this.mTitle;
    }
    
    public void b(final Long mId) {
        this.mId = mId;
    }
    
    public void b(final String mTitle) {
        this.mTitle = mTitle;
    }
    
    public String c() {
        return this.mImageUrl;
    }
    
    public void c(final Long mTweetId) {
        this.mTweetId = mTweetId;
    }
    
    public void c(final String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
    
    public Calendar d() {
        return this.mOrderedAt;
    }
    
    public void d(final String mOrderStatus) {
        this.mOrderStatus = mOrderStatus;
    }
    
    public String e() {
        return this.mOrderStatus;
    }
    
    public void e(final String mMerchantEmail) {
        this.mMerchantEmail = mMerchantEmail;
    }
    
    public String f() {
        return this.mMerchantEmail;
    }
    
    public void f(final String mProductUrl) {
        this.mProductUrl = mProductUrl;
    }
    
    public Long g() {
        return this.mId;
    }
    
    public void g(final String mTotalCurrency) {
        this.mTotalCurrency = mTotalCurrency;
    }
    
    public Map h() {
        return this.mAttributes;
    }
    
    public void h(final String mExternalOrderId) {
        this.mExternalOrderId = mExternalOrderId;
    }
    
    public BigDecimal i() {
        return this.mTotal;
    }
    
    public void i(final String mMerchantUrl) {
        this.mMerchantUrl = mMerchantUrl;
    }
    
    public String j() {
        return this.mExternalOrderId;
    }
    
    public void j(final String mMerchantPhoneNumber) {
        this.mMerchantPhoneNumber = mMerchantPhoneNumber;
    }
    
    public String k() {
        return this.mMerchantUrl;
    }
    
    public String l() {
        return this.mMerchantPhoneNumber;
    }
    
    public Long m() {
        return this.mTweetId;
    }
}
