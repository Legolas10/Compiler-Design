1.Consider the following attribute grammar which  computes the maximum or minimum of a sequence of integers depending on the suffix ‘-‘ or ‘+’ respectively:

Production	Semantic Rule

S → B +	S.val = B.val; print(B.val)

S → C -	S.val = C.val; print(C.val)

B → n	B.val = value(n)

B → B1 , n	B.val = max(B1.val,value(n))

C → n	C.val = value(n)

C → C1 , n	C.val = min(C1.val,value(n))


Write an antlr specification which parses and evaluates input strings of the form: “5, 2, 3 -“ and outputs 2 and “7, 1, 4 +“ and outputs 7.
