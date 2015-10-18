// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import java.util.Iterator;
import android.database.DataSetObserver;
import com.twitter.library.util.bk;
import com.twitter.library.api.geo.TwitterPlace;
import java.util.HashMap;
import android.location.Location;
import java.util.Map;
import android.database.Observable;

public class PlacePickerModel extends Observable
{
    private final Map a;
    private long b;
    private Location c;
    private GeoTagState d;
    
    public PlacePickerModel() {
        this.a = new HashMap();
        this.d = GeoTagState.a();
    }
    
    public int a(final TwitterPlace twitterPlace) {
        if (this.a.containsKey(PlacePickerModel$PlaceListSource.a)) {
            final int index = this.a.get(PlacePickerModel$PlaceListSource.a).c().indexOf(twitterPlace);
            if (index >= 0) {
                return index;
            }
        }
        if (this.a.containsKey(PlacePickerModel$PlaceListSource.b)) {
            return this.a.get(PlacePickerModel$PlaceListSource.b).c().indexOf(twitterPlace);
        }
        return -1;
    }
    
    public f a(final PlacePickerModel$PlaceListSource placePickerModel$PlaceListSource) {
        return this.a.get(placePickerModel$PlaceListSource);
    }
    
    public void a() {
        this.b = 0L;
        this.c = null;
        this.a.clear();
        this.d = GeoTagState.a();
        this.c();
    }
    
    public void a(final Location c, final f f) {
        this.b = bk.a();
        this.c = c;
        this.a.put(PlacePickerModel$PlaceListSource.a, f);
        this.c();
    }
    
    public void a(final GeoTagState d) {
        this.d = d;
        this.c();
    }
    
    public void a(final f f) {
        this.a.put(PlacePickerModel$PlaceListSource.b, f);
        this.c();
    }
    
    public boolean a(final Location location) {
        final f f = this.a.get(PlacePickerModel$PlaceListSource.a);
        return bk.a() - this.b > 300000L || f == null || f.c().isEmpty() || this.c == null || this.c.distanceTo(location) > 30.0f;
    }
    
    public GeoTagState b() {
        return this.d;
    }
    
    public String b(final TwitterPlace twitterPlace) {
        int index;
        if (this.a.containsKey(PlacePickerModel$PlaceListSource.a)) {
            index = this.a.get(PlacePickerModel$PlaceListSource.a).c().indexOf(twitterPlace);
        }
        else {
            index = -1;
        }
        if (index >= 0 && index < 25) {
            return "default";
        }
        if (index >= 0 || (this.a.containsKey(PlacePickerModel$PlaceListSource.b) && this.a.get(PlacePickerModel$PlaceListSource.b).c().contains(twitterPlace))) {
            return "search";
        }
        return "unknown";
    }
    
    public void c() {
        final Iterator<DataSetObserver> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onChanged();
        }
    }
}
