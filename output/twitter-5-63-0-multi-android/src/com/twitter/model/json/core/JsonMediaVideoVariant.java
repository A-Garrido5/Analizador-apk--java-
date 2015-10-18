// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.util.q;
import com.twitter.library.api.MediaVideoVariant;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaVideoVariant extends c
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public int c;
    
    public MediaVideoVariant a() {
        if (!q.a(this.a) && !q.a(this.b)) {
            return new MediaVideoVariant(this.a, this.b, this.c);
        }
        return null;
    }
}
