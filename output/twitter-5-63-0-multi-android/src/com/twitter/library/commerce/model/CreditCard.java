// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.text.TextUtils;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public abstract class CreditCard implements Serializable
{
    private Address mAddress;
    private String mAddressId;
    private String mAlias;
    private String mId;
    private boolean mIsAvailableBuyNow;
    private boolean mIsAvailableOffers;
    private boolean mIsDefault;
    private Integer mMonth;
    private Integer mYear;
    
    public static boolean a(final CreditCard creditCard, final List list) {
        if (list != null && list.size() > 0) {
            return list.contains(creditCard.a());
        }
        return creditCard.a() != CreditCard$Type.a;
    }
    
    public abstract CreditCard$Type a();
    
    public void a(final Address mAddress) {
        this.mAddress = mAddress;
    }
    
    public void a(final Integer mMonth) {
        this.mMonth = mMonth;
    }
    
    public void a(final boolean mIsDefault) {
        this.mIsDefault = mIsDefault;
    }
    
    public abstract String b();
    
    public void b(final Integer mYear) {
        this.mYear = mYear;
    }
    
    public void b(final boolean mIsAvailableBuyNow) {
        this.mIsAvailableBuyNow = mIsAvailableBuyNow;
    }
    
    public List c() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        if (this.j() == null) {
            list.add(lg.commerce_error_invalid_card_month_empty);
        }
        else if (this.j() < 1 || this.j() > 12) {
            list.add(lg.commerce_error_invalid_card_month);
        }
        if (this.k() == null) {
            list.add(lg.commerce_error_invalid_card_year_empty);
        }
        else {
            final int value = Calendar.getInstance().get(1);
            final int n = 1 + Calendar.getInstance().get(2);
            if (this.k() < value) {
                list.add(lg.commerce_error_invalid_card_year);
                return list;
            }
            if (this.k() == value && this.j() < n) {
                list.add(lg.commerce_error_invalid_card_expired);
                return list;
            }
        }
        return list;
    }
    
    public void c(final boolean mIsAvailableOffers) {
        this.mIsAvailableOffers = mIsAvailableOffers;
    }
    
    public void d(final String mId) {
        this.mId = mId;
    }
    
    public void e(final String mAddressId) {
        this.mAddressId = mAddressId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CreditCard)) {
                return false;
            }
            final CreditCard creditCard = (CreditCard)o;
            if (this.mIsDefault != creditCard.mIsDefault) {
                return false;
            }
            Label_0064: {
                if (this.mAddress != null) {
                    if (this.mAddress.equals(creditCard.mAddress)) {
                        break Label_0064;
                    }
                }
                else if (creditCard.mAddress == null) {
                    break Label_0064;
                }
                return false;
            }
            Label_0094: {
                if (this.mAddressId != null) {
                    if (this.mAddressId.equals(creditCard.mAddressId)) {
                        break Label_0094;
                    }
                }
                else if (creditCard.mAddressId == null) {
                    break Label_0094;
                }
                return false;
            }
            Label_0124: {
                if (this.mAlias != null) {
                    if (this.mAlias.equals(creditCard.mAlias)) {
                        break Label_0124;
                    }
                }
                else if (creditCard.mAlias == null) {
                    break Label_0124;
                }
                return false;
            }
            Label_0154: {
                if (this.mId != null) {
                    if (this.mId.equals(creditCard.mId)) {
                        break Label_0154;
                    }
                }
                else if (creditCard.mId == null) {
                    break Label_0154;
                }
                return false;
            }
            Label_0184: {
                if (this.mMonth != null) {
                    if (this.mMonth.equals(creditCard.mMonth)) {
                        break Label_0184;
                    }
                }
                else if (creditCard.mMonth == null) {
                    break Label_0184;
                }
                return false;
            }
            if (this.mYear != null) {
                if (this.mYear.equals(creditCard.mYear)) {
                    return true;
                }
            }
            else if (creditCard.mYear == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.mId != null) {
            hashCode = this.mId.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.mAlias != null) {
            hashCode2 = this.mAlias.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.mMonth != null) {
            hashCode3 = this.mMonth.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.mYear != null) {
            hashCode4 = this.mYear.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.mAddress != null) {
            hashCode5 = this.mAddress.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.mAddressId != null) {
            hashCode6 = this.mAddressId.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        final boolean mIsDefault = this.mIsDefault;
        int n7 = 0;
        if (mIsDefault) {
            n7 = 1;
        }
        return n6 + n7;
    }
    
    public String i() {
        return this.mId;
    }
    
    public Integer j() {
        return this.mMonth;
    }
    
    public Integer k() {
        return this.mYear;
    }
    
    public boolean l() {
        return this.mIsDefault;
    }
    
    public boolean m() {
        return this.mIsAvailableBuyNow;
    }
    
    public boolean n() {
        return this.mIsAvailableOffers;
    }
    
    public String o() {
        return this.mAddressId;
    }
    
    @Override
    public String toString() {
        if (!TextUtils.isEmpty((CharSequence)this.mAlias)) {
            return this.mAlias;
        }
        String s = null;
        switch (c.a[this.a().ordinal()]) {
            default: {
                s = "CARD";
                break;
            }
            case 1: {
                s = "AMEX";
                break;
            }
            case 2: {
                s = "VISA";
                break;
            }
            case 3: {
                s = "MASTERCARD";
                break;
            }
            case 4: {
                s = "JCB";
                break;
            }
            case 5: {
                s = "DINERS";
                break;
            }
            case 6: {
                s = "DISCOVER";
                break;
            }
        }
        return s + " ending in " + this.b();
    }
}
