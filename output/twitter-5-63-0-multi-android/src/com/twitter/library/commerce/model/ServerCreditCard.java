// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.text.TextUtils;
import java.util.List;

public class ServerCreditCard extends CreditCard
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
    public List c() {
        final List c = super.c();
        if (TextUtils.isEmpty((CharSequence)this.b())) {
            c.add(lg.commerce_error_invalid_card_last_four_digits);
        }
        return c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ServerCreditCard)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final ServerCreditCard serverCreditCard = (ServerCreditCard)o;
            Label_0061: {
                if (this.mLastFourDigits != null) {
                    if (this.mLastFourDigits.equals(serverCreditCard.mLastFourDigits)) {
                        break Label_0061;
                    }
                }
                else if (serverCreditCard.mLastFourDigits == null) {
                    break Label_0061;
                }
                return false;
            }
            if (this.mType != serverCreditCard.mType) {
                return false;
            }
        }
        return true;
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
