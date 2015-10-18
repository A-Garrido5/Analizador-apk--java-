// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.apache.http.message.BasicNameValuePair;
import org.apache.http.HttpResponse;
import java.net.MalformedURLException;
import com.whatsapp.util.Log;
import android.text.TextUtils;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.RequestContent;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import java.net.URL;
import java.util.List;
import org.apache.http.protocol.BasicHttpProcessor;

public class e6
{
    private static final String[] z;
    private BasicHttpProcessor a;
    private List b;
    private URL c;
    private HttpEntity d;
    
    static {
        final String[] z2 = new String[19];
        String s = "Q]-8/";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\\';
                        break;
                    }
                    case 0: {
                        c2 = '9';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Q]-8s[H=e,KF-'?VE";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Q]-8sWFt<=KN<<";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Q]-8s[H==.U";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Q]-8sXM=:sWFt 3J]";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Q]-8,VZ-g>XMt;(X],;?VM<h";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0010\t";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Q]-8rZF7&9Z]0'2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Q]-8,VZ-g4M])-.KF+ht";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Q]-8,VZ-g9K[6:|\u0011";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0010\t";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Q]-8,VZ-g2V\u00048,8KL*;9J";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Q]-8,VZ-g5VL+:3K\tq";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "if\n\u001c";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "zF7&9Z]0'2";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "ZE6;9";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "l}\u001fed";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0019\u0001";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0010\t";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private e6(final URL c) {
        this.c = c;
        this.b = new ArrayList();
        (this.a = new BasicHttpProcessor()).addInterceptor((HttpRequestInterceptor)new RequestContent());
        this.a.addInterceptor((HttpRequestInterceptor)new RequestTargetHost());
        this.a.addInterceptor((HttpRequestInterceptor)new RequestUserAgent());
        this.a.removeRequestInterceptorByClass((Class)RequestExpectContinue.class);
    }
    
    public static e6 a(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                Log.e(e6.z[2]);
                return null;
            }
        }
        catch (MalformedURLException ex) {
            throw ex;
        }
        URL url;
        try {
            url = new URL(s);
            if (!url.getProtocol().equals(e6.z[0])) {
                Log.e(e6.z[1]);
                return null;
            }
        }
        catch (MalformedURLException ex2) {
            Log.e(e6.z[3]);
            return null;
        }
        return new e6(url);
    }
    
    private static List b(final String s) {
        if (s == null) {
            Log.e(e6.z[4]);
            return null;
        }
        return App.g.d(s);
    }
    
    public HttpResponse a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a_9.k:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //     8: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //    11: invokestatic    com/whatsapp/e6.b:(Ljava/lang/String;)Ljava/util/List;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnonnull       35
        //    19: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //    22: bipush          11
        //    24: aaload         
        //    25: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    28: aconst_null    
        //    29: areturn        
        //    30: astore          41
        //    32: aload           41
        //    34: athrow         
        //    35: aload_0        
        //    36: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //    39: invokevirtual   java/net/URL.getPort:()I
        //    42: istore_3       
        //    43: iload_3        
        //    44: iconst_m1      
        //    45: if_icmpne       947
        //    48: aload_0        
        //    49: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //    52: invokevirtual   java/net/URL.getDefaultPort:()I
        //    55: istore          4
        //    57: aload_2        
        //    58: invokestatic    java/util/Collections.shuffle:(Ljava/util/List;)V
        //    61: aload_2        
        //    62: invokeinterface java/util/List.size:()I
        //    67: istore          6
        //    69: iload           6
        //    71: iconst_4       
        //    72: if_icmple       630
        //    75: iconst_4       
        //    76: istore          7
        //    78: iconst_0       
        //    79: istore          8
        //    81: iload           8
        //    83: iload           7
        //    85: if_icmpge       934
        //    88: invokestatic    java/lang/Math.random:()D
        //    91: ldc2_w          4000.0
        //    94: ldc2_w          2.0
        //    97: iload           8
        //    99: i2d            
        //   100: invokestatic    java/lang/Math.pow:(DD)D
        //   103: dconst_1       
        //   104: dsub           
        //   105: dmul           
        //   106: dmul           
        //   107: d2i            
        //   108: i2l            
        //   109: invokestatic    java/lang/Thread.sleep:(J)V
        //   112: new             Lorg/apache/http/params/BasicHttpParams;
        //   115: dup            
        //   116: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //   119: astore          20
        //   121: aload           20
        //   123: getstatic       org/apache/http/HttpVersion.HTTP_1_1:Lorg/apache/http/HttpVersion;
        //   126: invokestatic    org/apache/http/params/HttpProtocolParams.setVersion:(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
        //   129: aload           20
        //   131: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   134: bipush          16
        //   136: aaload         
        //   137: invokestatic    org/apache/http/params/HttpProtocolParams.setContentCharset:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   140: aload           20
        //   142: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //   145: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   148: new             Lorg/apache/http/protocol/BasicHttpContext;
        //   151: dup            
        //   152: aconst_null    
        //   153: invokespecial   org/apache/http/protocol/BasicHttpContext.<init>:(Lorg/apache/http/protocol/HttpContext;)V
        //   156: astore          21
        //   158: new             Lorg/apache/http/impl/DefaultHttpClientConnection;
        //   161: dup            
        //   162: invokespecial   org/apache/http/impl/DefaultHttpClientConnection.<init>:()V
        //   165: astore          22
        //   167: new             Lorg/apache/http/protocol/HttpRequestExecutor;
        //   170: dup            
        //   171: invokespecial   org/apache/http/protocol/HttpRequestExecutor.<init>:()V
        //   174: astore          23
        //   176: aload_2        
        //   177: iload           8
        //   179: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   184: checkcast       Ljava/net/InetAddress;
        //   187: astore          24
        //   189: new             Ljava/net/Socket;
        //   192: dup            
        //   193: invokespecial   java/net/Socket.<init>:()V
        //   196: astore          25
        //   198: aload           25
        //   200: new             Ljava/net/InetSocketAddress;
        //   203: dup            
        //   204: aload           24
        //   206: iload           4
        //   208: invokespecial   java/net/InetSocketAddress.<init>:(Ljava/net/InetAddress;I)V
        //   211: ldc             60000
        //   213: invokevirtual   java/net/Socket.connect:(Ljava/net/SocketAddress;I)V
        //   216: aload           25
        //   218: ldc             60000
        //   220: invokevirtual   java/net/Socket.setSoTimeout:(I)V
        //   223: invokestatic    com/whatsapp/messaging/a6.b:()Lcom/whatsapp/messaging/a6;
        //   226: astore          26
        //   228: aload           25
        //   230: ldc             60000
        //   232: invokevirtual   java/net/Socket.setSoTimeout:(I)V
        //   235: aload           26
        //   237: aload           25
        //   239: aload_0        
        //   240: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //   243: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   246: iload           4
        //   248: iconst_1       
        //   249: invokevirtual   javax/net/ssl/SSLSocketFactory.createSocket:(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
        //   252: astore          27
        //   254: aload           21
        //   256: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   259: bipush          7
        //   261: aaload         
        //   262: aload           22
        //   264: invokeinterface org/apache/http/protocol/HttpContext.setAttribute:(Ljava/lang/String;Ljava/lang/Object;)V
        //   269: aload           22
        //   271: invokevirtual   org/apache/http/impl/DefaultHttpClientConnection.isOpen:()Z
        //   274: ifne            286
        //   277: aload           22
        //   279: aload           27
        //   281: aload           20
        //   283: invokevirtual   org/apache/http/impl/DefaultHttpClientConnection.bind:(Ljava/net/Socket;Lorg/apache/http/params/HttpParams;)V
        //   286: new             Ljava/lang/StringBuilder;
        //   289: dup            
        //   290: invokespecial   java/lang/StringBuilder.<init>:()V
        //   293: aload_0        
        //   294: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //   297: invokevirtual   java/net/URL.getPath:()Ljava/lang/String;
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: astore          30
        //   305: aload_0        
        //   306: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //   309: invokevirtual   java/net/URL.getQuery:()Ljava/lang/String;
        //   312: ifnull          811
        //   315: new             Ljava/lang/StringBuilder;
        //   318: dup            
        //   319: invokespecial   java/lang/StringBuilder.<init>:()V
        //   322: ldc_w           "?"
        //   325: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   328: aload_0        
        //   329: getfield        com/whatsapp/e6.c:Ljava/net/URL;
        //   332: invokevirtual   java/net/URL.getQuery:()Ljava/lang/String;
        //   335: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   338: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   341: astore          40
        //   343: aload           40
        //   345: astore          31
        //   347: aload           30
        //   349: aload           31
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   357: astore          32
        //   359: new             Lorg/apache/http/message/BasicHttpEntityEnclosingRequest;
        //   362: dup            
        //   363: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   366: bipush          13
        //   368: aaload         
        //   369: aload           32
        //   371: invokespecial   org/apache/http/message/BasicHttpEntityEnclosingRequest.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   374: astore          33
        //   376: aload_0        
        //   377: getfield        com/whatsapp/e6.d:Lorg/apache/http/HttpEntity;
        //   380: ifnull          392
        //   383: aload           33
        //   385: aload_0        
        //   386: getfield        com/whatsapp/e6.d:Lorg/apache/http/HttpEntity;
        //   389: invokevirtual   org/apache/http/message/BasicHttpEntityEnclosingRequest.setEntity:(Lorg/apache/http/HttpEntity;)V
        //   392: aload           33
        //   394: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   397: bipush          14
        //   399: aaload         
        //   400: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   403: bipush          15
        //   405: aaload         
        //   406: invokevirtual   org/apache/http/message/BasicHttpEntityEnclosingRequest.addHeader:(Ljava/lang/String;Ljava/lang/String;)V
        //   409: aload_0        
        //   410: getfield        com/whatsapp/e6.b:Ljava/util/List;
        //   413: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   418: astore          35
        //   420: aload           35
        //   422: invokeinterface java/util/Iterator.hasNext:()Z
        //   427: ifeq            465
        //   430: aload           35
        //   432: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   437: checkcast       Lorg/apache/http/NameValuePair;
        //   440: astore          39
        //   442: aload           33
        //   444: aload           39
        //   446: invokeinterface org/apache/http/NameValuePair.getName:()Ljava/lang/String;
        //   451: aload           39
        //   453: invokeinterface org/apache/http/NameValuePair.getValue:()Ljava/lang/String;
        //   458: invokevirtual   org/apache/http/message/BasicHttpEntityEnclosingRequest.addHeader:(Ljava/lang/String;Ljava/lang/String;)V
        //   461: iload_1        
        //   462: ifeq            420
        //   465: aload           33
        //   467: aload           20
        //   469: invokevirtual   org/apache/http/message/BasicHttpEntityEnclosingRequest.setParams:(Lorg/apache/http/params/HttpParams;)V
        //   472: aload           23
        //   474: aload           33
        //   476: aload_0        
        //   477: getfield        com/whatsapp/e6.a:Lorg/apache/http/protocol/BasicHttpProcessor;
        //   480: aload           21
        //   482: invokevirtual   org/apache/http/protocol/HttpRequestExecutor.preProcess:(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpProcessor;Lorg/apache/http/protocol/HttpContext;)V
        //   485: aload           23
        //   487: aload           33
        //   489: aload           22
        //   491: aload           21
        //   493: invokevirtual   org/apache/http/protocol/HttpRequestExecutor.execute:(Lorg/apache/http/HttpRequest;Lorg/apache/http/HttpClientConnection;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
        //   496: astore          9
        //   498: aload           9
        //   500: aload           20
        //   502: invokeinterface org/apache/http/HttpResponse.setParams:(Lorg/apache/http/params/HttpParams;)V
        //   507: aload           23
        //   509: aload           9
        //   511: aload_0        
        //   512: getfield        com/whatsapp/e6.a:Lorg/apache/http/protocol/BasicHttpProcessor;
        //   515: aload           21
        //   517: invokevirtual   org/apache/http/protocol/HttpRequestExecutor.postProcess:(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpProcessor;Lorg/apache/http/protocol/HttpContext;)V
        //   520: aload           9
        //   522: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   527: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   532: istore          36
        //   534: iload           36
        //   536: sipush          500
        //   539: if_icmplt       622
        //   542: iload           8
        //   544: iload           7
        //   546: iconst_1       
        //   547: isub           
        //   548: if_icmpeq       622
        //   551: invokestatic    com/whatsapp/App.O:()Z
        //   554: istore          38
        //   556: iload           38
        //   558: ifeq            622
        //   561: new             Ljava/lang/StringBuilder;
        //   564: dup            
        //   565: invokespecial   java/lang/StringBuilder.<init>:()V
        //   568: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   571: iconst_5       
        //   572: aaload         
        //   573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   576: iload           36
        //   578: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   581: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   584: bipush          17
        //   586: aaload         
        //   587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   590: iload           8
        //   592: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   595: ldc_w           "/"
        //   598: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   601: iload           7
        //   603: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   606: ldc_w           ")"
        //   609: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   612: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   615: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   618: iload_1        
        //   619: ifeq            924
        //   622: aload           9
        //   624: areturn        
        //   625: astore          5
        //   627: aload           5
        //   629: athrow         
        //   630: aload_2        
        //   631: invokeinterface java/util/List.size:()I
        //   636: istore          7
        //   638: goto            78
        //   641: astore          28
        //   643: aload           28
        //   645: athrow         
        //   646: astore          17
        //   648: new             Ljava/lang/StringBuilder;
        //   651: dup            
        //   652: invokespecial   java/lang/StringBuilder.<init>:()V
        //   655: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   658: bipush          12
        //   660: aaload         
        //   661: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   664: iload           8
        //   666: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   669: ldc_w           "/"
        //   672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   675: iload           7
        //   677: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   680: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   683: bipush          6
        //   685: aaload         
        //   686: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   689: aload           17
        //   691: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   694: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   697: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   700: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   703: iload           8
        //   705: iload           7
        //   707: iconst_1       
        //   708: isub           
        //   709: if_icmpeq       718
        //   712: invokestatic    com/whatsapp/App.O:()Z
        //   715: ifne            924
        //   718: aload           17
        //   720: athrow         
        //   721: astore          19
        //   723: aload           19
        //   725: athrow         
        //   726: astore          29
        //   728: aload           29
        //   730: athrow         
        //   731: astore          14
        //   733: new             Ljava/lang/StringBuilder;
        //   736: dup            
        //   737: invokespecial   java/lang/StringBuilder.<init>:()V
        //   740: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   743: bipush          8
        //   745: aaload         
        //   746: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   749: iload           8
        //   751: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   754: ldc_w           "/"
        //   757: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   760: iload           7
        //   762: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   765: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   768: bipush          10
        //   770: aaload         
        //   771: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   774: aload           14
        //   776: invokevirtual   org/apache/http/HttpException.toString:()Ljava/lang/String;
        //   779: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   782: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   785: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   788: iload           8
        //   790: iload           7
        //   792: iconst_1       
        //   793: isub           
        //   794: if_icmpeq       803
        //   797: invokestatic    com/whatsapp/App.O:()Z
        //   800: ifne            924
        //   803: aload           14
        //   805: athrow         
        //   806: astore          16
        //   808: aload           16
        //   810: athrow         
        //   811: ldc_w           ""
        //   814: astore          31
        //   816: goto            347
        //   819: astore          34
        //   821: aload           34
        //   823: athrow         
        //   824: astore          10
        //   826: new             Ljava/lang/StringBuilder;
        //   829: dup            
        //   830: invokespecial   java/lang/StringBuilder.<init>:()V
        //   833: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   836: bipush          9
        //   838: aaload         
        //   839: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   842: iload           8
        //   844: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   847: ldc_w           "/"
        //   850: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   853: iload           7
        //   855: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   858: getstatic       com/whatsapp/e6.z:[Ljava/lang/String;
        //   861: bipush          18
        //   863: aaload         
        //   864: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   867: aload           10
        //   869: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   872: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   875: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   878: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   881: iload           8
        //   883: iload           7
        //   885: iconst_1       
        //   886: isub           
        //   887: if_icmpeq       896
        //   890: invokestatic    com/whatsapp/App.O:()Z
        //   893: ifne            924
        //   896: aload           10
        //   898: athrow         
        //   899: astore          12
        //   901: aload           12
        //   903: athrow         
        //   904: astore          37
        //   906: aload           37
        //   908: athrow         
        //   909: astore          18
        //   911: aload           18
        //   913: athrow         
        //   914: astore          15
        //   916: aload           15
        //   918: athrow         
        //   919: astore          11
        //   921: aload           11
        //   923: athrow         
        //   924: iload           8
        //   926: iconst_1       
        //   927: iadd           
        //   928: istore          13
        //   930: iload_1        
        //   931: ifeq            940
        //   934: aconst_null    
        //   935: astore          9
        //   937: goto            622
        //   940: iload           13
        //   942: istore          8
        //   944: goto            81
        //   947: iload_3        
        //   948: istore          4
        //   950: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  19     28     30     35     Ljava/io/IOException;
        //  57     69     625    630    Ljava/io/IOException;
        //  88     254    646    914    Ljava/io/IOException;
        //  88     254    731    919    Lorg/apache/http/HttpException;
        //  88     254    824    924    Ljava/lang/Exception;
        //  254    286    641    646    Ljava/io/IOException;
        //  254    286    731    919    Lorg/apache/http/HttpException;
        //  254    286    824    924    Ljava/lang/Exception;
        //  286    343    726    731    Ljava/io/IOException;
        //  286    343    731    919    Lorg/apache/http/HttpException;
        //  286    343    824    924    Ljava/lang/Exception;
        //  347    376    646    914    Ljava/io/IOException;
        //  347    376    731    919    Lorg/apache/http/HttpException;
        //  347    376    824    924    Ljava/lang/Exception;
        //  376    392    819    824    Ljava/io/IOException;
        //  376    392    731    919    Lorg/apache/http/HttpException;
        //  376    392    824    924    Ljava/lang/Exception;
        //  392    420    646    914    Ljava/io/IOException;
        //  392    420    731    919    Lorg/apache/http/HttpException;
        //  392    420    824    924    Ljava/lang/Exception;
        //  420    461    646    914    Ljava/io/IOException;
        //  420    461    731    919    Lorg/apache/http/HttpException;
        //  420    461    824    924    Ljava/lang/Exception;
        //  465    534    646    914    Ljava/io/IOException;
        //  465    534    731    919    Lorg/apache/http/HttpException;
        //  465    534    824    924    Ljava/lang/Exception;
        //  551    556    904    909    Ljava/io/IOException;
        //  551    556    731    919    Lorg/apache/http/HttpException;
        //  551    556    824    924    Ljava/lang/Exception;
        //  561    618    646    914    Ljava/io/IOException;
        //  561    618    731    919    Lorg/apache/http/HttpException;
        //  561    618    824    924    Ljava/lang/Exception;
        //  643    646    646    914    Ljava/io/IOException;
        //  643    646    731    919    Lorg/apache/http/HttpException;
        //  643    646    824    924    Ljava/lang/Exception;
        //  648    703    909    914    Ljava/io/IOException;
        //  712    718    721    726    Ljava/io/IOException;
        //  718    721    721    726    Ljava/io/IOException;
        //  728    731    646    914    Ljava/io/IOException;
        //  728    731    731    919    Lorg/apache/http/HttpException;
        //  728    731    824    924    Ljava/lang/Exception;
        //  733    788    914    919    Ljava/io/IOException;
        //  797    803    806    811    Ljava/io/IOException;
        //  803    806    806    811    Ljava/io/IOException;
        //  821    824    646    914    Ljava/io/IOException;
        //  821    824    731    919    Lorg/apache/http/HttpException;
        //  821    824    824    924    Ljava/lang/Exception;
        //  826    881    919    924    Ljava/io/IOException;
        //  890    896    899    904    Ljava/io/IOException;
        //  896    899    899    904    Ljava/io/IOException;
        //  906    909    646    914    Ljava/io/IOException;
        //  906    909    731    919    Lorg/apache/http/HttpException;
        //  906    909    824    924    Ljava/lang/Exception;
        //  911    914    721    726    Ljava/io/IOException;
        //  916    919    806    811    Ljava/io/IOException;
        //  921    924    899    904    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 422, Size: 422
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    public void a(final String s, final String s2) {
        this.b.add(new BasicNameValuePair(s, s2));
    }
    
    public void a(final HttpEntity d) {
        this.d = d;
    }
}
