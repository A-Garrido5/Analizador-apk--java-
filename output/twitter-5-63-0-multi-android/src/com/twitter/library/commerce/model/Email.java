// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import com.twitter.library.util.text.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Email implements Serializable
{
    private String mId;
    private boolean mIsDefault;
    private boolean mIsLoginEmail;
    private String mValue;
    
    public String a() {
        return this.mValue;
    }
    
    public void a(final String mValue) {
        this.mValue = mValue;
    }
    
    public void a(final boolean mIsDefault) {
        this.mIsDefault = mIsDefault;
    }
    
    public void b(final String mId) {
        this.mId = mId;
    }
    
    public void b(final boolean mIsLoginEmail) {
        this.mIsLoginEmail = mIsLoginEmail;
    }
    
    public boolean b() {
        return this.mIsDefault;
    }
    
    public List c() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        if (TextUtils.isEmpty((CharSequence)this.mValue)) {
            list.add(lg.commerce_error_empty_email);
        }
        else if (!a.c.matcher(this.mValue).matches()) {
            list.add(lg.commerce_error_invalid_email);
            return list;
        }
        return list;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Email email = (Email)o;
            if (this.mIsDefault != email.mIsDefault) {
                return false;
            }
            if (this.mIsLoginEmail != email.mIsLoginEmail) {
                return false;
            }
            Label_0085: {
                if (this.mId != null) {
                    if (this.mId.equals(email.mId)) {
                        break Label_0085;
                    }
                }
                else if (email.mId == null) {
                    break Label_0085;
                }
                return false;
            }
            if (this.mValue != null) {
                if (this.mValue.equals(email.mValue)) {
                    return true;
                }
            }
            else if (email.mValue == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        int hashCode;
        if (this.mId != null) {
            hashCode = this.mId.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = hashCode * 31;
        int hashCode2;
        if (this.mValue != null) {
            hashCode2 = this.mValue.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int n4;
        if (this.mIsDefault) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        final int n5 = 31 * (n4 + n3);
        if (!this.mIsLoginEmail) {
            n = 0;
        }
        return n5 + n;
    }
    
    @Override
    public String toString() {
        return this.mValue;
    }
}
