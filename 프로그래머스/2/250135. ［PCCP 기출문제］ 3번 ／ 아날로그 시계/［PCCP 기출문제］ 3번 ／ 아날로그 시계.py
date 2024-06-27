def solution(h1, m1, s1, h2, m2, s2):
    answer = 0
    
    # 현재 시간과 목표 시간을 초로 변환
    current_time = h1 * 3600 + m1 * 60 + s1
    target_time = h2 * 3600 + m2 * 60 + s2
    
    if current_time == 0 or current_time == 43200:
        answer += 1
    
    while current_time < target_time:
        # 각 침의 이전 각도 저장
        previous_sec_angle = (current_time * 6) % 360
        previous_min_angle = (current_time / 10) % 360
        previous_hour_angle = (current_time / 120) % 360
        
        # 시간 증가
        current_time += 1

        # 각 침의 1초 후 각도 업데이트
        sec_angle = (current_time * 6) % 360
        min_angle = (current_time / 10) % 360
        hour_angle = (current_time / 120) % 360

        if sec_angle == 0:
            sec_angle = 360
        if min_angle == 0:
            min_angle = 360
        if hour_angle == 0:
            hour_angle = 360
        
        
        # 초침이 분침을 추월하는 경우
        if previous_sec_angle < previous_min_angle and sec_angle >= min_angle:
            answer += 1
        
        # 초침이 시침을 추월하는 경우
        if previous_sec_angle < previous_hour_angle and sec_angle >= hour_angle:
            answer += 1

        if sec_angle == min_angle == hour_angle:
            answer -= 1
    
    return answer