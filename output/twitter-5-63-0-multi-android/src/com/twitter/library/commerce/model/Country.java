// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.io.Serializable;

public class Country implements Serializable, Comparable
{
    private String mCountryDescription;
    private String mLongCountryCode;
    private String mShortCountryCode;
    
    public Country(final String mShortCountryCode, final String mLongCountryCode, final String mCountryDescription) {
        this.mShortCountryCode = mShortCountryCode;
        this.mLongCountryCode = mLongCountryCode;
        this.mCountryDescription = mCountryDescription;
    }
    
    public int a(final Country country) {
        return this.b().compareTo(country.b());
    }
    
    public String a() {
        return this.mShortCountryCode;
    }
    
    public String b() {
        return this.mCountryDescription;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Country)) {
                return false;
            }
            final Country country = (Country)o;
            if (!this.mCountryDescription.equals(country.mCountryDescription)) {
                return false;
            }
            if (!this.mLongCountryCode.equals(country.mLongCountryCode)) {
                return false;
            }
            if (!this.mShortCountryCode.equals(country.mShortCountryCode)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.mShortCountryCode.hashCode() + this.mLongCountryCode.hashCode()) + this.mCountryDescription.hashCode();
    }
    
    @Override
    public String toString() {
        return this.b();
    }
}
