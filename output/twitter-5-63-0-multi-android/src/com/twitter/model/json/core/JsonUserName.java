// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserName
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public String a() {
        if (this.a != null) {
            return this.a;
        }
        return this.b;
    }
}
