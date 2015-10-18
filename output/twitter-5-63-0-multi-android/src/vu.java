import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.util.q;
import com.twitter.util.collection.i;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.App;
import com.twitter.library.widget.tweet.content.DisplayMode;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

public class vu
{
    static final yv a;
    private static vu b;
    private vw c;
    private HashMap d;
    
    static {
        a = new yv("TestCardRegistry");
    }
    
    vu() {
        this.d = new HashMap();
    }
    
    public static vu a() {
        if (vu.b == null) {
            vu.b = new vu();
        }
        return vu.b;
    }
    
    static String b(final String s, final DisplayMode displayMode) {
        final StringBuilder sb = new StringBuilder();
        sb.append("card_registry_");
        sb.append(s.replaceAll("\\W", "_"));
        switch (vv.a[displayMode.ordinal()]) {
            case 1: {
                sb.append("_forward");
                break;
            }
            case 2: {
                sb.append("_full");
                break;
            }
            case 3: {
                sb.append("_compose");
                break;
            }
        }
        sb.append("_enabled");
        return sb.toString();
    }
    
    private boolean c(final String s, final DisplayMode displayMode) {
        return com.twitter.library.featureswitch.d.a(b(s, displayMode), App.a());
    }
    
    private boolean d(final String s, final DisplayMode displayMode) {
        return vh.a().a(s, displayMode);
    }
    
    public vr a(final String s, final DisplayMode displayMode) {
        if (!com.twitter.library.featureswitch.d.f("card_registry_enabled")) {
            return null;
        }
        return this.d.get(i.a(s, displayMode));
    }
    
    public void a(final String s, final vr vr, final DisplayMode... array) {
        if (com.twitter.library.featureswitch.d.f("card_registry_enabled")) {
            vu.a.a();
            if (q.a(s)) {
                if (com.twitter.util.d.e()) {
                    throw new IllegalArgumentException("Missing card name");
                }
            }
            else if (vr == null) {
                if (com.twitter.util.d.e()) {
                    throw new IllegalArgumentException("Null factory");
                }
            }
            else {
                final int length = array.length;
                int i = 0;
                while (i < length) {
                    final i a = com.twitter.util.collection.i.a(s, array[i]);
                    if (this.d.get(a) != null) {
                        if (com.twitter.util.d.e()) {
                            throw new IllegalArgumentException("Duplicate registration for " + s);
                        }
                        break;
                    }
                    else {
                        this.d.put(a, vr);
                        ++i;
                    }
                }
            }
        }
    }
    
    public void a(final vw c) {
        vu.a.a();
        this.c = c;
    }
    
    public boolean a(final CardInstanceData cardInstanceData) {
        return this.a(cardInstanceData.name, DisplayMode.a, cardInstanceData.u()) || !q.a(cardInstanceData.forwardCardTypeURL);
    }
    
    public boolean a(final String s, final DisplayMode displayMode, final vc vc) {
        if (com.twitter.library.featureswitch.d.f("card_registry_enabled")) {
            final vr vr = this.d.get(i.a(s, displayMode));
            if (vr != null) {
                return vr.a(displayMode, vc) && (this.c(s, displayMode) || this.d(s, displayMode));
            }
        }
        return false;
    }
    
    public boolean b(final CardInstanceData cardInstanceData) {
        return this.a(cardInstanceData.name, DisplayMode.b, cardInstanceData.u()) || !q.a(cardInstanceData.cardTypeURL);
    }
    
    public boolean c(final CardInstanceData cardInstanceData) {
        return com.twitter.library.featureswitch.d.f("cards_forward_enabled") && this.a(cardInstanceData) && (this.c == null || this.c.b(cardInstanceData));
    }
    
    public boolean d(final CardInstanceData cardInstanceData) {
        return this.b(cardInstanceData) && (this.c == null || this.c.c(cardInstanceData));
    }
    
    public boolean e(final CardInstanceData cardInstanceData) {
        return this.d(cardInstanceData) || this.c(cardInstanceData);
    }
}
