import android.annotation.TargetApi;
import android.content.res.Resources;
import com.twitter.android.ac;
import android.graphics.BitmapFactory;
import com.twitter.library.client.p;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class to extends ts
{
    private final int a;
    private final int b;
    
    public to(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    protected boolean a(final Context context, final Void void1) {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    @TargetApi(21)
    protected void b(final Context context, final Void void1) {
        final Resources resources = context.getResources();
        p.a().a(new tp(this, resources.getString(context.getApplicationInfo().labelRes), BitmapFactory.decodeResource(resources, this.a), resources.getColor(this.b)));
    }
}
