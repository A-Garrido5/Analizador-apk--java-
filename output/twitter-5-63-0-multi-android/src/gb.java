import com.twitter.library.provider.f;
import com.twitter.library.provider.b;
import com.twitter.library.client.az;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class gb extends ts
{
    @Override
    protected boolean a() {
        return true;
    }
    
    protected boolean a(final Context context, final Void void1) {
        return az.a(context).b().d();
    }
    
    protected void b(final Context context, final Void void1) {
        final b b = new b(context.getContentResolver());
        f.a(context, az.a(context).b().g()).a(b);
        b.a();
    }
}
