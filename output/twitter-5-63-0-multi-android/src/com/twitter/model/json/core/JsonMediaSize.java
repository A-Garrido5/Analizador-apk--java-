// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.internal.android.util.Size;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject
public class JsonMediaSize extends c
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    
    public Size a() {
        return Size.a(this.a, this.b);
    }
}
