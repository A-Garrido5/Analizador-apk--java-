// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class ResetWallpaper extends Activity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00115]}-\u001a;D ;\u0002*\u001e:4\u0006?^'t\u00139D:5\u001ctb\u0016\t7\u000eo\u0004\u001b>\u0016`\u0012\n7\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001b)o7?\u0014;E?.";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u001b)o!?\u0001?D";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = new Intent();
        Label_0059: {
            if (ResetWallpaper.z[0].equals(this.getIntent().getAction())) {
                intent.putExtra(ResetWallpaper.z[2], true);
                if (!ImageViewTouchBase.h) {
                    break Label_0059;
                }
            }
            intent.putExtra(ResetWallpaper.z[1], true);
        }
        this.setResult(-1, intent);
        this.finish();
    }
}
