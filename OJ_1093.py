a,b = map(int,input().split())
news = list(map(int,input().split()))
result_list = []
result = a * b
for n in news:
    result_list.append(n-result)
print(*result_list)
