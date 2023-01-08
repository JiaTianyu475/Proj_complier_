#include "textflag.h"

TEXT ·if_2(SB), NOSPLIT, $8-16
   MOVQ i+0(FP), AX
   MOVQ $0, res-0(SP)
   CMPQ AX, $6
   JL I0_0
   JMP I1_0
I0_0:
MOVQ $-1, BX
   MOVQ BX, res-0(SP)
   JMP Iend_0
I1_0:
   CMPQ AX, $6
   JG I2_0
   JMP I3_0
I2_0:
   MOVQ $100, res-0(SP)
   CMPQ AX, $8
   JL I0_1
   JMP I1_1
I0_1:
   MOVQ $1, res-0(SP)
   JMP Iend_1
I1_1:
   CMPQ AX, $10
   JL I2_1
   JMP I3_1
I2_1:
   MOVQ $2, res-0(SP)
   JMP Iend_1
I3_1:
   MOVQ $3, res-0(SP)
Iend_1:
   JMP Iend_0
I3_0:
   MOVQ $0, res-0(SP)
Iend_0:
   MOVQ res-0(SP), CX
   MOVQ CX, ret+8(FP)
   RET
