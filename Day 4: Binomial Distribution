import math

l=list(map(float,input().split(" ")))
b=l[0]
g=l[1]

if __name__ == '__main__':
    result=0
    for i in range(3,7):
        cmb=math.factorial(6)/(math.factorial(i)*math.factorial(6-i))
        result+=cmb*math.pow(b/(b+g),i)*math.pow(g/(b+g),(6-i))
    print(round(result,3))
