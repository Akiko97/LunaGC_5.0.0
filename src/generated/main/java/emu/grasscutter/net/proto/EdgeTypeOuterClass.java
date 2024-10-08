// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EdgeType.proto

package emu.grasscutter.net.proto;

public final class EdgeTypeOuterClass {
  private EdgeTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code EdgeType}
   */
  public enum EdgeType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INNER = 0;</code>
     */
    INNER(0),
    /**
     * <code>TILE_BOUND = 1;</code>
     */
    TILE_BOUND(1),
    /**
     * <code>TILE_BOUND_UNCONNECT = 2;</code>
     */
    TILE_BOUND_UNCONNECT(2),
    /**
     * <code>TILE_BOUND_OVERIDE = 3;</code>
     */
    TILE_BOUND_OVERIDE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INNER = 0;</code>
     */
    public static final int INNER_VALUE = 0;
    /**
     * <code>TILE_BOUND = 1;</code>
     */
    public static final int TILE_BOUND_VALUE = 1;
    /**
     * <code>TILE_BOUND_UNCONNECT = 2;</code>
     */
    public static final int TILE_BOUND_UNCONNECT_VALUE = 2;
    /**
     * <code>TILE_BOUND_OVERIDE = 3;</code>
     */
    public static final int TILE_BOUND_OVERIDE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EdgeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EdgeType forNumber(int value) {
      switch (value) {
        case 0: return INNER;
        case 1: return TILE_BOUND;
        case 2: return TILE_BOUND_UNCONNECT;
        case 3: return TILE_BOUND_OVERIDE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EdgeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EdgeType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EdgeType>() {
            public EdgeType findValueByNumber(int number) {
              return EdgeType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EdgeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final EdgeType[] VALUES = values();

    public static EdgeType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EdgeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EdgeType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016EdgeType.proto*W\n\010EdgeType\022\t\n\005INNER\020\000\022" +
      "\016\n\nTILE_BOUND\020\001\022\030\n\024TILE_BOUND_UNCONNECT\020" +
      "\002\022\026\n\022TILE_BOUND_OVERIDE\020\003B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
