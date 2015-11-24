import android.annotation.TargetApi;
import android.webkit.WebView;
import android.os.Build$VERSION;
import com.twitter.library.client.App;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ud extends ts
{
    protected boolean a(final Context context, final Void void1) {
        return App.a() && Build$VERSION.SDK_INT >= 19;
    }
    
    @TargetApi(19)
    protected void b(final Context context, final Void void1) {
        WebView.setWebContentsDebuggingEnabled(true);
    }
}
