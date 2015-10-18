// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterClusterMetadata extends c
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public long e;
    @JsonField
    public long f;
    
    public xa a() {
        boolean b;
        if ("PEOPLE".equals(this.b)) {
            b = true;
        }
        else {
            b = false;
        }
        return new xa(this.a, b ? 1 : 0, this.c, this.d, this.e, this.f);
    }
}
