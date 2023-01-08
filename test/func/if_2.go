package main

func if_2(i int) int {
	var res int
	if i < 6 {
		res = -1
	} else if i > 6 {
		res = 100
		if i < 8 {
			res = 1
		} else if i < 10 {
			res = 2
		} else {
			res = 3
		}
	} else {
		res = 0
	}
	return res
}