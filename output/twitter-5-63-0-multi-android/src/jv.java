import java.util.Collection;
import android.content.Context;
import com.twitter.internal.android.widget.ToolBar;
import android.app.Activity;

// 
// Decompiled by Procyon v0.5.30
// 

public class jv
{
    private final Activity a;
    
    public jv(final Activity a) {
        this.a = a;
    }
    
    public void a(final int n, final ToolBar toolBar) {
        final jw jw = new jw((Context)this.a, n, toolBar);
        jw.a();
        toolBar.a(jw.e);
    }
}
