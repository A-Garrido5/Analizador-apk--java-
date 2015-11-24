import com.twitter.util.k;
import java.util.AbstractMap;
import java.util.Map;
import com.twitter.util.collection.a;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;

// 
// Decompiled by Procyon v0.5.30
// 

public class wz extends StringBasedTypeConverter
{
    private final Object a;
    private final a b;
    
    public wz(final Object a, final Map map) {
        this.a = a;
        this.b = new a(map);
    }
    
    public wz(final Object a, final Map.Entry... array) {
        this.a = a;
        this.b = new a(array);
    }
    
    protected static Map.Entry a(final String s, final Object o) {
        return (Map.Entry)new AbstractMap.SimpleImmutableEntry(s, o);
    }
    
    @Override
    public String convertToString(final Object o) {
        return (String)this.b.a(o);
    }
    
    @Override
    public Object getFromString(final String s) {
        return k.a(this.b.get(s), this.a);
    }
}
