// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class a65 implements View$OnClickListener
{
    private static final String[] z;
    final VideoPreviewActivity a;
    
    static {
        final String[] z2 = new String[4];
        String s = "0eS's0c";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = 'B';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0eS's\"~Q/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\"eR's4mJ*";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "'mN6E+b";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a65(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        VideoPreviewActivity.c(this.a).a();
        final Intent intent = new Intent();
        if (VideoPreviewActivity.g(this.a) - VideoPreviewActivity.k(this.a) < 1000L) {
            VideoPreviewActivity.b(this.a, Math.min(1000L + VideoPreviewActivity.k(this.a), VideoPreviewActivity.m(this.a).e()));
            VideoPreviewActivity.a(this.a, Math.max(0L, VideoPreviewActivity.g(this.a) - 1000L));
        }
        if (VideoPreviewActivity.k(this.a) - 200L > 0L || 200L + VideoPreviewActivity.g(this.a) < VideoPreviewActivity.m(this.a).e()) {
            intent.putExtra(a65.z[1], VideoPreviewActivity.k(this.a));
            intent.putExtra(a65.z[0], VideoPreviewActivity.g(this.a));
        }
        intent.putExtra(a65.z[2], VideoPreviewActivity.n(this.a).getAbsolutePath());
        intent.putExtra(a65.z[3], cq.a(VideoPreviewActivity.f(this.a).getText().toString()));
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
