// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShortAbilityHashPair.proto

package emu.grasscutter.net.proto;

public final class ShortAbilityHashPairOuterClass {
  private ShortAbilityHashPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShortAbilityHashPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShortAbilityHashPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>sfixed32 OMPEBEMNKLG = 13;</code>
     * @return The oMPEBEMNKLG.
     */
    int getOMPEBEMNKLG();

    /**
     * <code>sfixed32 ability_name_hash = 15;</code>
     * @return The abilityNameHash.
     */
    int getAbilityNameHash();
  }
  /**
   * Protobuf type {@code ShortAbilityHashPair}
   */
  public static final class ShortAbilityHashPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShortAbilityHashPair)
      ShortAbilityHashPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShortAbilityHashPair.newBuilder() to construct.
    private ShortAbilityHashPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShortAbilityHashPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShortAbilityHashPair();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShortAbilityHashPair(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 109: {

              oMPEBEMNKLG_ = input.readSFixed32();
              break;
            }
            case 125: {

              abilityNameHash_ = input.readSFixed32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.class, emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.Builder.class);
    }

    public static final int OMPEBEMNKLG_FIELD_NUMBER = 13;
    private int oMPEBEMNKLG_;
    /**
     * <code>sfixed32 OMPEBEMNKLG = 13;</code>
     * @return The oMPEBEMNKLG.
     */
    @java.lang.Override
    public int getOMPEBEMNKLG() {
      return oMPEBEMNKLG_;
    }

    public static final int ABILITY_NAME_HASH_FIELD_NUMBER = 15;
    private int abilityNameHash_;
    /**
     * <code>sfixed32 ability_name_hash = 15;</code>
     * @return The abilityNameHash.
     */
    @java.lang.Override
    public int getAbilityNameHash() {
      return abilityNameHash_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (oMPEBEMNKLG_ != 0) {
        output.writeSFixed32(13, oMPEBEMNKLG_);
      }
      if (abilityNameHash_ != 0) {
        output.writeSFixed32(15, abilityNameHash_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oMPEBEMNKLG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(13, oMPEBEMNKLG_);
      }
      if (abilityNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(15, abilityNameHash_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair other = (emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) obj;

      if (getOMPEBEMNKLG()
          != other.getOMPEBEMNKLG()) return false;
      if (getAbilityNameHash()
          != other.getAbilityNameHash()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OMPEBEMNKLG_FIELD_NUMBER;
      hash = (53 * hash) + getOMPEBEMNKLG();
      hash = (37 * hash) + ABILITY_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityNameHash();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ShortAbilityHashPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShortAbilityHashPair)
        emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.class, emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oMPEBEMNKLG_ = 0;

        abilityNameHash_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.internal_static_ShortAbilityHashPair_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair build() {
        emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair buildPartial() {
        emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair result = new emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair(this);
        result.oMPEBEMNKLG_ = oMPEBEMNKLG_;
        result.abilityNameHash_ = abilityNameHash_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) {
          return mergeFrom((emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair other) {
        if (other == emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair.getDefaultInstance()) return this;
        if (other.getOMPEBEMNKLG() != 0) {
          setOMPEBEMNKLG(other.getOMPEBEMNKLG());
        }
        if (other.getAbilityNameHash() != 0) {
          setAbilityNameHash(other.getAbilityNameHash());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oMPEBEMNKLG_ ;
      /**
       * <code>sfixed32 OMPEBEMNKLG = 13;</code>
       * @return The oMPEBEMNKLG.
       */
      @java.lang.Override
      public int getOMPEBEMNKLG() {
        return oMPEBEMNKLG_;
      }
      /**
       * <code>sfixed32 OMPEBEMNKLG = 13;</code>
       * @param value The oMPEBEMNKLG to set.
       * @return This builder for chaining.
       */
      public Builder setOMPEBEMNKLG(int value) {
        
        oMPEBEMNKLG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>sfixed32 OMPEBEMNKLG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMPEBEMNKLG() {
        
        oMPEBEMNKLG_ = 0;
        onChanged();
        return this;
      }

      private int abilityNameHash_ ;
      /**
       * <code>sfixed32 ability_name_hash = 15;</code>
       * @return The abilityNameHash.
       */
      @java.lang.Override
      public int getAbilityNameHash() {
        return abilityNameHash_;
      }
      /**
       * <code>sfixed32 ability_name_hash = 15;</code>
       * @param value The abilityNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityNameHash(int value) {
        
        abilityNameHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>sfixed32 ability_name_hash = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityNameHash() {
        
        abilityNameHash_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ShortAbilityHashPair)
    }

    // @@protoc_insertion_point(class_scope:ShortAbilityHashPair)
    private static final emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair();
    }

    public static emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShortAbilityHashPair>
        PARSER = new com.google.protobuf.AbstractParser<ShortAbilityHashPair>() {
      @java.lang.Override
      public ShortAbilityHashPair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortAbilityHashPair(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShortAbilityHashPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShortAbilityHashPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ShortAbilityHashPairOuterClass.ShortAbilityHashPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShortAbilityHashPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShortAbilityHashPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ShortAbilityHashPair.proto\"F\n\024ShortAbi" +
      "lityHashPair\022\023\n\013OMPEBEMNKLG\030\r \001(\017\022\031\n\021abi" +
      "lity_name_hash\030\017 \001(\017B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShortAbilityHashPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShortAbilityHashPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShortAbilityHashPair_descriptor,
        new java.lang.String[] { "OMPEBEMNKLG", "AbilityNameHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
