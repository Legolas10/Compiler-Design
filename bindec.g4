grammar bindec;

equation returns[Integer value]
:
e=l {$value=$e.value; System.out.println("DECIMAL VALUE IS "+$value);}
;
l returns[Integer value]
:
lv=l bv=b {$value=(2*$lv.value)+$bv.value;}
|
bv=b {$value=$bv.value;}
;

b returns[Integer value]
: NUM {$value=Integer.parseInt($NUM.text);}
;

NUM
:
[0-1]
;




