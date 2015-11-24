// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class PurchaseRequest implements Externalizable
{
    private static final long serialVersionUID = -8397754710854057477L;
    public int failureActionId;
    public PurchaseRequestParameter[] parameters;
    public int successActionId;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof PurchaseRequest)) {
                return false;
            }
            final PurchaseRequest purchaseRequest = (PurchaseRequest)o;
            if (!Arrays.equals(this.parameters, purchaseRequest.parameters)) {
                return false;
            }
            if (this.successActionId != purchaseRequest.successActionId) {
                return false;
            }
            if (this.failureActionId != purchaseRequest.failureActionId) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.parameters != null) {
            hashCode = Arrays.hashCode(this.parameters);
        }
        else {
            hashCode = 0;
        }
        return 31 * (hashCode * 31 + this.successActionId) + this.failureActionId;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.parameters = (PurchaseRequestParameter[])f.a(PurchaseRequestParameter[].class, objectInput);
        this.successActionId = objectInput.readInt();
        this.failureActionId = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        f.a(this.parameters, objectOutput);
        objectOutput.writeInt(this.successActionId);
        objectOutput.writeInt(this.failureActionId);
    }
}
