// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.App;
import android.view.InflateException;
import org.xmlpull.v1.XmlPullParser;
import android.view.LayoutInflater$Factory;
import android.view.ViewParent;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.List;
import android.view.View;
import android.content.DialogInterface$OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.view.ViewGroup;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Activity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.File;

public class b_
{
    private static boolean a;
    private static String b;
    public static File c;
    private static String d;
    private static FileWriter e;
    private static JSONObject f;
    private static JSONArray g;
    private static int h;
    private static Map i;
    private static Map j;
    private static Set k;
    private static String l;
    public static boolean m;
    private static Map n;
    private static String o;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[55];
        int n = 0;
        String[] array = z2;
        String s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[qz!\f\u0015tx\u001f\u001d\u001am]<\u000b\u0004}w&\u0017\u00068r3\u001b\u0000wf+X\u0015tf7\u0019\u0010a47\u0000\u001dk`!";
        int n2 = -1;
        String intern = null;
    Label_1353:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    n = 1;
                    array = z2;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTkq \u0011\u0011k4;\u000bTva>\u0014";
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    n = 2;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fT59&\n\u0001vw3\f\u001dwz!+\u0017jq7\u0016\u0007p{&10#";
                    n2 = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    n = 3;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTq{r\u001d\f{q\"\f\u001dwz";
                    n2 = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTkw \u001d\u0011vg:\u0017\u00008g'\u001b\u0017}g!X\u0003q`:X\u0007qpr";
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTpq;\u001f\u001cl4&\u0017\u001b8x3\n\u0013}4\u007fFTt}9\u001d\u0018a4<\u0017\u00008ur\u0015\u0011vaiX\u0016uK:\u001d\u001d\u007f|&XI8";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 6;
                    s = "Zhz5";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 7;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fT}l1\u001d\u0004l}=\u0016T{f7\u0019\u0000qz5X\u0012qx7X";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n] = intern;
                    n = 8;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTy`&\u001d\u0019h`r\u000b\u0017jq7\u0016\u0007p{&X\u001b~4?\u001d\u001am";
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n] = intern;
                    n = 9;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTk}6XI8f=\u0017\u0000L{\u0001106s7\f\\sq+QO8g;\u001cTqgr";
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n] = intern;
                    n = 10;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTy`&\u001d\u0019h`r\u000b\u0017jq7\u0016\u0007p{&X\u001b~44\r\u0018t43\u001b\u0000qb;\f\r";
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n] = intern;
                    n = 11;
                    s = "\u0003qz6\u0017\u0003";
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n] = intern;
                    n = 12;
                    s = "Tj{=\fN8";
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n] = intern;
                    n = 13;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTqz1\n\u0011uq<\f\u0011|G\u001b<\u001dk4&\n\u0001}/r\u000b\u001d|4;\u000bT";
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n] = intern;
                    n = 14;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[lu9\u001d'{f7\u001d\u001ak|=\fTz}&\u0015\u0015h4!\u0019\u0019}/r\f\u001bGc \u0011\u0000}.r";
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n] = intern;
                    n = 15;
                    s = "\u0007lf;\u0016\u0013k";
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n] = intern;
                    n = 16;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u0019\u0018qn7X>K[\u001cX\u0011`w7\b\u0000q{<X";
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n] = intern;
                    n = 17;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u0019\u0018qn7X\u0011`w7\b\u0000q{<X\u0017t{!\u0011\u001a\u007f4&\n\u0001vw3\f\u001dwz!X\u0012qx7X";
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n] = intern;
                    n = 18;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u0019\u0018qn7X\u0017wy\"\u0014\u0011lq";
                    n2 = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n] = intern;
                    n = 19;
                    s = "5vp \u0017\u001d|";
                    n2 = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n] = intern;
                    s = "Zhz5";
                    n2 = 19;
                    n = 20;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n] = intern;
                    n = 21;
                    array = z2;
                    s = "\u0004tu&\u001e\u001bjy";
                    n2 = 20;
                    continue;
                }
                case 20: {
                    array[n] = intern;
                    n = 22;
                    s = "\u0018ww3\u0014\u0011";
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n] = intern;
                    n = 23;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c:}c\u0013\u0016\u0010j{;\u001c";
                    n2 = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n] = intern;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c:}c\u0013\u0016\u0010j{;\u001cTk}6BT";
                    n2 = 23;
                    n = 24;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n] = intern;
                    n = 25;
                    array = z2;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c:}c\u0013\u0016\u0010j{;\u001cTk\u007f;\b\u0004}p";
                    n2 = 24;
                    continue;
                }
                case 24: {
                    array[n] = intern;
                    n = 26;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c:}c\u0013\u0016\u0010j{;\u001cTsq+BT";
                    n2 = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n] = intern;
                    n = 27;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c:}c\u0013\u0016\u0010j{;\u001cTlq*\fN8";
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n] = intern;
                    n = 28;
                    s = "6J";
                    n2 = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n] = intern;
                    n = 29;
                    s = "\u0004l";
                    n2 = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n] = intern;
                    n = 30;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[kq&-\u00048y3\u001c\u00118";
                    n2 = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n] = intern;
                    n = 31;
                    s = "\u0000ja<\u001b\u0015l}=\u0016\u0007";
                    n2 = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n] = intern;
                    n = 32;
                    s = "T|} \u001d\u0017l{ \u0001";
                    n2 = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n] = intern;
                    n = 33;
                    s = "\u001d|";
                    n2 = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n] = intern;
                    n = 34;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[kq&-\u00048w \u001d\u0015l}<\u001fTlf'\u0016\u0017y`;\u0017\u001ak44\u0011\u0018}47\u0000\u0017}d&\u0011\u001bv4";
                    n2 = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n] = intern;
                    n = 35;
                    s = "\u001dv";
                    n2 = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n] = intern;
                    n = 36;
                    s = "'{f7\u001d\u001ak|=\f\u0007";
                    n2 = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n] = intern;
                    n = 37;
                    s = "\u001do";
                    n2 = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n] = intern;
                    n = 38;
                    s = "Zrg=\u0016";
                    n2 = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n] = intern;
                    n = 39;
                    s = "\u001c}";
                    n2 = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n] = intern;
                    n = 40;
                    s = "\u000ep";
                    n2 = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n] = intern;
                    n = 41;
                    s = "\u0000ja<\u001b\u0015l}=\u0016\u00075";
                    n2 = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n] = intern;
                    n = 42;
                    s = "Zrg=\u0016";
                    n2 = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n] = intern;
                    n = 43;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[kq&-\u00048y3\u001c\u00118G1\n\u0011}z!\u0010\u001blgr\u001c\u001djq1\f\u001bjm";
                    n2 = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n] = intern;
                    n = 44;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[kq&\r\u00048w=\u0015\u0004tq&\u001dN8";
                    n2 = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n] = intern;
                    n = 45;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c ja<\u001b\u0015l}=\u0016\u00078g;\u001cN8";
                    n2 = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n] = intern;
                    n = 46;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c ja<\u001b\u0015l}=\u0016\u00078g9\u0011\u0004hq6";
                    n2 = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n] = intern;
                    n = 47;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c ja<\u001b\u0015l}=\u0016\u0007";
                    n2 = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n] = intern;
                    n = 48;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c ja<\u001b\u0015l}=\u0016\u00078\u007f7\u0001N8";
                    n2 = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n] = intern;
                    n = 49;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c ja<\u001b\u0015l}=\u0016\u00078`7\u0000\u0000\"4";
                    n2 = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n] = intern;
                    n = 50;
                    s = ":}cr+\u0011j}7\u000b";
                    n2 = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n] = intern;
                    n = 51;
                    s = "\\}:5VT[\\\u0013,'1";
                    n2 = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n] = intern;
                    n = 52;
                    s = "6}s;\u0016TKq \u0011\u0011k";
                    n2 = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n] = intern;
                    n = 53;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c9}z',\u0006mz1\u0019\u0000q{<\u000bT~u1\f\u001bjmr\u0019\u0018jq3\u001c\r8q*\u0011\u0007lg";
                    n2 = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n] = intern;
                    n = 54;
                    s = "\u0000ja<\u001b\u0015l}=\u0016!l}>\u000b[~}<\u001c9}z',\u0006mz1\u0019\u0000q{<\u000b";
                    n2 = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    break Label_1353;
                }
            }
        }
        array[n] = intern;
        z = z2;
        b_.e = null;
        b_.o = null;
        final char[] charArray2 = "\u0015vp \u0017\u001d|9".toCharArray();
        for (int j = charArray2.length, n4 = 0; j > n4; ++n4) {
            final char c3 = charArray2[n4];
            char c4 = '\0';
            switch (n4 % 5) {
                default: {
                    c4 = 'x';
                    break;
                }
                case 0: {
                    c4 = 't';
                    break;
                }
                case 1: {
                    c4 = '\u0018';
                    break;
                }
                case 2: {
                    c4 = '\u0014';
                    break;
                }
                case 3: {
                    c4 = 'R';
                    break;
                }
            }
            charArray2[n4] = (char)(c4 ^ c3);
        }
        b_.l = new String(charArray2).intern();
        b_.b = null;
        b_.h = -1;
        b_.f = null;
        b_.g = null;
        b_.m = false;
        b_.k = new HashSet();
        b_.n = null;
        b_.i = null;
        b_.j = new HashMap();
        b_.a = false;
        b_.d = "";
        b_.c = null;
    }
    
    public static AlertDialog$Builder a(final Activity activity) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        alertDialog$Builder.setTitle(b_.z[50]);
        alertDialog$Builder.setMessage(b_.z[51]);
        final View inflate = activity.getLayoutInflater().inflate(2130903227, (ViewGroup)null);
        alertDialog$Builder.setView(inflate);
        alertDialog$Builder.setPositiveButton(b_.z[52], (DialogInterface$OnClickListener)new bv((EditText)inflate.findViewById(2131755765), (CheckBox)inflate.findViewById(2131755766), (CheckBox)inflate.findViewById(2131755767), activity));
        return alertDialog$Builder;
    }
    
    static String a(final String b) {
        return b_.b = b;
    }
    
    static JSONArray a() {
        return b_.g;
    }
    
    public static void a(final Activity p0, final ViewGroup p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //     7: bipush          23
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore_3       
        //    21: aload_1        
        //    22: aload_3        
        //    23: invokestatic    com/whatsapp/util/b_.a:(Landroid/view/View;Ljava/util/List;)V
        //    26: aload_3        
        //    27: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    32: astore          4
        //    34: aload           4
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifeq            73
        //    44: aload           4
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: checkcast       Landroid/widget/TextView;
        //    54: astore          5
        //    56: aload           5
        //    58: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //    61: invokeinterface java/lang/CharSequence.length:()I
        //    66: istore          7
        //    68: iload           7
        //    70: ifgt            79
        //    73: return         
        //    74: astore          6
        //    76: aload           6
        //    78: athrow         
        //    79: aload           5
        //    81: invokevirtual   android/widget/TextView.getRootView:()Landroid/view/View;
        //    84: astore          8
        //    86: getstatic       com/whatsapp/util/b_.k:Ljava/util/Set;
        //    89: aload           8
        //    91: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: aload           8
        //    99: invokevirtual   android/view/View.getHeight:()I
        //   102: aload           8
        //   104: invokevirtual   android/view/View.getWidth:()I
        //   107: imul           
        //   108: i2l            
        //   109: aload           8
        //   111: invokevirtual   java/lang/Object.hashCode:()I
        //   114: i2l            
        //   115: aload           8
        //   117: invokevirtual   android/view/View.getDrawingTime:()J
        //   120: ladd           
        //   121: ladd           
        //   122: lstore          10
        //   124: new             Ljava/lang/StringBuilder;
        //   127: dup            
        //   128: invokespecial   java/lang/StringBuilder.<init>:()V
        //   131: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   134: bipush          26
        //   136: aaload         
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: lload           10
        //   142: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   151: aload           5
        //   153: lload           10
        //   155: iconst_1       
        //   156: aload_0        
        //   157: invokestatic    com/whatsapp/util/b_.b:(Landroid/view/View;JZLandroid/app/Activity;)V
        //   160: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   163: astore          14
        //   165: aload           14
        //   167: ifnull          186
        //   170: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   173: lload           10
        //   175: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   178: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   183: ifne            206
        //   186: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   189: bipush          25
        //   191: aaload         
        //   192: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   195: return         
        //   196: astore          13
        //   198: aload           13
        //   200: athrow         
        //   201: astore          12
        //   203: aload           12
        //   205: athrow         
        //   206: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   209: lload           10
        //   211: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   214: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   219: checkcast       Ljava/lang/Integer;
        //   222: invokevirtual   java/lang/Integer.intValue:()I
        //   225: istore          15
        //   227: new             Ljava/lang/StringBuilder;
        //   230: dup            
        //   231: invokespecial   java/lang/StringBuilder.<init>:()V
        //   234: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   237: bipush          24
        //   239: aaload         
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: iload           15
        //   245: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   254: aload           5
        //   256: invokevirtual   android/widget/TextView.getLayout:()Landroid/text/Layout;
        //   259: astore          16
        //   261: aload           5
        //   263: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   266: astore          17
        //   268: aload           5
        //   270: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   273: astore          18
        //   275: new             Ljava/lang/StringBuilder;
        //   278: dup            
        //   279: invokespecial   java/lang/StringBuilder.<init>:()V
        //   282: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   285: bipush          27
        //   287: aaload         
        //   288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   291: aload           18
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   296: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   299: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   302: aload           5
        //   304: invokevirtual   android/widget/TextView.getLineCount:()I
        //   307: istore          19
        //   309: iload           19
        //   311: ifle            345
        //   314: aload           18
        //   316: aload           16
        //   318: iload           19
        //   320: iconst_1       
        //   321: isub           
        //   322: invokevirtual   android/text/Layout.getLineStart:(I)I
        //   325: aload           16
        //   327: iload           19
        //   329: iconst_1       
        //   330: isub           
        //   331: invokevirtual   android/text/Layout.getLineEnd:(I)I
        //   334: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //   339: astore          20
        //   341: iload_2        
        //   342: ifeq            349
        //   345: aload           18
        //   347: astore          20
        //   349: aload           18
        //   351: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   356: astore          21
        //   358: aload           5
        //   360: invokevirtual   android/widget/TextView.getWidth:()I
        //   363: aload           5
        //   365: invokevirtual   android/widget/TextView.getCompoundPaddingLeft:()I
        //   368: isub           
        //   369: aload           5
        //   371: invokevirtual   android/widget/TextView.getCompoundPaddingRight:()I
        //   374: isub           
        //   375: i2f            
        //   376: fstore          22
        //   378: aload           17
        //   380: aload           20
        //   382: iconst_0       
        //   383: aload           20
        //   385: invokeinterface java/lang/CharSequence.length:()I
        //   390: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/CharSequence;II)F
        //   393: fstore          23
        //   395: fload           22
        //   397: fconst_0       
        //   398: fcmpl          
        //   399: ifle            575
        //   402: aload           5
        //   404: invokestatic    com/whatsapp/util/b_.a:(Landroid/view/View;)Z
        //   407: istore          26
        //   409: iload           26
        //   411: ifeq            575
        //   414: aload           21
        //   416: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   419: ifne            575
        //   422: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //   425: astore          27
        //   427: aload           27
        //   429: ifnull          575
        //   432: new             Lorg/json/JSONArray;
        //   435: dup            
        //   436: invokespecial   org/json/JSONArray.<init>:()V
        //   439: astore          28
        //   441: iload           15
        //   443: bipush          10
        //   445: if_icmpge       595
        //   448: new             Ljava/lang/StringBuilder;
        //   451: dup            
        //   452: invokespecial   java/lang/StringBuilder.<init>:()V
        //   455: ldc_w           "0"
        //   458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   461: iload           15
        //   463: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   466: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   469: astore          40
        //   471: aload           40
        //   473: astore          29
        //   475: aload           28
        //   477: new             Ljava/lang/StringBuilder;
        //   480: dup            
        //   481: invokespecial   java/lang/StringBuilder.<init>:()V
        //   484: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   487: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   490: ldc_w           "-"
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: aload           29
        //   498: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   501: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   504: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   507: pop            
        //   508: aload           28
        //   510: aload           21
        //   512: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   515: pop            
        //   516: aload           28
        //   518: fload           22
        //   520: f2d            
        //   521: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   524: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   527: pop            
        //   528: aload           28
        //   530: fload           23
        //   532: f2d            
        //   533: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   536: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   539: pop            
        //   540: fload           23
        //   542: fload           22
        //   544: fcmpl          
        //   545: ifle            559
        //   548: aload           28
        //   550: iconst_1       
        //   551: invokevirtual   org/json/JSONArray.put:(Z)Lorg/json/JSONArray;
        //   554: pop            
        //   555: iload_2        
        //   556: ifeq            566
        //   559: aload           28
        //   561: iconst_0       
        //   562: invokevirtual   org/json/JSONArray.put:(Z)Lorg/json/JSONArray;
        //   565: pop            
        //   566: getstatic       com/whatsapp/util/b_.g:Lorg/json/JSONArray;
        //   569: aload           28
        //   571: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   574: pop            
        //   575: iload_2        
        //   576: ifeq            34
        //   579: return         
        //   580: astore          24
        //   582: aload           24
        //   584: athrow         
        //   585: astore          25
        //   587: aload           25
        //   589: athrow         
        //   590: astore          39
        //   592: aload           39
        //   594: athrow         
        //   595: iload           15
        //   597: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   600: astore          29
        //   602: goto            475
        //   605: astore          30
        //   607: aload           30
        //   609: athrow         
        //   610: astore          31
        //   612: aload           31
        //   614: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  56     68     74     79     Ljava/lang/UnsupportedOperationException;
        //  124    165    201    206    Ljava/lang/UnsupportedOperationException;
        //  170    186    196    201    Ljava/lang/UnsupportedOperationException;
        //  186    195    196    201    Ljava/lang/UnsupportedOperationException;
        //  203    206    196    201    Ljava/lang/UnsupportedOperationException;
        //  402    409    580    585    Ljava/lang/UnsupportedOperationException;
        //  414    427    585    590    Ljava/lang/UnsupportedOperationException;
        //  448    471    590    595    Ljava/lang/UnsupportedOperationException;
        //  475    540    605    610    Ljava/lang/UnsupportedOperationException;
        //  548    555    610    615    Ljava/lang/UnsupportedOperationException;
        //  559    566    610    615    Ljava/lang/UnsupportedOperationException;
        //  582    585    585    590    Ljava/lang/UnsupportedOperationException;
        //  607    610    610    615    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 273, Size: 273
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
    
    public static void a(final Activity activity, final boolean b) {
        a((ViewGroup)activity.findViewById(16908290).getRootView(), activity, b);
    }
    
    static void a(final View view, final long n, final boolean b, final Activity activity) {
        b(view, n, b, activity);
    }
    
    private static void a(final View view, final List list) {
        final boolean l = Log.l;
        while (true) {
            final int n2;
            Label_0057: {
                if (!(view instanceof ViewGroup)) {
                    break Label_0057;
                }
                final int childCount = ((ViewGroup)view).getChildCount();
                final int n = 0;
                if (n < childCount) {
                    a(((ViewGroup)view).getChildAt(n), list);
                    n2 = n + 1;
                    if (!l) {
                        break Label_0057;
                    }
                }
                if (!l) {
                    return;
                }
                try {
                    if (view instanceof TextView) {
                        list.add(view);
                    }
                    return;
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
            }
            final int n = n2;
            continue;
        }
    }
    
    public static void a(final ViewGroup p0, final Activity p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_3       
        //     4: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //     7: astore          5
        //     9: aload           5
        //    11: ifnonnull       20
        //    14: return         
        //    15: astore          4
        //    17: aload           4
        //    19: athrow         
        //    20: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    23: bipush          47
        //    25: aaload         
        //    26: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    29: aload_0        
        //    30: invokevirtual   android/view/ViewGroup.getHeight:()I
        //    33: aload_0        
        //    34: invokevirtual   android/view/ViewGroup.getWidth:()I
        //    37: imul           
        //    38: i2l            
        //    39: aload_0        
        //    40: invokevirtual   java/lang/Object.hashCode:()I
        //    43: i2l            
        //    44: aload_0        
        //    45: invokevirtual   android/view/ViewGroup.getDrawingTime:()J
        //    48: ladd           
        //    49: ladd           
        //    50: lstore          6
        //    52: new             Ljava/lang/StringBuilder;
        //    55: dup            
        //    56: invokespecial   java/lang/StringBuilder.<init>:()V
        //    59: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    62: bipush          48
        //    64: aaload         
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    68: lload           6
        //    70: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    79: aload_0        
        //    80: lload           6
        //    82: iload_2        
        //    83: aload_1        
        //    84: invokestatic    com/whatsapp/util/b_.b:(Landroid/view/View;JZLandroid/app/Activity;)V
        //    87: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //    90: astore          10
        //    92: aload           10
        //    94: ifnull          113
        //    97: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   100: lload           6
        //   102: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   105: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   110: ifne            133
        //   113: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   116: bipush          46
        //   118: aaload         
        //   119: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   122: return         
        //   123: astore          9
        //   125: aload           9
        //   127: athrow         
        //   128: astore          8
        //   130: aload           8
        //   132: athrow         
        //   133: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   136: lload           6
        //   138: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   141: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   146: checkcast       Ljava/lang/Integer;
        //   149: invokevirtual   java/lang/Integer.intValue:()I
        //   152: istore          11
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   164: bipush          45
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: iload           11
        //   172: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   175: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   178: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   181: new             Ljava/util/ArrayList;
        //   184: dup            
        //   185: invokespecial   java/util/ArrayList.<init>:()V
        //   188: astore          12
        //   190: aload_0        
        //   191: aload           12
        //   193: invokestatic    com/whatsapp/util/b_.a:(Landroid/view/View;Ljava/util/List;)V
        //   196: aload           12
        //   198: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   203: astore          13
        //   205: aload           13
        //   207: invokeinterface java/util/Iterator.hasNext:()Z
        //   212: ifeq            14
        //   215: aload           13
        //   217: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   222: checkcast       Landroid/widget/TextView;
        //   225: astore          14
        //   227: aload           14
        //   229: invokevirtual   android/widget/TextView.getLayout:()Landroid/text/Layout;
        //   232: astore          15
        //   234: aload           14
        //   236: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   239: astore          16
        //   241: aload           14
        //   243: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   246: astore          17
        //   248: getstatic       com/whatsapp/util/b_.a:Z
        //   251: ifeq            262
        //   254: aload           14
        //   256: ldc_w           -16711936
        //   259: invokevirtual   android/widget/TextView.setTextColor:(I)V
        //   262: aload           14
        //   264: invokevirtual   android/widget/TextView.getLineCount:()I
        //   267: istore          19
        //   269: iload           19
        //   271: ifle            305
        //   274: aload           17
        //   276: aload           15
        //   278: iload           19
        //   280: iconst_1       
        //   281: isub           
        //   282: invokevirtual   android/text/Layout.getLineStart:(I)I
        //   285: aload           15
        //   287: iload           19
        //   289: iconst_1       
        //   290: isub           
        //   291: invokevirtual   android/text/Layout.getLineEnd:(I)I
        //   294: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //   299: astore          20
        //   301: iload_3        
        //   302: ifeq            309
        //   305: aload           17
        //   307: astore          20
        //   309: aload           16
        //   311: aload           20
        //   313: iconst_0       
        //   314: aload           20
        //   316: invokeinterface java/lang/CharSequence.length:()I
        //   321: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/CharSequence;II)F
        //   324: fstore          21
        //   326: aload           14
        //   328: invokevirtual   android/widget/TextView.getWidth:()I
        //   331: aload           14
        //   333: invokevirtual   android/widget/TextView.getCompoundPaddingLeft:()I
        //   336: isub           
        //   337: aload           14
        //   339: invokevirtual   android/widget/TextView.getCompoundPaddingRight:()I
        //   342: isub           
        //   343: i2f            
        //   344: fstore          22
        //   346: aload           17
        //   348: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //   353: astore          23
        //   355: new             Ljava/lang/StringBuilder;
        //   358: dup            
        //   359: invokespecial   java/lang/StringBuilder.<init>:()V
        //   362: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   365: bipush          49
        //   367: aaload         
        //   368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   371: aload           23
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   379: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   382: fload           22
        //   384: fconst_0       
        //   385: fcmpl          
        //   386: ifle            562
        //   389: aload           14
        //   391: invokestatic    com/whatsapp/util/b_.a:(Landroid/view/View;)Z
        //   394: istore          27
        //   396: iload           27
        //   398: ifeq            562
        //   401: aload           23
        //   403: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   406: ifne            562
        //   409: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //   412: astore          28
        //   414: aload           28
        //   416: ifnull          562
        //   419: new             Lorg/json/JSONArray;
        //   422: dup            
        //   423: invokespecial   org/json/JSONArray.<init>:()V
        //   426: astore          29
        //   428: iload           11
        //   430: bipush          10
        //   432: if_icmpge       592
        //   435: new             Ljava/lang/StringBuilder;
        //   438: dup            
        //   439: invokespecial   java/lang/StringBuilder.<init>:()V
        //   442: ldc_w           "0"
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: iload           11
        //   450: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   453: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   456: astore          41
        //   458: aload           41
        //   460: astore          30
        //   462: aload           29
        //   464: new             Ljava/lang/StringBuilder;
        //   467: dup            
        //   468: invokespecial   java/lang/StringBuilder.<init>:()V
        //   471: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   474: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   477: ldc_w           "-"
        //   480: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   483: aload           30
        //   485: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   488: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   491: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   494: pop            
        //   495: aload           29
        //   497: aload           23
        //   499: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   502: pop            
        //   503: aload           29
        //   505: fload           22
        //   507: f2d            
        //   508: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   511: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   514: pop            
        //   515: aload           29
        //   517: fload           21
        //   519: f2d            
        //   520: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   523: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   526: pop            
        //   527: fload           21
        //   529: fload           22
        //   531: fcmpl          
        //   532: ifle            546
        //   535: aload           29
        //   537: iconst_1       
        //   538: invokevirtual   org/json/JSONArray.put:(Z)Lorg/json/JSONArray;
        //   541: pop            
        //   542: iload_3        
        //   543: ifeq            553
        //   546: aload           29
        //   548: iconst_0       
        //   549: invokevirtual   org/json/JSONArray.put:(Z)Lorg/json/JSONArray;
        //   552: pop            
        //   553: getstatic       com/whatsapp/util/b_.g:Lorg/json/JSONArray;
        //   556: aload           29
        //   558: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   561: pop            
        //   562: iload_3        
        //   563: ifeq            205
        //   566: return         
        //   567: astore          18
        //   569: aload           18
        //   571: athrow         
        //   572: astore          24
        //   574: aload           24
        //   576: athrow         
        //   577: astore          25
        //   579: aload           25
        //   581: athrow         
        //   582: astore          26
        //   584: aload           26
        //   586: athrow         
        //   587: astore          40
        //   589: aload           40
        //   591: athrow         
        //   592: iload           11
        //   594: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   597: astore          30
        //   599: goto            462
        //   602: astore          31
        //   604: aload           31
        //   606: athrow         
        //   607: astore          32
        //   609: aload           32
        //   611: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      9      15     20     Ljava/lang/UnsupportedOperationException;
        //  52     92     128    133    Ljava/lang/UnsupportedOperationException;
        //  97     113    123    128    Ljava/lang/UnsupportedOperationException;
        //  113    122    123    128    Ljava/lang/UnsupportedOperationException;
        //  130    133    123    128    Ljava/lang/UnsupportedOperationException;
        //  248    262    567    572    Ljava/lang/UnsupportedOperationException;
        //  355    382    572    577    Ljava/lang/UnsupportedOperationException;
        //  389    396    577    582    Ljava/lang/UnsupportedOperationException;
        //  401    414    582    587    Ljava/lang/UnsupportedOperationException;
        //  435    458    587    592    Ljava/lang/UnsupportedOperationException;
        //  462    527    602    607    Ljava/lang/UnsupportedOperationException;
        //  535    542    607    612    Ljava/lang/UnsupportedOperationException;
        //  546    553    607    612    Ljava/lang/UnsupportedOperationException;
        //  574    577    577    582    Ljava/lang/UnsupportedOperationException;
        //  579    582    582    587    Ljava/lang/UnsupportedOperationException;
        //  604    607    607    612    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 275, Size: 275
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
    
    private static void a(final CharSequence p0, final Activity p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    10: bipush          32
        //    12: bipush          95
        //    14: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    17: astore_3       
        //    18: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    21: bipush          31
        //    23: aaload         
        //    24: pop            
        //    25: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    28: bipush          42
        //    30: aaload         
        //    31: pop            
        //    32: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //    35: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    38: astore          6
        //    40: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //    43: invokevirtual   java/util/Locale.getCountry:()Ljava/lang/String;
        //    46: astore          7
        //    48: aload           6
        //    50: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    53: bipush          35
        //    55: aaload         
        //    56: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    59: ifeq            74
        //    62: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    65: bipush          33
        //    67: aaload         
        //    68: astore          6
        //    70: iload_2        
        //    71: ifeq            646
        //    74: aload           6
        //    76: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    79: bipush          37
        //    81: aaload         
        //    82: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    85: istore          9
        //    87: iload           9
        //    89: ifeq            104
        //    92: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    95: bipush          39
        //    97: aaload         
        //    98: astore          6
        //   100: iload_2        
        //   101: ifeq            646
        //   104: aload           6
        //   106: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   109: bipush          40
        //   111: aaload         
        //   112: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   115: istore          11
        //   117: iload           11
        //   119: ifeq            154
        //   122: new             Ljava/lang/StringBuilder;
        //   125: dup            
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: aload           6
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: ldc_w           "_"
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload           7
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: astore          6
        //   150: iload_2        
        //   151: ifeq            646
        //   154: aload           6
        //   156: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   159: bipush          29
        //   161: aaload         
        //   162: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   165: istore          14
        //   167: iload           14
        //   169: ifeq            646
        //   172: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   175: bipush          28
        //   177: aaload         
        //   178: aload           7
        //   180: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   183: istore          29
        //   185: iload           29
        //   187: ifeq            646
        //   190: new             Ljava/lang/StringBuilder;
        //   193: dup            
        //   194: invokespecial   java/lang/StringBuilder.<init>:()V
        //   197: aload           6
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: ldc_w           "_"
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: aload           7
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   216: astore          15
        //   218: aload           15
        //   220: getstatic       com/whatsapp/util/b_.d:Ljava/lang/String;
        //   223: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   226: ifne            237
        //   229: getstatic       com/whatsapp/util/b_.j:Ljava/util/Map;
        //   232: invokeinterface java/util/Map.clear:()V
        //   237: new             Ljava/io/File;
        //   240: dup            
        //   241: getstatic       com/whatsapp/App.M:Ljava/io/File;
        //   244: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   247: bipush          36
        //   249: aaload         
        //   250: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   253: astore          17
        //   255: aload           17
        //   257: invokevirtual   java/io/File.exists:()Z
        //   260: ifne            278
        //   263: aload           17
        //   265: invokevirtual   java/io/File.mkdir:()Z
        //   268: pop            
        //   269: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   272: bipush          43
        //   274: aaload         
        //   275: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   278: new             Ljava/io/File;
        //   281: dup            
        //   282: aload           17
        //   284: aload           15
        //   286: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   289: astore          19
        //   291: aload           19
        //   293: invokevirtual   java/io/File.exists:()Z
        //   296: ifne            349
        //   299: aload           19
        //   301: invokevirtual   java/io/File.mkdir:()Z
        //   304: pop            
        //   305: getstatic       com/whatsapp/util/b_.j:Ljava/util/Map;
        //   308: invokeinterface java/util/Map.clear:()V
        //   313: new             Ljava/lang/StringBuilder;
        //   316: dup            
        //   317: invokespecial   java/lang/StringBuilder.<init>:()V
        //   320: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   323: bipush          30
        //   325: aaload         
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: aload           15
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   337: bipush          32
        //   339: aaload         
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   343: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   346: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   349: aload           19
        //   351: putstatic       com/whatsapp/util/b_.c:Ljava/io/File;
        //   354: new             Ljava/io/File;
        //   357: dup            
        //   358: getstatic       com/whatsapp/util/b_.c:Ljava/io/File;
        //   361: new             Ljava/lang/StringBuilder;
        //   364: dup            
        //   365: invokespecial   java/lang/StringBuilder.<init>:()V
        //   368: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   371: bipush          41
        //   373: aaload         
        //   374: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   377: aload           15
        //   379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   382: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   385: bipush          38
        //   387: aaload         
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   394: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   397: astore          21
        //   399: aload_3        
        //   400: putstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   403: getstatic       com/whatsapp/util/b_.j:Ljava/util/Map;
        //   406: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   409: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   414: ifeq            441
        //   417: getstatic       com/whatsapp/util/b_.j:Ljava/util/Map;
        //   420: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   423: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   428: checkcast       Ljava/lang/Integer;
        //   431: invokevirtual   java/lang/Integer.intValue:()I
        //   434: putstatic       com/whatsapp/util/b_.h:I
        //   437: iload_2        
        //   438: ifeq            445
        //   441: iconst_0       
        //   442: putstatic       com/whatsapp/util/b_.h:I
        //   445: aload           21
        //   447: invokevirtual   java/io/File.exists:()Z
        //   450: ifne            459
        //   453: aload           21
        //   455: invokevirtual   java/io/File.createNewFile:()Z
        //   458: pop            
        //   459: new             Ljava/io/FileWriter;
        //   462: dup            
        //   463: aload           21
        //   465: invokevirtual   java/io/File.getAbsoluteFile:()Ljava/io/File;
        //   468: iconst_1       
        //   469: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;Z)V
        //   472: putstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //   475: aload           15
        //   477: putstatic       com/whatsapp/util/b_.d:Ljava/lang/String;
        //   480: new             Ljava/util/HashMap;
        //   483: dup            
        //   484: invokespecial   java/util/HashMap.<init>:()V
        //   487: putstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   490: new             Ljava/util/HashMap;
        //   493: dup            
        //   494: invokespecial   java/util/HashMap.<init>:()V
        //   497: putstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   500: new             Lorg/json/JSONObject;
        //   503: dup            
        //   504: invokespecial   org/json/JSONObject.<init>:()V
        //   507: putstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //   510: new             Lorg/json/JSONArray;
        //   513: dup            
        //   514: invokespecial   org/json/JSONArray.<init>:()V
        //   517: putstatic       com/whatsapp/util/b_.g:Lorg/json/JSONArray;
        //   520: new             Ljava/lang/StringBuilder;
        //   523: dup            
        //   524: invokespecial   java/lang/StringBuilder.<init>:()V
        //   527: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   530: bipush          44
        //   532: aaload         
        //   533: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   536: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   542: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   545: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   548: aload_1        
        //   549: invokevirtual   android/app/Activity.finish:()V
        //   552: aload_1        
        //   553: aload_1        
        //   554: invokevirtual   android/app/Activity.getIntent:()Landroid/content/Intent;
        //   557: invokevirtual   android/app/Activity.startActivity:(Landroid/content/Intent;)V
        //   560: return         
        //   561: astore          8
        //   563: aload           8
        //   565: athrow         
        //   566: astore          10
        //   568: aload           10
        //   570: athrow         
        //   571: astore          12
        //   573: aload           12
        //   575: athrow         
        //   576: astore          13
        //   578: aload           13
        //   580: athrow         
        //   581: astore          16
        //   583: aload           16
        //   585: athrow         
        //   586: astore          18
        //   588: aload           18
        //   590: athrow         
        //   591: astore          20
        //   593: aload           20
        //   595: athrow         
        //   596: astore          22
        //   598: aload           22
        //   600: athrow         
        //   601: astore          23
        //   603: aload           23
        //   605: athrow         
        //   606: astore          24
        //   608: aload           24
        //   610: athrow         
        //   611: astore          25
        //   613: new             Ljava/lang/StringBuilder;
        //   616: dup            
        //   617: invokespecial   java/lang/StringBuilder.<init>:()V
        //   620: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   623: bipush          34
        //   625: aaload         
        //   626: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   629: aload           25
        //   631: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   637: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   640: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   643: goto            475
        //   646: aload           6
        //   648: astore          15
        //   650: goto            218
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  74     87     561    566    Ljava/io/IOException;
        //  104    117    566    571    Ljava/io/IOException;
        //  154    167    571    576    Ljava/io/IOException;
        //  172    185    576    581    Ljava/io/IOException;
        //  218    237    581    586    Ljava/io/IOException;
        //  255    278    586    591    Ljava/io/IOException;
        //  291    349    591    596    Ljava/io/IOException;
        //  399    437    596    601    Ljava/io/IOException;
        //  441    445    601    606    Ljava/io/IOException;
        //  445    459    606    611    Ljava/io/IOException;
        //  459    475    611    646    Ljava/io/IOException;
        //  573    576    576    581    Ljava/io/IOException;
        //  598    601    601    606    Ljava/io/IOException;
        //  608    611    611    646    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 282, Size: 282
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
    
    static void a(final String s, final AttributeSet set, final LayoutInflater layoutInflater, final View[] array) {
        b(s, set, layoutInflater, array);
    }
    
    private static boolean a(View view) {
        while (view != view.getRootView()) {
            try {
                if (view.getVisibility() != 0) {
                    return false;
                }
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            final ViewParent parent = view.getParent();
            if (parent == null) {
                return false;
            }
            try {
                if (!(parent instanceof View)) {
                    return true;
                }
            }
            catch (UnsupportedOperationException ex2) {
                throw ex2;
            }
            final View view2 = (View)parent;
            if (view2 == null) {
                return false;
            }
            view = view2;
        }
        return true;
    }
    
    static boolean a(final boolean a) {
        return b_.a = a;
    }
    
    static Map b() {
        return b_.n;
    }
    
    public static void b(final Activity activity) {
        try {
            if (LayoutInflater.from((Context)activity).getFactory() != null) {
                Log.i(b_.z[0]);
                return;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        LayoutInflater.from((Context)activity).setFactory((LayoutInflater$Factory)new cw(activity));
    }
    
    private static void b(final View p0, final long p1, final boolean p2, final Activity p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore          5
        //     5: aload           4
        //     7: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    10: bipush          11
        //    12: aaload         
        //    13: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    16: checkcast       Landroid/view/WindowManager;
        //    19: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //    24: astore          6
        //    26: aload           6
        //    28: invokevirtual   android/view/Display.getHeight:()I
        //    31: istore          7
        //    33: aload           6
        //    35: invokevirtual   android/view/Display.getWidth:()I
        //    38: istore          8
        //    40: aload_0        
        //    41: invokevirtual   android/view/View.getRootView:()Landroid/view/View;
        //    44: astore          9
        //    46: aload           9
        //    48: ifnonnull       52
        //    51: return         
        //    52: aload           9
        //    54: iconst_1       
        //    55: invokevirtual   android/view/View.setDrawingCacheEnabled:(Z)V
        //    58: aload           9
        //    60: invokevirtual   android/view/View.getDrawingCache:()Landroid/graphics/Bitmap;
        //    63: astore          10
        //    65: aload           10
        //    67: ifnull          51
        //    70: aload           10
        //    72: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    75: istore          11
        //    77: iload_3        
        //    78: ifeq            123
        //    81: iload           11
        //    83: iload           7
        //    85: bipush          25
        //    87: isub           
        //    88: if_icmplt       123
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   101: iconst_5       
        //   102: aaload         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: iload           11
        //   108: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   111: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   114: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   117: return         
        //   118: astore          54
        //   120: aload           54
        //   122: athrow         
        //   123: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   126: ifnonnull       139
        //   129: new             Ljava/util/HashMap;
        //   132: dup            
        //   133: invokespecial   java/util/HashMap.<init>:()V
        //   136: putstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   139: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   142: ifnonnull       155
        //   145: new             Ljava/util/HashMap;
        //   148: dup            
        //   149: invokespecial   java/util/HashMap.<init>:()V
        //   152: putstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   155: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   158: ifnonnull       185
        //   161: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   164: iconst_1       
        //   165: aaload         
        //   166: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   169: return         
        //   170: astore          14
        //   172: aload           14
        //   174: athrow         
        //   175: astore          12
        //   177: aload           12
        //   179: athrow         
        //   180: astore          13
        //   182: aload           13
        //   184: athrow         
        //   185: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   188: lload_1        
        //   189: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   192: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   197: ifeq            252
        //   200: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   203: lload_1        
        //   204: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   207: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   212: checkcast       Ljava/lang/Integer;
        //   215: invokevirtual   java/lang/Integer.intValue:()I
        //   218: istore          15
        //   220: new             Ljava/lang/StringBuilder;
        //   223: dup            
        //   224: invokespecial   java/lang/StringBuilder.<init>:()V
        //   227: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   230: bipush          9
        //   232: aaload         
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: iload           15
        //   238: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   247: iload           5
        //   249: ifeq            1068
        //   252: iconst_1       
        //   253: getstatic       com/whatsapp/util/b_.h:I
        //   256: iadd           
        //   257: istore          15
        //   259: iload           15
        //   261: putstatic       com/whatsapp/util/b_.h:I
        //   264: new             Ljava/lang/StringBuilder;
        //   267: dup            
        //   268: invokespecial   java/lang/StringBuilder.<init>:()V
        //   271: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   274: bipush          13
        //   276: aaload         
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: iload           15
        //   282: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   285: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   288: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   291: iconst_1       
        //   292: istore          16
        //   294: iload_3        
        //   295: ifeq            385
        //   298: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   301: bipush          8
        //   303: aaload         
        //   304: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   307: iload           8
        //   309: iload           7
        //   311: getstatic       android/graphics/Bitmap$Config.RGB_565:Landroid/graphics/Bitmap$Config;
        //   314: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   317: astore          53
        //   319: aload           53
        //   321: astore          50
        //   323: new             Landroid/graphics/Canvas;
        //   326: dup            
        //   327: aload           50
        //   329: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   332: astore          51
        //   334: aload           4
        //   336: ldc_w           16908290
        //   339: invokevirtual   android/app/Activity.findViewById:(I)Landroid/view/View;
        //   342: invokevirtual   android/view/View.getRootView:()Landroid/view/View;
        //   345: aload           51
        //   347: invokevirtual   android/view/View.draw:(Landroid/graphics/Canvas;)V
        //   350: iconst_2       
        //   351: newarray        I
        //   353: astore          52
        //   355: aload           9
        //   357: aload           52
        //   359: invokevirtual   android/view/View.getLocationOnScreen:([I)V
        //   362: aload           51
        //   364: aload           10
        //   366: aload           52
        //   368: iconst_0       
        //   369: iaload         
        //   370: i2f            
        //   371: aload           52
        //   373: iconst_1       
        //   374: iaload         
        //   375: i2f            
        //   376: aconst_null    
        //   377: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   380: iload           5
        //   382: ifeq            1061
        //   385: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   388: bipush          10
        //   390: aaload         
        //   391: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   394: aload           10
        //   396: astore          19
        //   398: iconst_0       
        //   399: istore          20
        //   401: new             Ljava/util/HashSet;
        //   404: dup            
        //   405: invokespecial   java/util/HashSet.<init>:()V
        //   408: astore          21
        //   410: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   413: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   418: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   423: astore          22
        //   425: aload           22
        //   427: invokeinterface java/util/Iterator.hasNext:()Z
        //   432: ifeq            1050
        //   435: aload           22
        //   437: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   442: checkcast       Landroid/graphics/Bitmap;
        //   445: astore          38
        //   447: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   450: aload           38
        //   452: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   457: checkcast       Ljava/lang/Integer;
        //   460: invokevirtual   java/lang/Integer.intValue:()I
        //   463: istore          39
        //   465: iload_3        
        //   466: ifeq            1039
        //   469: aload           38
        //   471: aload           19
        //   473: invokevirtual   android/graphics/Bitmap.sameAs:(Landroid/graphics/Bitmap;)Z
        //   476: istore          46
        //   478: iload           46
        //   480: ifne            497
        //   483: aload           38
        //   485: aload           10
        //   487: invokevirtual   android/graphics/Bitmap.sameAs:(Landroid/graphics/Bitmap;)Z
        //   490: istore          47
        //   492: iload           47
        //   494: ifeq            1039
        //   497: new             Ljava/lang/StringBuilder;
        //   500: dup            
        //   501: invokespecial   java/lang/StringBuilder.<init>:()V
        //   504: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   507: bipush          14
        //   509: aaload         
        //   510: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   513: aload           38
        //   515: aload           19
        //   517: invokevirtual   android/graphics/Bitmap.sameAs:(Landroid/graphics/Bitmap;)Z
        //   520: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   523: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   526: bipush          12
        //   528: aaload         
        //   529: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   532: aload           38
        //   534: aload           10
        //   536: invokevirtual   android/graphics/Bitmap.sameAs:(Landroid/graphics/Bitmap;)Z
        //   539: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   542: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   545: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   548: iconst_1       
        //   549: istore          23
        //   551: iload           5
        //   553: ifeq            1032
        //   556: iload           39
        //   558: istore          24
        //   560: getstatic       com/whatsapp/util/b_.h:I
        //   563: istore          42
        //   565: iload           42
        //   567: iload           39
        //   569: isub           
        //   570: iconst_3       
        //   571: if_icmple       584
        //   574: aload           21
        //   576: aload           38
        //   578: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   583: pop            
        //   584: iload           5
        //   586: ifeq            1021
        //   589: aload           21
        //   591: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   596: astore          25
        //   598: aload           25
        //   600: invokeinterface java/util/Iterator.hasNext:()Z
        //   605: ifeq            636
        //   608: aload           25
        //   610: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   615: checkcast       Landroid/graphics/Bitmap;
        //   618: astore          36
        //   620: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   623: aload           36
        //   625: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   630: pop            
        //   631: iload           5
        //   633: ifeq            598
        //   636: iload           23
        //   638: ifeq            681
        //   641: iload           16
        //   643: ifeq            681
        //   646: iconst_m1      
        //   647: getstatic       com/whatsapp/util/b_.h:I
        //   650: iadd           
        //   651: putstatic       com/whatsapp/util/b_.h:I
        //   654: new             Ljava/lang/StringBuilder;
        //   657: dup            
        //   658: invokespecial   java/lang/StringBuilder.<init>:()V
        //   661: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   664: iconst_2       
        //   665: aaload         
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: getstatic       com/whatsapp/util/b_.h:I
        //   672: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   675: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   678: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   681: iload           24
        //   683: bipush          10
        //   685: if_icmpge       1007
        //   688: new             Ljava/lang/StringBuilder;
        //   691: dup            
        //   692: invokespecial   java/lang/StringBuilder.<init>:()V
        //   695: ldc_w           "0"
        //   698: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   701: iload           24
        //   703: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   706: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   709: astore          34
        //   711: aload           34
        //   713: astore          27
        //   715: new             Ljava/io/FileOutputStream;
        //   718: dup            
        //   719: new             Ljava/io/File;
        //   722: dup            
        //   723: getstatic       com/whatsapp/util/b_.c:Ljava/io/File;
        //   726: new             Ljava/lang/StringBuilder;
        //   729: dup            
        //   730: invokespecial   java/lang/StringBuilder.<init>:()V
        //   733: getstatic       com/whatsapp/util/b_.l:Ljava/lang/String;
        //   736: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   739: getstatic       com/whatsapp/util/b_.b:Ljava/lang/String;
        //   742: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   745: ldc_w           "-"
        //   748: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   751: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   754: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   757: ldc_w           "-"
        //   760: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   763: aload           27
        //   765: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   768: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   771: bipush          6
        //   773: aaload         
        //   774: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   777: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   780: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   783: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   786: astore          28
        //   788: aload           19
        //   790: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //   793: bipush          100
        //   795: aload           28
        //   797: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   800: pop            
        //   801: getstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   804: lload_1        
        //   805: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   808: iload           24
        //   810: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   813: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   818: pop            
        //   819: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   822: aload           10
        //   824: iload           24
        //   826: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   829: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   834: pop            
        //   835: getstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   838: aload           19
        //   840: iload           24
        //   842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   845: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   850: pop            
        //   851: aload           28
        //   853: invokevirtual   java/io/FileOutputStream.flush:()V
        //   856: aload           28
        //   858: invokevirtual   java/io/FileOutputStream.close:()V
        //   861: new             Ljava/lang/StringBuilder;
        //   864: dup            
        //   865: invokespecial   java/lang/StringBuilder.<init>:()V
        //   868: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   871: iconst_4       
        //   872: aaload         
        //   873: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   876: iload           24
        //   878: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   881: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   884: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   887: return         
        //   888: astore          18
        //   890: new             Ljava/lang/StringBuilder;
        //   893: dup            
        //   894: invokespecial   java/lang/StringBuilder.<init>:()V
        //   897: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   900: bipush          7
        //   902: aaload         
        //   903: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   906: aload           18
        //   908: invokevirtual   java/io/FileNotFoundException.toString:()Ljava/lang/String;
        //   911: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   914: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   917: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   920: return         
        //   921: astore          48
        //   923: invokestatic    java/lang/System.gc:()V
        //   926: iload           8
        //   928: iload           7
        //   930: getstatic       android/graphics/Bitmap$Config.ARGB_4444:Landroid/graphics/Bitmap$Config;
        //   933: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   936: astore          49
        //   938: aload           49
        //   940: astore          50
        //   942: goto            323
        //   945: astore          44
        //   947: aload           44
        //   949: athrow         
        //   950: astore          45
        //   952: aload           45
        //   954: athrow         
        //   955: astore          17
        //   957: new             Ljava/lang/StringBuilder;
        //   960: dup            
        //   961: invokespecial   java/lang/StringBuilder.<init>:()V
        //   964: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   967: iconst_3       
        //   968: aaload         
        //   969: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   972: aload           17
        //   974: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   977: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   980: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   983: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   986: return         
        //   987: astore          40
        //   989: aload           40
        //   991: athrow         
        //   992: astore          41
        //   994: aload           41
        //   996: athrow         
        //   997: astore          35
        //   999: aload           35
        //  1001: athrow         
        //  1002: astore          33
        //  1004: aload           33
        //  1006: athrow         
        //  1007: iload           24
        //  1009: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1012: astore          26
        //  1014: aload           26
        //  1016: astore          27
        //  1018: goto            715
        //  1021: iload           24
        //  1023: istore          15
        //  1025: iload           23
        //  1027: istore          20
        //  1029: goto            425
        //  1032: iload           39
        //  1034: istore          24
        //  1036: goto            589
        //  1039: iload           20
        //  1041: istore          23
        //  1043: iload           15
        //  1045: istore          24
        //  1047: goto            560
        //  1050: iload           20
        //  1052: istore          23
        //  1054: iload           15
        //  1056: istore          24
        //  1058: goto            589
        //  1061: aload           50
        //  1063: astore          19
        //  1065: goto            398
        //  1068: iconst_0       
        //  1069: istore          16
        //  1071: goto            294
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  91     117    118    123    Ljava/lang/OutOfMemoryError;
        //  123    139    175    180    Ljava/lang/OutOfMemoryError;
        //  139    155    180    185    Ljava/lang/OutOfMemoryError;
        //  155    169    170    175    Ljava/lang/OutOfMemoryError;
        //  298    307    888    921    Ljava/io/FileNotFoundException;
        //  298    307    955    987    Ljava/io/IOException;
        //  307    319    921    945    Ljava/lang/OutOfMemoryError;
        //  307    319    888    921    Ljava/io/FileNotFoundException;
        //  307    319    955    987    Ljava/io/IOException;
        //  323    380    888    921    Ljava/io/FileNotFoundException;
        //  323    380    955    987    Ljava/io/IOException;
        //  385    394    888    921    Ljava/io/FileNotFoundException;
        //  385    394    955    987    Ljava/io/IOException;
        //  401    425    888    921    Ljava/io/FileNotFoundException;
        //  401    425    955    987    Ljava/io/IOException;
        //  425    465    888    921    Ljava/io/FileNotFoundException;
        //  425    465    955    987    Ljava/io/IOException;
        //  469    478    945    950    Ljava/lang/OutOfMemoryError;
        //  469    478    888    921    Ljava/io/FileNotFoundException;
        //  469    478    955    987    Ljava/io/IOException;
        //  483    492    950    955    Ljava/lang/OutOfMemoryError;
        //  483    492    888    921    Ljava/io/FileNotFoundException;
        //  483    492    955    987    Ljava/io/IOException;
        //  497    548    888    921    Ljava/io/FileNotFoundException;
        //  497    548    955    987    Ljava/io/IOException;
        //  560    565    987    992    Ljava/lang/OutOfMemoryError;
        //  560    565    888    921    Ljava/io/FileNotFoundException;
        //  560    565    955    987    Ljava/io/IOException;
        //  574    584    992    997    Ljava/lang/OutOfMemoryError;
        //  574    584    888    921    Ljava/io/FileNotFoundException;
        //  574    584    955    987    Ljava/io/IOException;
        //  589    598    888    921    Ljava/io/FileNotFoundException;
        //  589    598    955    987    Ljava/io/IOException;
        //  598    631    888    921    Ljava/io/FileNotFoundException;
        //  598    631    955    987    Ljava/io/IOException;
        //  646    681    997    1002   Ljava/lang/OutOfMemoryError;
        //  646    681    888    921    Ljava/io/FileNotFoundException;
        //  646    681    955    987    Ljava/io/IOException;
        //  688    711    1002   1007   Ljava/lang/OutOfMemoryError;
        //  688    711    888    921    Ljava/io/FileNotFoundException;
        //  688    711    955    987    Ljava/io/IOException;
        //  715    887    888    921    Ljava/io/FileNotFoundException;
        //  715    887    955    987    Ljava/io/IOException;
        //  923    938    888    921    Ljava/io/FileNotFoundException;
        //  923    938    955    987    Ljava/io/IOException;
        //  947    950    950    955    Ljava/lang/OutOfMemoryError;
        //  947    950    888    921    Ljava/io/FileNotFoundException;
        //  947    950    955    987    Ljava/io/IOException;
        //  952    955    888    921    Ljava/io/FileNotFoundException;
        //  952    955    955    987    Ljava/io/IOException;
        //  989    992    992    997    Ljava/lang/OutOfMemoryError;
        //  989    992    888    921    Ljava/io/FileNotFoundException;
        //  989    992    955    987    Ljava/io/IOException;
        //  994    997    888    921    Ljava/io/FileNotFoundException;
        //  994    997    955    987    Ljava/io/IOException;
        //  999    1002   888    921    Ljava/io/FileNotFoundException;
        //  999    1002   955    987    Ljava/io/IOException;
        //  1004   1007   888    921    Ljava/io/FileNotFoundException;
        //  1004   1007   955    987    Ljava/io/IOException;
        //  1007   1014   888    921    Ljava/io/FileNotFoundException;
        //  1007   1014   955    987    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 458, Size: 458
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    static void b(final CharSequence charSequence, final Activity activity) {
        a(charSequence, activity);
    }
    
    private static void b(final String s, final AttributeSet set, final LayoutInflater layoutInflater, final View[] array) {
        try {
            layoutInflater.inflate((XmlPullParser)new w(array, layoutInflater, s, set), (ViewGroup)null, false);
        }
        catch (InflateException ex) {}
    }
    
    static boolean b(final View view) {
        return a(view);
    }
    
    static String c() {
        return b_.o;
    }
    
    public static void c(final Activity activity) {
        try {
            if (App.aS != 3) {
                throw new UnsupportedOperationException();
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        try {
            Log.i(b_.z[54]);
            if (b_.o == null) {
                return;
            }
        }
        catch (UnsupportedOperationException ex2) {
            throw ex2;
        }
        final LayoutInflater layoutInflater = activity.getLayoutInflater();
        try {
            if (layoutInflater.getFactory() != null) {
                Log.i(b_.z[53]);
                return;
            }
        }
        catch (UnsupportedOperationException ex3) {
            throw ex3;
        }
        layoutInflater.setFactory((LayoutInflater$Factory)new bo(activity));
    }
    
    static FileWriter d() {
        return b_.e;
    }
    
    static Set e() {
        return b_.k;
    }
    
    public static void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/util/Log.l:Z
        //     3: istore_0       
        //     4: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //     7: ifnull          104
        //    10: getstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //    13: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    16: bipush          21
        //    18: aaload         
        //    19: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    22: bipush          19
        //    24: aaload         
        //    25: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    28: pop            
        //    29: getstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //    32: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    35: bipush          22
        //    37: aaload         
        //    38: getstatic       com/whatsapp/util/b_.d:Ljava/lang/String;
        //    41: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    44: pop            
        //    45: getstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //    48: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //    51: bipush          15
        //    53: aaload         
        //    54: getstatic       com/whatsapp/util/b_.g:Lorg/json/JSONArray;
        //    57: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    60: pop            
        //    61: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: getstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //    74: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: ldc_w           "\n"
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokevirtual   java/io/FileWriter.write:(Ljava/lang/String;)V
        //    92: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //    95: invokevirtual   java/io/FileWriter.flush:()V
        //    98: getstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //   101: invokevirtual   java/io/FileWriter.close:()V
        //   104: getstatic       com/whatsapp/util/b_.j:Ljava/util/Map;
        //   107: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   110: getstatic       com/whatsapp/util/b_.h:I
        //   113: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   116: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: iconst_1       
        //   123: getstatic       com/whatsapp/util/b_.h:I
        //   126: iadd           
        //   127: istore_3       
        //   128: iload_3        
        //   129: bipush          10
        //   131: if_icmpge       368
        //   134: new             Ljava/lang/StringBuilder;
        //   137: dup            
        //   138: invokespecial   java/lang/StringBuilder.<init>:()V
        //   141: ldc_w           "0"
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: iload_3        
        //   148: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   151: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   154: astore          4
        //   156: new             Ljava/io/File;
        //   159: dup            
        //   160: getstatic       com/whatsapp/util/b_.c:Ljava/io/File;
        //   163: new             Ljava/lang/StringBuilder;
        //   166: dup            
        //   167: invokespecial   java/lang/StringBuilder.<init>:()V
        //   170: getstatic       com/whatsapp/util/b_.l:Ljava/lang/String;
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: getstatic       com/whatsapp/util/b_.b:Ljava/lang/String;
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: ldc_w           "-"
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: getstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: ldc_w           "-"
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: aload           4
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   208: bipush          20
        //   210: aaload         
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   217: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   220: astore          5
        //   222: aload           5
        //   224: invokevirtual   java/io/File.exists:()Z
        //   227: istore          8
        //   229: iload           8
        //   231: ifne            238
        //   234: iload_0        
        //   235: ifeq            253
        //   238: aload           5
        //   240: invokevirtual   java/io/File.delete:()Z
        //   243: pop            
        //   244: iload_3        
        //   245: iconst_1       
        //   246: iadd           
        //   247: istore          10
        //   249: iload_0        
        //   250: ifeq            387
        //   253: aconst_null    
        //   254: putstatic       com/whatsapp/util/b_.e:Ljava/io/FileWriter;
        //   257: aconst_null    
        //   258: putstatic       com/whatsapp/util/b_.o:Ljava/lang/String;
        //   261: iconst_0       
        //   262: putstatic       com/whatsapp/util/b_.h:I
        //   265: aconst_null    
        //   266: putstatic       com/whatsapp/util/b_.f:Lorg/json/JSONObject;
        //   269: aconst_null    
        //   270: putstatic       com/whatsapp/util/b_.g:Lorg/json/JSONArray;
        //   273: aconst_null    
        //   274: putstatic       com/whatsapp/util/b_.n:Ljava/util/Map;
        //   277: aconst_null    
        //   278: putstatic       com/whatsapp/util/b_.i:Ljava/util/Map;
        //   281: aconst_null    
        //   282: putstatic       com/whatsapp/util/b_.c:Ljava/io/File;
        //   285: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   288: bipush          18
        //   290: aaload         
        //   291: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   294: return         
        //   295: astore          12
        //   297: aload           12
        //   299: athrow         
        //   300: astore          11
        //   302: new             Ljava/lang/StringBuilder;
        //   305: dup            
        //   306: invokespecial   java/lang/StringBuilder.<init>:()V
        //   309: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   312: bipush          17
        //   314: aaload         
        //   315: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   318: aload           11
        //   320: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   329: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   332: goto            104
        //   335: astore_1       
        //   336: new             Ljava/lang/StringBuilder;
        //   339: dup            
        //   340: invokespecial   java/lang/StringBuilder.<init>:()V
        //   343: getstatic       com/whatsapp/util/b_.z:[Ljava/lang/String;
        //   346: bipush          16
        //   348: aaload         
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: aload_1        
        //   353: invokevirtual   org/json/JSONException.toString:()Ljava/lang/String;
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   362: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   365: goto            104
        //   368: iload_3        
        //   369: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   372: astore          4
        //   374: goto            156
        //   377: astore          6
        //   379: aload           6
        //   381: athrow         
        //   382: astore          7
        //   384: aload           7
        //   386: athrow         
        //   387: iload           10
        //   389: istore_3       
        //   390: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      104    295    300    Ljava/lang/UnsupportedOperationException;
        //  4      104    300    335    Ljava/io/IOException;
        //  4      104    335    368    Lorg/json/JSONException;
        //  222    229    377    382    Ljava/io/IOException;
        //  238    244    382    387    Ljava/io/IOException;
        //  297    300    300    335    Ljava/io/IOException;
        //  297    300    335    368    Lorg/json/JSONException;
        //  379    382    382    387    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 170, Size: 170
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
}
