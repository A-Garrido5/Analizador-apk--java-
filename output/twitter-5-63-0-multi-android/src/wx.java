import java.util.Collections;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.util.List;
import com.twitter.model.common.b;
import com.twitter.model.common.a;
import com.twitter.model.common.c;
import com.fasterxml.jackson.core.JsonParser;

// 
// Decompiled by Procyon v0.5.30
// 

public class wx
{
    public static Object a(final JsonParser jsonParser, final Class clazz) {
        final c c = (c)d(jsonParser, clazz);
        if (c != null) {
            return c.b();
        }
        return null;
    }
    
    public static a b(final JsonParser jsonParser, final Class clazz) {
        final b b = (b)d(jsonParser, clazz);
        if (b != null) {
            return b.a();
        }
        return null;
    }
    
    public static List c(final JsonParser jsonParser, final Class clazz) {
        return wy.a(e(jsonParser, clazz));
    }
    
    public static Object d(final JsonParser jsonParser, final Class clazz) {
        try {
            return LoganSquare.mapperFor(clazz).parse(jsonParser);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
            return null;
        }
    }
    
    public static List e(final JsonParser jsonParser, final Class clazz) {
        try {
            return LoganSquare.mapperFor(clazz).parseList(jsonParser);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
            return Collections.emptyList();
        }
    }
}
