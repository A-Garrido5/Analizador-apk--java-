// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline.wtf;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSocialProof
{
    @JsonField(name = { "proof_type" })
    public String a;
    @JsonField(name = { "user_ids" })
    public String[] b;
}
