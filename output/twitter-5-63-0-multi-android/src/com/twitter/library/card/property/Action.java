// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class Action implements Externalizable
{
    private static final long serialVersionUID = -2911364245704987621L;
    public int actionType;
    public ApiRequest apiRequest;
    public String appId;
    public String appUrl;
    public String debugId;
    public String displayAppUrl;
    public String displayUrl;
    public int failureActionId;
    public int formId;
    public int id;
    public String phoneNumber;
    public String phoneNumberUrl;
    public PurchaseRequest purchaseRequest;
    public String scribeAction;
    public String scribeElement;
    public StylePair[] stylePairs;
    public int successActionId;
    public int tokenizedTextId;
    public String url;
    public long userId;
    public int validationStatus;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Action)) {
                return false;
            }
            final Action action = (Action)o;
            if (this.actionType != action.actionType) {
                return false;
            }
            if (this.failureActionId != action.failureActionId) {
                return false;
            }
            if (this.id != action.id) {
                return false;
            }
            if (this.successActionId != action.successActionId) {
                return false;
            }
            if (this.tokenizedTextId != action.tokenizedTextId) {
                return false;
            }
            if (this.userId != action.userId) {
                return false;
            }
            Label_0130: {
                if (this.apiRequest != null) {
                    if (this.apiRequest.equals(action.apiRequest)) {
                        break Label_0130;
                    }
                }
                else if (action.apiRequest == null) {
                    break Label_0130;
                }
                return false;
            }
            Label_0160: {
                if (this.purchaseRequest != null) {
                    if (this.purchaseRequest.equals(action.purchaseRequest)) {
                        break Label_0160;
                    }
                }
                else if (action.purchaseRequest == null) {
                    break Label_0160;
                }
                return false;
            }
            Label_0190: {
                if (this.appId != null) {
                    if (this.appId.equals(action.appId)) {
                        break Label_0190;
                    }
                }
                else if (action.appId == null) {
                    break Label_0190;
                }
                return false;
            }
            Label_0220: {
                if (this.appUrl != null) {
                    if (this.appUrl.equals(action.appUrl)) {
                        break Label_0220;
                    }
                }
                else if (action.appUrl == null) {
                    break Label_0220;
                }
                return false;
            }
            Label_0250: {
                if (this.displayAppUrl != null) {
                    if (this.displayAppUrl.equals(action.displayAppUrl)) {
                        break Label_0250;
                    }
                }
                else if (action.displayAppUrl == null) {
                    break Label_0250;
                }
                return false;
            }
            Label_0280: {
                if (this.displayUrl != null) {
                    if (this.displayUrl.equals(action.displayUrl)) {
                        break Label_0280;
                    }
                }
                else if (action.displayUrl == null) {
                    break Label_0280;
                }
                return false;
            }
            Label_0310: {
                if (this.phoneNumber != null) {
                    if (this.phoneNumber.equals(action.phoneNumber)) {
                        break Label_0310;
                    }
                }
                else if (action.phoneNumber == null) {
                    break Label_0310;
                }
                return false;
            }
            Label_0340: {
                if (this.phoneNumberUrl != null) {
                    if (this.phoneNumberUrl.equals(action.phoneNumberUrl)) {
                        break Label_0340;
                    }
                }
                else if (action.phoneNumberUrl == null) {
                    break Label_0340;
                }
                return false;
            }
            Label_0370: {
                if (this.scribeAction != null) {
                    if (this.scribeAction.equals(action.scribeAction)) {
                        break Label_0370;
                    }
                }
                else if (action.scribeAction == null) {
                    break Label_0370;
                }
                return false;
            }
            Label_0400: {
                if (this.scribeElement != null) {
                    if (this.scribeElement.equals(action.scribeElement)) {
                        break Label_0400;
                    }
                }
                else if (action.scribeElement == null) {
                    break Label_0400;
                }
                return false;
            }
            if (!Arrays.equals(this.stylePairs, action.stylePairs)) {
                return false;
            }
            Label_0446: {
                if (this.url != null) {
                    if (this.url.equals(action.url)) {
                        break Label_0446;
                    }
                }
                else if (action.url == null) {
                    break Label_0446;
                }
                return false;
            }
            if (this.formId != action.formId) {
                return false;
            }
            if (this.debugId != null) {
                if (this.debugId.equals(action.debugId)) {
                    return true;
                }
            }
            else if (action.debugId == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * this.id + this.actionType) + this.tokenizedTextId);
        int hashCode;
        if (this.stylePairs != null) {
            hashCode = Arrays.hashCode(this.stylePairs);
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.url != null) {
            hashCode2 = this.url.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.displayUrl != null) {
            hashCode3 = this.displayUrl.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (31 * (hashCode3 + n3) + (int)(this.userId ^ this.userId >>> 32));
        int hashCode4;
        if (this.appId != null) {
            hashCode4 = this.appId.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.appUrl != null) {
            hashCode5 = this.appUrl.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.displayAppUrl != null) {
            hashCode6 = this.displayAppUrl.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.phoneNumberUrl != null) {
            hashCode7 = this.phoneNumberUrl.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (hashCode7 + n7);
        int hashCode8;
        if (this.phoneNumber != null) {
            hashCode8 = this.phoneNumber.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n9 = 31 * (hashCode8 + n8);
        int hashCode9;
        if (this.apiRequest != null) {
            hashCode9 = this.apiRequest.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n10 = 31 * (hashCode9 + n9);
        int hashCode10;
        if (this.purchaseRequest != null) {
            hashCode10 = this.purchaseRequest.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n11 = 31 * (31 * (31 * (hashCode10 + n10) + this.successActionId) + this.failureActionId);
        int hashCode11;
        if (this.scribeElement != null) {
            hashCode11 = this.scribeElement.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final int n12 = 31 * (hashCode11 + n11);
        int hashCode12;
        if (this.scribeAction != null) {
            hashCode12 = this.scribeAction.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final int n13 = 31 * (31 * (hashCode12 + n12) + this.formId);
        final String debugId = this.debugId;
        int hashCode13 = 0;
        if (debugId != null) {
            hashCode13 = this.debugId.hashCode();
        }
        return n13 + hashCode13;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.actionType = objectInput.readInt();
        this.tokenizedTextId = objectInput.readInt();
        this.stylePairs = (StylePair[])f.a(StylePair[].class, objectInput);
        this.url = (String)objectInput.readObject();
        this.displayUrl = (String)objectInput.readObject();
        this.userId = objectInput.readLong();
        this.appId = (String)objectInput.readObject();
        this.appUrl = (String)objectInput.readObject();
        this.displayAppUrl = (String)objectInput.readObject();
        this.phoneNumberUrl = (String)objectInput.readObject();
        this.phoneNumber = (String)objectInput.readObject();
        this.apiRequest = (ApiRequest)objectInput.readObject();
        this.purchaseRequest = (PurchaseRequest)objectInput.readObject();
        this.successActionId = objectInput.readInt();
        this.failureActionId = objectInput.readInt();
        this.scribeElement = (String)objectInput.readObject();
        this.scribeAction = (String)objectInput.readObject();
        this.formId = objectInput.readInt();
        this.debugId = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeInt(this.actionType);
        objectOutput.writeInt(this.tokenizedTextId);
        f.a(this.stylePairs, objectOutput);
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.displayUrl);
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.appId);
        objectOutput.writeObject(this.appUrl);
        objectOutput.writeObject(this.displayAppUrl);
        objectOutput.writeObject(this.phoneNumberUrl);
        objectOutput.writeObject(this.phoneNumber);
        objectOutput.writeObject(this.apiRequest);
        objectOutput.writeObject(this.purchaseRequest);
        objectOutput.writeInt(this.successActionId);
        objectOutput.writeInt(this.failureActionId);
        objectOutput.writeObject(this.scribeElement);
        objectOutput.writeObject(this.scribeAction);
        objectOutput.writeInt(this.formId);
        objectOutput.writeObject(this.debugId);
    }
}
