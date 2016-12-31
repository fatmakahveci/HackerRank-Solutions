import statistics

n_el=int(input())

elements=input().split(" ")
elements=list(map(int,elements))

frequencies=input().split(" ")
frequencies=list(map(int,frequencies))

l=[]
n=0
for i in range(n_el):
    n+=frequencies[i]

for i in range(n_el):
    for j in range(frequencies[i]):
        l.append(elements[i])
l.sort()
mid=int(n/2)
q1=statistics.median(l[0:mid])
if(n%2==0):
    q3=statistics.median(l[mid:n])
else:
    q3=statistics.median(l[mid+1:n])
print(str(float(q3-q1)))
