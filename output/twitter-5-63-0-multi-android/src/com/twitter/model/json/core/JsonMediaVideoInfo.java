// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.List;
import com.twitter.library.api.MediaVideoVariant;
import java.util.ArrayList;
import com.twitter.library.api.MediaVideoInfo;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaVideoInfo extends c
{
    @JsonField
    public int[] a;
    @JsonField
    public float b;
    @JsonField
    public JsonMediaVideoVariant[] c;
    
    public JsonMediaVideoInfo() {
        this.a = new int[2];
    }
    
    public MediaVideoInfo a() {
        int i = 0;
        final int[] a = this.a;
        float n;
        if (a[1] != 0) {
            n = a[0] / a[1];
        }
        else {
            n = 0.0f;
        }
        final float n2 = this.b / 1000.0f;
        final ArrayList<MediaVideoVariant> list = new ArrayList<MediaVideoVariant>();
        if (this.c != null) {
            for (JsonMediaVideoVariant[] c = this.c; i < c.length; ++i) {
                final MediaVideoVariant a2 = c[i].a();
                if (a2 != null) {
                    list.add(a2);
                }
            }
        }
        if (list.size() > 0 && n != 0.0f) {
            return new MediaVideoInfo(n, n2, list);
        }
        return null;
    }
}
