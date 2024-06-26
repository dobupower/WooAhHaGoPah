import re

def switch(key):
    telecom = {
        "one": "1", "two": "2", "three": "3", "four": "4", "five": "5",
        "six": "6", "seven": "7", "eight": "8", "nine": "9", "zero": "0"
    }
    return telecom.get(key, "알 수 없는")

def solution(s):
    answer = ""
    string = re.split('([^0-9])', s)
    string = ' '.join(string).split()
    temp = ""
    disease = ""
    for i in range(len(string)):
        if string[i].isdigit():
            answer += string[i]
        else:
            temp += string[i]
            disease = switch(temp)
            if disease != "알 수 없는":
                answer += disease
                temp = ""
    answer = int(answer)
    return answer