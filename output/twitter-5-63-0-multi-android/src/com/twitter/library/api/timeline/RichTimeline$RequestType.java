// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import com.twitter.library.provider.bg;

public enum RichTimeline$RequestType
{
    a("INITIAL", 0) {
        RichTimeline$RequestType$1(final String s, final int n) {
        }
        
        @Override
        Map a(final bg bg, final int n, final long n2, final long n3) {
            return Collections.emptyMap();
        }
    }, 
    b("NEWER", 1) {
        RichTimeline$RequestType$2(final String s, final int n) {
        }
        
        @Override
        Map a(final bg bg, final int n, final long n2, final long n3) {
            final String b = bg.b(n, n2, n3);
            if (b != null) {
                return Collections.singletonMap("up_cursor", b);
            }
            return RichTimeline$RequestType$2.a.a(bg, n, n2, n3);
        }
    }, 
    c("OLDER", 2) {
        RichTimeline$RequestType$3(final String s, final int n) {
        }
        
        @Override
        Map a(final bg bg, final int n, final long n2, final long n3) {
            final String c = bg.c(n, n2, n3);
            if (c != null) {
                return Collections.singletonMap("down_cursor", c);
            }
            return RichTimeline$RequestType$3.a.a(bg, n, n2, n3);
        }
    }, 
    d("GAP", 3) {
        RichTimeline$RequestType$4(final String s, final int n) {
        }
        
        @Override
        Map a(final bg bg, final int n, final long n2, final long n3) {
            final HashMap<String, String> hashMap = new HashMap<String, String>(2);
            final String a = bg.a(n, 4, n2, n3);
            final String a2 = bg.a(n, 5, n2, n3);
            if (a != null) {
                hashMap.put("down_cursor", a);
            }
            if (a2 != null) {
                hashMap.put("up_cursor", a2);
            }
            return hashMap;
        }
    };
    
    private RichTimeline$RequestType(final String s, final int n) {
    }
    
    abstract Map a(final bg p0, final int p1, final long p2, final long p3);
}
