#include "textflag.h"

TEXT ·if_(SB), NOSPLIT, $0-16
   MOVQ a+0(FP), AX
   CMPQ AX, $10
   JLE I0_0
   JMP I1_0
I0_0:
   MOVQ $0, ret+8(FP)
   RET
   JMP Iend_0
I1_0:
   CMPQ AX, $20
   JLE I2_0
   JMP I3_0
I2_0:
   MOVQ $1, ret+8(FP)
   RET
   JMP Iend_0
I3_0:
   MOVQ $2, ret+8(FP)
   RET
Iend_0:
   MOVQ AX, ret+8(FP)
   RET
