n,s = input().split()
n = int(n)
str = s[:n-1]+s[n:]
if str:
    print(str)
else:
    print(-1)