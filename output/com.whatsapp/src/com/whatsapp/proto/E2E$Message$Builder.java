// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.bg;
import com.google.fu;
import com.google.cL;
import com.google.ch;
import com.google.hv;
import com.google.fE;
import com.google.aJ;
import com.google.a8;
import com.google.fx;
import com.google.fm;
import com.google.ci;
import com.google.dS;
import com.google.bl;
import com.google.dg;
import com.google.aA;
import com.google.fp;

public final class E2E$Message$Builder extends fp implements E2E$MessageOrBuilder
{
    private int bitField0_;
    private Object conversation_;
    private aA senderKeyDistributionMessageBuilder_;
    private E2E$Message$SenderKeyDistributionMessage senderKeyDistributionMessage_;
    
    private E2E$Message$Builder() {
        this.conversation_ = "";
        this.senderKeyDistributionMessage_ = E2E$Message$SenderKeyDistributionMessage.getDefaultInstance();
        this.maybeForceBuilderInitialization();
    }
    
    private E2E$Message$Builder(final dg dg) {
        super(dg);
        this.conversation_ = "";
        this.senderKeyDistributionMessage_ = E2E$Message$SenderKeyDistributionMessage.getDefaultInstance();
        this.maybeForceBuilderInitialization();
    }
    
    E2E$Message$Builder(final dg dg, final E2E$1 e2E$1) {
        this(dg);
    }
    
    static E2E$Message$Builder access$1300() {
        return create();
    }
    
    private static E2E$Message$Builder create() {
        return new E2E$Message$Builder();
    }
    
    public static final bl getDescriptor() {
        return E2E.access$000();
    }
    
    private aA getSenderKeyDistributionMessageFieldBuilder() {
        try {
            if (this.senderKeyDistributionMessageBuilder_ == null) {
                this.senderKeyDistributionMessageBuilder_ = new aA(this.getSenderKeyDistributionMessage(), this.a(), this.f());
                this.senderKeyDistributionMessage_ = null;
            }
            return this.senderKeyDistributionMessageBuilder_;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void maybeForceBuilderInitialization() {
        try {
            if (E2E$Message.access$1500()) {
                this.getSenderKeyDistributionMessageFieldBuilder();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    @Override
    public ci build() {
        return this.build();
    }
    
    @Override
    public fm build() {
        return this.build();
    }
    
    @Override
    public E2E$Message build() {
        final E2E$Message buildPartial = this.buildPartial();
        try {
            if (!buildPartial.isInitialized()) {
                throw fx.a(buildPartial);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return buildPartial;
    }
    
    @Override
    public ci buildPartial() {
        return this.buildPartial();
    }
    
    @Override
    public fm buildPartial() {
        return this.buildPartial();
    }
    
    @Override
    public E2E$Message buildPartial() {
        int n = 1;
        final boolean e = E2E$Message.e;
        final E2E$Message e2E$Message = new E2E$Message(this, null);
        final int bitField0_ = this.bitField0_;
        if ((bitField0_ & 0x1) != n) {
            n = 0;
        }
        E2E$Message.access$1702(e2E$Message, this.conversation_);
        while (true) {
            Label_0113: {
                if ((bitField0_ & 0x2) != 0x2) {
                    break Label_0113;
                }
                final int n2 = n | 0x2;
                try {
                    Label_0095: {
                        if (this.senderKeyDistributionMessageBuilder_ == null) {
                            E2E$Message.access$1802(e2E$Message, this.senderKeyDistributionMessage_);
                            if (!e) {
                                break Label_0095;
                            }
                            ++E2E.a;
                        }
                        E2E$Message.access$1802(e2E$Message, (E2E$Message$SenderKeyDistributionMessage)this.senderKeyDistributionMessageBuilder_.a());
                    }
                    E2E$Message.access$1902(e2E$Message, n2);
                    this.b();
                    return e2E$Message;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            final int n2 = n;
            continue;
        }
    }
    
    public a8 clear() {
        return this.clear();
    }
    
    public aJ clear() {
        return this.clear();
    }
    
    @Override
    public fp clear() {
        return this.clear();
    }
    
    public fx clear() {
        return this.clear();
    }
    
    @Override
    public E2E$Message$Builder clear() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/fp.clear:()Lcom/google/fp;
        //     4: pop            
        //     5: aload_0        
        //     6: ldc             ""
        //     8: putfield        com/whatsapp/proto/E2E$Message$Builder.conversation_:Ljava/lang/Object;
        //    11: aload_0        
        //    12: bipush          -2
        //    14: aload_0        
        //    15: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    18: iand           
        //    19: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    22: aload_0        
        //    23: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //    26: astore          4
        //    28: aload           4
        //    30: ifnonnull       46
        //    33: aload_0        
        //    34: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getDefaultInstance:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    37: putfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    40: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //    43: ifeq            54
        //    46: aload_0        
        //    47: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //    50: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    53: pop            
        //    54: aload_0        
        //    55: bipush          -3
        //    57: aload_0        
        //    58: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    61: iand           
        //    62: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    65: aload_0        
        //    66: areturn        
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      28     67     70     Ljava/lang/NullPointerException;
        //  33     46     70     73     Ljava/lang/NullPointerException;
        //  46     54     70     73     Ljava/lang/NullPointerException;
        //  68     70     70     73     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public E2E$Message$Builder clearConversation() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.conversation_ = E2E$Message.getDefaultInstance().getConversation();
        this.c();
        return this;
    }
    
    public E2E$Message$Builder clearSenderKeyDistributionMessage() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       26
        //     9: aload_0        
        //    10: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getDefaultInstance:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    13: putfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    16: aload_0        
        //    17: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.c:()V
        //    20: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //    23: ifeq            34
        //    26: aload_0        
        //    27: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //    30: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //    33: pop            
        //    34: aload_0        
        //    35: bipush          -3
        //    37: aload_0        
        //    38: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    41: iand           
        //    42: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    45: aload_0        
        //    46: areturn        
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      47     50     Ljava/lang/NullPointerException;
        //  9      26     50     53     Ljava/lang/NullPointerException;
        //  26     34     50     53     Ljava/lang/NullPointerException;
        //  48     50     50     53     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    @Override
    public a8 clone() {
        return this.clone();
    }
    
    @Override
    public aJ clone() {
        return this.clone();
    }
    
    @Override
    public fE clone() {
        return this.clone();
    }
    
    @Override
    public fp clone() {
        return this.clone();
    }
    
    @Override
    public fx clone() {
        return this.clone();
    }
    
    @Override
    public E2E$Message$Builder clone() {
        return create().mergeFrom(this.buildPartial());
    }
    
    @Override
    public Object clone() {
        return this.clone();
    }
    
    @Override
    public String getConversation() {
        final Object conversation_ = this.conversation_;
        if (!(conversation_ instanceof String)) {
            final hv hv = (hv)conversation_;
            final String i = hv.i();
            try {
                if (hv.b()) {
                    this.conversation_ = i;
                }
                return i;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return (String)conversation_;
    }
    
    @Override
    public hv getConversationBytes() {
        final Object conversation_ = this.conversation_;
        if (conversation_ instanceof String) {
            return (hv)(this.conversation_ = hv.b((String)conversation_));
        }
        return (hv)conversation_;
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
    public E2E$Message getDefaultInstanceForType() {
        return E2E$Message.getDefaultInstance();
    }
    
    @Override
    public bl getDescriptorForType() {
        return E2E.access$000();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessage getSenderKeyDistributionMessage() {
        try {
            if (this.senderKeyDistributionMessageBuilder_ == null) {
                return this.senderKeyDistributionMessage_;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return (E2E$Message$SenderKeyDistributionMessage)this.senderKeyDistributionMessageBuilder_.b();
    }
    
    public E2E$Message$SenderKeyDistributionMessage$Builder getSenderKeyDistributionMessageBuilder() {
        this.bitField0_ |= 0x2;
        this.c();
        return (E2E$Message$SenderKeyDistributionMessage$Builder)this.getSenderKeyDistributionMessageFieldBuilder().f();
    }
    
    @Override
    public E2E$Message$SenderKeyDistributionMessageOrBuilder getSenderKeyDistributionMessageOrBuilder() {
        try {
            if (this.senderKeyDistributionMessageBuilder_ != null) {
                return (E2E$Message$SenderKeyDistributionMessageOrBuilder)this.senderKeyDistributionMessageBuilder_.e();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.senderKeyDistributionMessage_;
    }
    
    @Override
    public boolean hasConversation() {
        try {
            if ((this.bitField0_ & 0x1) == 0x1) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public boolean hasSenderKeyDistributionMessage() {
        try {
            if ((this.bitField0_ & 0x2) == 0x2) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return E2E.access$100().a(E2E$Message.class, E2E$Message$Builder.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
    }
    
    @Override
    public a8 mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.mergeFrom(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        return this.mergeFrom(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.mergeFrom(fm);
    }
    
    @Override
    public E2E$Message$Builder mergeFrom(final cL cl, final fu fu) {
        while (true) {
            try {
                E2E$Message e2E$Message3;
                Throwable t;
                try {
                    final E2E$Message e2E$Message = (E2E$Message)E2E$Message.PARSER.parsePartialFrom(cl, fu);
                    if (e2E$Message == null) {
                        return this;
                    }
                    try {
                        this.mergeFrom(e2E$Message);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final E2E$Message e2E$Message2 = (E2E$Message)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        e2E$Message3 = e2E$Message2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (e2E$Message3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.mergeFrom(e2E$Message3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final E2E$Message e2E$Message3 = null;
                continue;
            }
            break;
        }
    }
    
    @Override
    public E2E$Message$Builder mergeFrom(final fm fm) {
        try {
            if (fm instanceof E2E$Message) {
                return this.mergeFrom((E2E$Message)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public E2E$Message$Builder mergeFrom(final E2E$Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/proto/E2E$Message.getDefaultInstance:()Lcom/whatsapp/proto/E2E$Message;
        //     3: astore_3       
        //     4: aload_1        
        //     5: aload_3        
        //     6: if_acmpne       14
        //     9: aload_0        
        //    10: areturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_1        
        //    15: invokevirtual   com/whatsapp/proto/E2E$Message.hasConversation:()Z
        //    18: ifeq            43
        //    21: aload_0        
        //    22: iconst_1       
        //    23: aload_0        
        //    24: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    27: ior            
        //    28: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokestatic    com/whatsapp/proto/E2E$Message.access$1700:(Lcom/whatsapp/proto/E2E$Message;)Ljava/lang/Object;
        //    36: putfield        com/whatsapp/proto/E2E$Message$Builder.conversation_:Ljava/lang/Object;
        //    39: aload_0        
        //    40: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.c:()V
        //    43: aload_1        
        //    44: invokevirtual   com/whatsapp/proto/E2E$Message.hasSenderKeyDistributionMessage:()Z
        //    47: ifeq            59
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokevirtual   com/whatsapp/proto/E2E$Message.getSenderKeyDistributionMessage:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    55: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.mergeSenderKeyDistributionMessage:(Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;)Lcom/whatsapp/proto/E2E$Message$Builder;
        //    58: pop            
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   com/whatsapp/proto/E2E$Message.getUnknownFields:()Lcom/google/ce;
        //    64: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.b:(Lcom/google/ce;)Lcom/google/fp;
        //    67: pop            
        //    68: aload_0        
        //    69: areturn        
        //    70: astore          4
        //    72: aload           4
        //    74: athrow         
        //    75: astore          5
        //    77: aload           5
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     43     70     75     Ljava/lang/NullPointerException;
        //  43     59     75     80     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public E2E$Message$Builder mergeSenderKeyDistributionMessage(final E2E$Message$SenderKeyDistributionMessage p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       82
        //    15: aload_0        
        //    16: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    19: istore          10
        //    21: iload           10
        //    23: iconst_2       
        //    24: iand           
        //    25: iconst_2       
        //    26: if_icmpne       69
        //    29: aload_0        
        //    30: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    33: astore          11
        //    35: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.getDefaultInstance:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    38: astore          12
        //    40: aload           11
        //    42: aload           12
        //    44: if_acmpeq       69
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    52: invokestatic    com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage.newBuilder:(Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;)Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder;
        //    55: aload_1        
        //    56: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.mergeFrom:(Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;)Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder;
        //    59: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.buildPartial:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    62: putfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    65: iload_2        
        //    66: ifeq            74
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    74: aload_0        
        //    75: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.c:()V
        //    78: iload_2        
        //    79: ifeq            91
        //    82: aload_0        
        //    83: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //    86: aload_1        
        //    87: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    90: pop            
        //    91: aload_0        
        //    92: iconst_2       
        //    93: aload_0        
        //    94: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    97: ior            
        //    98: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //   101: aload_0        
        //   102: areturn        
        //   103: astore_3       
        //   104: aload_3        
        //   105: athrow         
        //   106: astore          4
        //   108: aload           4
        //   110: athrow         
        //   111: astore          5
        //   113: aload           5
        //   115: athrow         
        //   116: astore          6
        //   118: aload           6
        //   120: athrow         
        //   121: astore          8
        //   123: aload           8
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     103    106    Ljava/lang/NullPointerException;
        //  15     21     106    111    Ljava/lang/NullPointerException;
        //  29     40     111    116    Ljava/lang/NullPointerException;
        //  47     65     116    121    Ljava/lang/NullPointerException;
        //  69     74     116    121    Ljava/lang/NullPointerException;
        //  74     78     121    126    Ljava/lang/NullPointerException;
        //  82     91     121    126    Ljava/lang/NullPointerException;
        //  104    106    106    111    Ljava/lang/NullPointerException;
        //  108    111    111    116    Ljava/lang/NullPointerException;
        //  113    116    116    121    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public E2E$Message$Builder setConversation(final String conversation_) {
        if (conversation_ == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.bitField0_ |= 0x1;
        this.conversation_ = conversation_;
        this.c();
        return this;
    }
    
    public E2E$Message$Builder setConversationBytes(final hv conversation_) {
        if (conversation_ == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.bitField0_ |= 0x1;
        this.conversation_ = conversation_;
        this.c();
        return this;
    }
    
    public E2E$Message$Builder setSenderKeyDistributionMessage(final E2E$Message$SenderKeyDistributionMessage$Builder p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       29
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.build:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    16: putfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessage_:Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    19: aload_0        
        //    20: invokevirtual   com/whatsapp/proto/E2E$Message$Builder.c:()V
        //    23: getstatic       com/whatsapp/proto/E2E$Message.e:Z
        //    26: ifeq            41
        //    29: aload_0        
        //    30: getfield        com/whatsapp/proto/E2E$Message$Builder.senderKeyDistributionMessageBuilder_:Lcom/google/aA;
        //    33: aload_1        
        //    34: invokevirtual   com/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage$Builder.build:()Lcom/whatsapp/proto/E2E$Message$SenderKeyDistributionMessage;
        //    37: invokevirtual   com/google/aA.b:(Lcom/google/dS;)Lcom/google/aA;
        //    40: pop            
        //    41: aload_0        
        //    42: iconst_2       
        //    43: aload_0        
        //    44: getfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    47: ior            
        //    48: putfield        com/whatsapp/proto/E2E$Message$Builder.bitField0_:I
        //    51: aload_0        
        //    52: areturn        
        //    53: astore_2       
        //    54: aload_2        
        //    55: athrow         
        //    56: astore_3       
        //    57: aload_3        
        //    58: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      53     56     Ljava/lang/NullPointerException;
        //  11     29     56     59     Ljava/lang/NullPointerException;
        //  29     41     56     59     Ljava/lang/NullPointerException;
        //  54     56     56     59     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    public E2E$Message$Builder setSenderKeyDistributionMessage(final E2E$Message$SenderKeyDistributionMessage senderKeyDistributionMessage_) {
        Label_0044: {
            try {
                if (this.senderKeyDistributionMessageBuilder_ != null) {
                    break Label_0044;
                }
                if (senderKeyDistributionMessage_ == null) {
                    try {
                        throw new NullPointerException();
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            try {
                this.senderKeyDistributionMessage_ = senderKeyDistributionMessage_;
                this.c();
                if (E2E$Message.e) {
                    this.senderKeyDistributionMessageBuilder_.b(senderKeyDistributionMessage_);
                }
                this.bitField0_ |= 0x2;
                return this;
            }
            catch (NullPointerException ex3) {
                throw ex3;
            }
        }
    }
}
