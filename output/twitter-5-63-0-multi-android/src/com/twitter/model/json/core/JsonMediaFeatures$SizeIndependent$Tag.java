// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaFeatures$SizeIndependent$Tag
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
}
