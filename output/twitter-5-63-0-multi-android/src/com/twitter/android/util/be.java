// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.io.IOException;
import com.twitter.library.util.bh;
import android.text.TextUtils;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.twitter.library.client.App;
import android.content.Context;

public class be
{
    private static boolean a;
    private static String b;
    
    public static boolean a(final Context context) {
        b(context);
        return aq.a.contains(be.b);
    }
    
    private static void b(final Context context) {
        if (be.a) {
            return;
        }
        while (true) {
            Label_0084: {
                if (!App.f()) {
                    break Label_0084;
                }
                while (true) {
                    try {
                        be.b = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] { "/system/bin/getprop", "log.tag.twitter.CountryKey" }).getInputStream())).readLine();
                        if (TextUtils.isEmpty((CharSequence)be.b)) {
                            be.b = bh.a(context);
                        }
                        be.a = true;
                        return;
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                        continue;
                    }
                    break;
                }
            }
            be.b = bh.a(context);
            continue;
        }
    }
}
