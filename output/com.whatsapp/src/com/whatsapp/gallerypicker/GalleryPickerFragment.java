// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.LayoutInflater;
import android.view.View$OnCreateContextMenuListener;
import android.widget.AdapterView$OnItemClickListener;
import com.whatsapp.App;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import android.view.ViewGroup;
import android.support.v4.app.FragmentActivity;
import android.provider.MediaStore$Images$Media;
import android.content.IntentFilter;
import android.widget.ListAdapter;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.Build$VERSION;
import com.whatsapp.alm;
import java.util.ArrayList;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.database.ContentObserver;
import android.content.BroadcastReceiver;
import android.widget.GridView;
import android.support.v4.app.Fragment;

public class GalleryPickerFragment extends Fragment
{
    private static final String f;
    private static boolean o;
    private static final ah[] q;
    private static final String[] z;
    private boolean b;
    private int c;
    private GridView d;
    private aw e;
    private a_ g;
    private BroadcastReceiver h;
    private ContentObserver i;
    private boolean j;
    private Handler k;
    private Thread l;
    private Drawable m;
    volatile boolean n;
    private int p;
    private View r;
    private int s;
    ArrayList t;
    
    static {
        final String[] z2 = new String[27];
        String s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\u0014yl\u000e!\u0017xq\u0005s\fcu\u0014d\u001a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0707:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "uj\u000eu\u001bxqZ.Quj\r/\t~d\u0014r\u001ffuNq\fys\te\u001bd+\rd\u001a\u007fdOc\u000bun\u0005u\r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "9a\u0005r\ndj\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\fsf\u0005h\bsh\u0005e\u0017wg\u0012n\u001frf\u0001r\n9D#U7YK?L;RL!^3YP.U;R";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?T0[J5O*SA";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?R=WK.D,IV4@,B@$";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?R=WK.D,IC)O7EM%E";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\fsf\u0005h\bsh\u0005e\u0017wg\u0012n\u001frf\u0001r\n9D#U7YK?L;RL!^-UD.O;DZ&H0_V(D:";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\fsf\u0005h\bsh\u0005e\u0017wg\u0012n\u001frf\u0001r\n9D#U7YK?L;RL!^;\\@#U";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\fsf\u0005h\bsh\u0005e\u0017wg\u0012n\u001frf\u0001r\n9D#U7YK?L;RL!^+XH/T0B@$";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?L1CK4D:";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.\fsf\u0005h\bsh\u0005e\u0017wg\u0012n\u001frf\u0001r\n9D#U7YK?L;RL!^-UD.O;DZ3U?DQ%E";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?D4SF4";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u007fk\u0003m\u000br`";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?R=WK.D,IV4@,B@$";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "pl\fd";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?T0[J5O*SA";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?L1CK4D:";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?D4SF4";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "wk\u0004s\u0011\u007faNh\u0010b`\u000euPwf\u0014h\u0011x+-D:_D?R=WK.D,IC)O7EM%E";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Qd\fm\u001bd|0h\u001d}`\u0012!)yw\u000bd\f";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "6v\u0003`\u0010xl\u000efD";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "6j\fe\u000bxh\u000ft\u0010b`\u0004;";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "6j\fe\rud\u000eo\u0017xbZ";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "qd\fm\u001bd|\u0010h\u001d}`\u0012.";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "9w\u0005c\u001f}`@t\u0010{j\u0015o\nsaZ";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    break Label_0707;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        GalleryPickerFragment.o = (alm.c && Build$VERSION.SDK_INT < 21);
        f = a6.b;
        q = new ah[] { new ah(2, 1, a6.b, 2131231136), new ah(3, 4, a6.b, 2131231138), new ah(0, 1, null, 2131230803), new ah(1, 4, null, 2131230805) };
    }
    
    public GalleryPickerFragment() {
        this.s = 1;
        this.k = new Handler();
        this.n = false;
        this.t = new ArrayList();
    }
    
    static int a(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.c;
    }
    
    private aa a(final int n, final String s, final ContentResolver contentResolver) {
        final aa a = a6.a(contentResolver, bv.EXTERNAL, n, 2, s);
        this.t.add(a);
        return a;
    }
    
    private void a() {
        final int v = MediaGalleryBase.v;
        final Cursor query = this.f().query(Uri.parse(GalleryPickerFragment.z[1]), (String[])null, (String)null, (String[])null, (String)null);
        if (query != null) {
            while (query.moveToNext()) {
                final String string = query.getString(0);
                final String string2 = query.getString(1);
                if (this.n && v == 0) {
                    break;
                }
                ba ba;
                if (this.s == 4) {
                    ba = new bc(this.f(), 2, string);
                }
                else {
                    ba = new br(this.f(), 2, string);
                }
                if (!ba.d()) {
                    this.k.post((Runnable)new bt(this, new n(this, 6, this.s, string, string2, ba.a(0), ba.e())));
                }
                ba.a();
                if (v != 0) {
                    break;
                }
            }
            query.close();
        }
    }
    
    private void a(final int n, final View view) {
        this.e.b.get(n).a(this.getActivity(), view);
    }
    
    private void a(final Intent intent) {
        final int v = MediaGalleryBase.v;
        final String action = intent.getAction();
        if (action.equals(GalleryPickerFragment.z[11])) {
            Log.i(GalleryPickerFragment.z[4]);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(GalleryPickerFragment.z[5])) {
            Log.i(GalleryPickerFragment.z[10]);
            this.a(true, false);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(GalleryPickerFragment.z[6])) {
            Log.i(GalleryPickerFragment.z[12]);
            this.a(false, true);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(GalleryPickerFragment.z[7])) {
            Log.i(GalleryPickerFragment.z[8]);
            this.a(false, false);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(GalleryPickerFragment.z[13])) {
            Log.i(GalleryPickerFragment.z[9]);
            this.a(true, false);
        }
    }
    
    private void a(final ContextMenu contextMenu, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final int n, final View view) {
        galleryPickerFragment.a(n, view);
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final Intent intent) {
        galleryPickerFragment.a(intent);
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final ContextMenu contextMenu, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        galleryPickerFragment.a(contextMenu, contextMenu$ContextMenuInfo);
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final n n) {
        galleryPickerFragment.a(n);
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final boolean b) {
        galleryPickerFragment.a(b);
    }
    
    static void a(final GalleryPickerFragment galleryPickerFragment, final boolean b, final boolean b2) {
        galleryPickerFragment.a(b, b2);
    }
    
    private void a(final n n) {
        if (this.getActivity() != null) {
            if (this.e.getCount() == 0) {
                this.m();
            }
            this.e.a(n);
            this.e.b();
        }
    }
    
    private void a(final boolean b) {
    }
    
    private void a(final boolean b, final boolean b2) {
        this.a(b, b2, false);
    }
    
    private void a(final boolean b, final boolean j, final boolean b2) {
        Log.i(GalleryPickerFragment.z[25] + this.s + GalleryPickerFragment.z[26] + b + GalleryPickerFragment.z[22] + j + GalleryPickerFragment.z[23] + this.b + GalleryPickerFragment.z[24] + this.j);
        if (b != this.b || j != this.j || b2) {
            this.e();
            this.b = b;
            this.a(this.j = j);
            if (this.b) {
                this.h();
                if (MediaGalleryBase.v == 0) {
                    return;
                }
            }
            this.m();
            this.l();
        }
    }
    
    static int b(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.s;
    }
    
    private void b() {
        this.k.post((Runnable)new f(this, a6.a(this.f())));
    }
    
    static boolean b(final GalleryPickerFragment galleryPickerFragment, final boolean j) {
        return galleryPickerFragment.j = j;
    }
    
    private void c() {
        this.e = new aw(this, this.getActivity().getLayoutInflater());
        this.d.setAdapter((ListAdapter)this.e);
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GalleryPickerFragment.z[18]);
        intentFilter.addAction(GalleryPickerFragment.z[17]);
        intentFilter.addAction(GalleryPickerFragment.z[15]);
        intentFilter.addAction(GalleryPickerFragment.z[20]);
        intentFilter.addAction(GalleryPickerFragment.z[19]);
        intentFilter.addDataScheme(GalleryPickerFragment.z[16]);
        this.getActivity().registerReceiver(this.h, intentFilter);
        this.f().registerContentObserver(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, true, this.i);
        this.g = new a_(this.f(), this.k);
        this.b = false;
        this.j = false;
        this.l();
    }
    
    static void c(final GalleryPickerFragment galleryPickerFragment) {
        galleryPickerFragment.g();
    }
    
    static int d(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.p;
    }
    
    private void d() {
        final int v = MediaGalleryBase.v;
        final int length = GalleryPickerFragment.q.length;
        final aa[] array = new aa[length];
        int n2;
        for (int i = 0; i < length; i = n2) {
            final ah ah = GalleryPickerFragment.q[i];
            Label_0266: {
                if ((ah.b & this.s) != 0x0 || v != 0) {
                    if (this.n) {
                        break;
                    }
                    array[i] = this.a(ah.b & this.s, ah.a, this.f());
                    if (array[i].d()) {
                        array[i].a();
                        if (v == 0) {
                            break Label_0266;
                        }
                    }
                    if (i == 2 && array[0].e() == array[2].e()) {
                        array[i].a();
                        if (v == 0) {
                            break Label_0266;
                        }
                    }
                    if (i == 3 && array[1].e() == array[3].e()) {
                        array[i].a();
                        if (v == 0) {
                            break Label_0266;
                        }
                    }
                    final n n = new n(this, ah.c, this.s, ah.a, this.getResources().getString(ah.d), array[i].a(0), array[i].e());
                    array[i].a();
                    this.k.post((Runnable)new ao(this, n));
                }
            }
            n2 = i + 1;
            if (v != 0) {
                break;
            }
        }
    }
    
    static Drawable e(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.m;
    }
    
    private void e() {
        if (this.l == null) {
            return;
        }
        a2.a().a(this.l, this.f());
        this.n = true;
        while (true) {
            try {
                this.l.join();
                this.l = null;
                this.k.removeMessages(0);
                this.e.a();
                this.e.b();
                this.o();
            }
            catch (InterruptedException ex) {
                Log.i(GalleryPickerFragment.z[0]);
                continue;
            }
            break;
        }
    }
    
    private ContentResolver f() {
        final FragmentActivity activity = this.getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getContentResolver();
    }
    
    static a_ f(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.g;
    }
    
    private void g() {
        this.b();
        if (!this.n) {
            this.d();
            if (!this.n) {
                this.n();
                if (!this.n) {
                    this.a();
                    if (!this.n) {
                        this.k.post((Runnable)new bz(this));
                    }
                }
            }
        }
    }
    
    static void g(final GalleryPickerFragment galleryPickerFragment) {
        galleryPickerFragment.k();
    }
    
    static ContentResolver h(final GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.f();
    }
    
    private void h() {
        if (this.r == null) {
            final ViewGroup viewGroup = (ViewGroup)this.getView().findViewById(2131755579);
            this.getActivity().getLayoutInflater().inflate(2130903160, viewGroup);
            this.r = viewGroup.findViewById(2131755581);
        }
        this.r.setVisibility(0);
    }
    
    static boolean i() {
        return GalleryPickerFragment.o;
    }
    
    private void j() {
        if (this.g != null) {
            this.e();
            this.g.d();
            this.g = null;
            this.getActivity().unregisterReceiver(this.h);
            this.f().unregisterContentObserver(this.i);
            this.e = null;
            this.d.setAdapter((ListAdapter)null);
        }
    }
    
    private void k() {
        if (!this.j && this.getActivity() != null && this.e.b.size() == 0) {
            this.h();
        }
    }
    
    private void l() {
        this.n = false;
        this.l = new g(this, GalleryPickerFragment.z[21]);
        a2.a().c(this.l);
        this.l.start();
    }
    
    private void m() {
        if (this.r != null) {
            this.r.setVisibility(8);
        }
    }
    
    private void n() {
        final int v = MediaGalleryBase.v;
        aa aa = null;
        Label_0036: {
            if (!this.b) {
                aa = a6.a(this.f(), bv.EXTERNAL, this.s, 2, null);
                if (v == 0) {
                    break Label_0036;
                }
            }
            aa = a6.a();
        }
        if (this.n) {
            aa.a();
        }
        else {
            final ArrayList list = new ArrayList<Object>(aa.b().entrySet());
            Collections.sort((List<E>)list, new ap(this));
            aa.a();
            if (!this.n) {
                for (final Map.Entry<String, V> entry : list) {
                    final String s = entry.getKey();
                    if (s != null || v != 0) {
                        if (this.n) {
                            break;
                        }
                        if (!s.equals(GalleryPickerFragment.f)) {
                            final aa a = this.a(this.s, s, this.f());
                            if (!a.d()) {
                                this.k.post((Runnable)new am(this, new n(this, 5, this.s, s, (String)entry.getValue(), a.a(0), a.e())));
                            }
                            a.a();
                        }
                        if (v != 0) {
                            return;
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    private void o() {
        final int v = MediaGalleryBase.v;
        final Iterator<aa> iterator = (Iterator<aa>)this.t.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
            if (v != 0) {
                break;
            }
        }
        this.t.clear();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.s = this.getArguments().getInt(GalleryPickerFragment.z[14]);
        this.p = this.getResources().getColor(2131623999);
        this.m = (Drawable)new ColorDrawable(this.p);
        this.c = this.getResources().getDimensionPixelSize(2131361913);
        this.d = (GridView)this.getView().findViewById(2131755578);
        if (GalleryPickerFragment.o && !App.ak()) {
            this.d.setHorizontalSpacing(0);
        }
        this.d.setOnItemClickListener((AdapterView$OnItemClickListener)new bb(this));
        this.d.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)new y(this));
        this.h = new GalleryPickerFragment$3(this);
        this.i = new bl(this, this.k);
        this.c();
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130903158, viewGroup, false);
    }
    
    @Override
    public void onDestroy() {
        Log.i(GalleryPickerFragment.z[3] + this.s + GalleryPickerFragment.z[2]);
        super.onDestroy();
        this.j();
        a_.a();
    }
}
