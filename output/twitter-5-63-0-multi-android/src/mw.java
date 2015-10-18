import com.twitter.library.card.instance.CardInstanceData;
import android.text.TextUtils;
import java.util.List;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bp;

// 
// Decompiled by Procyon v0.5.30
// 

public class mw
{
    public final String a;
    public final int b;
    public final mx c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    @Deprecated
    public final int j;
    public final bp k;
    public final TwitterUser l;
    public final List m;
    public bp n;
    
    public mw(final String a, int b, final mx c, final String d, final String e, String f, final String g, final String h, final String i, final bp k, final bp n, final TwitterUser l, final List m) {
        if (b == 1) {
            if (n != null) {
                b = 4;
            }
            else if (!k.c.media.c()) {
                b = 2;
            }
            else if (k.v != null && k.v.classicCard != null) {
                final CardInstanceData cardInstanceData = k.v.cardInstanceData;
                if (cardInstanceData != null && cardInstanceData.j() != null) {
                    if ((cardInstanceData.n() || cardInstanceData.q()) && !TextUtils.isEmpty((CharSequence)k.v.classicCard.playerStreamUrl)) {
                        b = 3;
                    }
                    else if (cardInstanceData.m() || cardInstanceData.k()) {
                        b = 2;
                    }
                }
            }
            else if (!TextUtils.isEmpty((CharSequence)g)) {
                b = 5;
            }
        }
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
        }
        else {
            this.c = new mx(1, 0, null);
        }
        this.d = d;
        this.e = e;
        if (TextUtils.isEmpty((CharSequence)f)) {
            f = d;
        }
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = 0;
        this.k = k;
        this.n = n;
        this.l = l;
        this.m = m;
    }
}
