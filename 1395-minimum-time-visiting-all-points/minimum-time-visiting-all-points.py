class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        time = 0
        x1 , y1 = points.pop()     #we start from the last element because its the same thing both ways
        while points != []:        #couldve done while points:
            x2,y2 = points.pop()
            time += max(abs(x1-x2) , abs(y1-y2))
            x1,y1 = x2,y2
        return time