// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.content.Context;
import android.text.format.Formatter;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

public class InsufficientStorageSpaceActivity extends DialogToastActivity
{
    private static final String[] z;
    private long k;
    
    static {
        final String[] z2 = new String[3];
        String s = "Z?g]4R5-F5O4m[uZ2wF4U\u007fNn\u0012u";
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
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = 'Q';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Z?g]4R5-F5O4m[uX0wJ<T#z\u0001\u0013t\u001cF";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "H!bL>u4fK>_\u0018mm\"O4p";
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
    
    @Override
    public void onBackPressed() {
        final Intent intent = new Intent(InsufficientStorageSpaceActivity.z[0]);
        intent.addCategory(InsufficientStorageSpaceActivity.z[1]);
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903073);
        final Button button = (Button)this.findViewById(2131755195);
        final TextView textView = (TextView)this.findViewById(2131755194);
        this.k = this.getIntent().getLongExtra(InsufficientStorageSpaceActivity.z[2], -1L);
        textView.setText((CharSequence)String.format(this.getString(2131231252), Formatter.formatShortFileSize((Context)this, this.k)));
        button.setOnClickListener((View$OnClickListener)new f7(this));
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (App.u() > this.k) {
            this.finish();
        }
    }
}
