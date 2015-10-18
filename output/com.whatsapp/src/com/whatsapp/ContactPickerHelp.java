// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.ListAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.List;

public class ContactPickerHelp extends DialogToastListActivity
{
    private static final String z;
    k7 q;
    List r;
    TextView s;
    boolean t;
    CheckBox u;
    
    static {
        final char[] charArray = "g\tvMRg\u0012p\\_tI{KVe\u0012}".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '3';
                    break;
                }
                case 0: {
                    c2 = '\u0004';
                    break;
                }
                case 1: {
                    c2 = 'f';
                    break;
                }
                case 2: {
                    c2 = '\u0018';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public void b(final int n) {
        switch (n) {
            default: {}
            case 2131230943: {
                this.finish();
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(ContactPickerHelp.z);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903100);
        ((Button)this.findViewById(2131755399)).setOnClickListener((View$OnClickListener)new mo(this));
        this.s = (TextView)this.findViewById(2131755404);
        this.r = new ArrayList();
        this.q = new k7((Context)this, 2130903101, this.r);
        this.c().setAdapter((ListAdapter)this.q);
        this.s.setVisibility(4);
        this.c().setVisibility(8);
        (this.u = (CheckBox)this.findViewById(2131755402)).setChecked(App.w((Context)this));
        this.u.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new b9(this));
        this.findViewById(2131755401).setOnClickListener((View$OnClickListener)new vf(this));
        ((ScrollView)this.findViewById(2131755344)).post((Runnable)new xr(this));
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
