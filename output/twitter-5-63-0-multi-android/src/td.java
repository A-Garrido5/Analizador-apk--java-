import android.view.View$OnLayoutChangeListener;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;
import com.google.android.gms.maps.s;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.l;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.c;
import com.twitter.library.api.geo.Coordinate;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.t;

// 
// Decompiled by Procyon v0.5.30
// 

class td implements t
{
    final /* synthetic */ a a;
    final /* synthetic */ Coordinate b;
    final /* synthetic */ sy c;
    final /* synthetic */ ta d;
    
    td(final ta d, final a a, final Coordinate b, final sy c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final c c) {
        final MapView a = this.d.a;
        final c map = a.getMap();
        a.setVisibility(0);
        this.d.b.setVisibility(8);
        map.a(new te(this, map));
        map.a(this.a);
        if (this.d.c != null) {
            this.d.c.a();
            this.d.c = null;
        }
        this.d.c = map.a(new MarkerOptions().a(new LatLng(this.b.a(), this.b.b())).a(com.google.android.gms.maps.model.b.a(kz.ic_location_pin)));
        map.a(new tf(this));
    }
}
