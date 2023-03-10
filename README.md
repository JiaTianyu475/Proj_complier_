# Proj_complier
go语言编译器，实现建立语法分析树、中间代码生成以及生成go汇编等功能.

### 环境依赖
* openjdk 19.0.1
* antlr4 4.11.1
* go 1.19.4

### 使用
test目录下为测试文件，以math文件夹为例：
* math.s为func文件下math.go生成的汇编文件
* math.exe为生成的可执行文件
* math.go包含汇编函数声明与main函数

编译命令：
```
cd go
antlr4 go.g4
javac go*.gava ui.fava
java Ui t.json
```
ui界面:
![image](./img/ui.png)

**上传go程序**
![image](./img/loadGo.png)

**生成语法分析树**
![image](./img/createParseTree.png)

**生成中间代码**
![image](./img/createIr.png)

**生成汇编语言**
![image](./img/createAss.png)

**生成可执行文件**
![image](./img/createExe.png)

### 附加功能
可以检查变量或函数未定义错误。
