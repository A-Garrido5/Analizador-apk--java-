import com.twitter.library.util.bj;
import android.net.Uri;
import com.twitter.library.card.property.ImageSpec;

// 
// Decompiled by Procyon v0.5.30
// 

public class vj
{
    public final String a;
    public final int b;
    public final int c;
    
    public vj(final ImageSpec imageSpec) {
        final Uri parse = Uri.parse(imageSpec.url);
        if (parse.getEncodedPath().equals("/2/proxy.jpg")) {
            if (bj.a >= 2.0f) {
                this.a = parse.buildUpon().appendQueryParameter("m", "2").build().toString();
            }
            else {
                this.a = parse.buildUpon().appendQueryParameter("m", "1").build().toString();
            }
        }
        else {
            this.a = imageSpec.url;
        }
        this.b = (int)(imageSpec.size.x / bj.a);
        this.c = (int)(imageSpec.size.y / bj.a);
    }
    
    public static vj a(final String s, final vc vc) {
        try {
            return (vj)vc.a(s, vj.class);
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
    
    public float a(float n) {
        if (this.c > 0) {
            n = this.b / this.c;
        }
        return n;
    }
}
