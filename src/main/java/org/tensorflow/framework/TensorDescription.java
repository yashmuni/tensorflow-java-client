// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensor_description.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.TensorDescription}
 */
public  final class TensorDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.TensorDescription)
    TensorDescriptionOrBuilder {
  // Use TensorDescription.newBuilder() to construct.
  private TensorDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorDescription() {
    dtype_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TensorDescription(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            dtype_ = rawValue;
            break;
          }
          case 18: {
            org.tensorflow.framework.TensorShapeProto.Builder subBuilder = null;
            if (shape_ != null) {
              subBuilder = shape_.toBuilder();
            }
            shape_ = input.readMessage(org.tensorflow.framework.TensorShapeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(shape_);
              shape_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            AllocationDescription.Builder subBuilder = null;
            if (allocationDescription_ != null) {
              subBuilder = allocationDescription_.toBuilder();
            }
            allocationDescription_ = input.readMessage(AllocationDescription.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(allocationDescription_);
              allocationDescription_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TensorDescription.class, Builder.class);
  }

  public static final int DTYPE_FIELD_NUMBER = 1;
  private int dtype_;
  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  public DataType getDtype() {
    DataType result = DataType.valueOf(dtype_);
    return result == null ? DataType.UNRECOGNIZED : result;
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private org.tensorflow.framework.TensorShapeProto shape_;
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int ALLOCATION_DESCRIPTION_FIELD_NUMBER = 4;
  private AllocationDescription allocationDescription_;
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  public boolean hasAllocationDescription() {
    return allocationDescription_ != null;
  }
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  public AllocationDescription getAllocationDescription() {
    return allocationDescription_ == null ? AllocationDescription.getDefaultInstance() : allocationDescription_;
  }
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  public AllocationDescriptionOrBuilder getAllocationDescriptionOrBuilder() {
    return getAllocationDescription();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dtype_ != DataType.DT_INVALID.getNumber()) {
      output.writeEnum(1, dtype_);
    }
    if (shape_ != null) {
      output.writeMessage(2, getShape());
    }
    if (allocationDescription_ != null) {
      output.writeMessage(4, getAllocationDescription());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dtype_ != DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dtype_);
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShape());
    }
    if (allocationDescription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAllocationDescription());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TensorDescription)) {
      return super.equals(obj);
    }
    TensorDescription other = (TensorDescription) obj;

    boolean result = true;
    result = result && dtype_ == other.dtype_;
    result = result && (hasShape() == other.hasShape());
    if (hasShape()) {
      result = result && getShape()
          .equals(other.getShape());
    }
    result = result && (hasAllocationDescription() == other.hasAllocationDescription());
    if (hasAllocationDescription()) {
      result = result && getAllocationDescription()
          .equals(other.getAllocationDescription());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    if (hasAllocationDescription()) {
      hash = (37 * hash) + ALLOCATION_DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getAllocationDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TensorDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TensorDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TensorDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TensorDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TensorDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TensorDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TensorDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TensorDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TensorDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TensorDescription parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TensorDescription prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.TensorDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.TensorDescription)
      org.tensorflow.framework.TensorDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TensorDescription.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.TensorDescription.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      dtype_ = 0;

      if (shapeBuilder_ == null) {
        shape_ = null;
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = null;
      } else {
        allocationDescription_ = null;
        allocationDescriptionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
    }

    public TensorDescription getDefaultInstanceForType() {
      return TensorDescription.getDefaultInstance();
    }

    public TensorDescription build() {
      TensorDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TensorDescription buildPartial() {
      TensorDescription result = new TensorDescription(this);
      result.dtype_ = dtype_;
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      if (allocationDescriptionBuilder_ == null) {
        result.allocationDescription_ = allocationDescription_;
      } else {
        result.allocationDescription_ = allocationDescriptionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TensorDescription) {
        return mergeFrom((TensorDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TensorDescription other) {
      if (other == TensorDescription.getDefaultInstance()) return this;
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.hasAllocationDescription()) {
        mergeAllocationDescription(other.getAllocationDescription());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TensorDescription parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TensorDescription) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dtype_ = 0;
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>optional .tensorflow.DataType dtype = 1;</code>
     */
    public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>optional .tensorflow.DataType dtype = 1;</code>
     */
    public Builder setDtypeValue(int value) {
      dtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>optional .tensorflow.DataType dtype = 1;</code>
     */
    public DataType getDtype() {
      DataType result = DataType.valueOf(dtype_);
      return result == null ? DataType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>optional .tensorflow.DataType dtype = 1;</code>
     */
    public Builder setDtype(DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>optional .tensorflow.DataType dtype = 1;</code>
     */
    public Builder clearDtype() {
      
      dtype_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorShapeProto shape_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> shapeBuilder_;
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
        onChanged();
      } else {
        shapeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(
        org.tensorflow.framework.TensorShapeProto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
        onChanged();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder mergeShape(org.tensorflow.framework.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (shape_ != null) {
          shape_ =
            org.tensorflow.framework.TensorShapeProto.newBuilder(shape_).mergeFrom(value).buildPartial();
        } else {
          shape_ = value;
        }
        onChanged();
      } else {
        shapeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder clearShape() {
      if (shapeBuilder_ == null) {
        shape_ = null;
        onChanged();
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            org.tensorflow.framework.TensorShapeProto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorShapeProto, org.tensorflow.framework.TensorShapeProto.Builder, org.tensorflow.framework.TensorShapeProtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private AllocationDescription allocationDescription_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AllocationDescription, AllocationDescription.Builder, AllocationDescriptionOrBuilder> allocationDescriptionBuilder_;
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public boolean hasAllocationDescription() {
      return allocationDescriptionBuilder_ != null || allocationDescription_ != null;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public AllocationDescription getAllocationDescription() {
      if (allocationDescriptionBuilder_ == null) {
        return allocationDescription_ == null ? AllocationDescription.getDefaultInstance() : allocationDescription_;
      } else {
        return allocationDescriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder setAllocationDescription(AllocationDescription value) {
      if (allocationDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allocationDescription_ = value;
        onChanged();
      } else {
        allocationDescriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder setAllocationDescription(
        AllocationDescription.Builder builderForValue) {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = builderForValue.build();
        onChanged();
      } else {
        allocationDescriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder mergeAllocationDescription(AllocationDescription value) {
      if (allocationDescriptionBuilder_ == null) {
        if (allocationDescription_ != null) {
          allocationDescription_ =
            AllocationDescription.newBuilder(allocationDescription_).mergeFrom(value).buildPartial();
        } else {
          allocationDescription_ = value;
        }
        onChanged();
      } else {
        allocationDescriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder clearAllocationDescription() {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = null;
        onChanged();
      } else {
        allocationDescription_ = null;
        allocationDescriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public AllocationDescription.Builder getAllocationDescriptionBuilder() {
      
      onChanged();
      return getAllocationDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public AllocationDescriptionOrBuilder getAllocationDescriptionOrBuilder() {
      if (allocationDescriptionBuilder_ != null) {
        return allocationDescriptionBuilder_.getMessageOrBuilder();
      } else {
        return allocationDescription_ == null ?
            AllocationDescription.getDefaultInstance() : allocationDescription_;
      }
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AllocationDescription, AllocationDescription.Builder, AllocationDescriptionOrBuilder>
        getAllocationDescriptionFieldBuilder() {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AllocationDescription, AllocationDescription.Builder, AllocationDescriptionOrBuilder>(
                getAllocationDescription(),
                getParentForChildren(),
                isClean());
        allocationDescription_ = null;
      }
      return allocationDescriptionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.TensorDescription)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.TensorDescription)
  private static final TensorDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TensorDescription();
  }

  public static TensorDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorDescription>
      PARSER = new com.google.protobuf.AbstractParser<TensorDescription>() {
    public TensorDescription parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TensorDescription(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TensorDescription> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TensorDescription> getParserForType() {
    return PARSER;
  }

  public TensorDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

