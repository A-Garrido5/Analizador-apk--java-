// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.dms;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonConversationEvent
{
    @JsonField
    public long b;
    @JsonField
    public String c;
    @JsonField(name = { "time" })
    public long d;
    @JsonField
    public long e;
    @JsonField
    public boolean f;
}
