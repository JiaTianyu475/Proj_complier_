package main

import "fmt"

func if_(a int) int // 汇编函数声明


func main() {
	fmt.Println(if_(10))
	fmt.Println(if_(20))
	fmt.Println(if_(30))
}
