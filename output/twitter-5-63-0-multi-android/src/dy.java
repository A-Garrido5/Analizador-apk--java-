import org.json.JSONException;
import org.json.JSONArray;
import java.util.Locale;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.featureswitch.d;
import org.json.JSONObject;
import java.util.Iterator;
import com.twitter.library.client.Session;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.service.c;
import com.twitter.library.api.ae;
import android.text.TextUtils;
import com.twitter.library.av.model.b;
import java.util.List;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.client.as;

// 
// Decompiled by Procyon v0.5.30
// 

public class dy implements dz
{
    private final as a;
    private final az b;
    private final Context c;
    
    public dy(final Context context) {
        this(context, as.a(context), az.a(context));
    }
    
    public dy(final Context context, final as a, final az b) {
        this.a = a;
        this.b = b;
        this.c = context.getApplicationContext();
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final Context context, final List list, final String s, final b b) {
        if (b != null) {
            final Session b2 = this.b.b();
            for (final String s2 : list) {
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    final ae ae = new ae(context, b2);
                    this.a(ae, s2, s, b, b2);
                    this.a.a(ae, (z)null);
                }
            }
        }
    }
    
    void a(final c c, final String s, final String s2, final b b, final Session session) {
        final JSONObject jsonObject = new JSONObject();
        try {
            final String h = b.h();
            Object o = null;
            if (h != null) {
                final String g = d.g(String.format("audio_configurations_macawnymizer_beaconing_integration_key_%s", h.toLowerCase()));
                final boolean empty = TextUtils.isEmpty((CharSequence)g);
                o = null;
                if (!empty) {
                    o = g;
                }
            }
            if (o != null) {
                jsonObject.put("integration", o);
            }
            if (s2 != null) {
                jsonObject.put("page", (Object)s2);
            }
            final String b2 = com.twitter.library.av.model.factory.a.b(this.c);
            if (b2 != null) {
                jsonObject.put("user_agent", (Object)b2);
            }
            final Locale default1 = Locale.getDefault();
            if (default1 != null) {
                jsonObject.put("locale", (Object)default1);
            }
            jsonObject.put("beacon_url", (Object)s);
            if (session.d()) {
                jsonObject.put("user_id", (Object)Long.toString(session.g()));
            }
            final JSONArray jsonArray = new JSONArray();
            jsonArray.put((Object)jsonObject);
            c.b("data", jsonArray.toString());
        }
        catch (JSONException ex) {}
    }
}
