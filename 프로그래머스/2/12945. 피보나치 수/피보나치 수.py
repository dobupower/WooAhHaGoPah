def solution(n):
    answer = 0
    x = 0
    y = 1
    temp = 0
    for i in range(n):
        temp = x
        x = y
        y = temp + y
    
    answer = x % 1234567
    return answer