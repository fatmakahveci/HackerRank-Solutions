import statistics

n=int(input())
l=input().split(" ")
l=list(map(int,l))
l.sort()
mid=int(n/2)
q1=statistics.median(l[0:mid])
q2=statistics.median(l)
if(n%2==0):
    q3=statistics.median(l[mid:n])
else:
    q3=statistics.median(l[mid+1:n])
print(int(q1))
print(int(q2))
print(int(q3))
