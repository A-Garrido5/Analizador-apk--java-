// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaFeatures$SizeDependent$Face
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public JsonMediaFeatures$SizeDependent$Face() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
}
