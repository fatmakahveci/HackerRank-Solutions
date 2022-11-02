if __name__ == '__main__':
    N = int(raw_input())
    intList=[]
    for i in range(N):
        line=raw_input().strip().split(' ')
        if line[0]=="insert":
           intList.insert(int(line[1]),int(line[2]))
        elif line[0]=="print":
            print intList
        elif line[0]=="append":
            intList.append(int(line[1]))
        elif line[0]=="sort":
            intList.sort()
        elif line[0]=="reverse":
            intList.reverse()
        elif line[0]=="pop":
            intList.pop()
        elif line[0]=="remove":
            intList.remove(int(line[1]))
