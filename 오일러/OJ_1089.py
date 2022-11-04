d,h,m = map(int,input().split())
sum = (d-11)*1440 + (h-11)*60 + (m-11)
if sum <= 0:
    print(-1)
else:
    print(sum)
