import math

if __name__ == "__main__":
    ab=list(map(float,input().split(' ')))
    a=160+40*(ab[0]+math.pow(ab[0],2))
    b=128+40*(ab[1]+math.pow(ab[1],2))
    
    
    print(round(a,3))
    print(round(b,3))
