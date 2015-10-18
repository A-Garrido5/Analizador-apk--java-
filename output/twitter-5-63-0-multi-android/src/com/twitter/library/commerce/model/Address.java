// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;
import java.io.Serializable;

public class Address implements Serializable
{
    private String mAddressHint;
    private String mAddressLine1;
    private String mAddressLine2;
    private String mCity;
    private String mCountryCode;
    private boolean mDefault;
    private String mId;
    private String mName;
    private String mState;
    private String mZip;
    
    private String a(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        return s + s2;
    }
    
    private String j(final String s) {
        return this.a(s, " ");
    }
    
    public List a() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        if (TextUtils.isEmpty((CharSequence)this.mName)) {
            list.add(lg.commerce_error_invalid_address_name);
        }
        if (TextUtils.isEmpty((CharSequence)this.mAddressLine1)) {
            list.add(lg.commerce_error_invalid_address_address);
        }
        if (this.mCountryCode == null) {
            list.add(lg.commerce_error_invalid_address_country);
        }
        if (TextUtils.isEmpty((CharSequence)this.mCity)) {
            list.add(lg.commerce_error_invalid_address_city);
        }
        if (this.mCountryCode != null && this.mCountryCode.equals("US")) {
            if (TextUtils.isEmpty((CharSequence)this.mState)) {
                list.add(lg.commerce_error_invalid_address_state);
            }
            if (TextUtils.isEmpty((CharSequence)this.mZip)) {
                list.add(lg.commerce_error_invalid_address_zip);
            }
        }
        return list;
    }
    
    public void a(final String mAddressLine1) {
        this.mAddressLine1 = mAddressLine1;
    }
    
    public void a(final boolean mDefault) {
        this.mDefault = mDefault;
    }
    
    public String b() {
        return this.mAddressLine1;
    }
    
    public void b(final String mAddressLine2) {
        this.mAddressLine2 = mAddressLine2;
    }
    
    public String c() {
        return this.mAddressLine2;
    }
    
    public void c(final String mCountryCode) {
        this.mCountryCode = mCountryCode;
    }
    
    public String d() {
        return this.mCountryCode;
    }
    
    public void d(final String mCity) {
        this.mCity = mCity;
    }
    
    public String e() {
        return this.mCity;
    }
    
    public void e(final String mState) {
        this.mState = mState;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Address)) {
                return false;
            }
            final Address address = (Address)o;
            if (this.mDefault != address.mDefault) {
                return false;
            }
            Label_0064: {
                if (this.mAddressHint != null) {
                    if (this.mAddressHint.equals(address.mAddressHint)) {
                        break Label_0064;
                    }
                }
                else if (address.mAddressHint == null) {
                    break Label_0064;
                }
                return false;
            }
            Label_0094: {
                if (this.mAddressLine1 != null) {
                    if (this.mAddressLine1.equals(address.mAddressLine1)) {
                        break Label_0094;
                    }
                }
                else if (address.mAddressLine1 == null) {
                    break Label_0094;
                }
                return false;
            }
            Label_0124: {
                if (this.mAddressLine2 != null) {
                    if (this.mAddressLine2.equals(address.mAddressLine2)) {
                        break Label_0124;
                    }
                }
                else if (address.mAddressLine2 == null) {
                    break Label_0124;
                }
                return false;
            }
            Label_0154: {
                if (this.mCity != null) {
                    if (this.mCity.equals(address.mCity)) {
                        break Label_0154;
                    }
                }
                else if (address.mCity == null) {
                    break Label_0154;
                }
                return false;
            }
            Label_0184: {
                if (this.mCountryCode != null) {
                    if (this.mCountryCode.equals(address.mCountryCode)) {
                        break Label_0184;
                    }
                }
                else if (address.mCountryCode == null) {
                    break Label_0184;
                }
                return false;
            }
            Label_0214: {
                if (this.mId != null) {
                    if (this.mId.equals(address.mId)) {
                        break Label_0214;
                    }
                }
                else if (address.mId == null) {
                    break Label_0214;
                }
                return false;
            }
            Label_0244: {
                if (this.mName != null) {
                    if (this.mName.equals(address.mName)) {
                        break Label_0244;
                    }
                }
                else if (address.mName == null) {
                    break Label_0244;
                }
                return false;
            }
            Label_0274: {
                if (this.mState != null) {
                    if (this.mState.equals(address.mState)) {
                        break Label_0274;
                    }
                }
                else if (address.mState == null) {
                    break Label_0274;
                }
                return false;
            }
            if (this.mZip != null) {
                if (this.mZip.equals(address.mZip)) {
                    return true;
                }
            }
            else if (address.mZip == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        return this.mState;
    }
    
    public void f(final String mZip) {
        this.mZip = mZip;
    }
    
    public String g() {
        return this.mZip;
    }
    
    public void g(final String mId) {
        this.mId = mId;
    }
    
    public String h() {
        return this.mId;
    }
    
    public void h(final String mAddressHint) {
        this.mAddressHint = mAddressHint;
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
        if (this.mName != null) {
            hashCode2 = this.mName.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.mAddressHint != null) {
            hashCode3 = this.mAddressHint.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.mAddressLine1 != null) {
            hashCode4 = this.mAddressLine1.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.mAddressLine2 != null) {
            hashCode5 = this.mAddressLine2.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.mCountryCode != null) {
            hashCode6 = this.mCountryCode.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.mCity != null) {
            hashCode7 = this.mCity.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.mState != null) {
            hashCode8 = this.mState.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        int hashCode9;
        if (this.mZip != null) {
            hashCode9 = this.mZip.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n9 = 31 * (hashCode9 + n8);
        final boolean mDefault = this.mDefault;
        int n10 = 0;
        if (mDefault) {
            n10 = 1;
        }
        return n9 + n10;
    }
    
    public String i() {
        return this.mAddressHint;
    }
    
    public void i(final String mName) {
        this.mName = mName;
    }
    
    public boolean j() {
        return this.mDefault;
    }
    
    public String k() {
        return this.mName;
    }
    
    @Override
    public String toString() {
        final String format = String.format("%n", new Object[0]);
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a(this.k(), format));
        sb.append(this.a(this.b(), " "));
        sb.append(this.j(this.c()));
        sb.append(format);
        sb.append(this.a(this.e(), ", "));
        sb.append(this.a(this.f(), " "));
        sb.append(this.j(this.g()));
        sb.append(format);
        sb.append(this.j(this.d()));
        return sb.toString();
    }
}
