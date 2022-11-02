import math

l=list(map(float,input().split(" ")))
percentage=l[0]/100
piston=l[1]

if __name__ == '__main__':
    result=0
    for i in range(0,3):
        cmb=math.factorial(piston)/(math.factorial(i)*math.factorial(piston-i))
        result+=cmb*math.pow(percentage,i)*math.pow(1-percentage,piston-i)
    print(round(result,3))
    
    result=0
    for i in range(2,11):
        cmb=math.factorial(piston)/(math.factorial(i)*math.factorial(piston-i))
        result+=cmb*math.pow(percentage,i)*math.pow(1-percentage,piston-i)
    print(round(result,3))
