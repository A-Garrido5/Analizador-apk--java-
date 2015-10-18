import android.content.Context;
import java.util.ArrayList;
import com.twitter.internal.android.widget.ToolBar;

// 
// Decompiled by Procyon v0.5.30
// 

class jw extends ju
{
    final ToolBar d;
    final ArrayList e;
    
    public jw(final Context context, final int n, final ToolBar d) {
        super(context, n);
        this.e = new ArrayList();
        this.d = d;
    }
    
    @Override
    protected void b() {
        final jx jx = new jx(this.d, this.b, this.c);
        if (jx.a() != 0) {
            this.e.add(jx);
        }
    }
}
