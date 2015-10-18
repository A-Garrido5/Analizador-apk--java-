// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import android.provider.MediaStore$Images$Media;
import android.view.View;
import android.view.View$OnClickListener;

class cs implements View$OnClickListener
{
    private static final String[] z;
    final DescribeProblemActivity a;
    final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "Ll\u0011\u0000]\n+";
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
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Do\u0014\u0015WLe^\u000eVQd\u001e\u0013\u0016@y\u0004\u0015Y\u000bH>.ll@<8qkU5)lv";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Do\u0014\u0015WLe^\u000eVQd\u001e\u0013\u0016Db\u0004\u000eWK/ .{n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Fn\u001dIOM`\u0004\u0014YUq^\u000eVQd\u001e\u0013\u0016Db\u0004\u000eWK/\"\"ujW58kfS5\"vvI?3";
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
    
    cs(final DescribeProblemActivity a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent(cs.z[2], MediaStore$Images$Media.INTERNAL_CONTENT_URI);
        intent.setType(cs.z[0]);
        final Intent chooser = Intent.createChooser(intent, (CharSequence)null);
        if (DescribeProblemActivity.c(this.a)[this.b] != null) {
            chooser.putExtra(cs.z[1], (Parcelable[])new Intent[] { new Intent(cs.z[3], (Uri)null) });
        }
        this.a.startActivityForResult(chooser, 1 + this.b);
    }
}
