grammar maxmin;

s returns [Integer value]
:
bval=b(PLUS) {$value=$bval.value; System.out.println($value);}
|
cval=c(MINUS) {$value=$cval.value; System.out.println($value);}
;

b returns [Integer value]
:
bval=b(COM)NUM {$value=max($bval.value,(Integer.parseInt($NUM.text)));}
|
NUM {$value=Integer.parseInt($NUM.text);}
;

c returns [Integer value]
:
cval=c(COM)NUM {$value=min($cval.value,(Integer.parseInt($NUM.text)));}
|
NUM {$value=Integer.parseInt($NUM.text);}
;

NUM
:
[0-9]+
;

PLUS
:
'+'
;

MINUS
:
'-'
;

COM
:
','
;

WS
:
[r\n\t]-> skip
;
