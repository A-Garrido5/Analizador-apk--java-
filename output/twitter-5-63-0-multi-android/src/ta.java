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

// 
// Decompiled by Procyon v0.5.30
// 

public class ta implements sx
{
    private final MapView a;
    private final ImageView b;
    private f c;
    
    public ta(final ViewGroup viewGroup, final MapView a, final ImageView b) {
        a.setVisibility(4);
        this.a = a;
        this.b = b;
        if (a.getParent() == null) {
            a.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
            viewGroup.addView((View)a);
        }
        if (b.getParent() == null) {
            b.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
            viewGroup.addView((View)b);
        }
        s.a(viewGroup.getContext());
        this.a.a(new tb(this, viewGroup));
    }
    
    public static MapView a(final Context context) {
        return new MapView(context, new GoogleMapOptions().j(false).c(false).f(false).h(false).e(false).g(false));
    }
    
    private LatLng a(final Coordinate coordinate) {
        return new LatLng(coordinate.a(), coordinate.b());
    }
    
    private void a(final a a, final Coordinate coordinate, final sy sy) {
        this.a.a(new td(this, a, coordinate, sy));
    }
    
    private void b(final Coordinate coordinate, final Coordinate coordinate2, final sy sy) {
        this.a(com.google.android.gms.maps.b.a(new LatLngBounds(this.a(coordinate), this.a(coordinate2)), 0), sj.a(coordinate2, coordinate), sy);
    }
    
    @Override
    public void a() {
        this.a.a();
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.a.a(bundle);
    }
    
    @Override
    public void a(final Coordinate coordinate, final Coordinate coordinate2, final sy sy) {
        if (this.a.getLeft() < this.a.getRight()) {
            this.b(coordinate, coordinate2, sy);
            return;
        }
        this.a.addOnLayoutChangeListener((View$OnLayoutChangeListener)new tc(this, coordinate, coordinate2, sy));
    }
    
    @Override
    public void a(final Coordinate coordinate, final sy sy) {
        this.a(com.google.android.gms.maps.b.a(new LatLng(coordinate.a(), coordinate.b()), 15.0f), coordinate, sy);
    }
    
    @Override
    public void b() {
        this.a.b();
    }
    
    @Override
    public void b(final Bundle bundle) {
        this.a.b(bundle);
    }
    
    @Override
    public void c() {
        this.a.c();
    }
    
    @Override
    public void d() {
        this.a.d();
    }
}
