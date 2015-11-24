// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.List;
import java.io.Serializable;

public class OfferDetails implements Serializable
{
    private long mOfferExpirationDate;
    private String mOfferId;
    private long mOfferStartDate;
    private OfferDetails$OfferStatus mOfferStatus;
    private boolean mOfferValid;
    private List mSupportedCards;
    
    public OfferDetails() {
        this.mOfferStatus = OfferDetails$OfferStatus.a;
    }
    
    public String a() {
        return this.mOfferId;
    }
    
    public void a(final long mOfferExpirationDate) {
        this.mOfferExpirationDate = mOfferExpirationDate;
    }
    
    public void a(final OfferDetails$OfferStatus mOfferStatus) {
        this.mOfferStatus = mOfferStatus;
    }
    
    public void a(final String mOfferId) {
        this.mOfferId = mOfferId;
    }
    
    public void a(final List mSupportedCards) {
        this.mSupportedCards = mSupportedCards;
    }
    
    public void a(final boolean mOfferValid) {
        this.mOfferValid = mOfferValid;
    }
    
    public void b(final long mOfferStartDate) {
        this.mOfferStartDate = mOfferStartDate;
    }
    
    public boolean b() {
        return this.mOfferValid;
    }
    
    public long c() {
        return this.mOfferExpirationDate;
    }
    
    public long d() {
        return this.mOfferStartDate;
    }
    
    public OfferDetails$OfferStatus e() {
        return this.mOfferStatus;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof OfferDetails)) {
                return false;
            }
            final OfferDetails offerDetails = (OfferDetails)o;
            if (this.mOfferExpirationDate != offerDetails.mOfferExpirationDate) {
                return false;
            }
            if (this.mOfferStartDate != offerDetails.mOfferStartDate) {
                return false;
            }
            if (this.mOfferValid != offerDetails.mOfferValid) {
                return false;
            }
            Label_0092: {
                if (this.mOfferId != null) {
                    if (this.mOfferId.equals(offerDetails.mOfferId)) {
                        break Label_0092;
                    }
                }
                else if (offerDetails.mOfferId == null) {
                    break Label_0092;
                }
                return false;
            }
            if (this.mOfferStatus != offerDetails.mOfferStatus) {
                return false;
            }
            if (this.mSupportedCards != null) {
                if (this.mSupportedCards.equals(offerDetails.mSupportedCards)) {
                    return true;
                }
            }
            else if (offerDetails.mSupportedCards == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public List f() {
        return this.mSupportedCards;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.mOfferId != null) {
            hashCode = this.mOfferId.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final boolean mOfferValid = this.mOfferValid;
        int n2 = 0;
        if (mOfferValid) {
            n2 = 1;
        }
        return 31 * (31 * (n + n2) + (int)(this.mOfferExpirationDate ^ this.mOfferExpirationDate >>> 32)) + (int)(this.mOfferStartDate ^ this.mOfferStartDate >>> 32);
    }
}
