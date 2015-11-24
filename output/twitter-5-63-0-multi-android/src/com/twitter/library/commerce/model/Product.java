// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.text.TextUtils;
import android.content.Context;
import java.math.BigDecimal;
import java.util.List;
import java.io.Serializable;

public class Product implements Serializable
{
    private String mCardUrl;
    private String mDescription;
    private String mDestinationUrl;
    private String mId;
    private List mImages;
    private String mMediaSearchString;
    private String mName;
    private BigDecimal mPrice;
    private List mRelatedTweets;
    private String mSoldBy;
    private String mTweetSearchString;
    
    private String b(final Context context) {
        final String b = rl.b(context);
        String a = rl.a(context);
        if (TextUtils.isEmpty((CharSequence)a)) {
            a = b;
        }
        if (TextUtils.isEmpty((CharSequence)a)) {
            return "";
        }
        return String.format("https://%s/pages/shop/%s", a, this.a());
    }
    
    public String a() {
        return this.mId;
    }
    
    public String a(final Context context) {
        if (!TextUtils.isEmpty((CharSequence)this.k())) {
            return this.k();
        }
        return this.b(context);
    }
    
    public void a(final String mId) {
        this.mId = mId;
    }
    
    public void a(final BigDecimal mPrice) {
        this.mPrice = mPrice;
    }
    
    public void a(final List mImages) {
        this.mImages = mImages;
    }
    
    public List b() {
        return this.mImages;
    }
    
    public void b(final String mName) {
        this.mName = mName;
    }
    
    public void b(final List mRelatedTweets) {
        this.mRelatedTweets = mRelatedTweets;
    }
    
    public String c() {
        return this.mName;
    }
    
    public void c(final String mDescription) {
        this.mDescription = mDescription;
    }
    
    public String d() {
        return this.mDescription;
    }
    
    public void d(final String mSoldBy) {
        this.mSoldBy = mSoldBy;
    }
    
    public BigDecimal e() {
        return this.mPrice;
    }
    
    public void e(final String mTweetSearchString) {
        this.mTweetSearchString = mTweetSearchString;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Product product = (Product)o;
            Label_0059: {
                if (this.mCardUrl != null) {
                    if (this.mCardUrl.equals(product.mCardUrl)) {
                        break Label_0059;
                    }
                }
                else if (product.mCardUrl == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.mDescription != null) {
                    if (this.mDescription.equals(product.mDescription)) {
                        break Label_0089;
                    }
                }
                else if (product.mDescription == null) {
                    break Label_0089;
                }
                return false;
            }
            Label_0119: {
                if (this.mDestinationUrl != null) {
                    if (this.mDestinationUrl.equals(product.mDestinationUrl)) {
                        break Label_0119;
                    }
                }
                else if (product.mDestinationUrl == null) {
                    break Label_0119;
                }
                return false;
            }
            Label_0149: {
                if (this.mId != null) {
                    if (this.mId.equals(product.mId)) {
                        break Label_0149;
                    }
                }
                else if (product.mId == null) {
                    break Label_0149;
                }
                return false;
            }
            Label_0181: {
                if (this.mImages != null) {
                    if (this.mImages.equals(product.mImages)) {
                        break Label_0181;
                    }
                }
                else if (product.mImages == null) {
                    break Label_0181;
                }
                return false;
            }
            Label_0211: {
                if (this.mMediaSearchString != null) {
                    if (this.mMediaSearchString.equals(product.mMediaSearchString)) {
                        break Label_0211;
                    }
                }
                else if (product.mMediaSearchString == null) {
                    break Label_0211;
                }
                return false;
            }
            Label_0241: {
                if (this.mName != null) {
                    if (this.mName.equals(product.mName)) {
                        break Label_0241;
                    }
                }
                else if (product.mName == null) {
                    break Label_0241;
                }
                return false;
            }
            Label_0271: {
                if (this.mPrice != null) {
                    if (this.mPrice.equals(product.mPrice)) {
                        break Label_0271;
                    }
                }
                else if (product.mPrice == null) {
                    break Label_0271;
                }
                return false;
            }
            Label_0303: {
                if (this.mRelatedTweets != null) {
                    if (this.mRelatedTweets.equals(product.mRelatedTweets)) {
                        break Label_0303;
                    }
                }
                else if (product.mRelatedTweets == null) {
                    break Label_0303;
                }
                return false;
            }
            Label_0333: {
                if (this.mSoldBy != null) {
                    if (this.mSoldBy.equals(product.mSoldBy)) {
                        break Label_0333;
                    }
                }
                else if (product.mSoldBy == null) {
                    break Label_0333;
                }
                return false;
            }
            if (this.mTweetSearchString != null) {
                if (this.mTweetSearchString.equals(product.mTweetSearchString)) {
                    return true;
                }
            }
            else if (product.mTweetSearchString == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        return this.mSoldBy;
    }
    
    public void f(final String mMediaSearchString) {
        this.mMediaSearchString = mMediaSearchString;
    }
    
    public String g() {
        return this.mTweetSearchString;
    }
    
    public void g(final String mDestinationUrl) {
        this.mDestinationUrl = mDestinationUrl;
    }
    
    public String h() {
        return this.mMediaSearchString;
    }
    
    public void h(final String mCardUrl) {
        this.mCardUrl = mCardUrl;
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
        if (this.mImages != null) {
            hashCode2 = this.mImages.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.mName != null) {
            hashCode3 = this.mName.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.mDescription != null) {
            hashCode4 = this.mDescription.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.mPrice != null) {
            hashCode5 = this.mPrice.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.mSoldBy != null) {
            hashCode6 = this.mSoldBy.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.mTweetSearchString != null) {
            hashCode7 = this.mTweetSearchString.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.mMediaSearchString != null) {
            hashCode8 = this.mMediaSearchString.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        int hashCode9;
        if (this.mRelatedTweets != null) {
            hashCode9 = this.mRelatedTweets.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n9 = 31 * (hashCode9 + n8);
        int hashCode10;
        if (this.mDestinationUrl != null) {
            hashCode10 = this.mDestinationUrl.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n10 = 31 * (hashCode10 + n9);
        final String mCardUrl = this.mCardUrl;
        int hashCode11 = 0;
        if (mCardUrl != null) {
            hashCode11 = this.mCardUrl.hashCode();
        }
        return n10 + hashCode11;
    }
    
    public List i() {
        return this.mRelatedTweets;
    }
    
    public String j() {
        return this.mDestinationUrl;
    }
    
    public String k() {
        return this.mCardUrl;
    }
}
