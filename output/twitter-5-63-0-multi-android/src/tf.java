import android.view.View$OnLayoutChangeListener;
import android.os.Bundle;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.model.LatLng;
import com.twitter.library.api.geo.Coordinate;
import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;
import com.google.android.gms.maps.t;
import com.google.android.gms.maps.s;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.f;
import android.widget.ImageView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.n;
import com.google.android.gms.maps.l;

// 
// Decompiled by Procyon v0.5.30
// 

class tf implements l
{
    final /* synthetic */ td a;
    
    tf(final td a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.d.a.getMap().a(new tg(this));
    }
}
