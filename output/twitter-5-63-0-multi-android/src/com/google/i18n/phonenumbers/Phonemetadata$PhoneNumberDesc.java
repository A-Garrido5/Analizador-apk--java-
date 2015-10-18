// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Phonemetadata$PhoneNumberDesc implements Externalizable
{
    private static final long serialVersionUID = 1L;
    private String exampleNumber_;
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private boolean hasPossibleNumberPattern;
    private String nationalNumberPattern_;
    private String possibleNumberPattern_;
    
    public Phonemetadata$PhoneNumberDesc() {
        this.nationalNumberPattern_ = "";
        this.possibleNumberPattern_ = "";
        this.exampleNumber_ = "";
    }
    
    public Phonemetadata$PhoneNumberDesc a(final String nationalNumberPattern_) {
        this.hasNationalNumberPattern = true;
        this.nationalNumberPattern_ = nationalNumberPattern_;
        return this;
    }
    
    public String a() {
        return this.nationalNumberPattern_;
    }
    
    public Phonemetadata$PhoneNumberDesc b(final String possibleNumberPattern_) {
        this.hasPossibleNumberPattern = true;
        this.possibleNumberPattern_ = possibleNumberPattern_;
        return this;
    }
    
    public String b() {
        return this.possibleNumberPattern_;
    }
    
    public Phonemetadata$PhoneNumberDesc c(final String exampleNumber_) {
        this.hasExampleNumber = true;
        this.exampleNumber_ = exampleNumber_;
        return this;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            this.a(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.b(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            this.c(objectInput.readUTF());
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasNationalNumberPattern);
        if (this.hasNationalNumberPattern) {
            objectOutput.writeUTF(this.nationalNumberPattern_);
        }
        objectOutput.writeBoolean(this.hasPossibleNumberPattern);
        if (this.hasPossibleNumberPattern) {
            objectOutput.writeUTF(this.possibleNumberPattern_);
        }
        objectOutput.writeBoolean(this.hasExampleNumber);
        if (this.hasExampleNumber) {
            objectOutput.writeUTF(this.exampleNumber_);
        }
    }
}
