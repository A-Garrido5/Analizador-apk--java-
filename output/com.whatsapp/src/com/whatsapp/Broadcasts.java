// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.widget.AdapterView$AdapterContextMenuInfo;
import com.whatsapp.protocol.bi;
import android.view.MenuItem;

public class Broadcasts extends DialogToastListActivity
{
    private static final String[] z;
    private aqg q;
    private final aws r;
    private final a9q s;
    private final sj t;
    
    static {
        final String[] z2 = new String[4];
        String s = "\tff\f=\buz\u0019*Dw{\b8\u001fq";
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
                        c2 = 'Y';
                        break;
                    }
                    case 0: {
                        c2 = 'k';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = '\t';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\tff\f=\buz\u0019*Kvf\u00187\bq)\u00196Kyh\u00047";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\tff\f=\buz\u0019*Dw{\b8\u001fq&\u00036Fyl@6\u00199d\u001e>\u0018`f\u001f<Fpk";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\tff\f=\buz\u0019*Dpl\u001e-\u0019{p";
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
    
    public Broadcasts() {
        this.s = new a9q();
        this.t = new sg(this);
        this.r = new a2c(this);
    }
    
    static aqg a(final Broadcasts broadcasts) {
        return broadcasts.q;
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onContextItemSelected(menuItem);
            }
            case 1: {
                App.a((bi)((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).targetView.getTag(), false);
                return true;
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        Log.i(Broadcasts.z[0]);
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        App.ak.a(this.t);
        App.b(this.r);
        if (App.aX == null || !App.ak.l() || App.c((Context)this) != 3) {
            Log.i(Broadcasts.z[2]);
            App.F(Broadcasts.z[1]);
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
            return;
        }
        this.setContentView(2130903084);
        this.q = new aqg(this);
        final ListView c = this.c();
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean fastScrollEnabled = false;
        if (sdk_INT < 11) {
            fastScrollEnabled = true;
        }
        c.setFastScrollEnabled(fastScrollEnabled);
        if (Build$VERSION.SDK_INT < 11) {
            c.setSelector(2130839068);
        }
        c.setScrollbarFadingEnabled(true);
        c.setAdapter((ListAdapter)this.q);
        c.setOnItemClickListener((AdapterView$OnItemClickListener)new x9(this));
        this.registerForContextMenu((View)c);
    }
    
    @Override
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
        contextMenu.add(0, 1, 0, (CharSequence)this.getString(2131230992));
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        Log.i(Broadcasts.z[3]);
        super.onDestroy();
        this.s.a();
        App.ak.b(this.t);
        App.a(this.r);
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
