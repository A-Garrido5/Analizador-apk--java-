// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import java.io.Externalizable;

public class ApiRequest implements Externalizable
{
    private static final long serialVersionUID = 7251009167812180333L;
    public String apiProxyRule;
    public int failureActionId;
    public int method;
    public ApiRequestParameter[] parameters;
    public int successActionId;
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ApiRequest)) {
                return false;
            }
            final ApiRequest apiRequest = (ApiRequest)o;
            Label_0051: {
                if (this.apiProxyRule != null) {
                    if (this.apiProxyRule.equals(apiRequest.apiProxyRule)) {
                        break Label_0051;
                    }
                }
                else if (apiRequest.apiProxyRule == null) {
                    break Label_0051;
                }
                return false;
            }
            if (this.failureActionId != apiRequest.failureActionId) {
                return false;
            }
            if (this.method != apiRequest.method) {
                return false;
            }
            if (this.successActionId != apiRequest.successActionId) {
                return false;
            }
            if (!Arrays.equals(this.parameters, apiRequest.parameters)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.method;
        int hashCode;
        if (this.parameters != null) {
            hashCode = Arrays.hashCode(this.parameters);
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (31 * (hashCode + n) + this.successActionId) + this.failureActionId);
        final String apiProxyRule = this.apiProxyRule;
        int hashCode2 = 0;
        if (apiProxyRule != null) {
            hashCode2 = this.apiProxyRule.hashCode();
        }
        return n2 + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.method = objectInput.readInt();
        this.parameters = (ApiRequestParameter[])f.a(ApiRequestParameter[].class, objectInput);
        this.successActionId = objectInput.readInt();
        this.failureActionId = objectInput.readInt();
        this.apiProxyRule = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.method);
        f.a(this.parameters, objectOutput);
        objectOutput.writeInt(this.successActionId);
        objectOutput.writeInt(this.failureActionId);
        objectOutput.writeObject(this.apiProxyRule);
    }
}
