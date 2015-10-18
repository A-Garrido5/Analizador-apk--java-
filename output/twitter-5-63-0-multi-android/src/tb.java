import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import com.google.android.gms.maps.c;
import android.view.ViewGroup;
import com.google.android.gms.maps.t;

// 
// Decompiled by Procyon v0.5.30
// 

class tb implements t
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ ta b;
    
    tb(final ta b, final ViewGroup a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final c c) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.a.getResources(), kz.ic_location_pin, bitmapFactory$Options);
        c.a(0, bitmapFactory$Options.outHeight, 0, 0);
    }
}
