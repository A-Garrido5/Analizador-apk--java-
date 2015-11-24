import java.util.Collections;
import java.util.List;
import com.twitter.library.api.moments.MomentGuideSectionType;

// 
// Decompiled by Procyon v0.5.30
// 

public class nk
{
    public final String a;
    public final MomentGuideSectionType b;
    public final List c;
    
    public nk(final String a, final MomentGuideSectionType b, final List list) {
        this.a = a;
        this.b = b;
        this.c = Collections.unmodifiableList((List<?>)list);
    }
}
