// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.util.bk;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.App;
import android.content.Context;

public class o
{
    public static void a(final Context context) {
        int n = 1;
        if (App.b()) {
        Label_0069_Outer:
            while (true) {
                final PackageManager packageManager = context.getPackageManager();
                while (true) {
                Label_0093:
                    while (true) {
                        try {
                            packageManager.getPackageInfo("io.crash.air", 0);
                            final int n2 = n;
                            if (n2 == 0) {
                                break;
                            }
                            try {
                                if (packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime + 86400000L * d.a("dogfood_update_interval", 5) >= bk.a()) {
                                    break Label_0093;
                                }
                                if (n != 0) {
                                    x.a(context).b("io.crash.air");
                                }
                                return;
                            }
                            catch (PackageManager$NameNotFoundException ex) {
                                return;
                            }
                        }
                        catch (PackageManager$NameNotFoundException ex2) {
                            final int n2 = 0;
                            continue Label_0069_Outer;
                        }
                        break;
                    }
                    n = 0;
                    continue;
                }
            }
            x.a(context).f();
        }
    }
}
