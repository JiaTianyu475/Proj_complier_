package main

import "fmt"

func for_2(a,b int) int // 汇编函数声明


func main() {
	fmt.Println(for_2(5, 2))
	fmt.Println(for_2(5, 10))
	fmt.Println(for_2(5, 15))
}
