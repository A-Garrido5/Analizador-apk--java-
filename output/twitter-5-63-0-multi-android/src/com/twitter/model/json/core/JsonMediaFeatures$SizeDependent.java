// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import com.twitter.library.api.TweetMediaFeature;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaFeatures$SizeDependent
{
    @JsonField
    public JsonMediaFeatures$SizeDependent$Face[] a;
    
    public ArrayList a() {
        final ArrayList<TweetMediaFeature> list = new ArrayList<TweetMediaFeature>();
        for (final JsonMediaFeatures$SizeDependent$Face jsonMediaFeatures$SizeDependent$Face : this.a) {
            if (jsonMediaFeatures$SizeDependent$Face.a >= 0 && jsonMediaFeatures$SizeDependent$Face.b >= 0 && jsonMediaFeatures$SizeDependent$Face.c >= 0 && jsonMediaFeatures$SizeDependent$Face.d >= 0) {
                list.add(new TweetMediaFeature(jsonMediaFeatures$SizeDependent$Face.a, jsonMediaFeatures$SizeDependent$Face.b, jsonMediaFeatures$SizeDependent$Face.d, jsonMediaFeatures$SizeDependent$Face.c));
            }
        }
        return list;
    }
}
