// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.geo;

import java.util.Iterator;
import java.util.HashMap;
import com.twitter.library.api.geo.Coordinate;
import java.util.List;
import com.twitter.util.collection.g;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.util.q;
import com.twitter.library.api.geo.TwitterPlace;
import java.util.Map;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.common.c;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterPlace extends c
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField(typeConverter = "Lcom/twitter/model/json/core/d;")
    public TwitterPlace$PlaceType c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public JsonTwitterPlace[] g;
    @JsonField
    public String[] h;
    @JsonField
    public double[] i;
    @JsonField
    public JsonTwitterPlace$CoordinateArray j;
    @JsonField
    public Map k;
    
    public JsonTwitterPlace() {
        this.c = TwitterPlace$PlaceType.f;
    }
    
    public TwitterPlace a() {
        if (q.a(this.d)) {
            return null;
        }
        while (true) {
            Label_0285: {
                if (this.j == null) {
                    break Label_0285;
                }
                final List a = this.j.a;
                if (CollectionUtils.a((Collection)a)) {
                    break Label_0285;
                }
                final g a2 = com.twitter.util.collection.g.a();
                final Iterator<List<List>> iterator = a.iterator();
                while (iterator.hasNext()) {
                    for (final List<Double> list : iterator.next()) {
                        a2.a(new Coordinate(list.get(1), list.get(0)));
                    }
                }
                final List d = a2.d();
                Coordinate coordinate;
                if (this.i != null) {
                    coordinate = new Coordinate(this.i[1], this.i[0]);
                }
                else {
                    coordinate = null;
                }
                final JsonTwitterPlace jsonTwitterPlace = (JsonTwitterPlace)CollectionUtils.b(this.g);
                TwitterPlace a3;
                if (jsonTwitterPlace != null) {
                    a3 = jsonTwitterPlace.a();
                }
                else {
                    a3 = null;
                }
                HashMap hashMap;
                if (CollectionUtils.a(this.k)) {
                    hashMap = null;
                }
                else {
                    hashMap = new HashMap(this.k);
                }
                return new TwitterPlace(this.d, this.c, this.a, this.b, d, coordinate, this.e, this.f, (String)CollectionUtils.b(this.h), a3, hashMap);
            }
            final List d = null;
            continue;
        }
    }
}
