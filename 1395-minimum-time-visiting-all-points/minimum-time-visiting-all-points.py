class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        cursor=points[0]
        time = 0
        for point in points:
            while cursor != point:
                if point[0] > cursor[0] and point[1] > cursor[1]:
                    cursor[0] += 1
                    cursor[1] += 1
                    time += 1
                if point[0] > cursor[0] and point[1] == cursor[1]:
                    cursor[0] += 1
                    time += 1
                if point[0] > cursor[0] and point[1] < cursor[1]:
                    cursor[0] += 1
                    cursor[1] -= 1
                    time += 1
                if point[0] == cursor[0] and point[1] < cursor[1]:
                    cursor[1] -= 1
                    time += 1
                if point[0] == cursor[0] and point[1] > cursor[1]:
                    cursor[1] += 1
                    time += 1
                if point[0] < cursor[0] and point[1] < cursor[1]:
                    cursor[0] -= 1
                    cursor[1] -= 1
                    time += 1
                if point[0] < cursor[0] and point[1] == cursor[1]:
                    cursor[0] -= 1
                    time += 1
                if point[0] < cursor[0] and point[1] > cursor[1]:
                    cursor[0] -= 1
                    cursor[1] += 1
                    time += 1
        return time
