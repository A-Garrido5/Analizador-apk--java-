// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ExtendedProfile implements Serializable
{
    public final int mBirthDay;
    public final int mBirthMonth;
    public final int mBirthYear;
    public final long mUpdateTime;
    public final long mUserId;
    
    public ExtendedProfile(final x x) {
        this.mUserId = x.a;
        this.mBirthDay = x.b;
        this.mBirthMonth = x.c;
        this.mBirthYear = x.d;
        this.mUpdateTime = x.e;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new ExtendedProfile$SerializationProxy(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final ExtendedProfile extendedProfile = (ExtendedProfile)o;
            if (this.mUserId != extendedProfile.mUserId || this.mBirthDay != extendedProfile.mBirthDay || this.mBirthMonth != extendedProfile.mBirthMonth || this.mBirthYear != extendedProfile.mBirthYear || this.mUpdateTime != extendedProfile.mUpdateTime) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (int)(this.mUserId ^ this.mUserId >>> 32) + this.mBirthDay) + this.mBirthMonth) + this.mBirthYear;
    }
}
