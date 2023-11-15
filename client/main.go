package main

import (
	"context"
	"log"
	"net/http"

	"connectrpc.com/connect"
	demov1 "github.com/kala-reputation/demo-api/gen/demo/v1"
	"github.com/kala-reputation/demo-api/gen/demo/v1/demov1connect"
)

func main() {
	client := demov1connect.NewDemoServiceClient(
		http.DefaultClient,
		"http://localhost:8080",
	)
	res, err := client.GetDemo(
		context.Background(),
		connect.NewRequest(&demov1.GetDemoRequest{DemoId: "12345", Name: "testing"}),
	)
	if err != nil {
		log.Println(err)
		return
	}
	log.Println(res.Msg)
}
