// @generated by protoc-gen-es v1.3.1
// @generated from file demo/v1/demo.proto (package demo.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { proto3 } from "@bufbuild/protobuf";

/**
 * Pet represents a pet in the pet store.
 *
 * @generated from message demo.v1.Demo
 */
export const Demo = proto3.makeMessageType(
  "demo.v1.Demo",
  () => [
    { no: 1, name: "demo_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "name", kind: "scalar", T: 9 /* ScalarType.STRING */ },
  ],
);

/**
 * @generated from message demo.v1.GetDemoRequest
 */
export const GetDemoRequest = proto3.makeMessageType(
  "demo.v1.GetDemoRequest",
  () => [
    { no: 1, name: "demo_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
  ],
);

/**
 * @generated from message demo.v1.GetDemoResponse
 */
export const GetDemoResponse = proto3.makeMessageType(
  "demo.v1.GetDemoResponse",
  () => [
    { no: 1, name: "demo", kind: "message", T: Demo },
  ],
);
