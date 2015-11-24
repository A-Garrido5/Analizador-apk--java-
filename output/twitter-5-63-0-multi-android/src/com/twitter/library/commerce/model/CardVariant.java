// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.ArrayList;
import java.io.Serializable;

public class CardVariant implements Serializable
{
    private ArrayList mAttributes;
    private String mDescription;
    private String mId;
    private String mImageUrl;
    private String mInventoryCount;
    private String mLastUpdated;
    private String mPrice;
    private ProductVariant mProductVariant;
    private String mTaxCategory;
    private String mTitle;
    
    public CardVariant() {
        this.mAttributes = new ArrayList();
    }
    
    public String a() {
        return this.mId;
    }
    
    public void a(final int n, final String s) {
        if (n >= this.mAttributes.size()) {
            a.a(this.mAttributes, n + 1);
        }
        this.mAttributes.set(n, s);
    }
    
    public void a(final ProductVariant mProductVariant) {
        this.mProductVariant = mProductVariant;
    }
    
    public void a(final String mId) {
        this.mId = mId;
    }
    
    public String b() {
        return this.mPrice;
    }
    
    public void b(final String mTitle) {
        this.mTitle = mTitle;
    }
    
    public String c() {
        return this.mImageUrl;
    }
    
    public void c(final String mDescription) {
        this.mDescription = mDescription;
    }
    
    public ProductVariant d() {
        return this.mProductVariant;
    }
    
    public void d(final String mInventoryCount) {
        this.mInventoryCount = mInventoryCount;
    }
    
    public final ArrayList e() {
        return this.mAttributes;
    }
    
    public void e(final String mLastUpdated) {
        this.mLastUpdated = mLastUpdated;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CardVariant)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final CardVariant cardVariant = (CardVariant)o;
            if (!this.mAttributes.equals(cardVariant.mAttributes)) {
                return false;
            }
            if (!this.mDescription.equals(cardVariant.mDescription)) {
                return false;
            }
            if (!this.mId.equals(cardVariant.mId)) {
                return false;
            }
            if (!this.mImageUrl.equals(cardVariant.mImageUrl)) {
                return false;
            }
            if (!this.mInventoryCount.equals(cardVariant.mInventoryCount)) {
                return false;
            }
            if (!this.mLastUpdated.equals(cardVariant.mLastUpdated)) {
                return false;
            }
            if (!this.mPrice.equals(cardVariant.mPrice)) {
                return false;
            }
            if (!this.mTaxCategory.equals(cardVariant.mTaxCategory)) {
                return false;
            }
            if (!this.mTitle.equals(cardVariant.mTitle)) {
                return false;
            }
            if (!this.mProductVariant.equals(cardVariant.mProductVariant)) {
                return false;
            }
        }
        return true;
    }
    
    public void f(final String mPrice) {
        this.mPrice = mPrice;
    }
    
    public void g(final String mTaxCategory) {
        this.mTaxCategory = mTaxCategory;
    }
    
    public void h(final String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * this.mId.hashCode() + this.mTitle.hashCode()) + this.mDescription.hashCode()) + this.mInventoryCount.hashCode()) + this.mLastUpdated.hashCode()) + this.mPrice.hashCode()) + this.mTaxCategory.hashCode()) + this.mImageUrl.hashCode()) + this.mAttributes.hashCode()) + this.mProductVariant.hashCode();
    }
}
