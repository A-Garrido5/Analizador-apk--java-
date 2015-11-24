import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.api.b;
import com.twitter.library.client.u;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class fq extends ts
{
    protected void a(final Context context, final Void void1) {
        u.a.a(b.a(context));
        c.a(context).a(az.a(context).b().g(), "app::::launch", true);
    }
    
    @Override
    protected boolean a() {
        return true;
    }
}
