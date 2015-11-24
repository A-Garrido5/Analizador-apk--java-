// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.aJ;
import com.google.dg;
import com.google.a8;
import com.google.ch;
import com.google.ep;
import com.google.fm;
import com.google.ci;
import java.io.InputStream;
import com.google.bl;
import com.google.fp;
import com.google.fu;
import com.google.cL;
import com.google.ce;
import com.google.hv;
import com.google.du;
import com.google.dS;

public final class E2E$Message$SenderKeyDistributionMessage extends dS implements E2E$Message$SenderKeyDistributionMessageOrBuilder
{
    public static final int AXOLOTL_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    public static du PARSER;
    private static final E2E$Message$SenderKeyDistributionMessage defaultInstance;
    private static final long serialVersionUID;
    private hv axolotlSenderKeyDistributionMessage_;
    private int bitField0_;
    private Object groupId_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ce unknownFields;
    
    static {
        E2E$Message$SenderKeyDistributionMessage.PARSER = new E2E$Message$SenderKeyDistributionMessage$1();
        (defaultInstance = new E2E$Message$SenderKeyDistributionMessage(true)).initFields();
    }
    
    private E2E$Message$SenderKeyDistributionMessage(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   com/google/dS.<init>:()V
        //     8: aload_0        
        //     9: iconst_m1      
        //    10: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.memoizedIsInitialized:B
        //    13: aload_0        
        //    14: iconst_m1      
        //    15: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.memoizedSerializedSize:I
        //    18: aload_0        
        //    19: invokespecial   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.initFields:()V
        //    22: invokestatic    com/google/ce.g:()Lcom/google/aY;
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: ifne            148
        //    35: aload_1        
        //    36: invokevirtual   com/google/cL.a:()I
        //    39: istore          9
        //    41: iload           9
        //    43: lookupswitch {
        //                0: 162
        //               10: 100
        //               18: 126
        //          default: 76
        //        }
        //    76: aload_0        
        //    77: aload_1        
        //    78: aload           4
        //    80: aload_2        
        //    81: iload           9
        //    83: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.a:(Lcom/google/cL;Lcom/google/aY;Lcom/google/fu;I)Z
        //    86: istore          11
        //    88: iload           11
        //    90: ifne            144
        //    93: iload_3        
        //    94: ifeq            228
        //    97: iconst_1       
        //    98: istore          5
        //   100: aload_1        
        //   101: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   104: astore          12
        //   106: aload_0        
        //   107: iconst_1       
        //   108: aload_0        
        //   109: getfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.bitField0_:I
        //   112: ior            
        //   113: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.bitField0_:I
        //   116: aload_0        
        //   117: aload           12
        //   119: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.groupId_:Ljava/lang/Object;
        //   122: iload_3        
        //   123: ifeq            144
        //   126: aload_0        
        //   127: iconst_2       
        //   128: aload_0        
        //   129: getfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.bitField0_:I
        //   132: ior            
        //   133: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.bitField0_:I
        //   136: aload_0        
        //   137: aload_1        
        //   138: invokevirtual   com/google/cL.e:()Lcom/google/hv;
        //   141: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.axolotlSenderKeyDistributionMessage_:Lcom/google/hv;
        //   144: iload_3        
        //   145: ifeq            30
        //   148: aload_0        
        //   149: aload           4
        //   151: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   154: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.unknownFields:Lcom/google/ce;
        //   157: aload_0        
        //   158: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.c:()V
        //   161: return         
        //   162: iload_3        
        //   163: ifeq            228
        //   166: iconst_1       
        //   167: istore          5
        //   169: goto            76
        //   172: astore          10
        //   174: aload           10
        //   176: athrow         
        //   177: astore          8
        //   179: aload           8
        //   181: aload_0        
        //   182: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   185: athrow         
        //   186: astore          7
        //   188: aload_0        
        //   189: aload           4
        //   191: invokevirtual   com/google/aY.g:()Lcom/google/ce;
        //   194: putfield        com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.unknownFields:Lcom/google/ce;
        //   197: aload_0        
        //   198: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.c:()V
        //   201: aload           7
        //   203: athrow         
        //   204: astore          13
        //   206: aload           13
        //   208: athrow         
        //   209: astore          6
        //   211: new             Lcom/google/bg;
        //   214: dup            
        //   215: aload           6
        //   217: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   220: invokespecial   com/google/bg.<init>:(Ljava/lang/String;)V
        //   223: aload_0        
        //   224: invokevirtual   com/google/bg.a:(Lcom/google/ci;)Lcom/google/bg;
        //   227: athrow         
        //   228: iconst_1       
        //   229: istore          5
        //   231: goto            144
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     41     177    186    Lcom/google/bg;
        //  35     41     209    228    Ljava/io/IOException;
        //  35     41     186    204    Any
        //  76     88     172    177    Lcom/google/bg;
        //  76     88     209    228    Ljava/io/IOException;
        //  76     88     186    204    Any
        //  100    106    177    186    Lcom/google/bg;
        //  100    106    209    228    Ljava/io/IOException;
        //  100    106    186    204    Any
        //  106    122    204    209    Lcom/google/bg;
        //  106    122    209    228    Ljava/io/IOException;
        //  106    122    186    204    Any
        //  126    144    204    209    Lcom/google/bg;
        //  126    144    209    228    Ljava/io/IOException;
        //  126    144    186    204    Any
        //  174    177    177    186    Lcom/google/bg;
        //  174    177    209    228    Ljava/io/IOException;
        //  174    177    186    204    Any
        //  179    186    186    204    Any
        //  206    209    177    186    Lcom/google/bg;
        //  206    209    209    228    Ljava/io/IOException;
        //  206    209    186    204    Any
        //  211    228    186    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    E2E$Message$SenderKeyDistributionMessage(final cL cl, final fu fu, final E2E$1 e2E$1) {
        this(cl, fu);
    }
    
    private E2E$Message$SenderKeyDistributionMessage(final fp fp) {
        super(fp);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = fp.getUnknownFields();
    }
    
    E2E$Message$SenderKeyDistributionMessage(final fp fp, final E2E$1 e2E$1) {
        this(fp);
    }
    
    private E2E$Message$SenderKeyDistributionMessage(final boolean b) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ce.d();
    }
    
    static Object access$1000(final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage) {
        return e2E$Message$SenderKeyDistributionMessage.groupId_;
    }
    
    static Object access$1002(final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage, final Object groupId_) {
        return e2E$Message$SenderKeyDistributionMessage.groupId_ = groupId_;
    }
    
    static hv access$1102(final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage, final hv axolotlSenderKeyDistributionMessage_) {
        return e2E$Message$SenderKeyDistributionMessage.axolotlSenderKeyDistributionMessage_ = axolotlSenderKeyDistributionMessage_;
    }
    
    static int access$1202(final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage, final int bitField0_) {
        return e2E$Message$SenderKeyDistributionMessage.bitField0_ = bitField0_;
    }
    
    static boolean access$800() {
        return E2E$Message$SenderKeyDistributionMessage.d;
    }
    
    public static E2E$Message$SenderKeyDistributionMessage getDefaultInstance() {
        return E2E$Message$SenderKeyDistributionMessage.defaultInstance;
    }
    
    public static final bl getDescriptor() {
        return E2E.access$300();
    }
    
    private void initFields() {
        this.groupId_ = "";
        this.axolotlSenderKeyDistributionMessage_ = hv.b;
    }
    
    public static E2E$Message$SenderKeyDistributionMessage$Builder newBuilder() {
        return E2E$Message$SenderKeyDistributionMessage$Builder.access$600();
    }
    
    public static E2E$Message$SenderKeyDistributionMessage$Builder newBuilder(final E2E$Message$SenderKeyDistributionMessage e2E$Message$SenderKeyDistributionMessage) {
        return newBuilder().mergeFrom(e2E$Message$SenderKeyDistributionMessage);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseDelimitedFrom(final InputStream inputStream) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.b(inputStream);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseDelimitedFrom(final InputStream inputStream, final fu fu) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(inputStream, fu);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final cL cl) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(cl);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final cL cl, final fu fu) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(cl, fu);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final hv hv) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(hv);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final hv hv, final fu fu) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(hv, fu);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final InputStream inputStream) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(inputStream);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final InputStream inputStream, final fu fu) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.b(inputStream, fu);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final byte[] array) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(array);
    }
    
    public static E2E$Message$SenderKeyDistributionMessage parseFrom(final byte[] array, final fu fu) {
        return (E2E$Message$SenderKeyDistributionMessage)E2E$Message$SenderKeyDistributionMessage.PARSER.a(array, fu);
    }
    
    @Override
    public hv getAxolotlSenderKeyDistributionMessage() {
        return this.axolotlSenderKeyDistributionMessage_;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage getDefaultInstanceForType() {
        return E2E$Message$SenderKeyDistributionMessage.defaultInstance;
    }
    
    @Override
    public String getGroupId() {
        final Object groupId_ = this.groupId_;
        if (groupId_ instanceof String) {
            return (String)groupId_;
        }
        final hv hv = (hv)groupId_;
        final String i = hv.i();
        if (hv.b()) {
            this.groupId_ = i;
        }
        return i;
    }
    
    @Override
    public hv getGroupIdBytes() {
        final Object groupId_ = this.groupId_;
        if (groupId_ instanceof String) {
            return (hv)(this.groupId_ = hv.b((String)groupId_));
        }
        return (hv)groupId_;
    }
    
    @Override
    public du getParserForType() {
        return E2E$Message$SenderKeyDistributionMessage.PARSER;
    }
    
    @Override
    public int getSerializedSize() {
        final int memoizedSerializedSize = this.memoizedSerializedSize;
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        final int n = 0x1 & this.bitField0_;
        int n2 = 0;
        if (n == 1) {
            n2 = 0 + ep.b(1, this.getGroupIdBytes());
        }
        if ((0x2 & this.bitField0_) == 0x2) {
            n2 += ep.b(2, this.axolotlSenderKeyDistributionMessage_);
        }
        return this.memoizedSerializedSize = n2 + this.getUnknownFields().getSerializedSize();
    }
    
    @Override
    public final ce getUnknownFields() {
        return this.unknownFields;
    }
    
    @Override
    public boolean hasAxolotlSenderKeyDistributionMessage() {
        return (0x2 & this.bitField0_) == 0x2;
    }
    
    @Override
    public boolean hasGroupId() {
        return (0x1 & this.bitField0_) == 0x1;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return E2E.access$400().a(E2E$Message$SenderKeyDistributionMessage.class, E2E$Message$SenderKeyDistributionMessage$Builder.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final byte memoizedIsInitialized = this.memoizedIsInitialized;
        if (memoizedIsInitialized == 1) {
            return true;
        }
        if (memoizedIsInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }
    
    @Override
    public a8 newBuilderForType() {
        return this.newBuilderForType();
    }
    
    @Override
    protected a8 newBuilderForType(final dg dg) {
        return this.newBuilderForType(dg);
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.newBuilderForType();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder newBuilderForType() {
        return newBuilder();
    }
    
    @Override
    protected E2E$Message$SenderKeyDistributionMessage$Builder newBuilderForType(final dg dg) {
        return new E2E$Message$SenderKeyDistributionMessage$Builder(dg, null);
    }
    
    @Override
    public a8 toBuilder() {
        return this.toBuilder();
    }
    
    @Override
    public aJ toBuilder() {
        return this.toBuilder();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage$Builder toBuilder() {
        return newBuilder(this);
    }
    
    @Override
    protected Object writeReplace() {
        return super.writeReplace();
    }
    
    @Override
    public void writeTo(final ep ep) {
        this.getSerializedSize();
        if ((0x1 & this.bitField0_) == 0x1) {
            ep.c(1, this.getGroupIdBytes());
        }
        if ((0x2 & this.bitField0_) == 0x2) {
            ep.c(2, this.axolotlSenderKeyDistributionMessage_);
        }
        this.getUnknownFields().writeTo(ep);
    }
}
