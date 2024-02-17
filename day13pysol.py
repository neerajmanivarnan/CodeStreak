import numpy

str = input()
num = int(input())
arr = []
flag = 0
for x in range(num):
    newstr = input()
    arr.append(newstr)
    
for x in arr:
    if x in str:
        #do nothing
        str.replace(x,"")
    else:
        flag = 1
        print(0)
        break


if flag == 0:
    print(1)