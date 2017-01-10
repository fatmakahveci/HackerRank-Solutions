import math

n=int(input())
box=int(input())
mean=float(input())
var=float(input())

def cdf(mu,sig,x):
    return 1/2.0*(1+math.erf((x-mu)/(sig*math.sqrt(2))));

if __name__=="__main__":
    new_mean=box*mean
    new_var=math.sqrt(box)*var
    print(round(cdf(new_mean,new_var,n),4))
