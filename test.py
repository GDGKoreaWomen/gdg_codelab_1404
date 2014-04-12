#!/usr/bin/env python
import commands
from Fibonacci import f

if __name__ == '__main__':
    commands.getstatusoutput('javac Fibonacci.java')
    for x in range(2,100):
        java = commands.getstatusoutput('java Fibonacci '+str(x))[1]
        python = f(int(x))
        if java != python:
            print "java %s python %s" % (java, python)
