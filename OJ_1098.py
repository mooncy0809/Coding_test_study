# 시간 복잡도를 줄인 약수 구하기 알고리즘 사용해봄.
n = int(input())
li = []
sqrt = round(n**(1/2))
for i in range(1,sqrt+1):
    if n % i == 0 :
        li.append(i)

li2 = li
for j in range(len(li)):
    li2.append(n/li[j])
li2 = list(set(li2))
li2.remove(n)

print(int(sum(li2)))