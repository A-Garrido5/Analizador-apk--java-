// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.webkit.WebView;
import android.os.Bundle;
import android.content.Intent;

public class FaqItemActivity extends DialogToastActivity
{
    private static final String[] z;
    private long k;
    private long l;
    private long m;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u00078\b-},#\u0015!t,$\f)\u007f\u0007";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0007>\b t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u00072\u00048>\u001b#\u0011 ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00108\u00128t\u001d#";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&\u0003:a)";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0006%\u0010";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u00078\b-},#\u0015!t,$\f)\u007f\u0007";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void onBackPressed() {
        this.k = System.currentTimeMillis();
        this.l += this.k - this.m;
        this.m = System.currentTimeMillis();
        this.setResult(-1, new Intent().putExtra(FaqItemActivity.z[0], this.l));
        super.onBackPressed();
        this.overridePendingTransition(2130968588, 2130968591);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903155);
        this.getSupportActionBar().setTitle(this.getIntent().getStringExtra(FaqItemActivity.z[1]));
        ((WebView)this.findViewById(2131755573)).loadDataWithBaseURL(this.getIntent().getStringExtra(FaqItemActivity.z[5]), this.getIntent().getStringExtra(FaqItemActivity.z[3]), FaqItemActivity.z[2], FaqItemActivity.z[4], (String)null);
        this.l = 0L;
    }
    
    public void onDestroy() {
        super.onDestroy();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                this.overridePendingTransition(2130968588, 2130968591);
                return true;
            }
        }
    }
    
    public void onPause() {
        super.onPause();
        this.k = System.currentTimeMillis();
        this.l += this.k - this.m;
        this.m = System.currentTimeMillis();
    }
    
    public void onResume() {
        super.onResume();
        this.m = System.currentTimeMillis();
    }
    
    public void onStop() {
        super.onStop();
        this.k = System.currentTimeMillis();
        this.l += this.k - this.m;
        this.m = System.currentTimeMillis();
        this.setResult(-1, new Intent().putExtra(FaqItemActivity.z[6], this.l));
    }
}
