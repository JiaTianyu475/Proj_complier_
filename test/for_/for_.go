package main

import "fmt"

func for_(a int) int // 汇编函数声明


func main() {
	fmt.Println(for_(5))
	fmt.Println(for_(10))
	fmt.Println(for_(15))
}
