// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import com.whatsapp.a_9;
import java.util.Iterator;
import com.whatsapp.util.b6;
import com.whatsapp.notification.y;
import com.whatsapp.util.cq;
import com.whatsapp.App;
import com.whatsapp.protocol.bi;
import android.os.Binder;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RemoteViews;
import android.content.Context;
import java.util.ArrayList;
import android.annotation.TargetApi;
import android.widget.RemoteViewsService$RemoteViewsFactory;

@TargetApi(11)
public class d implements RemoteViewsService$RemoteViewsFactory
{
    private static final String[] z;
    private ArrayList a;
    private final Context b;
    
    static {
        final String[] z2 = new String[4];
        String s = ">]`";
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
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#]`V\u0001 BmT\u0013'ReR\u0010;F}\u001e\u000b:PeE\u0005'QpR\f5ZcT\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#]`V\u0001 BmT\u0013'ReR\u0010;F}\u001e\u000b:WvT\u0005 Q";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "#]`V\u0001 BmT\u0013'ReR\u0010;F}\u001e\u000b:PaB\u0010&[}";
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
    
    public d(final Context b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public int getCount() {
        return this.a.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public RemoteViews getLoadingView() {
        return null;
    }
    
    public RemoteViews getViewAt(final int n) {
        if (n >= this.a.size()) {
            return null;
        }
        final RemoteViews remoteViews = new RemoteViews(this.b.getPackageName(), 2130903245);
        final f f = this.a.get(n);
        remoteViews.setTextViewText(2131755841, f.b);
        remoteViews.setTextViewText(2131755262, f.c);
        remoteViews.setTextViewText(2131755472, (CharSequence)f.d);
        final Intent intent = new Intent();
        final Bundle bundle = new Bundle();
        bundle.putString(d.z[0], f.a);
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(2131755840, intent);
        return remoteViews;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public void onCreate() {
        Log.i(d.z[2]);
        this.onDataSetChanged();
    }
    
    public void onDataSetChanged() {
        final int d = WidgetProvider.d;
        Log.i(com.whatsapp.appwidget.d.z[1]);
        final long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final ArrayList a = WidgetProvider.a();
            this.a.clear();
            if (a != null) {
                for (final bi bi : a) {
                    final f f = new f(null);
                    final a_9 e = App.S.e(bi.a.a);
                    f.a = e.u;
                    f.b = cq.a((CharSequence)e.a(this.b));
                    f.c = cq.a(y.a(this.b, bi, e, false, false));
                    f.d = b6.k(this.b, App.i(bi));
                    this.a.add(f);
                    if (d != 0) {
                        break;
                    }
                }
            }
        }
        finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
    
    public void onDestroy() {
        Log.i(d.z[3]);
    }
}
