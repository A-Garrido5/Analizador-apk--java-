// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Serializable;
import com.twitter.util.f;
import java.util.HashMap;
import java.io.Externalizable;

public class PromotedContent implements Externalizable
{
    private static final long serialVersionUID = -3056474709914061834L;
    public long advertiserId;
    public String advertiserName;
    public String disclosureType;
    public HashMap experimentValues;
    public String impressionId;
    public boolean isPAcInTimeline;
    public boolean isPromotedTrend;
    public boolean isSuppressMediaForward;
    public long promotedTrendId;
    public String socialContext;
    
    public PromotedContent() {
        this.experimentValues = new HashMap();
    }
    
    public boolean a() {
        return "political".equals(this.disclosureType);
    }
    
    public boolean b() {
        return "earned".equals(this.disclosureType);
    }
    
    public void c() {
        this.disclosureType = "earned";
    }
    
    public boolean d() {
        return this.isPromotedTrend;
    }
    
    public byte[] e() {
        return f.a(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final PromotedContent promotedContent = (PromotedContent)o;
            if (this.impressionId != null) {
                if (this.impressionId.equals(promotedContent.impressionId)) {
                    return true;
                }
            }
            else if (promotedContent.impressionId == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.impressionId != null) {
            return this.impressionId.hashCode();
        }
        return 0;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.impressionId = (String)objectInput.readObject();
        this.disclosureType = (String)objectInput.readObject();
        this.promotedTrendId = objectInput.readLong();
        this.socialContext = (String)objectInput.readObject();
        this.advertiserName = (String)objectInput.readObject();
        this.isPAcInTimeline = objectInput.readBoolean();
        this.isSuppressMediaForward = objectInput.readBoolean();
        this.experimentValues = (HashMap)objectInput.readObject();
        this.advertiserId = objectInput.readLong();
        this.isPromotedTrend = objectInput.readBoolean();
    }
    
    @Override
    public String toString() {
        return "impressionId: " + this.impressionId + ", disclosureType: " + this.disclosureType + ", isPromotedTrend: " + this.isPromotedTrend + ", promotedTrendId: " + this.promotedTrendId + ", socialContext: " + this.socialContext + ", advertiserName: " + this.advertiserName + ", advertiserId: " + this.advertiserId + ", isPAcInTimeline: " + this.isPAcInTimeline + ", isSuppressMediaForward: " + this.isSuppressMediaForward + ", expValues: " + this.experimentValues;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.impressionId);
        objectOutput.writeObject(this.disclosureType);
        objectOutput.writeLong(this.promotedTrendId);
        objectOutput.writeObject(this.socialContext);
        objectOutput.writeObject(this.advertiserName);
        objectOutput.writeBoolean(this.isPAcInTimeline);
        objectOutput.writeBoolean(this.isSuppressMediaForward);
        objectOutput.writeObject(this.experimentValues);
        objectOutput.writeLong(this.advertiserId);
        objectOutput.writeBoolean(this.isPromotedTrend);
    }
}
