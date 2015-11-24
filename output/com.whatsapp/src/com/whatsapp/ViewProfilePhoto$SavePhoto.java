// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import java.io.FileNotFoundException;
import android.content.Context;
import com.whatsapp.util.br;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

public class ViewProfilePhoto$SavePhoto extends Activity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "F\"b<";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = '(';
                        break;
                    }
                    case 1: {
                        c2 = 'C';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0006)\u007f>";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "I-k+>A'!0?\\&a-\u007fM;{+0\u0006\u0010[\u000b\u0014i\u000e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Q:v \u001ce'k\u0006\u0019`.b*\"";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "s|5\u0005~\u0002a3g-u";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Uri uri = (Uri)this.getIntent().getParcelableExtra(ViewProfilePhoto$SavePhoto.z[2]);
        final File file = new File(qf.e(), this.getIntent().getStringExtra(ViewProfilePhoto$SavePhoto.z[0]).replaceAll(ViewProfilePhoto$SavePhoto.z[4], "") + " " + new SimpleDateFormat(ViewProfilePhoto$SavePhoto.z[3], Locale.US).format(new Date()) + ViewProfilePhoto$SavePhoto.z[1]);
        while (true) {
            try {
                br.a(new File(uri.getPath()), file);
                br.a((Context)this, Uri.fromFile(file));
                App.a(this.getApplicationContext(), 2131231473, 0);
                this.finish();
            }
            catch (FileNotFoundException ex) {
                App.a(this.getApplicationContext(), 2131231465, 1);
                continue;
            }
            catch (IOException ex2) {
                App.a(this.getApplicationContext(), 2131231465, 1);
                continue;
            }
            break;
        }
    }
}
