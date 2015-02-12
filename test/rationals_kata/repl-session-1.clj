; cases - scratchpad

; a rational = n / m - numerator / denominator
; examples:
;   0 + 0 = 0 ; two zeros
;   0 + 1 = 1 ; a zero with a non-zero
;   1 + 1 = 2 ; two non-zeros
;   1 + 1/2 = 3/2 ; different denominators, no need to simplify
; -  1/2 + 1 = 3/2 ; duplicated case as above
;   1/2 + 1/2 = 1 ; same denominator, need to simplify
; - 1/6 + 1/6 = 1/3 ; duplicated case as above
;   1/2 + 1/8 = 5/8 ; denominators are one multiple of the other, no need to simplify
;   1/2 + 2/8 = 3/4 ; denominators are one multiple of the other, need to simplify
;   8/5 + 5/8 = 89/40 ; inverse fractions, numbers are coprime between each other (share no common prime) - because fractions were already simplified
;   6/14 + 14/6 = 58/21 ; inverse fractions, fractionals are not simplified (they are not coprime)
; - 3/7 + 7/3 = 58/21 ; same result as above

(+ 15/16 16/15)
(+ 6/14 14/6)
(+ 3/7 7/3)
