#!/usr/bin/env python
import sys

def f(arg):
    start = arg
    fib1 = 0
    fib2 = 1
    output = ''
    for i in range(start-1):
        fib3 = fib1 + fib2
        output += "F%d = %d, F%d = %d, F%d = %d" % (i,fib1,(i+1), fib2,(i+2), fib3)
        fib1 = fib2
        fib2 = fib3
    return output

if(len(sys.argv)<2):
    print "Please Input a num ex) python Fibonacci.py 100"
else :
    print f(int(sys.argv[1]))
