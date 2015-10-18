import java.util.Iterator;
import com.twitter.library.av.model.a;
import com.twitter.library.av.model.b;
import android.content.Context;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class dv
{
    static final Map a;
    private final ea b;
    
    static {
        final HashMap<String, List<Object>> hashMap = new HashMap<String, List<Object>>();
        hashMap.put("playback_0", Collections.unmodifiableList((List<?>)Arrays.asList("start", "creativeView", "impressionTag")));
        hashMap.put("video_view", (List<Object>)Collections.singletonList("creativeView"));
        hashMap.put("playback_25", (List<Object>)Collections.singletonList("firstQuartile"));
        hashMap.put("playback_50", (List<Object>)Collections.singletonList("midpoint"));
        hashMap.put("playback_75", (List<Object>)Collections.singletonList("thirdQuartile"));
        hashMap.put("playback_100", (List<Object>)Collections.singletonList("complete"));
        hashMap.put("pause", (List<Object>)Collections.singletonList("pause"));
        hashMap.put("resume", (List<Object>)Collections.singletonList("resume"));
        hashMap.put("rewind", (List<Object>)Collections.singletonList("rewind"));
        hashMap.put("close", (List<Object>)Collections.singletonList("stop"));
        hashMap.put("error", (List<Object>)Collections.singletonList("errorTag"));
        hashMap.put("checkpoint", (List<Object>)Collections.singletonList("checkpoint"));
        hashMap.put("cta_impression_signup", (List<Object>)Collections.singletonList("ctaImpressionSignup"));
        hashMap.put("cta_impression_open", (List<Object>)Collections.singletonList("ctaImpressionOpen"));
        hashMap.put("cta_click_signup", (List<Object>)Collections.singletonList("ctaClickSignup"));
        hashMap.put("cta_click_open", (List<Object>)Collections.singletonList("ctaClickOpen"));
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public dv(final Context context) {
        this(ea.a(context));
    }
    
    dv(final ea b) {
        this.b = b;
    }
    
    public void a(final Context context, final String s, final b b, final a a, final String s2) {
        final List<String> list = dv.a.get(s);
        if (list != null && a != null) {
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                final List a2 = a.a(iterator.next());
                if (a2 != null && a2.size() > 0) {
                    this.b.a(a).a(context, a2, s2, b);
                }
            }
        }
    }
}
