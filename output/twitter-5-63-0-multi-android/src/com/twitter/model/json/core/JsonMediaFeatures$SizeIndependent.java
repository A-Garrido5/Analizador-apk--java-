// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.MediaTag;
import com.twitter.util.collection.g;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaFeatures$SizeIndependent
{
    @JsonField
    public JsonMediaFeatures$SizeIndependent$Tag[] a;
    
    public List a() {
        final g a = g.a();
        for (final JsonMediaFeatures$SizeIndependent$Tag jsonMediaFeatures$SizeIndependent$Tag : this.a) {
            final long a3 = jsonMediaFeatures$SizeIndependent$Tag.a;
            final String b = jsonMediaFeatures$SizeIndependent$Tag.b;
            final String c = jsonMediaFeatures$SizeIndependent$Tag.c;
            if (a3 > 0L && b != null && c != null) {
                a.a(new MediaTag(a3, b, c));
            }
        }
        return a.d();
    }
}
