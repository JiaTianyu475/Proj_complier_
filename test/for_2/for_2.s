#include "textflag.h"

TEXT ·for_2(SB), NOSPLIT, $24-24
   MOVQ a+0(FP), AX
   MOVQ b+8(FP), BX
   MOVQ $0, i-0(SP)
   MOVQ $0, j-8(SP)
   MOVQ $0, sum-16(SP)
   MOVQ $0, i-0(SP)
L0_0:
   CMPQ i-0(SP), AX
   JGE Lend_0
   JMP L2_0
L1_0:
   INCQ i-0(SP)
   JMP L0_0
L2_0:
   MOVQ $0, j-8(SP)
L0_1:
   CMPQ j-8(SP), BX
   JGE Lend_1
   JMP L2_1
L1_1:
   INCQ j-8(SP)
   JMP L0_1
L2_1:
   MOVQ i-0(SP), CX
   ADDQ CX, sum-16(SP)
   JMP L1_1
Lend_1:
   JMP L1_0
Lend_0:
   MOVQ sum-16(SP), DX
   MOVQ DX, ret+16(FP)
   RET
