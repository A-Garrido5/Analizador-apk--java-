// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.os.Parcel;
import java.math.BigDecimal;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class ProductVariant implements Parcelable, Serializable
{
    public static final Parcelable$Creator CREATOR;
    private String mId;
    private int mInventoryCount;
    private BigDecimal mPrice;
    private String mPriceCurrency;
    private String mShipCurrency;
    private BigDecimal mShipPrice;
    private ShippingType mShippingType;
    private BigDecimal mTax;
    private String mTaxCurrency;
    private TaxType mTaxType;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public ProductVariant() {
    }
    
    private ProductVariant(final Parcel parcel) {
        this.mId = parcel.readString();
        this.mInventoryCount = parcel.readInt();
        this.mPrice = new BigDecimal(parcel.readString());
        this.mPriceCurrency = parcel.readString();
        this.mShipPrice = new BigDecimal(parcel.readString());
        this.mShipCurrency = parcel.readString();
        this.mShippingType = ShippingType.a(parcel.readInt());
        this.mTax = new BigDecimal(parcel.readString());
        this.mTaxCurrency = parcel.readString();
        this.mTaxType = TaxType.a(parcel.readInt());
    }
    
    public String a() {
        return this.mId;
    }
    
    public void a(final int mInventoryCount) {
        this.mInventoryCount = mInventoryCount;
    }
    
    public void a(final ShippingType mShippingType) {
        this.mShippingType = mShippingType;
    }
    
    public void a(final TaxType mTaxType) {
        this.mTaxType = mTaxType;
    }
    
    public void a(final String mId) {
        this.mId = mId;
    }
    
    public void a(final BigDecimal mPrice) {
        this.mPrice = mPrice;
    }
    
    public int b() {
        return this.mInventoryCount;
    }
    
    public void b(final String mPriceCurrency) {
        this.mPriceCurrency = mPriceCurrency;
    }
    
    public void b(final BigDecimal mShipPrice) {
        this.mShipPrice = mShipPrice;
    }
    
    public BigDecimal c() {
        return this.mPrice;
    }
    
    public void c(final String mShipCurrency) {
        this.mShipCurrency = mShipCurrency;
    }
    
    public void c(final BigDecimal mTax) {
        this.mTax = mTax;
    }
    
    public String d() {
        return this.mPriceCurrency;
    }
    
    public void d(final String mTaxCurrency) {
        this.mTaxCurrency = mTaxCurrency;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public BigDecimal e() {
        return this.mShipPrice;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ProductVariant)) {
                return false;
            }
            final ProductVariant productVariant = (ProductVariant)o;
            if (this.mInventoryCount != productVariant.mInventoryCount) {
                return false;
            }
            Label_0064: {
                if (this.mId != null) {
                    if (this.mId.equals(productVariant.mId)) {
                        break Label_0064;
                    }
                }
                else if (productVariant.mId == null) {
                    break Label_0064;
                }
                return false;
            }
            Label_0094: {
                if (this.mPrice != null) {
                    if (this.mPrice.equals(productVariant.mPrice)) {
                        break Label_0094;
                    }
                }
                else if (productVariant.mPrice == null) {
                    break Label_0094;
                }
                return false;
            }
            Label_0124: {
                if (this.mPriceCurrency != null) {
                    if (this.mPriceCurrency.equals(productVariant.mPriceCurrency)) {
                        break Label_0124;
                    }
                }
                else if (productVariant.mPriceCurrency == null) {
                    break Label_0124;
                }
                return false;
            }
            Label_0154: {
                if (this.mShipCurrency != null) {
                    if (this.mShipCurrency.equals(productVariant.mShipCurrency)) {
                        break Label_0154;
                    }
                }
                else if (productVariant.mShipCurrency == null) {
                    break Label_0154;
                }
                return false;
            }
            Label_0184: {
                if (this.mShipPrice != null) {
                    if (this.mShipPrice.equals(productVariant.mShipPrice)) {
                        break Label_0184;
                    }
                }
                else if (productVariant.mShipPrice == null) {
                    break Label_0184;
                }
                return false;
            }
            if (this.mShippingType != productVariant.mShippingType) {
                return false;
            }
            Label_0227: {
                if (this.mTax != null) {
                    if (this.mTax.equals(productVariant.mTax)) {
                        break Label_0227;
                    }
                }
                else if (productVariant.mTax == null) {
                    break Label_0227;
                }
                return false;
            }
            Label_0257: {
                if (this.mTaxCurrency != null) {
                    if (this.mTaxCurrency.equals(productVariant.mTaxCurrency)) {
                        break Label_0257;
                    }
                }
                else if (productVariant.mTaxCurrency == null) {
                    break Label_0257;
                }
                return false;
            }
            if (this.mTaxType != productVariant.mTaxType) {
                return false;
            }
        }
        return true;
    }
    
    public ShippingType f() {
        return this.mShippingType;
    }
    
    public BigDecimal g() {
        return this.mTax;
    }
    
    public TaxType h() {
        return this.mTaxType;
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
        final int n = 31 * (hashCode * 31 + this.mInventoryCount);
        int hashCode2;
        if (this.mPrice != null) {
            hashCode2 = this.mPrice.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.mPriceCurrency != null) {
            hashCode3 = this.mPriceCurrency.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.mShipPrice != null) {
            hashCode4 = this.mShipPrice.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.mShipCurrency != null) {
            hashCode5 = this.mShipCurrency.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.mShippingType != null) {
            hashCode6 = this.mShippingType.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.mTax != null) {
            hashCode7 = this.mTax.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.mTaxCurrency != null) {
            hashCode8 = this.mTaxCurrency.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        final TaxType mTaxType = this.mTaxType;
        int hashCode9 = 0;
        if (mTaxType != null) {
            hashCode9 = this.mTaxType.hashCode();
        }
        return n8 + hashCode9;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.mId);
        parcel.writeInt(this.mInventoryCount);
        parcel.writeString(this.mPrice.toString());
        parcel.writeString(this.mPriceCurrency);
        parcel.writeString(this.mShipPrice.toString());
        parcel.writeString(this.mShipCurrency);
        parcel.writeInt(this.mShippingType.a());
        parcel.writeString(this.mTax.toString());
        parcel.writeString(this.mTaxCurrency);
        parcel.writeInt(this.mTaxType.a());
    }
}
