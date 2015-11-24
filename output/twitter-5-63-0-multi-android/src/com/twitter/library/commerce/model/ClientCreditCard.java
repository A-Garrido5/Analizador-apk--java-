// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.List;
import android.text.TextUtils;
import java.io.Serializable;

public class ClientCreditCard extends CreditCard implements Serializable
{
    protected static int a;
    private String mCVC;
    private String mNumber;
    private String mZip;
    
    static {
        ClientCreditCard.a = 4;
    }
    
    @Override
    public CreditCard$Type a() {
        if (this.h() != null) {
            return CreditCard$Type.e(this.h());
        }
        return CreditCard$Type.a;
    }
    
    public void a(final String mZip) {
        this.mZip = mZip;
    }
    
    @Override
    public String b() {
        if (!TextUtils.isEmpty((CharSequence)this.h()) && this.h().length() >= ClientCreditCard.a) {
            return this.h().substring(this.h().length() - ClientCreditCard.a);
        }
        return null;
    }
    
    public void b(final String mcvc) {
        this.mCVC = mcvc;
    }
    
    @Override
    public List c() {
        final List c = super.c();
        if (!this.e()) {
            c.add(lg.commerce_error_invalid_card_number_invalid);
        }
        if (this.g() == null) {
            c.add(lg.commerce_error_invalid_card_ccv_number_empty);
        }
        else if (!this.d()) {
            c.add(lg.commerce_error_invalid_card_ccv_number);
            return c;
        }
        return c;
    }
    
    public void c(final String mNumber) {
        this.mNumber = mNumber;
    }
    
    protected boolean d() {
        return this.g().length() == CreditCard$Type.c(this.h());
    }
    
    protected boolean e() {
        return CreditCard$Type.e(this.h()).d(this.h());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ClientCreditCard)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final ClientCreditCard clientCreditCard = (ClientCreditCard)o;
            Label_0061: {
                if (this.mCVC != null) {
                    if (this.mCVC.equals(clientCreditCard.mCVC)) {
                        break Label_0061;
                    }
                }
                else if (clientCreditCard.mCVC == null) {
                    break Label_0061;
                }
                return false;
            }
            Label_0091: {
                if (this.mNumber != null) {
                    if (this.mNumber.equals(clientCreditCard.mNumber)) {
                        break Label_0091;
                    }
                }
                else if (clientCreditCard.mNumber == null) {
                    break Label_0091;
                }
                return false;
            }
            if (this.mZip != null) {
                if (this.mZip.equals(clientCreditCard.mZip)) {
                    return true;
                }
            }
            else if (clientCreditCard.mZip == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        return this.mZip;
    }
    
    public String g() {
        return this.mCVC;
    }
    
    public String h() {
        return this.mNumber;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.mCVC != null) {
            hashCode = this.mCVC.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.mZip != null) {
            hashCode2 = this.mZip.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        final String mNumber = this.mNumber;
        int hashCode3 = 0;
        if (mNumber != null) {
            hashCode3 = this.mNumber.hashCode();
        }
        return n3 + hashCode3;
    }
}
