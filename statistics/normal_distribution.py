import math

normal_values=list(map(float,input().split(' ')))
mean=normal_values[0]
dev=normal_values[1]

first_boundary=float(input())
second_boundaries=list(map(float,input().split(' ')))

def cdf(x):
    return 1/2.0*(1+math.erf((x-mean)/(dev*math.sqrt(2))));

if __name__=="__main__":
    print(round(cdf(first_boundary),3))
    print(round(cdf(second_boundaries[1])-cdf(second_boundaries[0]),3))
