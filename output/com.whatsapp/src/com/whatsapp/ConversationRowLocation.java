// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.content.res.Resources;
import com.whatsapp.util.b;
import android.widget.TextView$BufferType;
import android.text.SpannableStringBuilder;
import com.google.android.gms.maps.OnMapReadyCallback;
import android.os.Bundle;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition$Builder;
import com.google.android.gms.maps.GoogleMapOptions;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.content.Intent;
import java.text.NumberFormat;
import android.os.Build$VERSION;
import android.net.Uri;
import android.text.TextUtils;
import android.content.pm.PackageManager$NameNotFoundException;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptor;

public class ConversationRowLocation extends ConversationRow
{
    private static int H;
    private static BitmapDescriptor O;
    private static final String[] S;
    private MapView F;
    private final TextView G;
    private final View I;
    private final TextEmojiLabel J;
    private MediaData K;
    private final View L;
    private final TextView M;
    private a02 N;
    private final View P;
    private final View Q;
    private final ImageView R;
    
    static {
        final String[] s = new String[10];
        int n = 0;
        String[] array = s;
        String s2 = "0\nboF<\nh-D}\u0004a%S<\fko@#\u0015|oL2\u0015|";
        int n2 = -1;
        String intern = null;
    Label_0273:
        while (true) {
            final char[] charArray = s2.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '!';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = 'e';
                        break;
                    }
                    case 2: {
                        c2 = '\u000f';
                        break;
                    }
                    case 3: {
                        c2 = 'A';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    s2 = ";\u0011{1RiJ ,@#\u0016!&N<\u0002c$\u000f0\nbnL2\u0015|~Pn";
                    n = 1;
                    array = s;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    s2 = "2\u000bk3N:\u0001!(O'\u0000a5\u000f2\u0006{(N=KY\bd\u0004";
                    n = 2;
                    array = s;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    s2 = "sM";
                    n = 3;
                    array = s;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    array = s;
                    s2 = ";\u0011{1RiJ ,@#\u0016!&N<\u0002c$\u000f0\nbnL2\u0015|~Pn\t`\"\u001b";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s2 = ";\u0011{1RiJ ,@#\u0016!&N<\u0002c$\u000f0\nbnL2\u0015|~Pn\t`\"\u001b{";
                    n2 = 4;
                    array = s;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 6;
                    s2 = "u\u001f2p\u0017";
                    n2 = 5;
                    array = s;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 7;
                    s2 = ";\u0011{1RiJ ,@#\u0016!&N<\u0002c$\u000f0\nbnL2\u0015|~Pn";
                    n2 = 6;
                    array = s;
                    continue;
                }
                case 6: {
                    array[n] = intern;
                    n = 8;
                    s2 = "\u000f\u0016$";
                    n2 = 7;
                    array = s;
                    continue;
                }
                case 7: {
                    array[n] = intern;
                    n = 9;
                    s2 = "u\u0016c-\u001c";
                    n2 = 8;
                    array = s;
                    continue;
                }
                case 8: {
                    break Label_0273;
                }
            }
        }
        array[n] = intern;
        S = s;
        ConversationRowLocation.H = -1;
    }
    
    ConversationRowLocation(final Context context, final bi bi) {
        super(context, bi);
        this.N = new a02(this, null);
        this.R = (ImageView)this.findViewById(2131755393);
        this.I = this.findViewById(2131755484);
        this.M = (TextView)this.findViewById(2131755468);
        this.P = this.findViewById(2131755485);
        this.Q = this.findViewById(2131755492);
        this.J = (TextEmojiLabel)this.findViewById(2131755489);
        this.G = (TextView)this.findViewById(2131755490);
        this.L = this.findViewById(2131755494);
        this.J.setLinkHandler(new aav());
        this.J.setAutoLinkMask(0);
        this.J.setLinksClickable(false);
        this.J.setFocusable(false);
        this.J.setClickable(false);
        this.J.setLongClickable(false);
        this.b(bi);
    }
    
    private static int a() {
        Label_0029: {
            if (ConversationRowLocation.H >= 0) {
                break Label_0029;
            }
            try {
                ConversationRowLocation.H = App.aq.getPackageManager().getPackageInfo(ConversationRowLocation.S[0], 128).versionCode;
                return ConversationRowLocation.H;
            }
            catch (PackageManager$NameNotFoundException ex) {
                ConversationRowLocation.H = 0;
                return ConversationRowLocation.H;
            }
        }
    }
    
    static BitmapDescriptor a(final BitmapDescriptor o) {
        return ConversationRowLocation.O = o;
    }
    
    public static void a(final Context context, final double n, final double n2, String replace) {
        if (!TextUtils.isEmpty((CharSequence)replace)) {
            replace = replace.replace("(", "[").replace(")", "]");
        }
        Uri uri = null;
        Label_0173: {
            if (App.q()) {
                uri = Uri.parse(ConversationRowLocation.S[1] + n + "," + n2);
                if (!App.I) {
                    break Label_0173;
                }
            }
            String s = ConversationRowLocation.S[4] + n + "," + n2;
            if (!TextUtils.isEmpty((CharSequence)replace) && (Build$VERSION.SDK_INT > 10 || a() < 614050000)) {
                s = s + ConversationRowLocation.S[3] + replace + ")";
            }
            uri = Uri.parse(s);
        }
        if (NumberFormat.getInstance().format(1.1).indexOf(",") > 0 && Build$VERSION.SDK_INT >= 14 && a() >= 700000000 && a() < 702000000) {
            uri = Uri.parse(ConversationRowLocation.S[5] + n + "," + n2 + ConversationRowLocation.S[6]);
        }
        context.startActivity(new Intent(ConversationRowLocation.S[2], uri));
    }
    
    static BitmapDescriptor b() {
        return ConversationRowLocation.O;
    }
    
    private void b(final bi bi) {
        final boolean i = App.I;
        if (bi.G != 0.0 && bi.p != 0.0) {
            this.I.setOnClickListener((View$OnClickListener)this.N);
            this.I.setOnLongClickListener(this.v);
        }
        Label_0275: {
            if (App.ax() && (bi.p != 0.0 || bi.G != 0.0)) {
                if (this.F == null) {
                    final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131755493);
                    final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                    googleMapOptions.mapType(1).mapToolbarEnabled(false).zoomControlsEnabled(false).zoomGesturesEnabled(false).compassEnabled(false).rotateGesturesEnabled(false).tiltGesturesEnabled(false).scrollGesturesEnabled(false).camera(new CameraPosition$Builder().target(new LatLng(bi.p, bi.G)).zoom(15.0f).build()).liteMode(true);
                    MapsInitializer.initialize(this.getContext());
                    (this.F = new MapView(this.getContext(), googleMapOptions)).onCreate(null);
                    this.F.onResume();
                    viewGroup.addView((View)this.F, -1, -1);
                }
                this.F.setVisibility(0);
                this.F.getMapAsync(new at3(this, bi));
                if (!i) {
                    break Label_0275;
                }
            }
            if (this.F != null) {
                this.F.setVisibility(8);
            }
        }
        this.K = (MediaData)bi.N;
        if (this.P != null) {
            this.P.setVisibility(8);
        }
        String[] split;
        if (!TextUtils.isEmpty((CharSequence)bi.k)) {
            split = bi.k.split("\n");
        }
        else {
            split = null;
        }
        Label_0660: {
            if (split == null || split.length == 0) {
                this.J.setVisibility(8);
                this.G.setVisibility(8);
                if (!i) {
                    break Label_0660;
                }
            }
            this.J.setVisibility(0);
            String s = null;
            Label_0484: {
                if (TextUtils.isEmpty((CharSequence)bi.d)) {
                    String k = null;
                    Label_0405: {
                        if (split.length > 1 && split[1].startsWith(split[0])) {
                            k = split[1];
                            if (!i) {
                                break Label_0405;
                            }
                        }
                        k = bi.k;
                    }
                    s = ConversationRowLocation.S[7] + Uri.encode(k.replaceAll(ConversationRowLocation.S[8], "+")) + ConversationRowLocation.S[9] + bi.p + "," + bi.G;
                    if (!i) {
                        break Label_0484;
                    }
                }
                s = bi.d;
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)split[0]);
            final Resources resources = this.getContext().getResources();
            int n;
            if (bi.a.b) {
                n = 2131624008;
            }
            else {
                n = 2131624007;
            }
            spannableStringBuilder.setSpan((Object)new iw(s, resources.getColor(n)), 0, split[0].length(), 18);
            this.J.setText((CharSequence)this.a(split[0], spannableStringBuilder), TextView$BufferType.SPANNABLE);
            this.G.setVisibility(0);
            Label_0639: {
                if (split.length > 1 && !TextUtils.isEmpty((CharSequence)split[1])) {
                    Object a = this.a(split[1], null);
                    final TextView g = this.G;
                    if (a == null) {
                        a = split[1];
                    }
                    g.setText((CharSequence)a);
                    if (!i) {
                        break Label_0639;
                    }
                }
                this.G.setText((CharSequence)"");
            }
            this.G.setOnClickListener((View$OnClickListener)new a0a(this, s));
        }
        if (this.L != null) {
            this.L.setVisibility(0);
        }
        this.M.setVisibility(8);
        Label_0920: {
            if (this.K.transferring) {
                if (bi.a.b) {
                    this.M.setVisibility(8);
                    this.J.setVisibility(8);
                    this.G.setVisibility(8);
                    this.Q.setVisibility(0);
                    if (this.P != null) {
                        this.P.setVisibility(0);
                    }
                    this.I.setOnClickListener((View$OnClickListener)null);
                    if (!i) {
                        break Label_0920;
                    }
                }
                this.Q.setVisibility(0);
                if (!i) {
                    break Label_0920;
                }
            }
            if (!bi.a.b || this.K.transferred) {
                if (this.Q != null) {
                    this.Q.setVisibility(8);
                }
                this.M.setOnClickListener((View$OnClickListener)this.N);
                this.M.setText(2131231907);
                if (!i) {
                    break Label_0920;
                }
            }
            if (this.Q != null) {
                this.Q.setVisibility(8);
            }
            this.M.setVisibility(0);
            this.M.setText(2131231609);
            this.M.setOnClickListener((View$OnClickListener)new a00(this, null));
            if (this.P != null) {
                this.P.setVisibility(0);
            }
            this.I.setOnClickListener((View$OnClickListener)new a00(this, null));
        }
        final Bitmap a2 = com.whatsapp.util.b.a(bi);
        if (a2 != null) {
            this.R.setImageBitmap(a2);
            if (!i) {
                return;
            }
        }
        this.R.setImageResource(2130838905);
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        if (bi != this.t || b) {
            this.b(bi);
        }
        super.a(bi, b);
    }
    
    @Override
    protected int b() {
        if (App.ax()) {
            return 2130903122;
        }
        return 2130903121;
    }
    
    @Override
    public void d() {
        this.b(this.t);
        super.d();
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    @Override
    protected int p() {
        if (App.ax()) {
            return 2130903125;
        }
        return 2130903124;
    }
}
