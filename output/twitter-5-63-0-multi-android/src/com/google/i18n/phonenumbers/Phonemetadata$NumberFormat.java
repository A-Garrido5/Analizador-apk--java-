// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;
import java.io.Externalizable;

public class Phonemetadata$NumberFormat implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private String domesticCarrierCodeFormattingRule_;
    private String format_;
    private boolean hasDomesticCarrierCodeFormattingRule;
    private boolean hasFormat;
    private boolean hasNationalPrefixFormattingRule;
    private boolean hasNationalPrefixOptionalWhenFormatting;
    private boolean hasPattern;
    private List leadingDigitsPattern_;
    private String nationalPrefixFormattingRule_;
    private boolean nationalPrefixOptionalWhenFormatting_;
    private String pattern_;
    
    public Phonemetadata$NumberFormat() {
        this.pattern_ = "";
        this.format_ = "";
        this.leadingDigitsPattern_ = new ArrayList();
        this.nationalPrefixFormattingRule_ = "";
        this.nationalPrefixOptionalWhenFormatting_ = false;
        this.domesticCarrierCodeFormattingRule_ = "";
    }
    
    public Phonemetadata$NumberFormat a(final String pattern_) {
        this.hasPattern = true;
        this.pattern_ = pattern_;
        return this;
    }
    
    public Phonemetadata$NumberFormat a(final boolean nationalPrefixOptionalWhenFormatting_) {
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = nationalPrefixOptionalWhenFormatting_;
        return this;
    }
    
    public String a() {
        return this.pattern_;
    }
    
    public String a(final int n) {
        return this.leadingDigitsPattern_.get(n);
    }
    
    public Phonemetadata$NumberFormat b(final String format_) {
        this.hasFormat = true;
        this.format_ = format_;
        return this;
    }
    
    public String b() {
        return this.format_;
    }
    
    public int c() {
        return this.leadingDigitsPattern_.size();
    }
    
    public Phonemetadata$NumberFormat c(final String nationalPrefixFormattingRule_) {
        this.hasNationalPrefixFormattingRule = true;
        this.nationalPrefixFormattingRule_ = nationalPrefixFormattingRule_;
        return this;
    }
    
    public Phonemetadata$NumberFormat d(final String domesticCarrierCodeFormattingRule_) {
        this.hasDomesticCarrierCodeFormattingRule = true;
        this.domesticCarrierCodeFormattingRule_ = domesticCarrierCodeFormattingRule_;
        return this;
    }
    
    public String d() {
        return this.nationalPrefixFormattingRule_;
    }
    
    public boolean e() {
        return this.nationalPrefixOptionalWhenFormatting_;
    }
    
    public String f() {
        return this.domesticCarrierCodeFormattingRule_;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.a(objectInput.readUTF());
        this.b(objectInput.readUTF());
        for (int int1 = objectInput.readInt(), i = 0; i < int1; ++i) {
            this.leadingDigitsPattern_.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.c(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.d(objectInput.readUTF());
        }
        this.a(objectInput.readBoolean());
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        final int c = this.c();
        objectOutput.writeInt(c);
        for (int i = 0; i < c; ++i) {
            objectOutput.writeUTF((String)this.leadingDigitsPattern_.get(i));
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}
