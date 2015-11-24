import android.widget.Toast;
import java.util.List;
import android.content.Context;
import com.twitter.library.client.am;

// 
// Decompiled by Procyon v0.5.30
// 

class tw implements am
{
    final /* synthetic */ Context a;
    final /* synthetic */ tv b;
    
    tw(final tv b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final List list) {
        Toast.makeText(this.a, (CharSequence)"Activities have leaked", 1).show();
    }
}
