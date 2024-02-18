import math

str = input()
number = int(input())
if str == 'sun':
    print(math.floor(number/7)+1)
else:
    print(math.floor(number/7))
    