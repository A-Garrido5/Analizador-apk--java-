// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import com.twitter.internal.android.util.Size;
import com.twitter.model.json.core.JsonMediaSize;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentMedia extends c
{
    @JsonField
    public long a;
    @JsonField
    public JsonMediaSize b;
    @JsonField
    public String c;
    
    public nl a() {
        return new nl(this.a, (Size)wy.a(this.b, Size.a), this.c);
    }
}
