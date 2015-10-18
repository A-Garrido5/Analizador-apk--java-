// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.content.IntentFilter;
import android.support.v4.app.ActivityCompat;
import android.view.MenuItem;
import android.view.KeyEvent;
import android.app.Activity;
import com.whatsapp.util.b_;
import com.whatsapp.App;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView$OnItemClickListener;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import android.content.ContentResolver;
import android.net.Uri;
import android.widget.Toast;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.text.TextPaint;
import android.text.TextUtils;
import android.content.Context;
import android.support.v7.view.ActionMode;
import java.util.HashSet;
import android.support.v7.view.ActionMode$Callback;
import android.content.BroadcastReceiver;
import android.view.View;
import java.util.HashMap;

public class MediaPicker extends MediaGalleryBase
{
    private static final String[] V;
    private boolean E;
    private HashMap F;
    private int G;
    private View H;
    private long I;
    private String J;
    private HashMap K;
    private int L;
    private BroadcastReceiver M;
    private boolean N;
    private HashMap O;
    private boolean P;
    private ActionMode$Callback Q;
    private HashMap R;
    private String S;
    private HashSet T;
    private ActionMode U;
    
    static {
        final String[] v = new String[48];
        String s = "\u0014QD8d\u0014lC(g\u0006";
        int n = -1;
        String[] array = v;
        int n2 = 0;
        String intern = null;
    Label_1232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000b';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\nVI0~\u0007]u1n\u0007QK";
                    n2 = 1;
                    array = v;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0002[^5d\r\u0016g\u0019O*yu\tE.w\u007f\u0012_&|";
                    n2 = 2;
                    array = v;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = v;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0002[^5d\r\u0016g\u0019O*yu\u000fH\"vd\u0019Y<~c\u0012B0po\u0018";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u000e]N5j\u0013QI7n\u0011\u0017X9x\u0016UO";
                    n = 3;
                    array = v;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0002[^5d\r\u0016g\u0019O*yu\u000fH\"vd\u0019Y<k~\u001dY7}n";
                    n = 4;
                    array = v;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0002[^5d\r\u0016g\u0019O*yu\u0019A&{~";
                    n = 5;
                    array = v;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0005QF9";
                    n = 6;
                    array = v;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0002[^5d\r\u0016g\u0019O*yu\u0011D6v~\u0019O";
                    n = 7;
                    array = v;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000e]N5j\u0013QI7n\u0011\u0017Z=~\u0010]";
                    n = 8;
                    array = v;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 9;
                    array = v;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "\u0015VNrj\r\\X3b\u0007\u0016I)y\u0010WXro\nJ\u00055f\u0002_O";
                    n = 10;
                    n2 = 11;
                    array = v;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = v;
                    s = "\nUK;nL\u0012";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u000e]N5j\u0013QI7n\u0011\u0017N9x\u0017JE%";
                    n = 12;
                    array = v;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0015QN9dL\u0012";
                    n = 13;
                    array = v;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0015VNrj\r\\X3b\u0007\u0016I)y\u0010WXro\nJ\u0005*b\u0007]E";
                    n = 14;
                    array = v;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "\u0000JE,~\u0011QY";
                    n = 15;
                    array = v;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0011]I5{\n]D(";
                    n = 16;
                    array = v;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0015]X>";
                    n = 17;
                    array = v;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0001MI7n\u0017g_.b";
                    n = 18;
                    array = v;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 19;
                    array = v;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0011W^=\u007f\nWD/";
                    n = 20;
                    array = v;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0000YZ(b\fVY";
                    n = 21;
                    array = v;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0017Q^0n";
                    n = 22;
                    array = v;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0000JE,y\u0006[^/";
                    n = 23;
                    array = v;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0005QF9T\u0013Y^4";
                    n = 24;
                    array = v;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0005QF9T\u0013Y^4";
                    n = 25;
                    array = v;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0001MI7n\u0017g_.b";
                    n = 26;
                    array = v;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 27;
                    array = v;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 28;
                    array = v;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u000eYR\u0003b\u0017]G/";
                    n = 29;
                    array = v;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\u0000JE,y\u0006[^/";
                    n = 30;
                    array = v;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 31;
                    array = v;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0011W^=\u007f\nWD/";
                    n = 32;
                    array = v;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0000JE,~\u0011QY";
                    n = 33;
                    array = v;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0000YZ(b\fVY";
                    n = 34;
                    array = v;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0001MI7n\u0017qN";
                    n = 35;
                    array = v;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0001MI7n\u0017qN";
                    n = 36;
                    array = v;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0001MI7n\u0017qN";
                    n = 37;
                    array = v;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0015]X>";
                    n = 38;
                    array = v;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 39;
                    array = v;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMKC&n/QG5\u007f";
                    n = 40;
                    array = v;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    s = "\u000e]N5j\u0013QI7n\u0011\u0017I.n\u0002LO";
                    n = 41;
                    n2 = 42;
                    array = v;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    array = v;
                    s = "\u000eYR\u0003b\u0017]G/";
                    n = 42;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "\u000e]N5j\u0013QI7n\u0011\u0017I.n\u0002LOs";
                    n = 43;
                    array = v;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u0013JO*b\u0006O";
                    n = 44;
                    array = v;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "\u0011]I5{\n]D(";
                    n = 45;
                    array = v;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "\u0002VN.d\n\\\u00045e\u0017]D(%\u0006@^.jMk~\u000eN\"u";
                    n = 46;
                    array = v;
                    continue;
                }
                case 46: {
                    break Label_1232;
                }
            }
        }
        array[n2] = intern;
        V = v;
    }
    
    public MediaPicker() {
        this.E = true;
        this.N = false;
        this.I = Long.MAX_VALUE;
        this.L = Integer.MAX_VALUE;
        this.M = null;
        this.P = true;
        this.T = new HashSet();
        this.R = new HashMap();
        this.O = new HashMap();
        this.K = new HashMap();
        this.F = new HashMap();
        this.Q = new ab(this);
    }
    
    static ActionMode a(final MediaPicker mediaPicker, final ActionMode u) {
        return mediaPicker.U = u;
    }
    
    static View a(final MediaPicker mediaPicker, final View h) {
        return mediaPicker.H = h;
    }
    
    static HashSet a(final MediaPicker mediaPicker) {
        return mediaPicker.T;
    }
    
    private void a() {
        this.G = 5;
        final Intent intent = this.getIntent();
        if (intent != null) {
            final String resolveType = intent.resolveType((Context)this);
            if (resolveType != null) {
                if (this.b(resolveType)) {
                    this.G = 1;
                    this.setTitle(2131231477);
                }
                if (this.a(resolveType)) {
                    this.G = 4;
                    this.setTitle(2131231478);
                }
            }
            final Bundle extras = intent.getExtras();
            String string;
            if (extras != null) {
                string = extras.getString(MediaPicker.V[0]);
            }
            else {
                string = null;
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                final TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(this.getResources().getDimension(2131361797));
                this.setTitle(cq.b(string, this.getBaseContext(), (Paint)textPaint));
            }
            if (extras != null) {
                this.G = (0x5 & extras.getInt(MediaPicker.V[1], this.G));
            }
        }
    }
    
    static void a(final MediaPicker mediaPicker, final bj bj) {
        mediaPicker.a(bj);
    }
    
    static void a(final MediaPicker mediaPicker, final HashSet set) {
        mediaPicker.a(set);
    }
    
    private void a(final bj bj) {
        final int v = MediaGalleryBase.v;
        if (bj != null) {
            if (this.U != null) {
                Label_0096: {
                    if (this.T.contains(bj.a())) {
                        this.T.remove(bj.a());
                        if (v == 0) {
                            break Label_0096;
                        }
                    }
                    if (this.T.size() < this.L) {
                        this.T.add(bj.a());
                        if (v == 0) {
                            break Label_0096;
                        }
                    }
                    Toast.makeText(this.getBaseContext(), 2131231737, 0).show();
                }
                Label_0124: {
                    if (this.T.isEmpty()) {
                        this.U.finish();
                        if (v == 0) {
                            break Label_0124;
                        }
                    }
                    this.U.invalidate();
                }
                this.s.notifyDataSetChanged();
                if (v == 0) {
                    return;
                }
            }
            final HashSet<Uri> set = new HashSet<Uri>();
            set.add(bj.a());
            this.a(set);
        }
    }
    
    private void a(final HashSet p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/gallerypicker/MediaGalleryBase.v:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          19
        //     8: aload_1        
        //     9: invokevirtual   java/util/HashSet.isEmpty:()Z
        //    12: istore          5
        //    14: iload           5
        //    16: ifeq            28
        //    19: return         
        //    20: astore_3       
        //    21: aload_3        
        //    22: athrow         
        //    23: astore          4
        //    25: aload           4
        //    27: athrow         
        //    28: new             Ljava/util/ArrayList;
        //    31: dup            
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: astore          6
        //    37: aload           6
        //    39: aload_1        
        //    40: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    43: pop            
        //    44: aload_0        
        //    45: getfield        com/whatsapp/gallerypicker/MediaPicker.E:Z
        //    48: ifeq            540
        //    51: aload_0        
        //    52: getfield        com/whatsapp/gallerypicker/MediaPicker.G:I
        //    55: istore          12
        //    57: iload           12
        //    59: iconst_1       
        //    60: if_icmpne       273
        //    63: new             Landroid/content/Intent;
        //    66: dup            
        //    67: aload_0        
        //    68: ldc_w           Lcom/whatsapp/gallerypicker/ImagePreview;.class
        //    71: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    74: astore          13
        //    76: aload           13
        //    78: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //    81: bipush          18
        //    83: aaload         
        //    84: aload_0        
        //    85: getfield        com/whatsapp/gallerypicker/MediaPicker.S:Ljava/lang/String;
        //    88: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    91: pop            
        //    92: aload           13
        //    94: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //    97: bipush          17
        //    99: aaload         
        //   100: aload_0        
        //   101: getfield        com/whatsapp/gallerypicker/MediaPicker.J:Ljava/lang/String;
        //   104: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   107: pop            
        //   108: aload           13
        //   110: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   113: bipush          30
        //   115: aaload         
        //   116: aload_0        
        //   117: getfield        com/whatsapp/gallerypicker/MediaPicker.L:I
        //   120: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   123: pop            
        //   124: aload           13
        //   126: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   129: bipush          20
        //   131: aaload         
        //   132: aload           6
        //   134: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   137: pop            
        //   138: aload           13
        //   140: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   143: bipush          21
        //   145: aaload         
        //   146: aload_0        
        //   147: getfield        com/whatsapp/gallerypicker/MediaPicker.R:Ljava/util/HashMap;
        //   150: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   153: pop            
        //   154: aload           13
        //   156: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   159: bipush          16
        //   161: aaload         
        //   162: aload_0        
        //   163: getfield        com/whatsapp/gallerypicker/MediaPicker.O:Ljava/util/HashMap;
        //   166: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   169: pop            
        //   170: aload           13
        //   172: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   175: bipush          24
        //   177: aaload         
        //   178: aload_0        
        //   179: getfield        com/whatsapp/gallerypicker/MediaPicker.K:Ljava/util/HashMap;
        //   182: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   185: pop            
        //   186: aload           13
        //   188: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   191: bipush          22
        //   193: aaload         
        //   194: aload_0        
        //   195: getfield        com/whatsapp/gallerypicker/MediaPicker.F:Ljava/util/HashMap;
        //   198: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
        //   201: pop            
        //   202: aload_0        
        //   203: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   206: ifnull          262
        //   209: aload_0        
        //   210: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   213: aload_0        
        //   214: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   217: invokevirtual   android/view/View.getLeft:()I
        //   220: aload_0        
        //   221: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   224: invokevirtual   android/view/View.getTop:()I
        //   227: aload_0        
        //   228: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   231: invokevirtual   android/view/View.getWidth:()I
        //   234: aload_0        
        //   235: getfield        com/whatsapp/gallerypicker/MediaPicker.H:Landroid/view/View;
        //   238: invokevirtual   android/view/View.getHeight:()I
        //   241: invokestatic    android/support/v4/app/ActivityOptionsCompat.makeScaleUpAnimation:(Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompat;
        //   244: astore          42
        //   246: aload_0        
        //   247: aload           13
        //   249: iconst_1       
        //   250: aload           42
        //   252: invokevirtual   android/support/v4/app/ActivityOptionsCompat.toBundle:()Landroid/os/Bundle;
        //   255: invokestatic    android/support/v4/app/ActivityCompat.startActivityForResult:(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
        //   258: iload_2        
        //   259: ifeq            269
        //   262: aload_0        
        //   263: aload           13
        //   265: iconst_1       
        //   266: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.startActivityForResult:(Landroid/content/Intent;I)V
        //   269: iload_2        
        //   270: ifeq            19
        //   273: aload_0        
        //   274: getfield        com/whatsapp/gallerypicker/MediaPicker.G:I
        //   277: istore          24
        //   279: iload           24
        //   281: iconst_4       
        //   282: if_icmpne       483
        //   285: aload           6
        //   287: iconst_0       
        //   288: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   291: checkcast       Landroid/net/Uri;
        //   294: invokestatic    com/whatsapp/util/br.b:(Landroid/net/Uri;)Ljava/io/File;
        //   297: astore          41
        //   299: aload           41
        //   301: astore          29
        //   303: aload           29
        //   305: ifnull          468
        //   308: aload           29
        //   310: invokestatic    com/whatsapp/wm.c:(Ljava/io/File;)Z
        //   313: istore          32
        //   315: iload           32
        //   317: ifeq            377
        //   320: new             Landroid/content/Intent;
        //   323: dup            
        //   324: aload_0        
        //   325: ldc_w           Lcom/whatsapp/VideoPreviewActivity;.class
        //   328: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   331: astore          33
        //   333: aload           33
        //   335: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   338: bipush          25
        //   340: aaload         
        //   341: aload           29
        //   343: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   346: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   349: pop            
        //   350: aload           33
        //   352: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   355: bipush          23
        //   357: aaload         
        //   358: aload_0        
        //   359: getfield        com/whatsapp/gallerypicker/MediaPicker.J:Ljava/lang/String;
        //   362: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   365: pop            
        //   366: aload_0        
        //   367: aload           33
        //   369: iconst_2       
        //   370: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.startActivityForResult:(Landroid/content/Intent;I)V
        //   373: iload_2        
        //   374: ifeq            479
        //   377: aload           29
        //   379: invokevirtual   java/io/File.length:()J
        //   382: ldc2_w          1048576
        //   385: getstatic       com/whatsapp/ym.k:I
        //   388: i2l            
        //   389: lmul           
        //   390: lcmp           
        //   391: ifle            427
        //   394: iconst_1       
        //   395: anewarray       Ljava/lang/Object;
        //   398: astore          40
        //   400: aload           40
        //   402: iconst_0       
        //   403: getstatic       com/whatsapp/ym.k:I
        //   406: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   409: aastore        
        //   410: aload_0        
        //   411: aload_0        
        //   412: ldc_w           2131231127
        //   415: aload           40
        //   417: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   420: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.f:(Ljava/lang/String;)V
        //   423: iload_2        
        //   424: ifeq            479
        //   427: new             Landroid/content/Intent;
        //   430: dup            
        //   431: invokespecial   android/content/Intent.<init>:()V
        //   434: astore          38
        //   436: aload           38
        //   438: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   441: bipush          26
        //   443: aaload         
        //   444: aload           29
        //   446: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   449: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   452: pop            
        //   453: aload_0        
        //   454: iconst_m1      
        //   455: aload           38
        //   457: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.setResult:(ILandroid/content/Intent;)V
        //   460: aload_0        
        //   461: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.finish:()V
        //   464: iload_2        
        //   465: ifeq            479
        //   468: aload_0        
        //   469: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.getBaseContext:()Landroid/content/Context;
        //   472: ldc_w           2131231735
        //   475: iconst_0       
        //   476: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   479: iload_2        
        //   480: ifeq            19
        //   483: new             Landroid/content/Intent;
        //   486: dup            
        //   487: invokespecial   android/content/Intent.<init>:()V
        //   490: astore          25
        //   492: aload           25
        //   494: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   497: bipush          27
        //   499: aaload         
        //   500: aload_0        
        //   501: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.getIntent:()Landroid/content/Intent;
        //   504: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   507: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   510: pop            
        //   511: aload           25
        //   513: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   516: bipush          29
        //   518: aaload         
        //   519: aload           6
        //   521: invokevirtual   android/content/Intent.putParcelableArrayListExtra:(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
        //   524: pop            
        //   525: aload_0        
        //   526: iconst_m1      
        //   527: aload           25
        //   529: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.setResult:(ILandroid/content/Intent;)V
        //   532: aload_0        
        //   533: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.finish:()V
        //   536: iload_2        
        //   537: ifeq            19
        //   540: new             Landroid/content/Intent;
        //   543: dup            
        //   544: invokespecial   android/content/Intent.<init>:()V
        //   547: astore          9
        //   549: aload           9
        //   551: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   554: bipush          19
        //   556: aaload         
        //   557: aload_0        
        //   558: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.getIntent:()Landroid/content/Intent;
        //   561: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   564: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   567: pop            
        //   568: aload           9
        //   570: getstatic       com/whatsapp/gallerypicker/MediaPicker.V:[Ljava/lang/String;
        //   573: bipush          28
        //   575: aaload         
        //   576: aload           6
        //   578: invokevirtual   android/content/Intent.putParcelableArrayListExtra:(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
        //   581: pop            
        //   582: aload_0        
        //   583: iconst_m1      
        //   584: aload           9
        //   586: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.setResult:(ILandroid/content/Intent;)V
        //   589: aload_0        
        //   590: invokevirtual   com/whatsapp/gallerypicker/MediaPicker.finish:()V
        //   593: return         
        //   594: astore          7
        //   596: aload           7
        //   598: athrow         
        //   599: astore          22
        //   601: aload           22
        //   603: athrow         
        //   604: astore          23
        //   606: aload           23
        //   608: athrow         
        //   609: astore          28
        //   611: aload           28
        //   613: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   616: aconst_null    
        //   617: astore          29
        //   619: goto            303
        //   622: astore          31
        //   624: aload           31
        //   626: athrow         
        //   627: astore          34
        //   629: aload           34
        //   631: athrow         
        //   632: astore          35
        //   634: aload           35
        //   636: athrow         
        //   637: astore          30
        //   639: aload           30
        //   641: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      14     20     28     Ljava/io/IOException;
        //  21     23     23     28     Ljava/io/IOException;
        //  37     57     594    599    Ljava/io/IOException;
        //  246    258    599    604    Ljava/io/IOException;
        //  262    269    599    604    Ljava/io/IOException;
        //  273    279    604    609    Ljava/io/IOException;
        //  285    299    609    622    Ljava/io/IOException;
        //  308    315    622    627    Ljava/io/IOException;
        //  333    373    627    632    Ljava/io/IOException;
        //  377    423    632    637    Ljava/io/IOException;
        //  436    464    637    642    Ljava/io/IOException;
        //  468    479    637    642    Ljava/io/IOException;
        //  629    632    632    637    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 317, Size: 317
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
    
    private boolean a(final String s) {
        return s.equals(MediaPicker.V[15]) || s.equals(MediaPicker.V[14]);
    }
    
    static ActionMode b(final MediaPicker mediaPicker) {
        return mediaPicker.U;
    }
    
    private boolean b(final String s) {
        return s.equals(MediaPicker.V[11]) || s.equals(MediaPicker.V[12]);
    }
    
    static ActionMode$Callback c(final MediaPicker mediaPicker) {
        return mediaPicker.Q;
    }
    
    public MediaGalleryBase$MediaItemView a() {
        return new MediaPicker$MediaItemPickerView((Context)this);
    }
    
    @Override
    protected aa a(final boolean b) {
        int n = 1;
        final Uri data = this.getIntent().getData();
        String string;
        if (data != null) {
            string = data.toString();
        }
        else {
            string = "";
        }
        if (!string.startsWith(br.i.toString())) {
            if (!b) {
                final ak ak = a6.c();
                if (MediaGalleryBase.v == 0) {
                    return a6.a(this.getContentResolver(), ak);
                }
            }
            final bv external = bv.EXTERNAL;
            final int g = this.G;
            if (!this.N) {
                n = 2;
            }
            String queryParameter;
            if (data != null) {
                queryParameter = data.getQueryParameter(MediaPicker.V[37]);
            }
            else {
                queryParameter = null;
            }
            final ak ak = a6.a(external, g, n, queryParameter);
            return a6.a(this.getContentResolver(), ak);
        }
        if (this.G == 4) {
            final ContentResolver contentResolver = this.getContentResolver();
            int n2;
            if (this.N) {
                n2 = n;
            }
            else {
                n2 = 2;
            }
            return new bc(contentResolver, n2, data.getQueryParameter(MediaPicker.V[38]));
        }
        final ContentResolver contentResolver2 = this.getContentResolver();
        if (!this.N) {
            n = 2;
        }
        return new br(contentResolver2, n, data.getQueryParameter(MediaPicker.V[36]));
    }
    
    @Override
    protected boolean a(final int n) {
        return this.T.contains(this.o.a(n).a());
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        final int v = MediaGalleryBase.v;
        Label_0290: {
            switch (n) {
                case 1: {
                    if (n2 == -1) {
                        this.setResult(-1, intent);
                        this.finish();
                        if (v == 0) {
                            break;
                        }
                    }
                    if (n2 == 2) {
                        this.setResult(2);
                        this.finish();
                        if (v == 0) {
                            break;
                        }
                    }
                    if (n2 != 1) {
                        break;
                    }
                    final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(MediaPicker.V[32]);
                    this.T.clear();
                    if (parcelableArrayListExtra != null) {
                        this.T.addAll(parcelableArrayListExtra);
                    }
                    Label_0138: {
                        if (this.U == null) {
                            this.U = this.startSupportActionMode(this.Q);
                            if (v == 0) {
                                break Label_0138;
                            }
                        }
                        this.U.invalidate();
                    }
                    this.R = (HashMap)intent.getSerializableExtra(MediaPicker.V[33]);
                    if (this.R == null) {
                        this.R = new HashMap();
                    }
                    this.O = (HashMap)intent.getSerializableExtra(MediaPicker.V[34]);
                    if (this.O == null) {
                        this.O = new HashMap();
                    }
                    this.K = (HashMap)intent.getSerializableExtra(MediaPicker.V[31]);
                    if (this.K == null) {
                        this.K = new HashMap();
                    }
                    this.F = (HashMap)intent.getSerializableExtra(MediaPicker.V[35]);
                    if (this.F == null) {
                        this.F = new HashMap();
                    }
                    this.s.notifyDataSetChanged();
                    if (v != 0) {
                        break Label_0290;
                    }
                    break;
                }
                case 2: {
                    if (n2 == -1 || n2 == 1) {
                        this.setResult(-1, intent);
                        this.finish();
                        if (v == 0) {
                            break;
                        }
                    }
                    if (n2 == 2) {
                        this.setResult(2);
                        this.finish();
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        Log.i(MediaPicker.V[42]);
        this.supportRequestWindowFeature(5);
        super.onCreate(bundle);
        this.I = this.getIntent().getLongExtra(MediaPicker.V[41], Long.MAX_VALUE);
        this.L = this.getIntent().getIntExtra(MediaPicker.V[43], Integer.MAX_VALUE);
        this.E = this.getIntent().getBooleanExtra(MediaPicker.V[45], true);
        this.S = this.getIntent().getStringExtra(MediaPicker.V[39]);
        this.J = this.getIntent().getStringExtra(MediaPicker.V[46]);
        this.y.setOnItemClickListener((AdapterView$OnItemClickListener)new be(this));
        if (this.L > 1) {
            this.y.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)new ay(this));
        }
        this.a();
        ArrayList list;
        if (bundle != null) {
            list = bundle.getParcelableArrayList(MediaPicker.V[40]);
        }
        else {
            list = this.getIntent().getParcelableArrayListExtra(MediaPicker.V[47]);
        }
        if (list != null && !list.isEmpty()) {
            this.T.clear();
            this.T.addAll(list);
            this.U = this.startSupportActionMode(this.Q);
            this.s.notifyDataSetChanged();
        }
        final Uri data = this.getIntent().getData();
        String string;
        if (data != null) {
            string = data.toString();
        }
        else {
            string = "";
        }
        Log.i(MediaPicker.V[44] + string);
        this.a(false, a6.a(this.getContentResolver()));
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (this.L > 1) {
            MenuItemCompat.setShowAsAction(menu.add(0, 2131755036, 0, 2131231628).setIcon(2130838732), 2);
        }
        if (App.aS == 3) {
            b_.c(this);
        }
        return true;
    }
    
    @Override
    public void onDestroy() {
        Log.i(MediaPicker.V[13]);
        super.onDestroy();
        this.Q = null;
        this.U = null;
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (this.P) {
            return false;
        }
        if (App.aS == 3 && n == 84) {
            b_.a(this, false);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 2131755036: {
                this.U = this.startSupportActionMode(this.Q);
                this.s.notifyDataSetChanged();
                return true;
            }
            case 16908332: {
                ActivityCompat.finishAfterTransition(this);
                return true;
            }
        }
    }
    
    public void onPause() {
        Log.i(MediaPicker.V[9]);
        super.onPause();
        this.P = true;
        if (this.M != null) {
            this.unregisterReceiver(this.M);
            this.M = null;
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (this.P) {
            return false;
        }
        if (App.aS == 3) {
            b_.c(this);
        }
        return true;
    }
    
    @Override
    public void onResume() {
        Log.i(MediaPicker.V[4]);
        super.onResume();
        this.P = false;
        final IntentFilter intentFilter = new IntentFilter(MediaPicker.V[8]);
        intentFilter.addAction(MediaPicker.V[2]);
        intentFilter.addAction(MediaPicker.V[5]);
        intentFilter.addAction(MediaPicker.V[3]);
        intentFilter.addAction(MediaPicker.V[6]);
        intentFilter.addDataScheme(MediaPicker.V[7]);
        this.registerReceiver(this.M = new MediaPicker$3(this), intentFilter);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.T != null) {
            bundle.putParcelableArrayList(MediaPicker.V[10], new ArrayList(this.T));
        }
    }
}
