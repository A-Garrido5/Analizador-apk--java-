// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.support.v4.app.Fragment;
import com.whatsapp.util.Log;
import android.os.Bundle;

public class ArchivedConversationsActivity extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0015<\nu\u001e\u0002+\r~\u0018\u001a8\fo\u0004\u0015:\u0000r\u0019\u0007a\rx\u0004\u0000<\u0006d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = '\u001d';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0015<\nu\u001e\u0002+\r~\u0018\u001a8\fo\u0004\u0015:\u0000r\u0019\u0007a\no\u0012\u0015:\f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(ArchivedConversationsActivity.z[1]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903077);
        if (bundle == null) {
            this.getSupportFragmentManager().beginTransaction().add(2131755260, new ArchivedConversationsFragment()).commit();
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ArchivedConversationsActivity.z[0]);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
}
