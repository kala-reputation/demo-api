// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo/v1/demo.proto

package com.demo.v1;

public final class DemoProto {
  private DemoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_v1_Demo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_v1_Demo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_v1_GetDemoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_v1_GetDemoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_v1_GetDemoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_v1_GetDemoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022demo/v1/demo.proto\022\007demo.v1\"3\n\004Demo\022\027\n" +
      "\007demo_id\030\001 \001(\tR\006demoId\022\022\n\004name\030\002 \001(\tR\004na" +
      "me\")\n\016GetDemoRequest\022\027\n\007demo_id\030\001 \001(\tR\006d" +
      "emoId\"4\n\017GetDemoResponse\022!\n\004demo\030\001 \001(\0132\r" +
      ".demo.v1.DemoR\004demo2M\n\013DemoService\022>\n\007Ge" +
      "tDemo\022\027.demo.v1.GetDemoRequest\032\030.demo.v1" +
      ".GetDemoResponse\"\000B\215\001\n\013com.demo.v1B\tDemo" +
      "ProtoP\001Z6github.com/kala-reputation/demo" +
      "-api/gen/demo/v1;demov1\242\002\003DXX\252\002\007Demo.V1\312" +
      "\002\007Demo\\V1\342\002\023Demo\\V1\\GPBMetadata\352\002\010Demo::" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_demo_v1_Demo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_demo_v1_Demo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_v1_Demo_descriptor,
        new java.lang.String[] { "DemoId", "Name", });
    internal_static_demo_v1_GetDemoRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_demo_v1_GetDemoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_v1_GetDemoRequest_descriptor,
        new java.lang.String[] { "DemoId", });
    internal_static_demo_v1_GetDemoResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_demo_v1_GetDemoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_v1_GetDemoResponse_descriptor,
        new java.lang.String[] { "Demo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}