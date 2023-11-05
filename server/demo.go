package main

import (
	"context"
	"log"

	connect "connectrpc.com/connect"
	demov1 "github.com/kala-reputation/demo-api/gen/demo/v1"
	// "github.com/reputation/go-paperboy-api/server/data"
)

// getdemo .
// initialize context- move this to seperate class
func (s *DemoAPIServer) GetDemo(
	ctx context.Context,
	req *connect.Request[demov1.GetDemoRequest],
) (*connect.Response[demov1.GetDemoResponse], error) {
	name := req.Msg.GetDemoId()
	log.Printf("Got a request to create a %v named %s", name)
	return connect.NewResponse(&demov1.GetDemoResponse{}), nil
}
