// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.library.featureswitch.d;
import java.util.List;

public class bl
{
    private static final Object a;
    private static List b;
    
    static {
        a = new Object();
        bl.b = null;
    }
    
    private static List a() {
        int i = 0;
        Label_0104: {
            if (bl.b != null) {
                break Label_0104;
            }
            synchronized (bl.a) {
                final ArrayList h = d.h("legacy_deciders_web_view_url_whitelist");
                int size;
                if (h == null) {
                    size = 0;
                }
                else {
                    size = h.size();
                }
                final ArrayList<String> b = new ArrayList<String>();
                while (i < size) {
                    b.add(h.get(i).toString());
                    ++i;
                }
                if (b.isEmpty()) {
                    b.add("https://ads.twitter.com/cards");
                }
                bl.b = b;
                return bl.b;
            }
        }
    }
    
    public static boolean a(final String s) {
        final Iterator<String> iterator = a().iterator();
        while (iterator.hasNext()) {
            if (s.startsWith(iterator.next())) {
                return true;
            }
        }
        return false;
    }
}
