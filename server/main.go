package main

import (
	"context"
	"fmt"
	"log"
	"net/http"

	connect "connectrpc.com/connect"
	demov1 "github.com/kala-reputation/demo-api/gen/demo/v1"

	"github.com/kala-reputation/demo-api/gen/demo/v1/demov1connect"
	"golang.org/x/net/http2"
	"golang.org/x/net/http2/h2c"
	// "github.com/reputation/go-paperboy-api/server/data"
)

const address = "localhost:8080"

func main() {
	mux := http.NewServeMux()
	path, handler := demov1connect.NewDemoServiceHandler(&DemoAPIServer{})
	mux.Handle(path, handler)
	fmt.Println("... Listening on", address)
	http.ListenAndServe(
		address,
		// Use h2c so we can serve HTTP/2 without TLS.
		h2c.NewHandler(mux, &http2.Server{}),
	)
}

// DemoAPIServer
type DemoAPIServer struct {
	demov1connect.UnimplementedDemoServiceHandler
}

// getdemo .
// initialize context- move this to seperate class
func (s *DemoAPIServer) GetDemo(
	ctx context.Context,
	req *connect.Request[demov1.GetDemoRequest],
) (*connect.Response[demov1.GetDemoResponse], error) {
	demoid := req.Msg.GetDemoId()
	demoname := req.Msg.GetName()
	log.Printf("Got a request to create a %v named %s", demoid, demoname)
	return connect.NewResponse(&demov1.GetDemoResponse{Msg: "successfully called", Name: demoname}), nil
}
