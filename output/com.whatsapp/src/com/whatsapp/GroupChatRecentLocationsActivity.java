// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import android.app.Activity;
import com.whatsapp.util.b_;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.b6;
import android.view.ViewGroup$LayoutParams;
import com.google.android.maps.MapView$LayoutParams;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import com.google.android.maps.GeoPoint;
import android.graphics.Point;
import java.util.HashMap;
import android.view.View;
import java.util.Iterator;
import com.whatsapp.protocol.bi;
import android.widget.TextView;
import java.util.ArrayList;
import android.view.View$OnLongClickListener;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.MapActivity;

public class GroupChatRecentLocationsActivity extends MapActivity implements ast
{
    private static final String[] z;
    private MyLocationOverlay a;
    private String b;
    private View$OnLongClickListener c;
    private int d;
    private ArrayList e;
    private a_9 f;
    private int g;
    private GoogleMapView h;
    private h2 i;
    private ArrayList j;
    private final sj k;
    private TextView l;
    
    static {
        final String[] z2 = new String[7];
        String s = "+`Q";
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
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "&{Za%\"aT`'$jPz!-fVu!(f[gz\"{Pu!$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "&lAN:.dwa!5f[g\u0016.gAf:-ePf";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "-hL{ 5V\\z3-hAq'";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "&{Za%\"aT`'$jPz!-fVu!(f[gz3lFa95&F\u007f<1&V{;5hV`u/fA44%mPp";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "&{Za%\"aT`'$jPz!-fVu!(f[gz3lFa95&V{;5hV`u/fA44%mPp";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "&{Za%\"aT`'$jPz!-fVu!(f[gz%lF`'.p";
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
    
    public GroupChatRecentLocationsActivity() {
        this.e = new ArrayList();
        this.g = -1;
        this.j = new ArrayList();
        this.k = new sv(this);
    }
    
    static int a(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.d;
    }
    
    static int a(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, final int d) {
        return groupChatRecentLocationsActivity.d = d;
    }
    
    static a_9 a(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, final a_9 f) {
        return groupChatRecentLocationsActivity.f = f;
    }
    
    static bi a(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, final String s) {
        return groupChatRecentLocationsActivity.a(s);
    }
    
    private bi a(final String s) {
        final boolean i = App.I;
        for (final bi bi : this.e) {
            if (s.equals(bi.t)) {
                return bi;
            }
            if (i) {
                break;
            }
        }
        return null;
    }
    
    private void a() {
        final boolean i = App.I;
        final Iterator<View> iterator = (Iterator<View>)this.j.iterator();
        while (iterator.hasNext()) {
            this.h.removeView((View)iterator.next());
            if (i) {
                break;
            }
        }
        final double n = Math.min(this.h.getWidth(), this.h.getHeight()) / 10 * 360 / (256.0 * Math.pow(2.0, this.h.getZoomLevel()) / 2.0);
        final double n2 = n / 2.0;
        final HashMap<String, ArrayList<bi>> hashMap = new HashMap<String, ArrayList<bi>>();
        final Point point = new Point();
        for (final bi bi : this.e) {
            final double g = bi.G;
            final double p = bi.p;
            this.h.getProjection().toPixels(new GeoPoint((int)(1000000.0 * bi.p), (int)(1000000.0 * bi.G)), point);
            final String string = (int)((g + 180.0) / n) + " " + (int)((90.0 + p) / n2);
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, new ArrayList<bi>());
            }
            hashMap.get(string).add(bi);
            if (i) {
                break;
            }
        }
        final ArrayList list = new ArrayList<ArrayList<bi>>(hashMap.values());
        Collections.sort((List<E>)list, new vh(this));
    Label_0648:
        for (final ArrayList<bi> list2 : list) {
            final LinearLayout linearLayout = new LinearLayout((Context)this);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, 0, 0, (int)(7.0f * vc.b().b));
            final LinearLayout linearLayout2 = new LinearLayout((Context)this);
            linearLayout2.setOrientation(1);
            linearLayout.addView((View)linearLayout2);
            final LayoutInflater layoutInflater = (LayoutInflater)this.getSystemService(GroupChatRecentLocationsActivity.z[3]);
            final yj backgroundDrawable = new yj();
            backgroundDrawable.a((int)(12.0f * vc.b().b));
            linearLayout2.setBackgroundDrawable((Drawable)backgroundDrawable);
            final Iterator<bi> iterator4 = list2.iterator();
            double n3 = 0.0;
            double n4 = 0.0;
            while (true) {
                while (iterator4.hasNext()) {
                    final bi bi2 = iterator4.next();
                    final View a = alm.a(layoutInflater, 2130903098, null);
                    a.setClickable(true);
                    a.setBackgroundResource(2130839068);
                    this.a(a, bi2);
                    linearLayout2.addView(a);
                    a.setOnLongClickListener(this.c);
                    n3 += bi2.p;
                    final double n5 = n4 + bi2.G;
                    if (i) {
                        this.h.addView((View)linearLayout, (ViewGroup$LayoutParams)new MapView$LayoutParams(-2, -2, new GeoPoint((int)(1000000.0 * (n3 / list2.size())), (int)(1000000.0 * (n5 / list2.size()))), 81));
                        this.j.add(linearLayout);
                        if (i) {
                            break Label_0648;
                        }
                        continue Label_0648;
                    }
                    else {
                        n4 = n5;
                    }
                }
                final double n5 = n4;
                continue;
            }
        }
    }
    
    private void a(final View view, final bi bi) {
        final a_9 e = App.S.e(bi.t);
        ((TextView)view.findViewById(2131755394)).setText((CharSequence)e.a((Context)this));
        ((TextView)view.findViewById(2131755395)).setText((CharSequence)b6.h((Context)this, App.i(bi)));
        final ImageView imageView = (ImageView)view.findViewById(2131755393);
        final Bitmap a = e.a(this.getResources().getDimensionPixelSize(2131361952), this.getResources().getDimension(2131361814), true);
        Label_0116: {
            if (a != null) {
                imageView.setImageBitmap(a);
                if (!App.I) {
                    break Label_0116;
                }
            }
            imageView.setImageResource(e.A());
        }
        view.setTag((Object)bi.t);
    }
    
    static int b(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.d--;
    }
    
    private void b() {
        if (this.d == -1 && this.a.getMyLocation() == null) {
            this.d = 0;
        }
        if (this.d == -1) {
            this.h.getController().animateTo(this.a.getMyLocation());
            this.h.getController().setZoom(17);
            this.l.setText((CharSequence)this.getString(2131231382));
            if (!App.I) {
                return;
            }
        }
        if (this.d < this.e.size()) {
            final bi bi = this.e.get(this.d);
            this.h.getController().animateTo(new GeoPoint((int)(1000000.0 * bi.p), (int)(1000000.0 * bi.G)));
            this.h.getController().setZoom(17);
            this.l.setText((CharSequence)this.getString(2131231279, new Object[] { 1 + this.d, this.e.size() }));
        }
    }
    
    static a_9 c(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.f;
    }
    
    static ArrayList d(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.e;
    }
    
    static void e(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.b();
    }
    
    static GoogleMapView f(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.h;
    }
    
    static String g(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.b;
    }
    
    static int h(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.d++;
    }
    
    static TextView i(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.l;
    }
    
    static h2 j(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.i;
    }
    
    static MyLocationOverlay k(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.a;
    }
    
    static void l(final GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.a();
    }
    
    public void a(final GeoPoint geoPoint, final int n, final int n2) {
        if (this.g != this.h.getZoomLevel()) {
            this.g = this.h.getZoomLevel();
            this.a();
        }
    }
    
    protected boolean isRouteDisplayed() {
        return false;
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean i = App.I;
        Label_0092: {
            switch (n) {
                case 10: {
                    if (n2 == -1) {
                        if (intent != null && intent.getData() != null) {
                            App.S.a(intent.getData(), this.f);
                            if (!i) {
                                break;
                            }
                        }
                        App.S.h(this.f);
                        if (!i) {
                            break;
                        }
                    }
                    Log.i(GroupChatRecentLocationsActivity.z[5]);
                    if (i) {
                        break Label_0092;
                    }
                    break;
                }
                case 11: {
                    if (n2 == -1) {
                        App.S.h(this.f);
                        if (!i) {
                            break;
                        }
                    }
                    Log.i(GroupChatRecentLocationsActivity.z[4]);
                }
            }
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/GroupChatRecentLocationsActivity.z:[Ljava/lang/String;
        //     7: iconst_1       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: getstatic       com/whatsapp/alm.c:Z
        //    15: ifeq            29
        //    18: aload_0        
        //    19: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.getWindow:()Landroid/view/Window;
        //    22: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    25: iconst_3       
        //    26: invokevirtual   android/view/View.setLayoutDirection:(I)V
        //    29: aload_0        
        //    30: aload_1        
        //    31: invokespecial   com/google/android/maps/MapActivity.onCreate:(Landroid/os/Bundle;)V
        //    34: aload_0        
        //    35: ldc_w           2130903169
        //    38: invokestatic    com/whatsapp/DialogToastActivity.a:(Landroid/app/Activity;I)V
        //    41: aload_0        
        //    42: aload_0        
        //    43: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.getIntent:()Landroid/content/Intent;
        //    46: getstatic       com/whatsapp/GroupChatRecentLocationsActivity.z:[Ljava/lang/String;
        //    49: iconst_0       
        //    50: aaload         
        //    51: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    54: putfield        com/whatsapp/GroupChatRecentLocationsActivity.b:Ljava/lang/String;
        //    57: aload_0        
        //    58: getfield        com/whatsapp/GroupChatRecentLocationsActivity.b:Ljava/lang/String;
        //    61: invokestatic    com/whatsapp/z8.a:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    64: astore          4
        //    66: aload_0        
        //    67: ldc_w           2131755371
        //    70: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //    73: checkcast       Landroid/support/v7/widget/Toolbar;
        //    76: astore          5
        //    78: aload           5
        //    80: aload           4
        //    82: aload_0        
        //    83: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    86: aload_0        
        //    87: invokestatic    com/whatsapp/util/cq.c:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;
        //    90: invokevirtual   android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
        //    93: aload_0        
        //    94: aload           5
        //    96: invokevirtual   android/support/v7/widget/Toolbar.getMenu:()Landroid/view/Menu;
        //    99: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.onCreateOptionsMenu:(Landroid/view/Menu;)Z
        //   102: pop            
        //   103: aload           5
        //   105: new             Lcom/whatsapp/a6a;
        //   108: dup            
        //   109: aload_0        
        //   110: invokespecial   com/whatsapp/a6a.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   113: invokevirtual   android/support/v7/widget/Toolbar.setOnMenuItemClickListener:(Landroid/support/v7/widget/Toolbar$OnMenuItemClickListener;)V
        //   116: aload_0        
        //   117: aload_0        
        //   118: ldc_w           2131755608
        //   121: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //   124: checkcast       Lcom/whatsapp/GoogleMapView;
        //   127: putfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   130: aload_0        
        //   131: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   134: aload_0        
        //   135: invokevirtual   com/whatsapp/GoogleMapView.setMapListener:(Lcom/whatsapp/ast;)V
        //   138: aload_0        
        //   139: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   142: iconst_1       
        //   143: invokevirtual   com/whatsapp/GoogleMapView.setBuiltInZoomControls:(Z)V
        //   146: aload_0        
        //   147: aload_0        
        //   148: ldc_w           2131755296
        //   151: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //   154: checkcast       Landroid/widget/TextView;
        //   157: putfield        com/whatsapp/GroupChatRecentLocationsActivity.l:Landroid/widget/TextView;
        //   160: aload_0        
        //   161: new             Lcom/whatsapp/awq;
        //   164: dup            
        //   165: aload_0        
        //   166: aload_0        
        //   167: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   170: invokespecial   com/whatsapp/awq.<init>:(Landroid/content/Context;Lcom/google/android/maps/MapView;)V
        //   173: putfield        com/whatsapp/GroupChatRecentLocationsActivity.a:Lcom/google/android/maps/MyLocationOverlay;
        //   176: aload_0        
        //   177: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   180: invokevirtual   com/whatsapp/GoogleMapView.getOverlays:()Ljava/util/List;
        //   183: aload_0        
        //   184: getfield        com/whatsapp/GroupChatRecentLocationsActivity.a:Lcom/google/android/maps/MyLocationOverlay;
        //   187: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   192: pop            
        //   193: aload_0        
        //   194: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   197: aload_0        
        //   198: getfield        com/whatsapp/GroupChatRecentLocationsActivity.b:Ljava/lang/String;
        //   201: invokevirtual   com/whatsapp/vy.y:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   204: putfield        com/whatsapp/GroupChatRecentLocationsActivity.e:Ljava/util/ArrayList;
        //   207: aload_0        
        //   208: getfield        com/whatsapp/GroupChatRecentLocationsActivity.e:Ljava/util/ArrayList;
        //   211: new             Lcom/whatsapp/wl;
        //   214: dup            
        //   215: aload_0        
        //   216: invokespecial   com/whatsapp/wl.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   219: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   222: aload_0        
        //   223: new             Lcom/whatsapp/_j;
        //   226: dup            
        //   227: aload_0        
        //   228: invokespecial   com/whatsapp/_j.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   231: putfield        com/whatsapp/GroupChatRecentLocationsActivity.c:Landroid/view/View$OnLongClickListener;
        //   234: aload_0        
        //   235: getfield        com/whatsapp/GroupChatRecentLocationsActivity.e:Ljava/util/ArrayList;
        //   238: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   241: astore          8
        //   243: ldc2_w          90.0
        //   246: dstore          9
        //   248: ldc2_w          -90.0
        //   251: dstore          11
        //   253: ldc2_w          180.0
        //   256: dstore          13
        //   258: ldc2_w          -180.0
        //   261: dstore          15
        //   263: aload           8
        //   265: invokeinterface java/util/Iterator.hasNext:()Z
        //   270: ifeq            714
        //   273: aload           8
        //   275: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   280: checkcast       Lcom/whatsapp/protocol/bi;
        //   283: astore          34
        //   285: dload           9
        //   287: aload           34
        //   289: getfield        com/whatsapp/protocol/bi.p:D
        //   292: invokestatic    java/lang/Math.min:(DD)D
        //   295: dstore          9
        //   297: dload           11
        //   299: aload           34
        //   301: getfield        com/whatsapp/protocol/bi.p:D
        //   304: invokestatic    java/lang/Math.max:(DD)D
        //   307: dstore          11
        //   309: dload           13
        //   311: aload           34
        //   313: getfield        com/whatsapp/protocol/bi.G:D
        //   316: invokestatic    java/lang/Math.min:(DD)D
        //   319: dstore          13
        //   321: dload           15
        //   323: aload           34
        //   325: getfield        com/whatsapp/protocol/bi.G:D
        //   328: invokestatic    java/lang/Math.max:(DD)D
        //   331: dstore          17
        //   333: iload_2        
        //   334: ifeq            707
        //   337: new             Lcom/google/android/maps/GeoPoint;
        //   340: dup            
        //   341: ldc2_w          1000000.0
        //   344: dload           9
        //   346: dload           11
        //   348: dadd           
        //   349: dmul           
        //   350: ldc2_w          2.0
        //   353: ddiv           
        //   354: d2i            
        //   355: ldc2_w          1000000.0
        //   358: dload           13
        //   360: dload           17
        //   362: dadd           
        //   363: dmul           
        //   364: ldc2_w          2.0
        //   367: ddiv           
        //   368: d2i            
        //   369: invokespecial   com/google/android/maps/GeoPoint.<init>:(II)V
        //   372: astore          19
        //   374: aload_0        
        //   375: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   378: invokevirtual   com/whatsapp/GoogleMapView.getController:()Lcom/google/android/maps/MapController;
        //   381: aload           19
        //   383: invokevirtual   com/google/android/maps/MapController.setCenter:(Lcom/google/android/maps/GeoPoint;)V
        //   386: ldc2_w          1000000.0
        //   389: ldc2_w          1.3
        //   392: dload           11
        //   394: dload           9
        //   396: dsub           
        //   397: dmul           
        //   398: dmul           
        //   399: d2i            
        //   400: istore          20
        //   402: ldc2_w          1000000.0
        //   405: ldc2_w          1.3
        //   408: dload           17
        //   410: dload           13
        //   412: dsub           
        //   413: dmul           
        //   414: dmul           
        //   415: d2i            
        //   416: istore          21
        //   418: aload_0        
        //   419: getfield        com/whatsapp/GroupChatRecentLocationsActivity.e:Ljava/util/ArrayList;
        //   422: invokevirtual   java/util/ArrayList.size:()I
        //   425: iconst_1       
        //   426: if_icmpgt       446
        //   429: aload_0        
        //   430: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   433: invokevirtual   com/whatsapp/GoogleMapView.getController:()Lcom/google/android/maps/MapController;
        //   436: bipush          17
        //   438: invokevirtual   com/google/android/maps/MapController.setZoom:(I)I
        //   441: pop            
        //   442: iload_2        
        //   443: ifeq            460
        //   446: aload_0        
        //   447: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   450: invokevirtual   com/whatsapp/GoogleMapView.getController:()Lcom/google/android/maps/MapController;
        //   453: iload           20
        //   455: iload           21
        //   457: invokevirtual   com/google/android/maps/MapController.zoomToSpan:(II)V
        //   460: aload_0        
        //   461: invokespecial   com/whatsapp/GroupChatRecentLocationsActivity.a:()V
        //   464: aload_0        
        //   465: iconst_m1      
        //   466: aload_0        
        //   467: getfield        com/whatsapp/GroupChatRecentLocationsActivity.e:Ljava/util/ArrayList;
        //   470: invokevirtual   java/util/ArrayList.size:()I
        //   473: iadd           
        //   474: putfield        com/whatsapp/GroupChatRecentLocationsActivity.d:I
        //   477: aload_0        
        //   478: new             Lcom/whatsapp/h2;
        //   481: dup            
        //   482: aload_0        
        //   483: invokespecial   com/whatsapp/h2.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   486: putfield        com/whatsapp/GroupChatRecentLocationsActivity.i:Lcom/whatsapp/h2;
        //   489: aload_0        
        //   490: getfield        com/whatsapp/GroupChatRecentLocationsActivity.i:Lcom/whatsapp/h2;
        //   493: invokevirtual   com/whatsapp/h2.a:()V
        //   496: aload_0        
        //   497: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   500: invokevirtual   com/whatsapp/GoogleMapView.getOverlays:()Ljava/util/List;
        //   503: aload_0        
        //   504: getfield        com/whatsapp/GroupChatRecentLocationsActivity.i:Lcom/whatsapp/h2;
        //   507: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   512: pop            
        //   513: aload_0        
        //   514: ldc_w           2131755611
        //   517: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //   520: new             Lcom/whatsapp/e1;
        //   523: dup            
        //   524: aload_0        
        //   525: invokespecial   com/whatsapp/e1.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   528: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   531: aload_0        
        //   532: ldc_w           2131755612
        //   535: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //   538: new             Lcom/whatsapp/dm;
        //   541: dup            
        //   542: aload_0        
        //   543: invokespecial   com/whatsapp/dm.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   546: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   549: aload_0        
        //   550: ldc_w           2131755610
        //   553: invokevirtual   com/whatsapp/GroupChatRecentLocationsActivity.findViewById:(I)Landroid/view/View;
        //   556: new             Lcom/whatsapp/r3;
        //   559: dup            
        //   560: aload_0        
        //   561: invokespecial   com/whatsapp/r3.<init>:(Lcom/whatsapp/GroupChatRecentLocationsActivity;)V
        //   564: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   567: aload_0        
        //   568: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   571: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   574: getstatic       com/whatsapp/GroupChatRecentLocationsActivity.z:[Ljava/lang/String;
        //   577: iconst_2       
        //   578: aaload         
        //   579: iconst_0       
        //   580: anewarray       Ljava/lang/Class;
        //   583: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   586: astore          32
        //   588: aload           32
        //   590: astore          26
        //   592: aload           26
        //   594: ifnull          701
        //   597: aload           26
        //   599: aload_0        
        //   600: getfield        com/whatsapp/GroupChatRecentLocationsActivity.h:Lcom/whatsapp/GoogleMapView;
        //   603: iconst_0       
        //   604: anewarray       Ljava/lang/Object;
        //   607: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   610: checkcast       Landroid/widget/ZoomButtonsController;
        //   613: astore          30
        //   615: aload           30
        //   617: ifnull          701
        //   620: aload           30
        //   622: invokevirtual   android/widget/ZoomButtonsController.getZoomControls:()Landroid/view/View;
        //   625: astore          27
        //   627: aload           27
        //   629: ifnull          651
        //   632: aload           27
        //   634: iconst_0       
        //   635: iconst_0       
        //   636: iconst_0       
        //   637: ldc_w           48.0
        //   640: invokestatic    com/whatsapp/vc.b:()Lcom/whatsapp/vc;
        //   643: getfield        com/whatsapp/vc.b:F
        //   646: fmul           
        //   647: f2i            
        //   648: invokevirtual   android/view/View.setPadding:(IIII)V
        //   651: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   654: aload_0        
        //   655: getfield        com/whatsapp/GroupChatRecentLocationsActivity.k:Lcom/whatsapp/sj;
        //   658: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/sj;)V
        //   661: return         
        //   662: astore_3       
        //   663: aload_3        
        //   664: athrow         
        //   665: astore          22
        //   667: aload           22
        //   669: athrow         
        //   670: astore          23
        //   672: aload           23
        //   674: athrow         
        //   675: astore          31
        //   677: aconst_null    
        //   678: astore          30
        //   680: goto            615
        //   683: astore          28
        //   685: aload           28
        //   687: athrow         
        //   688: astore          29
        //   690: goto            677
        //   693: astore          25
        //   695: aconst_null    
        //   696: astore          26
        //   698: goto            592
        //   701: aconst_null    
        //   702: astore          27
        //   704: goto            627
        //   707: dload           17
        //   709: dstore          15
        //   711: goto            263
        //   714: dload           15
        //   716: dstore          17
        //   718: goto            337
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  4      29     662    665    Ljava/lang/NoSuchMethodException;
        //  418    442    665    670    Ljava/lang/NoSuchMethodException;
        //  446    460    670    675    Ljava/lang/NoSuchMethodException;
        //  567    588    693    701    Ljava/lang/NoSuchMethodException;
        //  597    615    675    677    Ljava/lang/IllegalAccessException;
        //  597    615    688    693    Ljava/lang/reflect/InvocationTargetException;
        //  632    651    683    688    Ljava/lang/NoSuchMethodException;
        //  667    670    670    675    Ljava/lang/NoSuchMethodException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 335, Size: 335
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                final ArrayList<String> list = new ArrayList<String>();
                list.add(this.getString(2131231318, new Object[] { this.f.a((Context)this) }));
                list.add(this.getString(2131230860, new Object[] { this.f.a((Context)this) }));
                Label_0163: {
                    if (this.f.e != null) {
                        list.add(this.getString(2131231910, new Object[] { this.f.a((Context)this) }));
                        if (!App.I) {
                            break Label_0163;
                        }
                    }
                    list.add(this.getString(2131230790));
                    list.add(this.getString(2131230792));
                }
                final String[] array = new String[list.size()];
                list.toArray(array);
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                alertDialog$Builder.setItems(array, (DialogInterface$OnClickListener)new ub(this));
                final AlertDialog create = alertDialog$Builder.create();
                create.requestWindowFeature(1);
                return create;
            }
        }
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231295).setIcon(2130837696), 2);
        if (App.aS == 3) {
            b_.c((Activity)this);
        }
        return true;
    }
    
    public void onDestroy() {
        Log.i(GroupChatRecentLocationsActivity.z[6]);
        super.onDestroy();
        App.ak.b(this.k);
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 0: {
                this.h.setSatellite(!this.h.isSatellite());
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    protected void onPause() {
        super.onPause();
        this.a.disableMyLocation();
    }
    
    protected void onResume() {
        super.onResume();
        this.a.enableMyLocation();
    }
}
