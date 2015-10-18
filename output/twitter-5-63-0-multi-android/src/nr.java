import com.twitter.library.api.moments.ThemeData;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.api.moments.MomentPageType;
import com.twitter.model.common.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class nr extends a
{
    MomentPageType a;
    CropData b;
    ThemeData c;
    nl d;
    long e;
    
    public nr() {
        this.a = MomentPageType.a;
    }
    
    public nr a(final long e) {
        this.e = e;
        return this;
    }
    
    public nr a(final CropData b) {
        this.b = b;
        return this;
    }
    
    public nr a(final MomentPageType a) {
        this.a = a;
        return this;
    }
    
    public nr a(final ThemeData c) {
        this.c = c;
        return this;
    }
    
    public nr a(final nl d) {
        this.d = d;
        return this;
    }
    
    protected np c() {
        return new np(this, null);
    }
}
