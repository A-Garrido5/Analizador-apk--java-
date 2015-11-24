import android.widget.Toast;
import java.util.List;
import android.content.Context;
import com.twitter.library.client.am;

// 
// Decompiled by Procyon v0.5.30
// 

class tx implements am
{
    final /* synthetic */ Context a;
    final /* synthetic */ tv b;
    
    tx(final tv b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final List list) {
        Toast.makeText(this.a, (CharSequence)"Services have leaked", 1).show();
    }
}
