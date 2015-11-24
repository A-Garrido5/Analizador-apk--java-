// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.io.Serializable;

public class FeatureSwitchesValue$FeatureSwitchesImpression implements Serializable
{
    private static final long serialVersionUID = 4898440161435254910L;
    private String mBucket;
    private String mExperimentKey;
    private int mVersion;
    
    public FeatureSwitchesValue$FeatureSwitchesImpression(final String mExperimentKey, final int mVersion, final String mBucket) {
        this.mExperimentKey = mExperimentKey;
        this.mVersion = mVersion;
        this.mBucket = mBucket;
    }
    
    public String a() {
        return this.mExperimentKey;
    }
    
    public int b() {
        return this.mVersion;
    }
    
    public String c() {
        return this.mBucket;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.mExperimentKey != null) {
            hashCode = this.mExperimentKey.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = 31 * (hashCode * 31 + this.mVersion);
        final String mBucket = this.mBucket;
        int hashCode2 = 0;
        if (mBucket != null) {
            hashCode2 = this.mBucket.hashCode();
        }
        return n + hashCode2;
    }
}
