import com.twitter.internal.android.service.a;
import android.widget.Toast;
import java.util.List;
import java.util.Collections;
import com.twitter.android.trends.j;
import com.twitter.library.api.search.i;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

// 
// Decompiled by Procyon v0.5.30
// 

class df extends z
{
    final /* synthetic */ de a;
    
    df(final de a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (((aa)y.l().b()).a()) {
            final i i = (i)y;
            j.a(this.a.a, this.a.b, i);
            this.a.c.a(i.e());
            return;
        }
        this.a.c.a(Collections.emptyList());
        Toast.makeText(this.a.a, 2131297957, 1).show();
    }
}
