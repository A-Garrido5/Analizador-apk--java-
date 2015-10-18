// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.math.BigDecimal;
import java.io.Serializable;

public class OrderItem implements Serializable
{
    private CreditCard mPaymentMethod;
    private BigDecimal mPrice;
    private String mPriceCurrency;
    private String mProductDescription;
    private String mProductSku;
    private int mQuantity;
    private String mShipCurrency;
    private BigDecimal mShipPrice;
    private Address mShippingAddress;
    private String mShippingType;
    private BigDecimal mTax;
    private String mTaxCurrency;
    private String mTaxType;
    
    public void a(final int mQuantity) {
        this.mQuantity = mQuantity;
    }
    
    public void a(final Address mShippingAddress) {
        this.mShippingAddress = mShippingAddress;
    }
    
    public void a(final CreditCard mPaymentMethod) {
        this.mPaymentMethod = mPaymentMethod;
    }
    
    public void b(final BigDecimal mPrice) {
        this.mPrice = mPrice;
    }
    
    public void c(final BigDecimal mTax) {
        this.mTax = mTax;
    }
    
    public void d(final BigDecimal mShipPrice) {
        this.mShipPrice = mShipPrice;
    }
    
    public void k(final String mShippingType) {
        this.mShippingType = mShippingType;
    }
    
    public void l(final String mTaxType) {
        this.mTaxType = mTaxType;
    }
    
    public void m(final String mPriceCurrency) {
        this.mPriceCurrency = mPriceCurrency;
    }
    
    public BigDecimal n() {
        return this.mPrice;
    }
    
    public void n(final String mTaxCurrency) {
        this.mTaxCurrency = mTaxCurrency;
    }
    
    public BigDecimal o() {
        return this.mTax;
    }
    
    public void o(final String mShipCurrency) {
        this.mShipCurrency = mShipCurrency;
    }
    
    public Address p() {
        return this.mShippingAddress;
    }
    
    public CreditCard q() {
        return this.mPaymentMethod;
    }
    
    public BigDecimal r() {
        return this.mShipPrice;
    }
    
    public String s() {
        return this.mTaxType;
    }
}
