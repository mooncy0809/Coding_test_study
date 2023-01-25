def solution(numbers, target):
    if not numbers and target == 0 :
        return True
    elif not numbers:
        return False
    else:
        return solution(numbers[1:], target-numbers[0]) + solution(numbers[1:], target+numbers[0])

print(solution([4,1,2,1],4))
