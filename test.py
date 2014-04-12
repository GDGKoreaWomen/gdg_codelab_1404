import commands

def F(n):
    if n == 0: return 0
    elif n == 1: return 1
    else: return F(n-1)+F(n-2)

if __name__ == '__main__':
    commands.getstatusoutput('javac Fibonacci.java')
    for x in range(100):
        java = commands.getstatusoutput('java Fibonacci '+str(x))[1]
        try:
            java_last = int(java.split('=')[-1])
        except:
            java_last = java.split('=')[-1]
        if java_last != F(int(x)):
            print "java %s python %s" % (java_last, F(int(x)))
