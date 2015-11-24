// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaFeatures
{
    @JsonField(name = { "all" })
    public JsonMediaFeatures$SizeIndependent a;
    @JsonField(name = { "large" })
    public JsonMediaFeatures$SizeDependent b;
}
