package main
 
import "fmt"
 
func if_2(i int) int // 汇编函数声明

func main() {
	fmt.Println(if_2(5))
	fmt.Println(if_2(7))
	fmt.Println(if_2(8))
	fmt.Println(if_2(10))
}