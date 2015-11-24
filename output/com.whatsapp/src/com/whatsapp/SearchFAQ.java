// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.b9;
import com.whatsapp.fieldstats.a5;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.widget.ListView;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.whatsapp.fieldstats.ab;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;
import com.whatsapp.fieldstats.b8;
import java.util.ArrayList;

public class SearchFAQ extends DialogToastListActivity
{
    private static final String[] z;
    private ArrayList q;
    private b8 r;
    private String s;
    private HashMap t;
    private HashSet u;
    private String v;
    private String w;
    private int x;
    private String y;
    
    static {
        final String[] z2 = new String[21];
        String s = "[Y\u000eG3xU\f\\\"|\\+g3q]\f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0557:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "XJ\ra5=H\u001e|4tV\u0018.#rM\u001db\"=W\nzgr^_";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "iW\u000bo+BL\u0016c\"BK\u000fk)i";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "[Y\u000eG3xU\f\\\"|\\+g3q]\f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ~5rZ\u0013k*";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ{5qK";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQz.iT\u001a}";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "|V\u001b|(t\\Qg)i]\u0011zix@\u000b|&3k+\\\u0002\\u";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQj\"n[\rg7iQ\u0010`4";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQh5rU";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ}3|L\n}";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQm(hV\u000b";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "qY\u0006a2ig\u0016`!qY\u000bk5";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "|V\u001b|(t\\Qg)i]\u0011zix@\u000b|&3k+\\\u0002\\u";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQh5rU";
                    n = 13;
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    array = z2;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQj\"n[\rg7iQ\u0010`4";
                    n = 14;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ~5rZ\u0013k*";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQm(hV\u000b";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQz.iT\u001a}";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ{5qK";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "~W\u0012 0uY\u000b}&mHQ]\"|J\u001cf\u0001\\iQ}3|L\n}";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    break Label_0557;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static String a(final SearchFAQ searchFAQ, final String s) {
        return searchFAQ.s = s;
    }
    
    static HashSet a(final SearchFAQ searchFAQ) {
        return searchFAQ.u;
    }
    
    public static void a(final Context context, final String s, final String s2, final ArrayList list, final String s3, final int n, final ArrayList list2, final ArrayList list3, final ArrayList list4) {
        final Intent intent = new Intent(context, (Class)SearchFAQ.class);
        intent.putExtra(SearchFAQ.z[14], s);
        intent.putExtra(SearchFAQ.z[16], s2);
        intent.putExtra(SearchFAQ.z[20], s3);
        intent.putExtra(SearchFAQ.z[17], n);
        intent.putStringArrayListExtra(SearchFAQ.z[18], list2);
        intent.putStringArrayListExtra(SearchFAQ.z[15], list3);
        intent.putStringArrayListExtra(SearchFAQ.z[19], list4);
        intent.putParcelableArrayListExtra(SearchFAQ.z[13], list);
        context.startActivity(intent);
    }
    
    static String b(final SearchFAQ searchFAQ) {
        return searchFAQ.v;
    }
    
    static String c(final SearchFAQ searchFAQ) {
        return searchFAQ.y;
    }
    
    static ArrayList d(final SearchFAQ searchFAQ) {
        return searchFAQ.q;
    }
    
    static b8 e(final SearchFAQ searchFAQ) {
        return searchFAQ.r;
    }
    
    static String f(final SearchFAQ searchFAQ) {
        return searchFAQ.w;
    }
    
    public int a() {
        return this.u.size();
    }
    
    public int b() {
        return this.x;
    }
    
    @Override
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: iconst_1       
        //     2: if_icmpne       191
        //     5: iload_2        
        //     6: iconst_m1      
        //     7: if_icmpne       191
        //    10: aload_3        
        //    11: getstatic       com/whatsapp/SearchFAQ.z:[Ljava/lang/String;
        //    14: iconst_2       
        //    15: aaload         
        //    16: lconst_0       
        //    17: invokevirtual   android/content/Intent.getLongExtra:(Ljava/lang/String;J)J
        //    20: l2d            
        //    21: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    24: invokevirtual   java/lang/Double.doubleValue:()D
        //    27: dstore          4
        //    29: aload_0        
        //    30: getfield        com/whatsapp/SearchFAQ.t:Ljava/util/HashMap;
        //    33: aload_0        
        //    34: getfield        com/whatsapp/SearchFAQ.s:Ljava/lang/String;
        //    37: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //    40: ifeq            235
        //    43: dload           4
        //    45: aload_0        
        //    46: getfield        com/whatsapp/SearchFAQ.t:Ljava/util/HashMap;
        //    49: aload_0        
        //    50: getfield        com/whatsapp/SearchFAQ.s:Ljava/lang/String;
        //    53: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    56: checkcast       Ljava/lang/Double;
        //    59: invokevirtual   java/lang/Double.doubleValue:()D
        //    62: dadd           
        //    63: dstore          6
        //    65: aload_0        
        //    66: getfield        com/whatsapp/SearchFAQ.t:Ljava/util/HashMap;
        //    69: aload_0        
        //    70: getfield        com/whatsapp/SearchFAQ.s:Ljava/lang/String;
        //    73: dload           6
        //    75: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    78: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    81: pop            
        //    82: aload_0        
        //    83: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //    86: getfield        com/whatsapp/fieldstats/b8.g:Ljava/lang/Double;
        //    89: ifnonnull       103
        //    92: aload_0        
        //    93: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //    96: dconst_0       
        //    97: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   100: putfield        com/whatsapp/fieldstats/b8.g:Ljava/lang/Double;
        //   103: dload           6
        //   105: aload_0        
        //   106: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   109: getfield        com/whatsapp/fieldstats/b8.g:Ljava/lang/Double;
        //   112: invokevirtual   java/lang/Double.doubleValue:()D
        //   115: dcmpl          
        //   116: ifle            145
        //   119: aload_0        
        //   120: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   123: aload_0        
        //   124: getfield        com/whatsapp/SearchFAQ.s:Ljava/lang/String;
        //   127: invokestatic    java/lang/Double.valueOf:(Ljava/lang/String;)Ljava/lang/Double;
        //   130: putfield        com/whatsapp/fieldstats/b8.l:Ljava/lang/Double;
        //   133: aload_0        
        //   134: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   137: dload           6
        //   139: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   142: putfield        com/whatsapp/fieldstats/b8.g:Ljava/lang/Double;
        //   145: aload_0        
        //   146: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   149: getfield        com/whatsapp/fieldstats/b8.a:Ljava/lang/Double;
        //   152: ifnonnull       166
        //   155: aload_0        
        //   156: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   159: dconst_0       
        //   160: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   163: putfield        com/whatsapp/fieldstats/b8.a:Ljava/lang/Double;
        //   166: aload_0        
        //   167: getfield        com/whatsapp/SearchFAQ.r:Lcom/whatsapp/fieldstats/b8;
        //   170: astore          11
        //   172: aload           11
        //   174: dload           4
        //   176: aload           11
        //   178: getfield        com/whatsapp/fieldstats/b8.a:Ljava/lang/Double;
        //   181: invokevirtual   java/lang/Double.doubleValue:()D
        //   184: dadd           
        //   185: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   188: putfield        com/whatsapp/fieldstats/b8.a:Ljava/lang/Double;
        //   191: return         
        //   192: astore          8
        //   194: aload           8
        //   196: athrow         
        //   197: astore          12
        //   199: new             Ljava/lang/StringBuilder;
        //   202: dup            
        //   203: invokespecial   java/lang/StringBuilder.<init>:()V
        //   206: getstatic       com/whatsapp/SearchFAQ.z:[Ljava/lang/String;
        //   209: iconst_1       
        //   210: aaload         
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: aload_0        
        //   215: getfield        com/whatsapp/SearchFAQ.s:Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   224: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   227: goto            145
        //   230: astore          10
        //   232: aload           10
        //   234: athrow         
        //   235: dload           4
        //   237: dstore          6
        //   239: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  65     103    192    197    Ljava/lang/Exception;
        //  119    145    197    230    Ljava/lang/Exception;
        //  145    166    230    235    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 111, Size: 111
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
    
    public void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903212);
        this.u = new HashSet();
        if (bundle != null) {
            final String[] stringArray = bundle.getStringArray(SearchFAQ.z[3]);
            if (stringArray != null) {
                final int length = stringArray.length;
                int j = 0;
                while (j < length) {
                    this.u.add(stringArray[j]);
                    ++j;
                    if (i) {
                        break;
                    }
                }
            }
        }
        final Intent intent = this.getIntent();
        this.w = intent.getStringExtra(SearchFAQ.z[9]);
        this.y = intent.getStringExtra(SearchFAQ.z[4]);
        this.v = intent.getStringExtra(SearchFAQ.z[10]);
        this.q = intent.getParcelableArrayListExtra(SearchFAQ.z[7]);
        this.r = new b8();
        this.r.b = this.y;
        this.r.j = (double)ab.PROBLEM_DESCRIPTION.getCode();
        this.t = new HashMap();
        ((Button)this.findViewById(2131755748)).setOnClickListener((View$OnClickListener)new a6r(this));
        final ArrayList stringArrayListExtra = intent.getStringArrayListExtra(SearchFAQ.z[6]);
        final ArrayList stringArrayListExtra2 = intent.getStringArrayListExtra(SearchFAQ.z[8]);
        final ArrayList stringArrayListExtra3 = intent.getStringArrayListExtra(SearchFAQ.z[5]);
        final int intExtra = intent.getIntExtra(SearchFAQ.z[11], 0);
        this.x = intExtra;
        final ArrayList<ada> list = new ArrayList<ada>();
        int n;
        for (int k = 0; k < intExtra; k = n) {
            list.add(new ada(this, stringArrayListExtra.get(k), stringArrayListExtra2.get(k), stringArrayListExtra3.get(k)));
            n = k + 1;
            if (i) {
                break;
            }
        }
        final a8h a8h = new a8h(this, (Context)this, 2130903214, list);
        final ListView c = this.c();
        c.addHeaderView(alm.a((LayoutInflater)this.getSystemService(SearchFAQ.z[12]), 2130903213, null));
        this.a((ListAdapter)a8h);
        this.registerForContextMenu((View)c);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231553));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        a5.a((Context)this, this.r);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.u != null && this.u.size() > 0) {
            bundle.putStringArray(SearchFAQ.z[0], (String[])this.u.toArray(new String[this.u.size()]));
        }
    }
}
