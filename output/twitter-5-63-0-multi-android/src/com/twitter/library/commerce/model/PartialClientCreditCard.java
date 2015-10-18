// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.io.Serializable;

public class PartialClientCreditCard extends ClientCreditCard implements Serializable
{
    private String mLastFourDigits;
    private CreditCard$Type mType;
    
    @Override
    public CreditCard$Type a() {
        if (this.mType != null) {
            return this.mType;
        }
        return CreditCard$Type.a;
    }
    
    public void a(final CreditCard$Type mType) {
        this.mType = mType;
    }
    
    public void a(final CreditCard$Type creditCard$Type, final String mLastFourDigits) {
        this.a(creditCard$Type);
        this.mLastFourDigits = mLastFourDigits;
    }
    
    @Override
    public String b() {
        return this.mLastFourDigits;
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    protected boolean d() {
        final CreditCard$Type mType = this.mType;
        boolean b = false;
        if (mType != null) {
            final int length = this.g().length();
            final int c = this.mType.c();
            b = false;
            if (length == c) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    protected boolean e() {
        return this.b().length() == PartialClientCreditCard.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final PartialClientCreditCard partialClientCreditCard = (PartialClientCreditCard)o;
            Label_0069: {
                if (this.mLastFourDigits != null) {
                    if (this.mLastFourDigits.equals(partialClientCreditCard.mLastFourDigits)) {
                        break Label_0069;
                    }
                }
                else if (partialClientCreditCard.mLastFourDigits == null) {
                    break Label_0069;
                }
                return false;
            }
            if (this.mType != partialClientCreditCard.mType) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String h() {
        return "";
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.mLastFourDigits != null) {
            hashCode = this.mLastFourDigits.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final CreditCard$Type mType = this.mType;
        int hashCode2 = 0;
        if (mType != null) {
            hashCode2 = this.mType.hashCode();
        }
        return n2 + hashCode2;
    }
}
