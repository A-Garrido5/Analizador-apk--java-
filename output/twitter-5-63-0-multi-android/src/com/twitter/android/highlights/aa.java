// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import android.content.res.Resources;
import android.content.Context;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.api.TwitterUser;

public class aa
{
    public static String a(final mx mx, final int n) {
        switch (mx.a) {
            default: {
                return null;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 13:
            case 14: {
                if (mx.c != null && n < mx.c.size()) {
                    return mx.c.get(n).profileImageUrl;
                }
                ErrorReporter.a(new InvalidDataException("User related proof request out of bounds: " + n));
                return null;
            }
        }
    }
    
    public static String a(final mx mx, final Context context) {
        final Resources resources = context.getResources();
        switch (mx.a) {
            default: {
                return resources.getString(2131297895);
            }
            case 2: {
                return a(mx, resources, 2131297893, 2131427365);
            }
            case 3: {
                return a(mx, resources, 2131297902, 2131427367);
            }
            case 4: {
                return a(mx, resources, 2131297903, 2131427368);
            }
            case 5: {
                return a(mx, resources, 2131297894, 2131427366);
            }
            case 13: {
                return a(mx, resources, 2131297892, 2131427364);
            }
            case 6: {
                return resources.getString(2131297899);
            }
            case 7: {
                return resources.getString(2131297907);
            }
            case 8: {
                return resources.getString(2131297900);
            }
            case 9: {
                return resources.getString(2131297896);
            }
            case 10: {
                return resources.getString(2131297904);
            }
            case 11: {
                return resources.getString(2131297906);
            }
            case 12: {
                return resources.getString(2131297905);
            }
            case 14: {
                if (mx.c != null && !mx.c.isEmpty()) {
                    return resources.getString(2131297901, new Object[] { mx.c.get(0).username });
                }
                if (mx.b == 0) {
                    return resources.getString(2131296782);
                }
                if (mx.b == 1) {
                    return resources.getString(2131296783);
                }
                return resources.getString(2131296781, new Object[] { mx.b });
            }
            case 15: {
                return resources.getString(2131297898);
            }
            case 16: {
                return resources.getString(2131297897);
            }
        }
    }
    
    private static String a(final mx mx, final Resources resources, @StringRes final int n, @PluralsRes final int n2) {
        final int b = mx.b;
        TwitterUser twitterUser2;
        int n4;
        if (mx.c != null && !mx.c.isEmpty()) {
            final int size = mx.c.size();
            final TwitterUser twitterUser = mx.c.get(0);
            final int n3 = b + (size - 1);
            twitterUser2 = twitterUser;
            n4 = n3;
        }
        else {
            n4 = b;
            twitterUser2 = null;
        }
        if (twitterUser2 == null) {
            ErrorReporter.a(new InvalidDataException("User related proof did not receive a list of users"));
            return resources.getString(2131297895);
        }
        if (n4 > 0) {
            return resources.getQuantityString(n2, n4, new Object[] { twitterUser2.username, n4 });
        }
        return resources.getString(n, new Object[] { twitterUser2.username });
    }
}
