// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import android.net.Uri;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.content.Context;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

public class FileProvider extends ContentProvider
{
    private static final String[] COLUMNS;
    private static final File DEVICE_ROOT;
    private static HashMap sCache;
    private static final String[] z;
    private FileProvider$PathStrategy mStrategy;
    
    static {
        final String[] array = new String[24];
        String s = "\u001bKLl?";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0810:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "\u001b\\Le*(Y\\I4%U@";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "\u001b\\Le*(Y\\I4%U@";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "\u001bKLl?";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    array2 = array3;
                    s = "\nW\u0005s\"0]Wx;(\u0018Pf>%L@e";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "\u0002YLz? \u0018Qyz4YWe?dYKr(+QA8)1HUy(0\u0016c_\u0016\u0001guD\u0015\u0012qaS\b\u001bhdB\u0012\u0017\u0018Hs.%\u0015Aw.%";
                    n = 4;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    n2 = 6;
                    s = "\u0002YLz? \u0018Qyz4YWe?dYKr(+QA8)1HUy(0\u0016c_\u0016\u0001guD\u0015\u0012qaS\b\u001bhdB\u0012\u0017\u0018Hs.%\u0015Aw.%";
                    n = 5;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    n2 = 7;
                    s = "\u0014JJ`3 ]W671KQ64+L\u0005t?d]]f56L@r";
                    n = 6;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    n2 = 8;
                    s = "\u0014JJ`3 ]W671KQ6=6YKbz1JL6*!JH\u007f)7QJx)";
                    n = 7;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 9;
                    s = "\nW\u0005s\"0]Wx;(\u0018Lx)!JQe";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    array2[n2] = intern;
                    n2 = 10;
                    s = "%HUz3'YQ\u007f5*\u0017Ju.!L\be.6]D{";
                    n = 9;
                    array2 = array3;
                    continue;
                }
                case 9: {
                    array2[n2] = intern;
                    n2 = 11;
                    s = "*YHs";
                    n = 10;
                    array2 = array3;
                    continue;
                }
                case 10: {
                    array2[n2] = intern;
                    n2 = 12;
                    s = "\tQVe3*_\u0005w4 JJ\u007f>jKPf*+JQ8\u001c\rt`I\n\u0016ws_\u001e\u0001jzF\u001b\u0010pv67!LD;>%LD";
                    n = 11;
                    array2 = array3;
                    continue;
                }
                case 11: {
                    array2[n2] = intern;
                    n2 = 13;
                    s = "6WJbw4YQ~";
                    n = 12;
                    array2 = array3;
                    continue;
                }
                case 12: {
                    array2[n2] = intern;
                    n2 = 14;
                    s = "'YF~?iHDb2";
                    n = 13;
                    array2 = array3;
                    continue;
                }
                case 13: {
                    array2[n2] = intern;
                    n2 = 15;
                    s = "!@Qs(*YI;*%LM";
                    n = 14;
                    array2 = array3;
                    continue;
                }
                case 14: {
                    array2[n2] = intern;
                    n2 = 16;
                    s = "%VAd5-\\\u000be/4HJd.j~lZ\u001f\u001bhwY\f\r|`D\u0005\u0014yq^\t";
                    n = 15;
                    array2 = array3;
                    continue;
                }
                case 15: {
                    array2[n2] = intern;
                    n2 = 17;
                    s = "4YQ~";
                    n = 16;
                    array2 = array3;
                    continue;
                }
                case 16: {
                    array2[n2] = intern;
                    n2 = 18;
                    s = "\"QIs)iHDb2";
                    n = 17;
                    array2 = array3;
                    continue;
                }
                case 17: {
                    array2[n2] = intern;
                    n2 = 19;
                    s = "3Y";
                    n = 18;
                    array2 = array3;
                    continue;
                }
                case 18: {
                    array2[n2] = intern;
                    n2 = 20;
                    s = "\rVSw6-\\\u0005{5 ]\u001f6";
                    n = 19;
                    array2 = array3;
                    continue;
                }
                case 19: {
                    array2[n2] = intern;
                    n2 = 21;
                    s = "3L";
                    n = 20;
                    array2 = array3;
                    continue;
                }
                case 20: {
                    array2[n2] = intern;
                    s = "6O";
                    n = 21;
                    n2 = 22;
                    array2 = array3;
                    continue;
                }
                case 21: {
                    array2[n2] = intern;
                    n2 = 23;
                    array2 = array3;
                    s = "6OQ";
                    n = 22;
                    continue;
                }
                case 22: {
                    array2[n2] = intern;
                    z = array3;
                    final String[] array4 = new String[2];
                    s = "\u001b\\Le*(Y\\I4%U@";
                    n = 23;
                    array2 = array4;
                    array3 = array4;
                    n2 = 0;
                    continue;
                }
                case 23: {
                    array2[n2] = intern;
                    s = "\u001bKLl?";
                    n = 24;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 24: {
                    break Label_0810;
                }
            }
        }
        array2[n2] = intern;
        COLUMNS = array3;
        DEVICE_ROOT = new File("/");
        FileProvider.sCache = new HashMap();
    }
    
    private static File buildPath(final File file, final String[] array) {
        final boolean a = ContextCompat.a;
        final int length = array.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            final String s = array[i];
            if (s != null) {
                file2 = new File(file2, s);
            }
            final int n = i + 1;
            if (a) {
                break;
            }
            i = n;
        }
        return file2;
    }
    
    private static Object[] copyOf(final Object[] array, final int n) {
        final Object[] array2 = new Object[n];
        System.arraycopy(array, 0, array2, 0, n);
        return array2;
    }
    
    private static String[] copyOf(final String[] array, final int n) {
        final String[] array2 = new String[n];
        System.arraycopy(array, 0, array2, 0, n);
        return array2;
    }
    
    private static FileProvider$PathStrategy getPathStrategy(final Context context, final String s) {
        // monitorenter(FileProvider.sCache)
        try {
            FileProvider$PathStrategy pathStrategy = FileProvider.sCache.get(s);
            if (pathStrategy != null) {
                return pathStrategy;
            }
            try {
                pathStrategy = parsePathStrategy(context, s);
                FileProvider.sCache.put(s, pathStrategy);
                return pathStrategy;
            }
            catch (IOException ex) {
                throw new IllegalArgumentException(FileProvider.z[6], ex);
            }
            catch (XmlPullParserException ex2) {
                throw new IllegalArgumentException(FileProvider.z[5], (Throwable)ex2);
            }
        }
        finally {}
    }
    
    private static int modeToMode(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/content/ContextCompat.a:Z
        //     3: istore_1       
        //     4: ldc             "r"
        //     6: aload_0        
        //     7: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    10: ifeq            20
        //    13: ldc             268435456
        //    15: istore_3       
        //    16: iload_1        
        //    17: ifeq            179
        //    20: ldc             "w"
        //    22: aload_0        
        //    23: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    26: ifne            46
        //    29: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //    32: bipush          21
        //    34: aaload         
        //    35: aload_0        
        //    36: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    39: istore          11
        //    41: iload           11
        //    43: ifeq            53
        //    46: ldc             738197504
        //    48: istore_3       
        //    49: iload_1        
        //    50: ifeq            179
        //    53: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //    56: bipush          19
        //    58: aaload         
        //    59: aload_0        
        //    60: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    63: istore          5
        //    65: iload           5
        //    67: ifeq            77
        //    70: ldc             704643072
        //    72: istore_3       
        //    73: iload_1        
        //    74: ifeq            179
        //    77: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //    80: bipush          22
        //    82: aaload         
        //    83: aload_0        
        //    84: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    87: istore          7
        //    89: iload           7
        //    91: ifeq            101
        //    94: ldc             939524096
        //    96: istore_3       
        //    97: iload_1        
        //    98: ifeq            179
        //   101: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //   104: bipush          23
        //   106: aaload         
        //   107: aload_0        
        //   108: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   111: istore          9
        //   113: iload           9
        //   115: ifeq            125
        //   118: ldc             1006632960
        //   120: istore_3       
        //   121: iload_1        
        //   122: ifeq            179
        //   125: new             Ljava/lang/IllegalArgumentException;
        //   128: dup            
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: invokespecial   java/lang/StringBuilder.<init>:()V
        //   136: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //   139: bipush          20
        //   141: aaload         
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: aload_0        
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   152: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   155: athrow         
        //   156: astore          10
        //   158: aload           10
        //   160: athrow         
        //   161: astore_2       
        //   162: aload_2        
        //   163: athrow         
        //   164: astore          4
        //   166: aload           4
        //   168: athrow         
        //   169: astore          6
        //   171: aload           6
        //   173: athrow         
        //   174: astore          8
        //   176: aload           8
        //   178: athrow         
        //   179: iload_3        
        //   180: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  20     41     161    164    Ljava/lang/SecurityException;
        //  53     65     164    169    Ljava/lang/SecurityException;
        //  77     89     169    174    Ljava/lang/SecurityException;
        //  101    113    174    179    Ljava/lang/SecurityException;
        //  125    156    156    161    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 93, Size: 93
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
    
    private static FileProvider$PathStrategy parsePathStrategy(final Context context, final String s) {
        final boolean a = ContextCompat.a;
        final FileProvider$SimplePathStrategy fileProvider$SimplePathStrategy = new FileProvider$SimplePathStrategy(s);
        final XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), FileProvider.z[16]);
        if (loadXmlMetaData == null) {
            try {
                throw new IllegalArgumentException(FileProvider.z[12]);
            }
            catch (SecurityException ex) {
                throw ex;
            }
        }
    Label_0156_Outer:
        while (true) {
            final int next = loadXmlMetaData.next();
            if (next == 1) {
                return fileProvider$SimplePathStrategy;
            }
            if (next != 2) {
                continue Label_0156_Outer;
            }
            final String name = loadXmlMetaData.getName();
            final String attributeValue = loadXmlMetaData.getAttributeValue((String)null, FileProvider.z[11]);
            final String attributeValue2 = loadXmlMetaData.getAttributeValue((String)null, FileProvider.z[17]);
            File file;
            Block_10_Outer:Block_11_Outer:
            while (true) {
                Label_0175: {
                    if (!FileProvider.z[13].equals(name)) {
                        break Label_0175;
                    }
                    file = buildPath(FileProvider.DEVICE_ROOT, new String[] { attributeValue2 });
                    Label_0169: {
                        if (file == null) {
                            break Label_0169;
                        }
                        try {
                            fileProvider$SimplePathStrategy.addRoot(attributeValue, file);
                            if (a) {
                                return fileProvider$SimplePathStrategy;
                            }
                            continue Label_0156_Outer;
                            // iftrue(Label_0210:, !FileProvider.z[18].equals((Object)name))
                            // iftrue(Label_0245:, !FileProvider.z[14].equals((Object)name))
                            while (true) {
                            Block_9_Outer:
                                while (true) {
                                    file = buildPath(context.getCacheDir(), new String[] { attributeValue2 });
                                    continue Block_10_Outer;
                                    while (true) {
                                        file = buildPath(context.getFilesDir(), new String[] { attributeValue2 });
                                        continue Block_10_Outer;
                                        file = buildPath(Environment.getExternalStorageDirectory(), new String[] { attributeValue2 });
                                        continue Block_10_Outer;
                                        continue Block_11_Outer;
                                    }
                                    Label_0210: {
                                        continue Block_9_Outer;
                                    }
                                }
                                Label_0245: {
                                    continue;
                                }
                            }
                        }
                        // iftrue(Label_0284:, !FileProvider.z[15].equals((Object)name))
                        catch (SecurityException ex2) {
                            throw ex2;
                        }
                    }
                }
                Label_0284: {
                    file = null;
                }
                continue;
            }
        }
    }
    
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
            if (providerInfo.exported) {
                throw new SecurityException(FileProvider.z[7]);
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        try {
            if (!providerInfo.grantUriPermissions) {
                throw new SecurityException(FileProvider.z[8]);
            }
        }
        catch (SecurityException ex2) {
            throw ex2;
        }
        this.mStrategy = getPathStrategy(context, providerInfo.authority);
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        final File fileForUri = this.mStrategy.getFileForUri(uri);
        try {
            if (fileForUri.delete()) {
                return 1;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        return 0;
    }
    
    public String getType(final Uri uri) {
        final File fileForUri = this.mStrategy.getFileForUri(uri);
        final int lastIndex = fileForUri.getName().lastIndexOf(46);
        if (lastIndex >= 0) {
            final String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(lastIndex + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return FileProvider.z[10];
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException(FileProvider.z[9]);
    }
    
    public boolean onCreate() {
        return true;
    }
    
    public ParcelFileDescriptor openFile(final Uri uri, final String s) {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(s));
    }
    
    public Cursor query(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/content/ContextCompat.a:Z
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        android/support/v4/content/FileProvider.mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
        //     9: aload_1        
        //    10: invokeinterface android/support/v4/content/FileProvider$PathStrategy.getFileForUri:(Landroid/net/Uri;)Ljava/io/File;
        //    15: astore          7
        //    17: aload_2        
        //    18: ifnonnull       25
        //    21: getstatic       android/support/v4/content/FileProvider.COLUMNS:[Ljava/lang/String;
        //    24: astore_2       
        //    25: aload_2        
        //    26: arraylength    
        //    27: anewarray       Ljava/lang/String;
        //    30: astore          8
        //    32: aload_2        
        //    33: arraylength    
        //    34: anewarray       Ljava/lang/Object;
        //    37: astore          9
        //    39: aload_2        
        //    40: arraylength    
        //    41: istore          10
        //    43: iconst_0       
        //    44: istore          11
        //    46: iconst_0       
        //    47: istore          12
        //    49: iload           11
        //    51: iload           10
        //    53: if_icmpge       167
        //    56: aload_2        
        //    57: iload           11
        //    59: aaload         
        //    60: astore          16
        //    62: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //    65: iconst_1       
        //    66: aaload         
        //    67: aload           16
        //    69: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    72: ifeq            231
        //    75: aload           8
        //    77: iload           12
        //    79: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //    82: iconst_2       
        //    83: aaload         
        //    84: aastore        
        //    85: iload           12
        //    87: iconst_1       
        //    88: iadd           
        //    89: istore          18
        //    91: aload           9
        //    93: iload           12
        //    95: aload           7
        //    97: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   100: aastore        
        //   101: iload           6
        //   103: ifeq            224
        //   106: iconst_1       
        //   107: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   110: iadd           
        //   111: putstatic       android/support/v4/app/FragmentActivity.a:I
        //   114: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //   117: iconst_0       
        //   118: aaload         
        //   119: aload           16
        //   121: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   124: ifeq            224
        //   127: aload           8
        //   129: iload           18
        //   131: getstatic       android/support/v4/content/FileProvider.z:[Ljava/lang/String;
        //   134: iconst_3       
        //   135: aaload         
        //   136: aastore        
        //   137: iload           18
        //   139: iconst_1       
        //   140: iadd           
        //   141: istore          12
        //   143: aload           9
        //   145: iload           18
        //   147: aload           7
        //   149: invokevirtual   java/io/File.length:()J
        //   152: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   155: aastore        
        //   156: iload           11
        //   158: iconst_1       
        //   159: iadd           
        //   160: istore          20
        //   162: iload           6
        //   164: ifeq            217
        //   167: aload           8
        //   169: iload           12
        //   171: invokestatic    android/support/v4/content/FileProvider.copyOf:([Ljava/lang/String;I)[Ljava/lang/String;
        //   174: astore          13
        //   176: aload           9
        //   178: iload           12
        //   180: invokestatic    android/support/v4/content/FileProvider.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   183: astore          14
        //   185: new             Landroid/database/MatrixCursor;
        //   188: dup            
        //   189: aload           13
        //   191: iconst_1       
        //   192: invokespecial   android/database/MatrixCursor.<init>:([Ljava/lang/String;I)V
        //   195: astore          15
        //   197: aload           15
        //   199: aload           14
        //   201: invokevirtual   android/database/MatrixCursor.addRow:([Ljava/lang/Object;)V
        //   204: aload           15
        //   206: areturn        
        //   207: astore          17
        //   209: aload           17
        //   211: athrow         
        //   212: astore          19
        //   214: aload           19
        //   216: athrow         
        //   217: iload           20
        //   219: istore          11
        //   221: goto            49
        //   224: iload           18
        //   226: istore          12
        //   228: goto            156
        //   231: iload           12
        //   233: istore          18
        //   235: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  62     85     207    212    Ljava/lang/SecurityException;
        //  91     101    207    212    Ljava/lang/SecurityException;
        //  114    137    212    217    Ljava/lang/SecurityException;
        //  143    156    212    217    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException(FileProvider.z[4]);
    }
}
