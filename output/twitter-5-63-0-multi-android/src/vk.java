import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.IOException;
import java.util.Collections;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;
import com.twitter.library.api.bh;
import android.text.TextUtils;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class vk
{
    public static Map a(final String s, final vc vc) {
        try {
            final String s2 = (String)vc.a(s, String.class);
            if (TextUtils.isEmpty((CharSequence)s2)) {
                return null;
            }
            final JsonParser a = bh.a.a(s2);
            final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            JsonToken jsonToken = a.a();
            String e = "";
            while (jsonToken != null && jsonToken != JsonToken.c) {
                switch (vl.a[jsonToken.ordinal()]) {
                    case 3: {
                        e = a.e();
                        break;
                    }
                    case 4: {
                        hashMap.put(e, a.n());
                        break;
                    }
                    case 2: {
                        goto Label_0173;
                        goto Label_0173;
                    }
                }
                jsonToken = a.a();
            }
            if (hashMap.size() > 0) {
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
        }
        catch (IOException ex) {}
        catch (JsonParseException ex2) {}
        catch (ClassCastException ex3) {}
        return null;
    }
}
