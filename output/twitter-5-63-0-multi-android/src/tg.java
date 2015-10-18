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
import android.graphics.Bitmap;
import com.google.android.gms.maps.n;

// 
// Decompiled by Procyon v0.5.30
// 

class tg implements n
{
    final /* synthetic */ tf a;
    
    tg(final tf a) {
        this.a = a;
    }
    
    @Override
    public void a(final Bitmap imageBitmap) {
        if (imageBitmap != null) {
            this.a.a.d.b.setImageBitmap(imageBitmap);
            this.a.a.d.b.setVisibility(0);
            this.a.a.d.a.setVisibility(8);
            if (this.a.a.c != null) {
                this.a.a.c.a(imageBitmap);
            }
        }
    }
}
