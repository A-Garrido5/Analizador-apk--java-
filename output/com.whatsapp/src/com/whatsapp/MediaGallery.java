// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.view.Menu;
import java.util.Collection;
import android.app.Activity;
import java.util.ArrayList;
import android.app.Dialog;
import android.os.Environment;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView$OnItemClickListener;
import com.whatsapp.util.Log;
import android.os.Bundle;
import com.whatsapp.gallerypicker.aa;
import android.content.Context;
import com.whatsapp.gallerypicker.MediaGalleryBase$MediaItemView;
import com.whatsapp.gallerypicker.u;
import android.view.View;
import com.whatsapp.protocol.bi;
import android.support.v7.view.ActionMode$Callback;
import java.util.HashMap;
import android.support.v7.view.ActionMode;
import com.whatsapp.gallerypicker.MediaGalleryBase;

public class MediaGallery extends MediaGalleryBase
{
    private static final String[] I;
    private ActionMode E;
    private String F;
    private HashMap G;
    private ActionMode$Callback H;
    
    static {
        final String[] i = new String[9];
        String s = "H<\u001eU\u0013B8\u0016P\u0017W U_\u0000@8\u000eY";
        int n = -1;
        String[] array = i;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = 'Y';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "O0\u001e";
                    n2 = 1;
                    array = i;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "H6\u000fR\u0006@=";
                    n2 = 2;
                    array = i;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "H6\u000fR\u0006@=%N\u001d";
                    n2 = 3;
                    array = i;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "D5\u001fN\u0006";
                    n2 = 4;
                    array = i;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = i;
                    s = "H<\u001eU\u0013B8\u0016P\u0017W UX\u001bD5\u0015[]A<\u0016Y\u0006@y\u0014SRH<\tO\u0013B<\t";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "H<\u001eU\u0013B8\u0016P\u0017W UX\u001bD5\u0015[]A<\u0016Y\u0006@v";
                    n = 5;
                    array = i;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "H<\u001eU\u0013B8\u0016P\u0017W UX\u0017V-\bS\u000b";
                    n = 6;
                    array = i;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "O0\u001e";
                    n = 7;
                    array = i;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        I = i;
    }
    
    public MediaGallery() {
        this.G = new HashMap();
        this.H = new a2m(this);
    }
    
    static ActionMode$Callback a(final MediaGallery mediaGallery) {
        return mediaGallery.H;
    }
    
    static ActionMode a(final MediaGallery mediaGallery, final ActionMode e) {
        return mediaGallery.E = e;
    }
    
    private awx a() {
        return (awx)this.o;
    }
    
    static void a(final MediaGallery mediaGallery, final bi bi, final View view) {
        mediaGallery.a(bi, view);
    }
    
    static void a(final MediaGallery mediaGallery, final boolean b, final boolean b2) {
        mediaGallery.a(b, b2);
    }
    
    private void a(final bi bi, final View view) {
        Label_0045: {
            if (this.G.containsKey(bi.a)) {
                this.G.remove(bi.a);
                if (!App.I) {
                    break Label_0045;
                }
            }
            this.G.put(bi.a, bi);
        }
        this.s.notifyDataSetChanged();
        this.E.invalidate();
    }
    
    static HashMap b(final MediaGallery mediaGallery) {
        return mediaGallery.G;
    }
    
    static u c(final MediaGallery mediaGallery) {
        return mediaGallery.s;
    }
    
    static awx d(final MediaGallery mediaGallery) {
        return mediaGallery.a();
    }
    
    static ActionMode e(final MediaGallery mediaGallery) {
        return mediaGallery.E;
    }
    
    static u f(final MediaGallery mediaGallery) {
        return mediaGallery.s;
    }
    
    static String g(final MediaGallery mediaGallery) {
        return mediaGallery.F;
    }
    
    public MediaGalleryBase$MediaItemView a() {
        return new MediaGallery$GalleryMediaItemView((Context)this);
    }
    
    @Override
    protected aa a(final boolean b) {
        return new awx(this.getContentResolver(), this.getIntent().getStringExtra(MediaGallery.I[8]));
    }
    
    @Override
    protected boolean a(final int n) {
        return this.G.containsKey(this.a().a(n).a);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        Log.i(MediaGallery.I[0]);
        super.onCreate(bundle);
        App.y();
        this.F = this.getIntent().getStringExtra(MediaGallery.I[1]);
        this.y.setOnItemClickListener((AdapterView$OnItemClickListener)new arg(this));
        this.y.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)new a3(this));
        Label_0132: {
            if (this.getIntent().getBooleanExtra(MediaGallery.I[4], false)) {
                final String externalStorageState = Environment.getExternalStorageState();
                if (!externalStorageState.equals(MediaGallery.I[2]) && !externalStorageState.equals(MediaGallery.I[3])) {
                    int n;
                    if (App.aw()) {
                        n = 2131231383;
                    }
                    else {
                        n = 2131231384;
                    }
                    this.a(n);
                    if (!App.I) {
                        break Label_0132;
                    }
                }
                this.a(2131231142);
            }
        }
        this.a(false, false);
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                if (this.G == null || this.G.isEmpty()) {
                    Log.e(MediaGallery.I[5]);
                    return super.onCreateDialog(n);
                }
                Log.i(MediaGallery.I[6] + this.G.size());
                final ArrayList list = new ArrayList(this.G.values());
                return alh.a(this, list, this.F, 1, new dg(this, list));
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return true;
    }
    
    @Override
    public void onDestroy() {
        Log.i(MediaGallery.I[7]);
        super.onDestroy();
        App.y();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    public void onPause() {
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
    }
}
