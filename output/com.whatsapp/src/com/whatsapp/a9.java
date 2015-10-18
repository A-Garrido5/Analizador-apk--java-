// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.apache.http.HttpException;
import java.io.IOException;
import android.content.Context;
import com.whatsapp.util.br;
import com.whatsapp.util.Log;
import java.util.TimerTask;
import com.whatsapp.protocol.cb;
import com.whatsapp.protocol.bi;
import java.util.Timer;
import java.util.LinkedHashMap;
import android.os.AsyncTask;

public class a9 extends AsyncTask
{
    protected static final LinkedHashMap f;
    private static Timer g;
    protected static final LinkedHashMap k;
    private static final Object m;
    private static final String[] z;
    protected int a;
    private final long b;
    private long c;
    private alp d;
    private final MediaData e;
    protected final bi h;
    private boolean i;
    private long j;
    private boolean l;
    protected boolean n;
    protected cb o;
    private long p;
    private boolean q;
    private TimerTask r;
    
    static {
        final String[] z2 = new String[23];
        String s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0001\u000f\u001bx\u0013\u001bP\u001f8\u000e\u0000";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0607:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'w';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = '}';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w\r\u0011\u0013\u0013>\u0013\u0013G";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163RT\u000e\u0012%\u000b\u0011\u000f(?\u001c\u0007\u0015W:\u0014\u0007\u000e\u001e9\u001a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "w\u000f\u0011\u000e\u0002;\tN";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0001\u000f\u001bx\u0018\u0006\u000f\u0018%]";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "w\u000e\u0011\u000f\u00012\u000f+\u0015\u0016$\u0015N";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0011\u0013\u0013x\u0013\u001b\tW#\u0015\u001d\u000eW";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0019\u0014\u0004$\u0014\u001a\u001aW<\u0018\r\u000eW>\u0013T\b\u0007;\u0012\u0015\u0019W%\u0018\u0007\b\u001b#";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "4\b\u0006\u000f\u00129\tN";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163RT\u0011\u00184\u001c\u0018\"\u001f6\u000e\u001cG";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0011\u0013\u0013w";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0017\u001c\u00194\u0018\u0018]";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u001b\u0013\u00146\u0013\u0017\u0018\u001b;\u0018\u0010]";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "w\u001e\u0001\u000f\u00052\u0013\u0000G";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "w\r\u0011\u0013\u0013>\u0013\u0013G";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0007\t\u0016%\tT";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0006\u0018\u0006\"\u0018\u0007\t\u0002'\u0011\u001b\u001c\u0013w";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "w\u0015\u0015\u000e\u001fm";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u001d\u0012Z2\u000f\u0006\u0012\u0005w";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0011\u000f\u00058\u000fT";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u001c\t\u0003'\u0018\u0006\u000f\u0018%]";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "w\r\u0011\u0013\u0013>\u0013\u0013G";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = ":\u0018\u0010\u0014\u0016\"\r\u0018\u0012\u00163R\u0017\u001c\u00194\u0018\u0018\u001c\u001b;]\u0017\b\u0005%\u0018\u001a\tM";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    break Label_0607;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a9.g = new Timer();
        f = new LinkedHashMap();
        k = new LinkedHashMap();
        m = new Object();
    }
    
    public a9(final bi bi) {
        this(bi, 0L);
    }
    
    public a9(final bi bi, final long n) {
        this(bi, 0L, false);
    }
    
    public a9(final bi h, final long c, final boolean l) {
        this.n = false;
        this.p = System.currentTimeMillis();
        this.c = c;
        this.h = h;
        this.e = (MediaData)h.N;
        this.b = h.L;
        this.a = 0;
        if (!(this.l = l)) {
            h.c = 1;
            this.e.transferring = true;
            this.e.progress = 0L;
            if (h.I == 1 && this.e.file == null) {
                this.e.autodownloadRetryEnabled = false;
            }
            App.ak.a(h, false, -1);
        }
    }
    
    static alp a(final a9 a9, final alp d) {
        return a9.d = d;
    }
    
    static Object a() {
        return a9.m;
    }
    
    static TimerTask a(final a9 a9) {
        return a9.r;
    }
    
    static void a(final a9 a9, final String s) {
        a9.a(s);
    }
    
    static void a(final a9 a9, final Object[] array) {
        a9.publishProgress(array);
    }
    
    private void a(final String s) {
        Log.i(a9.z[16] + this.h.a + a9.z[17] + s);
        final w3 w3 = new w3(this);
        w3.c = this.h.a.a;
        w3.d = this.f();
        w3.e = bi.a(this.h.I);
        w3.f = s;
        Label_0144: {
            if (this.h.P == null) {
                this.h.P = s;
                if (!App.I) {
                    break Label_0144;
                }
            }
            if (!this.h.P.equals(s)) {
                w3.a = this.h.P;
            }
        }
        if (this.h.I == 2 && this.h.E == 1 && w3.f != null && w3.a != null) {
            final String a = w3.a;
            w3.a = w3.f;
            w3.f = a;
        }
        this.r = new ahb(this);
        a9.g.schedule(this.r, 20000L);
        App.a(w3);
    }
    
    static boolean a(final a9 a9, final boolean i) {
        return a9.i = i;
    }
    
    public static boolean a(final bi bi) {
        return a9.k.containsKey(bi.a) || a9.f.containsKey(bi.a);
    }
    
    static alp b(final a9 a9) {
        return a9.d;
    }
    
    static MediaData c(final a9 a9) {
        return a9.e;
    }
    
    public static void j() {
        final boolean i = App.I;
        Log.i(a9.z[22] + a9.f.size() + a9.z[21] + a9.k.size());
        final a9[] array = (a9[])a9.f.values().toArray(new a9[0]);
        final int length = array.length;
        int j = 0;
        while (j < length) {
            array[j].a(false);
            ++j;
            if (i) {
                break;
            }
        }
        a9.f.clear();
        final a9[] array2 = (a9[])a9.k.values().toArray(new a9[0]);
        final int length2 = array2.length;
        int k = 0;
        while (k < length2) {
            array2[k].a(false);
            ++k;
            if (i) {
                break;
            }
        }
        a9.k.clear();
    }
    
    public t8 a(final Void[] array) {
        Label_0169: {
            Label_0038: {
                try {
                    br.a((Context)App.aq);
                    if (this.d != null) {
                        break Label_0038;
                    }
                    if (this.n) {
                        return t8.SUCCESS;
                    }
                    return t8.FAILED_GENERIC;
                }
                catch (IOException ex) {
                    try {
                        throw ex;
                    }
                    catch (IOException ex2) {
                        throw ex2;
                    }
                }
                try {
                    return t8.SUCCESS;
                }
                catch (IOException ex7) {}
                return t8.FAILED_GENERIC;
                try {
                    final boolean a = this.d.a();
                    if (this.d.b() == 415) {
                        return t8.FAILED_BAD_MEDIA;
                    }
                    final long n = this.c - (System.currentTimeMillis() - this.p);
                    Label_0103: {
                        if (n <= 0L) {
                            break Label_0103;
                        }
                        try {
                            Thread.sleep(n);
                            if (a) {
                                final t8 success = t8.SUCCESS;
                                return success;
                            }
                            goto Label_0229;
                        }
                        catch (IOException ex3) {
                            throw ex3;
                        }
                    }
                }
                catch (IOException ex4) {
                    Log.e(a9.z[18] + this.h.a + " " + ex4.toString());
                }
                catch (HttpException ex5) {
                    Log.e(a9.z[20] + this.h.a + " " + ex5.toString());
                    break Label_0169;
                }
                catch (Exception ex6) {
                    Log.e(a9.z[19] + this.h.a + " " + ex6.toString());
                    break Label_0169;
                }
            }
            try {
                final t8 success2;
                final t8 success = success2 = t8.SUCCESS;
                return success2;
                return t8.FAILED_GENERIC;
            }
            catch (IOException ex8) {}
        }
    }
    
    public void a(final t8 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a9.e:Lcom/whatsapp/MediaData;
        //     8: iconst_0       
        //     9: putfield        com/whatsapp/MediaData.transferring:Z
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //    22: bipush          10
        //    24: aaload         
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: aload_0        
        //    29: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //    32: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    38: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //    41: bipush          8
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: getstatic       com/whatsapp/a9.f:Ljava/util/LinkedHashMap;
        //    50: invokevirtual   java/util/LinkedHashMap.size:()I
        //    53: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    56: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //    59: iconst_1       
        //    60: aaload         
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: getstatic       com/whatsapp/a9.k:Ljava/util/LinkedHashMap;
        //    67: invokevirtual   java/util/LinkedHashMap.size:()I
        //    70: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    73: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //    76: iconst_3       
        //    77: aaload         
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: aload_1        
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    91: aload_0        
        //    92: getfield        com/whatsapp/a9.r:Ljava/util/TimerTask;
        //    95: ifnull          106
        //    98: aload_0        
        //    99: getfield        com/whatsapp/a9.r:Ljava/util/TimerTask;
        //   102: invokevirtual   java/util/TimerTask.cancel:()Z
        //   105: pop            
        //   106: getstatic       com/whatsapp/a9.f:Ljava/util/LinkedHashMap;
        //   109: aload_0        
        //   110: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   113: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   116: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   119: checkcast       Lcom/whatsapp/a9;
        //   122: astore          4
        //   124: getstatic       com/whatsapp/a9.k:Ljava/util/LinkedHashMap;
        //   127: invokevirtual   java/util/LinkedHashMap.isEmpty:()Z
        //   130: ifne            181
        //   133: getstatic       com/whatsapp/a9.k:Ljava/util/LinkedHashMap;
        //   136: invokevirtual   java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
        //   139: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   144: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   149: checkcast       Ljava/util/Map$Entry;
        //   152: astore          60
        //   154: getstatic       com/whatsapp/a9.k:Ljava/util/LinkedHashMap;
        //   157: aload           60
        //   159: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   164: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   167: pop            
        //   168: aload           60
        //   170: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   175: checkcast       Lcom/whatsapp/a9;
        //   178: invokevirtual   com/whatsapp/a9.g:()V
        //   181: aload           4
        //   183: aload_0        
        //   184: if_acmpeq       262
        //   187: new             Ljava/lang/StringBuilder;
        //   190: dup            
        //   191: invokespecial   java/lang/StringBuilder.<init>:()V
        //   194: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   197: bipush          6
        //   199: aaload         
        //   200: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   203: aload_0        
        //   204: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   207: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   213: ldc_w           " "
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: astore          58
        //   221: aload           4
        //   223: ifnonnull       256
        //   226: iconst_1       
        //   227: istore          59
        //   229: aload           58
        //   231: iload           59
        //   233: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   242: return         
        //   243: astore_3       
        //   244: aload_3        
        //   245: athrow         
        //   246: astore          56
        //   248: aload           56
        //   250: athrow         
        //   251: astore          57
        //   253: aload           57
        //   255: athrow         
        //   256: iconst_0       
        //   257: istore          59
        //   259: goto            229
        //   262: aload_0        
        //   263: getfield        com/whatsapp/a9.l:Z
        //   266: istore          6
        //   268: iload           6
        //   270: ifne            242
        //   273: aload_1        
        //   274: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //   277: if_acmpne       714
        //   280: aload_0        
        //   281: getfield        com/whatsapp/a9.n:Z
        //   284: istore          35
        //   286: iload           35
        //   288: ifeq            714
        //   291: new             Ljava/net/URL;
        //   294: dup            
        //   295: aload_0        
        //   296: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   299: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   302: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   305: astore          36
        //   307: aload           36
        //   309: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   312: ifnull          330
        //   315: aload           36
        //   317: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   320: invokevirtual   java/lang/String.length:()I
        //   323: istore          55
        //   325: iload           55
        //   327: ifne            382
        //   330: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   333: iconst_0       
        //   334: aaload         
        //   335: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   338: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   341: aload_0        
        //   342: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   345: iconst_0       
        //   346: iconst_m1      
        //   347: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   350: return         
        //   351: astore          38
        //   353: new             Ljava/lang/StringBuilder;
        //   356: dup            
        //   357: invokespecial   java/lang/StringBuilder.<init>:()V
        //   360: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   363: iconst_4       
        //   364: aaload         
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: aload           38
        //   370: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   379: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   382: aload_0        
        //   383: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   386: getfield        com/whatsapp/protocol/cb.c:Ljava/lang/String;
        //   389: astore          42
        //   391: aload           42
        //   393: ifnull          422
        //   396: aload_0        
        //   397: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   400: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   403: astore          43
        //   405: aload           43
        //   407: ifnull          422
        //   410: aload_0        
        //   411: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   414: getfield        com/whatsapp/protocol/cb.d:J
        //   417: lconst_0       
        //   418: lcmp           
        //   419: ifne            474
        //   422: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   425: bipush          7
        //   427: aaload         
        //   428: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   431: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   434: aload_0        
        //   435: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   438: iconst_0       
        //   439: iconst_m1      
        //   440: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   443: return         
        //   444: astore          41
        //   446: aload           41
        //   448: athrow         
        //   449: astore          5
        //   451: aload           5
        //   453: athrow         
        //   454: astore          7
        //   456: aload           7
        //   458: athrow         
        //   459: astore          37
        //   461: aload           37
        //   463: athrow         
        //   464: astore          39
        //   466: aload           39
        //   468: athrow         
        //   469: astore          40
        //   471: aload           40
        //   473: athrow         
        //   474: aload_0        
        //   475: getfield        com/whatsapp/a9.i:Z
        //   478: istore          50
        //   480: iload           50
        //   482: ifne            628
        //   485: aload_0        
        //   486: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   489: getfield        com/whatsapp/protocol/cb.b:Ljava/lang/String;
        //   492: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   495: istore          52
        //   497: iload           52
        //   499: ifeq            514
        //   502: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   505: iconst_2       
        //   506: aaload         
        //   507: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   510: iload_2        
        //   511: ifeq            628
        //   514: aload_0        
        //   515: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   518: getfield        com/whatsapp/protocol/cb.b:Ljava/lang/String;
        //   521: aload_0        
        //   522: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   525: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   528: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   531: istore          53
        //   533: iload           53
        //   535: ifne            614
        //   538: aload_0        
        //   539: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   542: getfield        com/whatsapp/protocol/bi.I:B
        //   545: istore          54
        //   547: iload           54
        //   549: iconst_2       
        //   550: if_icmpne       564
        //   553: aload_0        
        //   554: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   557: getfield        com/whatsapp/protocol/bi.E:I
        //   560: iconst_1       
        //   561: if_icmpeq       614
        //   564: new             Ljava/lang/StringBuilder;
        //   567: dup            
        //   568: invokespecial   java/lang/StringBuilder.<init>:()V
        //   571: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   574: bipush          9
        //   576: aaload         
        //   577: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   580: aload_0        
        //   581: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   584: getfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   590: getstatic       com/whatsapp/a9.z:[Ljava/lang/String;
        //   593: iconst_5       
        //   594: aaload         
        //   595: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   598: aload_0        
        //   599: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   602: getfield        com/whatsapp/protocol/cb.b:Ljava/lang/String;
        //   605: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   608: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   611: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   614: aload_0        
        //   615: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   618: aload_0        
        //   619: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   622: getfield        com/whatsapp/protocol/cb.b:Ljava/lang/String;
        //   625: putfield        com/whatsapp/protocol/bi.P:Ljava/lang/String;
        //   628: aload_0        
        //   629: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   632: aload_0        
        //   633: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   636: getfield        com/whatsapp/protocol/cb.d:J
        //   639: putfield        com/whatsapp/protocol/bi.L:J
        //   642: aload_0        
        //   643: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   646: aload_0        
        //   647: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   650: getfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   653: putfield        com/whatsapp/protocol/bi.d:Ljava/lang/String;
        //   656: aload_0        
        //   657: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   660: aload_0        
        //   661: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   664: getfield        com/whatsapp/protocol/cb.c:Ljava/lang/String;
        //   667: putfield        com/whatsapp/protocol/bi.o:Ljava/lang/String;
        //   670: aload_0        
        //   671: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   674: getfield        com/whatsapp/protocol/bi.D:I
        //   677: ifne            694
        //   680: aload_0        
        //   681: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   684: aload_0        
        //   685: getfield        com/whatsapp/a9.o:Lcom/whatsapp/protocol/cb;
        //   688: getfield        com/whatsapp/protocol/cb.e:I
        //   691: putfield        com/whatsapp/protocol/bi.D:I
        //   694: aload_0        
        //   695: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   698: iconst_2       
        //   699: putfield        com/whatsapp/protocol/bi.c:I
        //   702: aload_0        
        //   703: getfield        com/whatsapp/a9.e:Lcom/whatsapp/MediaData;
        //   706: iconst_1       
        //   707: putfield        com/whatsapp/MediaData.transferred:Z
        //   710: iload_2        
        //   711: ifeq            722
        //   714: aload_0        
        //   715: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   718: iconst_0       
        //   719: putfield        com/whatsapp/protocol/bi.c:I
        //   722: aload_0        
        //   723: invokevirtual   com/whatsapp/a9.isCancelled:()Z
        //   726: istore          12
        //   728: iload           12
        //   730: ifne            938
        //   733: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //   736: astore          21
        //   738: aload_1        
        //   739: aload           21
        //   741: if_acmpeq       770
        //   744: aload_0        
        //   745: getfield        com/whatsapp/a9.l:Z
        //   748: ifne            770
        //   751: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   754: invokevirtual   com/whatsapp/App.a5:()Landroid/os/Handler;
        //   757: new             Lcom/whatsapp/_n;
        //   760: dup            
        //   761: aload_0        
        //   762: aload_1        
        //   763: invokespecial   com/whatsapp/_n.<init>:(Lcom/whatsapp/a9;Lcom/whatsapp/t8;)V
        //   766: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   769: pop            
        //   770: aload_0        
        //   771: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   774: getfield        com/whatsapp/protocol/bi.I:B
        //   777: tableswitch {
        //                2: 1055
        //                3: 1064
        //                4: 1084
        //          default: 804
        //        }
        //   804: getstatic       com/whatsapp/fieldstats/i.NONE:Lcom/whatsapp/fieldstats/i;
        //   807: astore          22
        //   809: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //   812: astore          25
        //   814: aload_1        
        //   815: aload           25
        //   817: if_acmpne       856
        //   820: aload_0        
        //   821: getfield        com/whatsapp/a9.n:Z
        //   824: ifeq            856
        //   827: aload_0        
        //   828: getfield        com/whatsapp/a9.d:Lcom/whatsapp/alp;
        //   831: astore          32
        //   833: aload           32
        //   835: ifnull          847
        //   838: getstatic       com/whatsapp/fieldstats/al.OK:Lcom/whatsapp/fieldstats/al;
        //   841: astore          26
        //   843: iload_2        
        //   844: ifeq            861
        //   847: getstatic       com/whatsapp/fieldstats/al.DUPLICATE:Lcom/whatsapp/fieldstats/al;
        //   850: astore          26
        //   852: iload_2        
        //   853: ifeq            861
        //   856: getstatic       com/whatsapp/fieldstats/al.ERROR_UNKNOWN:Lcom/whatsapp/fieldstats/al;
        //   859: astore          26
        //   861: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   864: astore          28
        //   866: getstatic       com/whatsapp/fieldstats/o.RETRY_COUNTER:Lcom/whatsapp/fieldstats/o;
        //   869: astore          29
        //   871: aload_0        
        //   872: getfield        com/whatsapp/a9.q:Z
        //   875: istore          30
        //   877: iconst_0       
        //   878: istore          31
        //   880: iload           30
        //   882: ifeq            888
        //   885: iconst_1       
        //   886: istore          31
        //   888: aload           28
        //   890: aload           29
        //   892: iload           31
        //   894: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   897: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Integer;)V
        //   900: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   903: aload           22
        //   905: aload_0        
        //   906: getfield        com/whatsapp/a9.e:Lcom/whatsapp/MediaData;
        //   909: getfield        com/whatsapp/MediaData.forward:Z
        //   912: aload           26
        //   914: aload_0        
        //   915: getfield        com/whatsapp/a9.b:J
        //   918: invokestatic    java/lang/System.currentTimeMillis:()J
        //   921: aload_0        
        //   922: getfield        com/whatsapp/a9.j:J
        //   925: lsub           
        //   926: invokestatic    com/whatsapp/aam.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/i;ZLcom/whatsapp/fieldstats/al;JJ)V
        //   929: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   932: getstatic       com/whatsapp/fieldstats/o.RETRY_COUNTER:Lcom/whatsapp/fieldstats/o;
        //   935: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;)V
        //   938: aload_1        
        //   939: getstatic       com/whatsapp/t8.FAILED_BAD_MEDIA:Lcom/whatsapp/t8;
        //   942: if_acmpne       953
        //   945: aload_0        
        //   946: getfield        com/whatsapp/a9.e:Lcom/whatsapp/MediaData;
        //   949: iconst_0       
        //   950: putfield        com/whatsapp/MediaData.autodownloadRetryEnabled:Z
        //   953: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   956: astore          16
        //   958: aload_0        
        //   959: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //   962: astore          17
        //   964: getstatic       com/whatsapp/t8.SUCCESS:Lcom/whatsapp/t8;
        //   967: astore          18
        //   969: aload_1        
        //   970: aload           18
        //   972: if_acmpne       1139
        //   975: aload_0        
        //   976: getfield        com/whatsapp/a9.n:Z
        //   979: istore          20
        //   981: iload           20
        //   983: ifeq            1139
        //   986: iconst_1       
        //   987: istore          19
        //   989: aload           16
        //   991: aload           17
        //   993: iconst_1       
        //   994: iload           19
        //   996: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/bi;ZI)V
        //   999: return         
        //  1000: astore          44
        //  1002: aload           44
        //  1004: athrow         
        //  1005: astore          45
        //  1007: aload           45
        //  1009: athrow         
        //  1010: astore          46
        //  1012: aload           46
        //  1014: athrow         
        //  1015: astore          47
        //  1017: aload           47
        //  1019: athrow         
        //  1020: astore          48
        //  1022: aload           48
        //  1024: athrow         
        //  1025: astore          49
        //  1027: aload           49
        //  1029: athrow         
        //  1030: astore          51
        //  1032: aload           51
        //  1034: athrow         
        //  1035: astore          8
        //  1037: aload           8
        //  1039: athrow         
        //  1040: astore          9
        //  1042: aload           9
        //  1044: athrow         
        //  1045: astore          10
        //  1047: aload           10
        //  1049: athrow         
        //  1050: astore          11
        //  1052: aload           11
        //  1054: athrow         
        //  1055: getstatic       com/whatsapp/fieldstats/i.PHOTO:Lcom/whatsapp/fieldstats/i;
        //  1058: astore          22
        //  1060: iload_2        
        //  1061: ifeq            809
        //  1064: aload_0        
        //  1065: getfield        com/whatsapp/a9.h:Lcom/whatsapp/protocol/bi;
        //  1068: getfield        com/whatsapp/protocol/bi.E:I
        //  1071: iconst_1       
        //  1072: if_icmpne       1101
        //  1075: getstatic       com/whatsapp/fieldstats/i.PTT:Lcom/whatsapp/fieldstats/i;
        //  1078: astore          22
        //  1080: iload_2        
        //  1081: ifeq            809
        //  1084: getstatic       com/whatsapp/fieldstats/i.VIDEO:Lcom/whatsapp/fieldstats/i;
        //  1087: astore          22
        //  1089: iload_2        
        //  1090: ifeq            809
        //  1093: goto            804
        //  1096: astore          33
        //  1098: aload           33
        //  1100: athrow         
        //  1101: getstatic       com/whatsapp/fieldstats/i.AUDIO:Lcom/whatsapp/fieldstats/i;
        //  1104: astore          22
        //  1106: goto            1080
        //  1109: astore          23
        //  1111: aload           23
        //  1113: athrow         
        //  1114: astore          24
        //  1116: aload           24
        //  1118: athrow         
        //  1119: astore          27
        //  1121: aload           27
        //  1123: athrow         
        //  1124: astore          13
        //  1126: aload           13
        //  1128: athrow         
        //  1129: astore          14
        //  1131: aload           14
        //  1133: athrow         
        //  1134: astore          15
        //  1136: aload           15
        //  1138: athrow         
        //  1139: iconst_m1      
        //  1140: istore          19
        //  1142: goto            989
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      106    243    246    Ljava/lang/Exception;
        //  187    221    246    256    Ljava/lang/Exception;
        //  248    251    251    256    Ljava/lang/Exception;
        //  262    268    449    454    Ljava/lang/Exception;
        //  273    286    454    459    Ljava/lang/Exception;
        //  291    307    351    382    Ljava/lang/Exception;
        //  307    325    459    464    Ljava/lang/Exception;
        //  330    350    351    382    Ljava/lang/Exception;
        //  382    391    464    469    Ljava/lang/Exception;
        //  396    405    469    474    Ljava/lang/Exception;
        //  410    422    444    449    Ljava/lang/Exception;
        //  422    443    444    449    Ljava/lang/Exception;
        //  461    464    351    382    Ljava/lang/Exception;
        //  466    469    469    474    Ljava/lang/Exception;
        //  471    474    444    449    Ljava/lang/Exception;
        //  474    480    1000   1005   Ljava/lang/Exception;
        //  485    497    1005   1010   Ljava/lang/Exception;
        //  502    510    1010   1015   Ljava/lang/Exception;
        //  514    533    1015   1020   Ljava/lang/Exception;
        //  538    547    1020   1025   Ljava/lang/Exception;
        //  553    564    1025   1030   Ljava/lang/Exception;
        //  564    614    1025   1030   Ljava/lang/Exception;
        //  628    694    1030   1035   Ljava/lang/Exception;
        //  694    710    1035   1040   Ljava/lang/Exception;
        //  714    722    1035   1040   Ljava/lang/Exception;
        //  722    728    1040   1045   Ljava/lang/Exception;
        //  733    738    1045   1050   Ljava/lang/Exception;
        //  744    770    1050   1055   Ljava/lang/Exception;
        //  809    814    1109   1114   Ljava/lang/Exception;
        //  820    833    1114   1119   Ljava/lang/Exception;
        //  861    877    1119   1124   Ljava/lang/Exception;
        //  938    953    1124   1129   Ljava/lang/Exception;
        //  953    969    1129   1134   Ljava/lang/Exception;
        //  975    981    1134   1139   Ljava/lang/Exception;
        //  1002   1005   1005   1010   Ljava/lang/Exception;
        //  1007   1010   1010   1015   Ljava/lang/Exception;
        //  1012   1015   1015   1020   Ljava/lang/Exception;
        //  1017   1020   1020   1025   Ljava/lang/Exception;
        //  1022   1025   1025   1030   Ljava/lang/Exception;
        //  1042   1045   1045   1050   Ljava/lang/Exception;
        //  1047   1050   1050   1055   Ljava/lang/Exception;
        //  1064   1080   1096   1101   Ljava/lang/Exception;
        //  1111   1114   1114   1119   Ljava/lang/Exception;
        //  1131   1134   1134   1139   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 512, Size: 512
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
    
    public void a(final boolean b) {
        boolean autodownloadRetryEnabled = true;
        Log.i(a9.z[11] + this.h.a);
        this.cancel(autodownloadRetryEnabled);
        if (!this.l) {
            this.h.c = 0;
            this.e.transferring = false;
            this.e.transferred = false;
            final MediaData e = this.e;
            if (b) {
                autodownloadRetryEnabled = false;
            }
            e.autodownloadRetryEnabled = autodownloadRetryEnabled;
            App.ak.a(this.h);
        }
        a9.f.remove(this.h.a);
        a9.k.remove(this.h.a);
    }
    
    public void a(final Integer[] array) {
        final int intValue = array[0];
        atd.a(intValue - this.a, 0);
        this.a = intValue;
        if (!this.l) {
            Label_0071: {
                if (this.b != 0L) {
                    this.e.progress = 100L * intValue / this.b;
                    if (!App.I) {
                        break Label_0071;
                    }
                }
                this.e.progress = 0L;
            }
            App.ak.a(this.h, false, -1);
        }
    }
    
    public MediaData b() {
        return this.e;
    }
    
    public void c() {
        this.q = true;
    }
    
    protected int d() {
        return 16384;
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public bi e() {
        return this.h;
    }
    
    protected long f() {
        return this.e.file.length();
    }
    
    public void g() {
        Log.i(a9.z[15] + this.h.a + a9.z[13] + a9.f.size() + a9.z[14] + a9.k.size());
        if (a9.f.size() > 10) {
            a9.k.put(this.h.a, this);
            if (!App.I) {
                return;
            }
        }
        a9.f.put(this.h.a, this);
        this.j = System.currentTimeMillis();
        a8s.a(new k4(this), new Void[0]);
    }
    
    protected String h() {
        return br.b(this.e.file);
    }
    
    public void i() {
        this.a(true);
    }
    
    protected _b k() {
        return new ip(this.e.file);
    }
    
    protected void onCancelled() {
        Log.i(a9.z[12] + this.h.a);
        this.a(t8.CANCEL);
    }
    
    public void onPostExecute(final Object o) {
        this.a((t8)o);
    }
    
    public void onProgressUpdate(final Object[] array) {
        this.a((Integer[])array);
    }
}
