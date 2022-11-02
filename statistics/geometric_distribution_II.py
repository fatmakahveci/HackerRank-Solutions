import math

l=list(map(int,input().split(" ")))
p=float(l[0]/l[1])

i=int(input())

result=math.pow(p,0)*math.pow((1-p),(i))

print(str(round(1-result,3)))
