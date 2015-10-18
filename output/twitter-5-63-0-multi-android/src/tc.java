import android.os.Bundle;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;
import com.google.android.gms.maps.t;
import com.google.android.gms.maps.s;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.f;
import android.widget.ImageView;
import com.google.android.gms.maps.MapView;
import android.view.View;
import com.twitter.library.api.geo.Coordinate;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.5.30
// 

class tc implements View$OnLayoutChangeListener
{
    final /* synthetic */ Coordinate a;
    final /* synthetic */ Coordinate b;
    final /* synthetic */ sy c;
    final /* synthetic */ ta d;
    
    tc(final ta d, final Coordinate a, final Coordinate b, final sy c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.d.a.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        this.d.b(this.a, this.b, this.c);
    }
}
