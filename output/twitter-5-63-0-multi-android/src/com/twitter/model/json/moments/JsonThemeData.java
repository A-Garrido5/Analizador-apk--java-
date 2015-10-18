// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.library.api.moments.ThemeData;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonThemeData extends c
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    
    public ThemeData a() {
        return new ThemeData(this.a, this.b);
    }
}
