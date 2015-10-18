import com.twitter.util.k;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.twitter.library.api.moments.Moment;

// 
// Decompiled by Procyon v0.5.30
// 

public class nm
{
    public final Moment a;
    public final Map b;
    public final List c;
    public final int d;
    public final np e;
    public final np f;
    public final np g;
    
    private nm(final no no) {
        this.a = no.a;
        this.b = (Map)k.a(no.b, Collections.emptyMap());
        this.c = (List)k.a(no.c, Collections.emptyList());
        this.d = no.d;
        this.e = no.e;
        this.f = no.f;
        this.g = no.g;
    }
}
