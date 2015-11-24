import java.util.List;
import java.util.Map;
import com.twitter.library.api.moments.Moment;
import com.twitter.model.common.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class no extends a
{
    Moment a;
    Map b;
    List c;
    int d;
    np e;
    np f;
    np g;
    
    public no a(final int d) {
        this.d = d;
        return this;
    }
    
    public no a(final Moment a) {
        this.a = a;
        return this;
    }
    
    public no a(final List c) {
        this.c = c;
        return this;
    }
    
    public no a(final Map b) {
        this.b = b;
        return this;
    }
    
    public no a(final np e) {
        this.e = e;
        return this;
    }
    
    @Override
    public boolean aw_() {
        return this.a != null;
    }
    
    public no b(final np f) {
        this.f = f;
        return this;
    }
    
    protected nm c() {
        return new nm(this, null);
    }
    
    public no c(final np g) {
        this.g = g;
        return this;
    }
}
