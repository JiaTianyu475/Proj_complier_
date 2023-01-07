#include "textflag.h"

TEXT ·for_(SB), NOSPLIT, $16-16
   MOVQ a+0(FP), AX
   MOVQ $0, i-0(SP)
   MOVQ $0, sum-8(SP)
   MOVQ $0, i-0(SP)
L0_0:
   CMPQ i-0(SP), AX
   JGE Lend_0
   JMP L2_0
L1_0:
   INCQ i-0(SP)
   JMP L0_0
L2_0:
   MOVQ i-0(SP), BX
   ADDQ BX, sum-8(SP)
   JMP L1_0
Lend_0:
   MOVQ sum-8(SP), CX
   MOVQ CX, ret+8(FP)
   RET
