n=int(input())

weighted_list=list(map(int,input().split(" ")))
weight_list=list(map(int,input().split(" ")))

sum_weight=0
sum_list=0
for i in range(n):
    sum_list+=weighted_list[i]*weight_list[i]
    sum_weight+=weight_list[i]

print(round(float(sum_list/sum_weight),1))
